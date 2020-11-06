# AdvancedAlgorithms
Here some advanced algorithms based on [LeetCode](https://leetcode.com/problems) problems are implemented and tested in Java. These algorithms is devide in three main categories based on their dificulties.

## List of Content
#### [Easy](#Easy-Algorithms)
###### Two Sum problem [(goto)](#Two-Sum-problem)
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

[back to up](#List-of-Content)

---
## Medium Algorithms
##### Three Sum To Zero problem
- [Problem description and source](https://leetcode.com/problems/3sum/)
- Key concepts:
1. The main key is to sort the input array once in O(n log n) to have a sorted array.
2. By having a sorted array, it is possible to use the idea of having two pointers of left and right to scrool the whole array in each iteration of main loop.
3. Finally it is colved in O(n^2)
4. The main challenges rise with the constraint of eliminating the repeatetive elements. So, be careful with the indexes when working with arrays!!!
- Solutions:
```ruby
Get an aux memory as HashMap (pairs)
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
