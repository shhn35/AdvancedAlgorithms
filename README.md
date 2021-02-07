# AdvancedAlgorithms
Here some advanced algorithms based on [LeetCode](https://leetcode.com/problems) problems are implemented and tested in Java. These algorithms is devide in three main categories based on their dificulties.

## List of Content
#### [Easy](#Easy-Algorithms)
###### Two Sum problem [(goto)](#Two-Sum-problem)
###### Reverse Integer problem [(goto)](#Reverse-Integer)
###### Remove Duplicate in Sorted Array problem [(goto)](#Remove-Duplicat-in-Sorted-Array)
#### [Medium](#Medium-Algorithms)
###### Three Sum To Zero [(goto)](#Three-Sum-To-Zero-problem)
###### Subarray Sum Equals K [(goto)](#Subarray-Sum-Equals-K)
###### Minimum Remove to Make Valid Parentheses [(goto)](#Minimum-Remove-to-Make-Valid-Parentheses)
###### String Compression [(goto)](#String-Compression)
###### Search in Rotated Sorted Array [(goto)](#Search-in-Rotated-Sorted-Array)
###### Random Pick with Weight [(goto)](#Random-Pick-with-Weight)
###### Merge Intervals [(goto)](#Merge-Intervals)
###### Product of Array Except Self [(goto)](#Product-of-Array-Except-Self)
###### K Closest Points to Origin [(goto)](#K-Closest-Points-to-Origin)
###### Top K Frequent Elements [(goto)](#Top-K-Frequent-Elements)
###### Interval List Intersections [(goto)](#Interval-List-Intersections)
#### [Hard](#Hard-Algorithms)
###### Merge k Sorted List [(goto)](#Merge-k-Sorted-List-problem)

---
## Easy Algorithms
##### Two Sum problem
- [Problem description and source](https://leetcode.com/problems/two-sum/)
- Key concepts:
The trick is if we just look at any element in the array, we can figure out what number we should look for to find a match with the target number. If we store this pair, then we can find the result in O(n).
- Solutions:
```ruby
Get an aux memory as HashMap (pairs)
For i = 0 to arr.size
  If (pairs.containsKey(arr[i]))
    Return (pairs.get(arr[i],i)
  Diff = target - arr[i]
  pair.put(diff,i)
return null
```
[back to up](#List-of-Content)

##### Reverse Integer
- [Problem description and source](https://leetcode.com/problems/reverse-integer/)
- Key concepts:
1. Get the last digit of x and by multiplying it by 10, shift it ro right properly, instead of doing the usual algorithms (i.e., 123 = 1*10^2 + 2*10^1 + 3*10^0);
1. For checking the overflow there would be two different approaches:
- Using long data type as the result and at the end check this value with Integer.MAX_VALUE and Integer.MIN_VALUE, if it exceed the boundary, simply return 0;
- Detecting the situation of getting out of bound of integer as it is shown in the algorithm.

- Solutions:
```ruby
int result = 0,digit=0;
while(x!=0){
  digit = x % 10;
  x/=10;
  // Overflow checking
  if(Integer.MAX_VALUE / 10 < result || // for pos numbers
    Integer.MIN_VALUE / 10 > result || // for neg numbers
    (Integer.MAX_VALUE / 10 == result && digit>Integer.MAX_VALUE % 10) ||
    (Integer.MIN_VALUE / 10 == result && digit<Integer.MIN_VALUE % 10))
  {
      return 0;
  }
  result = result * 10 + digit;
}
return result;
```
[back to up](#List-of-Content)

##### Remove Duplicat in Sorted Array
- [Problem description and source](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- Key concepts:
1. Just take a look at the previous element instead of looking forward to the next element for in-place operation.
2. O(n) is the time complexity with O(1) space consumption.

- Solutions:
```ruby
if(nums.length == 0)
    return 0;
int index = 1,pointer = 1;
while(pointer < nums.length){
    if(nums[pointer] == nums[index-1])
        pointer++;
    else
        nums[index++] = nums[pointer++];
}
return index;
```
[back to up](#List-of-Content)

---
## Medium Algorithms
##### Three Sum To Zero problem
- [Problem description and source](https://leetcode.com/problems/3sum/)
- Key concepts:
1. The main key is to sort the input array once in O(n log n) to have a sorted array.
2. By having a sorted array, it is possible to use the idea of having two pointers of left and right to scroll the whole array in each iteration of the main loop.
3. Finally it is solved in O(n^2)
4. The main challenges rise with the constraint of eliminating the repetitive elements. So, be careful with the indexes when working with arrays!!!

- Solutions:
```ruby
prevElement = 0, left = 0, right = 0
For i = 0 to arr.size - 2
  if (i>0 and prevElement == arr[i])
    continue;
  
  left = i+1
  right = arr.size - 1
  
  while(left < right){
    sum = arr[i] + arr[left] + arr[right]
    
    if(sum == 0)
      // one match is found
      result.add(arr[i],arr[left],arr[right)
    
    if(sum <= 0){
      // a bigger element is needed to find a probable match
      left++;
      
      // For preventing duplicate results
      while(left < arr.size && arr[left] == arr[left-1]) left++
    }
    else{
      // a smaller element is needed to find a probable match
      right--;
      
      // For preventing duplicate results
      while(right >=0 && arr[right] == arr[right+1]) right--
    }
  }
  
  prevElement = arr[i]
  
return result
```
[back to up](#List-of-Content)

##### Subarray Sum Equals K
- [Problem description and source](https://leetcode.com/problems/subarray-sum-equals-k/)
- Key concepts:
1. The key factor here is to consider that the sum[i , j] is equal to sum[0,j] - sum[0,i-1]. With this clue, we can store the cumulative sum of all indexes in a HashMap and look for the sum - k in the hashMap.
2. O(n) is the time complexity with O(n) space consumption.
- Solutions:
```ruby
int total = 0, sum = 0;
HashMap<Integer,Integer> preSum = new HashMap<>();

preSum.put(0,1);

for(int i = 0; i < nums.length; i++){
  sum += nums[i];
  if(preSum.containsKey(sum - k))
    total += preSum.get(sum - k);
    
  preSum.put(sum,preSum.getOrDefault(sum,0) + 1);
}
return total;
```
[back to up](#List-of-Content)

##### Minimum Remove to Make Valid Parentheses
- [Problem description and source](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)
- Key concepts:
1. Storing the index of any open paranthesis in Stack instead of its character to keep track of its appearance. When reaches to a close one, pop from stack, insert open pranthesis in its index and add close one. In case of alphabet chars, add them directly to the output.
2. Avoid using String concatanate or substring in each loop (this approach has a time complexity of O(n^2)), but instead use a char array for constructing the output and finally by using StringBuilder, form the final output.
3. O(n) is the time complexity 
- Solutions:
```ruby
for(int i=0;i<s.length();i++){
    c = s.charAt(i);
    if(c == '('){
        openParan.push(index++);
    }else if(c == ')'){
        if(openParan.size()>0){
            validS[index++] = c;
            validS[openParan.pop()] = '(';            
        }
    }else{
        validS[index++] = c;
    }
}

StringBuilder sb = new StringBuilder();
for (int i=0;i<s.length();i++){
    if(validS[i] != '\u0000')
        sb.append(validS[i]);
}
return sb.toString();
```
[back to up](#List-of-Content)

##### String Compression
- [Problem description and source](https://leetcode.com/problems/string-compression/)
- Key concepts:
1. Is to look at the prev element in the input array and keep track of its repeat.
2. O(n) is the time complexity with O(1) space consumption.
- Solutions:
```ruby
 for(int i = 0; i < chars.length; i++){
    if(chars[i] == curr)
        counter++;
    else{
        chars[index++] = curr;

        if(counter > 1){
            countChar = counter.toString().toCharArray();
            for(int j = 0; j<countChar.length; j++){
                chars[index++] = countChar[j];
            }
        }

        curr = chars[i];
        counter = 1;
    }
}
```
[back to up](#List-of-Content)

##### Search in Rotated Sorted Array
- [Problem description and source](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- Key concepts:
1. Behaving just like QuickSearch, but check whether the left sub-array is sorted or the right one. 
2. O(log n) is the time complexity with O(1) space consumption.
- Solutions:
```ruby
  int mid, result = -1, left = 0, right = nums.length-1;

  while(left<=right){
      mid = (left + right) / 2;
      if(nums[mid] == target){
          result = mid;
          break;
      }

      // left is sorted
      if(nums[left] <= nums[mid]){
          if(nums[left] <= target && nums[mid] >= target )
              right = mid - 1;
          else
              left = mid + 1;
      }else{
          // right is sorted
          if(nums[mid] <= target && nums[right] >= target )
              left = mid + 1;
          else
              right = mid - 1;
      }
  }
  return result;
```
[back to up](#List-of-Content)

##### Random Pick with Weight
- [Problem description and source](https://leetcode.com/problems/random-pick-with-weight/)
- Key concepts:
1. Using accumulative sum to do sampling. 
2. Generate an int random number in rage [1, max(accumulativeSum)] as a random sample
3. Find the index by looking up into the sorted accumulativeSum array by Binary Search.
Example: 
input: [2,5,1,4,2]
accumulativeSum = [2,7,8,12,14]
sample [1,2] -> idx = 0
sample [3,7] -> idx = 1
sample [8,8] -> idx = 2
sample [9,12] -> idx = 3
sample [13,14] -> idx = 4
2. O(n) is the time complexity. O(n) for generating accumulativeSum, but the lookup is done by O(log n)
- Solutions:
```ruby
public int pickIndex() {
    int left = 0;
    int right = wAcc.length - 1;
    int mid;
    //[1 max_sampling]
    int sample = rand.nextInt(wAcc[right]) + 1;
    while(left<right){
        mid = (left + right) / 2;
        if(wAcc[mid] == sample)
            return mid;
        else if(wAcc[mid] < sample)
            left = mid + 1;
        else if(wAcc[mid] > sample)
            right = mid;
    }
    return left;
}
```
[back to up](#List-of-Content)

##### Merge Intervals
- [Problem description and source](https://leetcode.com/problems/merge-intervals/)
- Key concepts:
1. If the input intervals would be a sorted array with respect to the first element, the a linea search from the begining would determine all overlapping intervals.
2. Therefore, O(n log n) would be the time complexity of the solution
```ruby
List<int[]> out = new ArrayList();
Arrays.sort(intervals,(A, B)->A[0]-B[0]);
int[] mergedElement = intervals[0];
for(int i=1;i<intervals.length;i++){
    if(mergedElement[1] >= intervals[i][0])
        mergedElement[1] = Math.max(mergedElement[1],intervals[i][1]);
    else{
        out.add(mergedElement);
        mergedElement = intervals[i];
    }
}
out.add(mergedElement);
return out.toArray(new int[out.size()][2]);
```
[back to up](#List-of-Content)

##### Product of Array Except Self
- [Problem description and source](https://leetcode.com/problems/product-of-array-except-self/)
- Key concepts:
1. If two different arrays holds all the products of the left side and the right side of any elements, then by multiplying the lef[i] by right[i] the result would be generated.
2. In a for loop, the left[] and the right[] arrays is generated.
3. The better approach is to doing this in O(1) of memory complexity. Generates the left[] array in the result[] array as its default value. Then, keeping the right value from the end of array in a simple int variable and multiply result[i] (which is the left[] array) by right at each element.
```ruby
int right =1;
int[] out = new int[nums.length];
out[0] = 1;
for(int i=1;i<nums.length;i++){
    out[i] = out[i-1] * nums[i-1];
}

for(int i=nums.length-1;i>0;i--){
    out[i] = out[i] * right;
    right = right * nums[i];
}
out[0] = right;
return out;
```
[back to up](#List-of-Content)

##### K Closest Points to Origin
- [Problem description and source](https://leetcode.com/problems/k-closest-points-to-origin/)
- Key concepts:
1- By adding each individual elements in a sorted array of size K, it will be assure that after a loop over all points, we have the Kth closest point. 
But this approach requires us to use of either Arrays.Sort or a MaxHeap, while both methods has a complexity of o(n log n).
2- So, for solving this problem in o(n), we can utilize the main property of QuickSelect algorithms, particularly the Partition algorithms, where after each run of Partition, the pivot is in its right place and also all smaller elements are placed before hand. So, if we kan find a pivot == k-1 then we know that all smallest K points are stored at the begining of the array up to K-1.
```ruby
int L = 0,
    R = points.length-1,
    pIndex=0;
while(L < R){
    pIndex = partition(points,L,R);
    if(pIndex == K-1)
        break;
    else if(pIndex > K)
        R = pIndex - 1;
    else
        L = pIndex + 1;
  }
return Arrays.copyOfRange(points,0,K);
}
private int partition(int[][] points,int L, int R){
    int pivot = distance(points[R]);
    int pIndex = L;
    for(int i=L; i<R; i++)
        if(distance(points[i]) < pivot){
            swap(points,i,pIndex);
            pIndex++;
        }
    swap(points,pIndex,R);
    return pIndex;
}
private int distance(int[] point){
    return point[0] * point[0] + point[1] * point[1];
}
```
[back to up](#List-of-Content)

##### Top K Frequent Elements
- [Problem description and source](https://leetcode.com/problems/top-k-frequent-elements/)
- Key concepts:
1- Calculate the requency of all elements in a HashMap and add all unique elements into a list for furthur calculation.
2- Unisng QuickSelect algorithms but, the comparision needs to be don by the frequency (HashMap) and the swap is done in unique elements list.
3- the boundry of the quick select is a little tricky, in which the condition should be (if pIndex == uniqs.length - k) instead of (if pIndex == k)
```ruby
HashMap<Integer,Integer> freq = new HashMap();
List<Integer> uniqList = new ArrayList<Integer>();
for(int i=0;i<nums.length;i++){
    if(!freq.containsKey(nums[i]))
        uniqList.add(nums[i]);
    freq.put(nums[i],(freq.getOrDefault(nums[i],0)+1));
}

int[] uniqs = new int[uniqList.size()];
for(int i=0;i<uniqList.size();i++)
    uniqs[i] = uniqList.get(i);

int L = 0,
    R = uniqs.length-1,
    pIndex = 0;

while(L<R){
    pIndex = partition(freq,uniqs,L,R);
    if(pIndex == uniqs.length - k)
        break;
    else if(pIndex < uniqs.length - k)
        L = pIndex+1;
    else
        R = pIndex-1;
}
return Arrays.copyOfRange(uniqs,L,uniqs.length);
```
[back to up](#List-of-Content)

##### Interval List Intersections
- [Problem description and source](https://leetcode.com/problems/interval-list-intersections/)
- Key concepts:
1- If Max(list1[i][0],list2[j][0]) <= Min(list1[i][1],list2[j][1]) then we have an intersection between ith interval from list1 and jth interval from list2.
2- increase either i or j by one based on the smallest End coordinate.
```ruby
List<int[]> out = new ArrayList();
int iIdx = 0;
int jIdx = 0;
int start,end;
while(iIdx < firstList.length && jIdx < secondList.length){
    start = Math.max(firstList[iIdx][0],secondList[jIdx][0]);
    end = Math.min(firstList[iIdx][1],secondList[jIdx][1]);

    if(start<=end){
        // new intersect detected
        out.add(new int[]{start,end});
    }
   if(firstList[iIdx][1] <= secondList[jIdx][1]){
        iIdx++;
    }else{
        jIdx++;
    }
}
return out.toArray(new int[out.size()][]);
```
[back to up](#List-of-Content)

---
## Hard Algorithms
##### Merge k Sorted List problem
- [Problem description and source](https://leetcode.com/problems/merge-k-sorted-lists)
- Key concepts:
1. Using MinHeap data structure to retrieve the min element among the head of all lists.
2. This approach has the time complexity of O(n log k)
- Solutions:
```ruby
current = head = result = new ListNode
pq = new PriorityQueue
For list in lists
  If list is not null
    pq.offer(list)
If pq.size() == 0
  return null;
while(qp.size() >0 )
  current = pq.poll()
  Result.next = current
  result = result.next
  if(current.next != null)
    pq.offer(current.next)
return head.next
```
[back to up](#List-of-Content)
