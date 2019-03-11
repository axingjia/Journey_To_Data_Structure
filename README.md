I am reading "Data Structure and Algorithm in Java" by Robert Lafore. I was reading another book with C++ before but honestly I don't feel comfortable and don't feel it's practical to learn data structure in C++ as a self-taught, because I will mainly only learn either Java or C++ for technical interview, so why use C++ when you can just use Java for easiness?

Let the journey of learning begin!

PS: This project's purpose is mainly to document my learning experience of data structure, and hopefully by having the project and document it it will motivate me to stick it to the end. Cheers!

---
Some useful stuff

<img src="assets/adv_disadv_1.png">
<img src="assets/adv_disadv_2.png">

---

Array:
Insert: 1 step
Search: N, average N/2
Delete: Search and move the rest of the array

---

A bit of digression:

I am curious about 3D in Java suddenly. And discover and figure out this.

<a href="http://www.youtube.com/watch?feature=player_embedded&v=W3R9X0VCFu0" 
target="_ blank">

<img src="http://img.youtube.com/vi/W3R9X0VCFu0/0.jpg"
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" />
</a>

---

Start of the construction of my review question:
[Review Question](./review_questions)


selectsort and bubblesort are all O(N^2), but selectsort is faster.

insertion sort algorithm visualization:

<img src="assets/insertsort.png">

Insertion sort logic:
In the outer for loop, out starts at 1 and moves right. It marks the leftmost unsorted data. In the inner while loop, in starts at out and moves left, until either temp is smaller than the array element there, or it can’t go left any further. Each pass through the while loop shifts another sorted element one space right.

How many comparisons and copies does this algorithm require? On the first pass, it compares a maximum of one item. On the second pass, it’s a maximum of two items, and so on, up to a maximum of N-1 comparisons on the last pass. This is
1 + 2 + 3 + ... + N-1 = N*(N-1)/2
However, because on each pass an average of only half of the maximum number of items are actually compared before the insertion point is found, we can divide by 2, which gives
N*(N-1)/4

For data that is already sorted or almost sorted, the insertion sort does much better. When data is in order, the condition in the while loop is never true, so it becomes a simple statement in the outer loop, which executes N-1 times. In this case the algo- rithm runs in O(N) time. If the data is almost sorted, insertion sort runs in almost O(N) time, which makes it a simple and efficient way to order a file that is only slightly out of order.

However, for data arranged in inverse sorted order, every possible comparison and shift is carried out, so the insertion sort runs no faster than the bubble sort.

Stability:
Some sorting algorithms retain this secondary ordering; they’re said to be stable.

All the algorithms in this chapter are stable. For example, notice the output of the objectSort.java program (Listing 3.4). Three persons have the last name of Smith. Initially, the order is Doc Smith, Lorraine Smith, and Paul Smith. After the sort, this ordering is preserved, despite the fact that the various Smith objects have been moved to new locations.

Comparing the sorts
The selection sort minimizes the number of swaps, but the number of comparisons is still high. This sort might be useful when the amount of data is small and swapping data items is very time-consuming compared with comparing them.

MY: selection sort is picking the position, and put the right item at that position. insertion sort is getting the next item, and put it at the left pile while maintaining its sortedness on the left pile

# Chapter 4

Stack and queue enforces restricted access

<a href="workable/stack.java" 
target="_ blank">Stack Implementation</a>

//skip reversing a word using stack, it's just breaking down a string with charAt and push it into a stack and pop it then cancat it to an empty string

<a href="workable/brackets.java" 
target="_ blank">Delimiter matching</a>

Efficiency of stack: pop and push are both O(1)

* * *

About circular queue: a way to make the front and the back moves forward so the back doesn't need to reach the end of the array

(A little bit of hiccup here. The markdown on atom.io turns everything after an underscore to purple. And then digress to other things. After three months since December last year, now get back to it)

(Also, I feel like self-teaching CS and reading a 800pages e-book require some sort of keep-tracking. And a note/review/sharing place on github fits the bill for this purpose very well).
(The reason for it is because you need to try to execute the code to learn CS, just reading about it is too abstract(at least for me). )

Insert is called add/put/enque, remove is called delete/get/deque
The rear of the queue is inserted is also called back/tail/end, the head is also called front.

<a href="workable/queue.java" 
target="_ blank">Queue Array Implementation</a>

(One more thing about just reading it on textbook, is the code doesn't have color and its hard to read)
(One more thing is having it online allows you to redo it with your own version by saving time)

