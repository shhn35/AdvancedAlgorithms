# AdvancedAlgorithms
Here some advanced algorithms based on [LeetCode](https://leetcode.com/problems) problems are implemented and tested in Java. These algorithms is devide in three main categories based on their dificulties.

## List of Content
#### [Easy](#Easy-Algorithms)
###### Two Sum problem [(goto)](#Two-Sum-problem)
###### Reverse Integer problem [(goto)](#Reverse-Integer)
###### Remove Duplicate in Sorted Array problem [(goto)](#Remove-Duplicat-in-Sorted-Array)
#### [Medium](#Medium-Algorithms)
###### Three Sum To Zero [(goto)](#Three-Sum-To-Zero-problem)
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
