I am reading "Data Structure and Algorithm in Java" by Robert Lafore. I was reading another book with C++ before but honestly I don't feel comfortable and don't feel it's practical to learn data structure in C++ as a self-taught, because I will mainly only learn either Java or C++ for technical interview, so why use C++ when you can just use Java for easiness?

Let the journey of learning begin!

PS: This project's purpose is mainly to document my learning experience of data structure, and hopefully by having the project and document it it will motivate me to stick it to the end. Cheers!

---
Some useful stuff

<img src="assets/adv_disadv_1.png">
<img src="assets/adv_disadv_2.png">

---Done Chapter 1

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
The rear is the beginning of the array, and the head is the end of the array

<a href="workable/queue.java" 
target="_ blank">Queue Array Implementation</a>

(One more thing about just reading it on textbook, is the code doesn't have color and its hard to read)
(One more thing is having it online allows you to saving time when redoing it with your own version)

(2 months has passed. I am coming back from a digression of reading the queue implementation. Just can't figure out why rear has to equal to -1 and can't be 0, and if I can make it to become 0)


### Try to solve Queue Implementation 
So there are two problems I have, 1. why rear is -1 and front is 0, 2. why rear is on the left and front is on the right of the array.

Third question, there are many kinds of implementation of Queue, which one is correct, which use should I use? Which one should I write it into my notes

To answer this question, I need to figure out one of them, and implement it correctly and then write down the code, which is the hardest part, because I can't break down the construction of implementation process.

<a href="https://www.youtube.com/watch?v=okr-XE8yTO8" 
target="_ blank">[mycodeschool]Queue explaination by someone which rear and front are -1, which is more understandable</a>

By the explaination is too fast, I kind of understand the pseudo code, but not totally, still very vague

Tried looking up to google, the text format is too hard to distill.

<a href="https://www.geeksforgeeks.org/circular-queue-set-1-introduction-array-implementation/" 
target="_ blank">[circular queue webpage geekforgeek]Another circular queue implementation that has rear and front equals to -1.</a>

<a href="https://www.youtube.com/watch?v=wjI1WNcIntg" 
target="_ blank">Queue in Linked List</a>

<a href="https://www.youtube.com/watch?v=gnYM_G1ILm0" 
target="_ blank">[some random youtuber]Another queue implementation that has rear on the right</a>

<a href="https://www.youtube.com/watch?v=q5oOYxfOD1c" 
target="_ blank">[geekforgeek video]Another queue implementation that has rear equals to capacity - 1</a>

So the implementation in this book is largely simplify.    
The implementation doesn't do error checking like checking if full for insert

So here I have to make a choice here. Whether to use the simply queue implementation in the book, or use the one on GeekforGeek

To figure out which to use, I have to completely understand the implementation of the book's and of the GeekForGeek's and then compare it.

To better do that, just reading it and taking mental note is not enough. I need to write down the explanation of both.

For the book's, front=0; rear=-1; insert: when rear is at the end of the array, make it -1, don't worry, we will add it at the end anyways.

The remove increment the front, and then check wrapping

Ok, I find a line saying this implementation assumes the queue is not full. This is *important*

For GeekForGeek,front and rear=-1; it has a full check, and a first element check to both front and rear to 0; *okay, the book's implementation is more elegant but more complex, because it combines the first element check and other condition*.

It also has a front!=0 check for the wrap around condition, why? One obvious reason is it's a check for full condition.  The book's implementation doesn't have it because it has an assumption. One lesson learn: *assumption can be major*.

For the remove/dequeue, do an empty check,

One difference between front=0 vs =1 is the other functions.

I actually really want to just forget the implementation from the book, and just write down the implementation from geekforgeek and mycodeschool

I need a bigger screen to write the implementation, or even better double screen. I can use my ipad to read, I can download the book to ipad and read it there. Or I can just do it with a laptop

Okay I was writing the circular implementation from geekForgeek, this (rear==(front-1)%(size-1))) is confusing me.

When enqueue, front doesn't wrap around if front is bigger than the array size.

(A few minutes later)

Oh crap, front doesn't move with enqueue, it wraps around at dequeue, my bad

Okay, successfully implement based on GeekForGeek. Its at queue2.java

**Lesson Learned**: where there is slightly more complicate math, like (rear==(front-1)%(size-1))), make example...(but maybe writing it on the code is not such a good idea but it makes the code messier, I wish I can attach a sticky note to the code, but because its coding it must be a document, but having the property of a adherent feature is difficult. I have to be creative to solve this problem, or I just deal with it as it is. 
	
If its on paper, I will have it on a draft paper, but I also want to keep the notes. What do I do? 

Because of this, computer science note is destined to be messy.

Or I should not keep the notes.

Whats the goal? Keep my calculation, and be reminded of how I solve this problem. Because of this, I can have a "Tips and Tricks section")

I think its a good idea. Is there a better idea?

What would be the format of Tips and Tricks. Reference of page, calculation and notes, and lesson learned.
* * *

Whats next? Keep reading? Constructing Tips and Tricks? Dive deeper into Queue and combine the function from the book and from geekforgeek? Write more implementation from mycodeschool? but mycodeschool is not circular.

Just check another implementation.     
The way geekforgeek do it seems to be the standard.

Now another question, there are some many ways to implement a data structure, how do I make peace of it.

Just remember one? Learn the pseudo code?

Anyways, what makes them different?

I want to compare all of them and figure out their code structure and figure out what makes them different.    
But its very time consuming     
In the term of Myers-briggs, it is my Ni trying to figure out the why, for sure I can't use Si to remember them, but if I know the pseudo code, and able to implement it, then I pass the test.
Si to remember the pseudo code.    
yeah, what exactly is the pseudo code for queue, maybe I will have another text file for pseudo code

Looking back, just figuring out Queue implementation took 2 months from March to May, luckily I can do it in my own pace by self-studying

