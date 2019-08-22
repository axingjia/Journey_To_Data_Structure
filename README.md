I am revisiting Data Structure by reading "Data Structure and Algorithm in Java" by Robert Lafore. I was reading another book with C++ before but honestly I don't feel comfortable and don't feel it's practical to learn data structure in C++ as a self-taught, because I will mainly only learn either Java or C++ for technical interview, so why use C++ when you can just use Java for easiness?

Let the journey of learning begin!

PS: This project's purpose is mainly to document my learning experience of data structure, and hopefully by having the project and document it it will motivate me to stick it to the end. Cheers!

Edit:5/24/2019:     
Here are the advantages of taking notes on github, that I realized after 4 months into this:    
1. The code is colorized
2. You can check previous code conveniently because it's stored and organized
3. You can copy and paste code from the textbook easily instead of spend eternity writing them down on a paper
4. The note can be viewed anywhere
5. The formating of writing on github is a lot easier, compared to try to organize it with paper
6. Remembering where you have read to is a lot easier
7. Documents are better organized

Here are the advantages of reading it in actual code, compared to just reading pseudocode and try to write it yourself: (aka why I read this book)    
1. You have something concrete to remember, instead of just remembering the process of the pseudocode
2. One thing that I was very curious is about different implementation of the same code, pseudocode can't be compared. It's not concrete
3. You don't need to waste time figuring out the actual code from pseudocode. 


---
Some useful stuff

<img src="assets/adv_disadv_1.png">
<img src="assets/adv_disadv_2.png">

---Done Chapter 1

Array:
Insert: 1 step    
Search: N, average N/2    
Delete: Search and move the rest of the array    

* * *

A bit of digression:

I am curious about 3D in Java suddenly. And discover and figure out this.

<a href="http://www.youtube.com/watch?feature=player_embedded&v=W3R9X0VCFu0" 
target="_ blank">

<img src="http://img.youtube.com/vi/W3R9X0VCFu0/0.jpg"
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" />
</a>

* * *

### Chapter 3 Sort

(**Tips: when thinking about 2d array, thinking of it as when outter array is 0, inner array goes from 0 to n** no from the big picture, it wouldnt make sense that way)

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

**MY: selection sort is picking the position, and put the right item at that position. insertion sort is getting the next item, and put it at the left pile while maintaining its sortedness on the left pile**

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

### Deques 
("we won't explore it further here")

### Priority Queue
like an ordinary queue, a priority queue has a front and a rear; however, in a priority queue, items are ordered by key value so that the item with the lowest key is always at the front. Items are inserted in the proper position to maintain the order

(Priority queue will be used in finding something called a minimum spanning tree for a graph in Chapter 14, "weighted graphs")

(In a preemptive multitasking operating system, for example, program may be placed in a priority queue so the highest priority program is the next one to receive a time-slice that allows it to execute)

You also awnt a priority queue to provide fairly quick insertion. Because of that, priority queue is often implemented witha data structure called a heap.

In this chapter, we will implement

(Okay, in this book, the front is at nElement-1, and not at index 0, which is different from other common implementations)

so what to do here..I can jog down this implementation, and then explore the common implementation, and then figure out the difference. Yes, this is the high way to go.

Jog down this implementation done, the implementation is largely different, the rear is at the beginning of the array and the rear is at the right, enqueue is on the left O(n) and delete is on the right.

But isn't normally the enqueue is on the right?

** The real problem is, there is no front and rear pointer**

Also, this implementation doesn't check if array is full 

### Parsing arithmetic Expression
for example: 2*(3+4) or ((2+4)*7)+3*(9–5)

It's easier for the algorithm to use a two-step process: 
1. Transform the arithmetic expression into a different format, called postfix notation
2. Evaluate the postfix expression

#### Postfix Notation
2+2 and 4/7 is called infix notation

In postfix notation , the operator follows the two operands. Thus A+B becomes AB+, a/b becomes AB/. More complex infix expressions can likewise be translated into postfix notation

A+B–C   AB+C–      
A*B/C   AB*C/     
A+B*C   ABC*+     
A*B+C   AB*C+     
A*(B+C)   ABC+*     
A*B+C*D   AB*CD*+     
(A+B)*(C–D)   AB+CD–*     
((A+B)*C)–D   AB+C*D–     
A+B*(C–D/(E+F))   ABCDEF+/–*+     

PS: this parsing algorithm only works for single digit numbers, although these expressions may evaluate to multidigit numbers

I just make the infix to postfix parse working, but how it works is still unclear. Anyways, I will try to figure it out later, with figuring out chapter 3.

Just make the postFix evaluation working too, but how it works is unclear, or should I say, the pseudocode of making it work is unclear.

Nice, chapter 5 now 

### Chapter 5, Linked Lists

In chapter 2, "array", we saw we saw that arrays had certain disadvantages as data storage structures. In an unordered array, searching is slow, whereas in an ordered array, insertion is slow. In both kinds of arrays, deletion is slow. Also, the size of an array can’t be changed after it’s created.

In this chapter we will look at a data storage structure that solves some of these problems: the *linked list*.

Most of the time you can use a linked list in many cases in which you use an array, unless you need frequent random access to individual item using an index

Link (MY: aka node):

		class Link
		{
		public int iData; // data
		public double dData; // data
		public Link next; // reference to next link
		}

### Reference and Basic Types
Being able to put a field of type Link inside the class definition of this same type may seem odd. Wouldn’t the compiler be confused? How can it figure out how big to make a Link object if a link contains a link and the compiler doesn’t already know how big a Link object is?

The answer is that in Java a Link object doesn’t really contain another Link object, although it may look like it does. The next field of type Link is only a reference to another link, not an object.

Note that in Java, primitive types such as int and double are stored quite differently than objects. Fields containing primitive types do not contain references, but actual numerical values like 7 or 3.14159.

A primitive type creates a space in memory and puts the number 65000.00 into this space. However, a reference to an object like

		Link aLink = someLink;

puts a reference to an object of type Link, called someLink, into aLink. The someLink object itself is located elsewhere. It isn’t moved, or even created, by this statement; it must have been created before. To create an object, you must always use new:

		Link someLink = new Link();

Other languages, such as C++, handle objects quite differently than Java. In C++ a field like

		Link next;
		
actually contains an object of type Link. You can’t write a self-referential class definition in C++ (although you can put a pointer to a Link in class Link; a pointer is similar to a reference). C++ programmers should keep in mind how Java handles objects; this usage may be counter-intuitive.	

		class LinkList
		{
		private Link first; // ref to first link on list
		// -------------------------------------------------------------
		public void LinkList() // constructor
		{
		first = null; // no items on list yet
		}
		// -------------------------------------------------------------
		public boolean isEmpty() // true if list is empty
		{
		return (first==null);
		}
		// -------------------------------------------------------------
		// ... other methods go here
		}


**IMPORTANT**:

		public void insertFirst(int id, double dd)
		{ // make new link
			Link newLink = new Link(id, dd);
			newLink.next = first; // newLink --> old first
			first = newLink; // first --> newLink
		}
		
the new node's next point to the first, and first points to new pointer... This is a mess.

MY:Okay, when the first is on the right, it is the object; when its on the left, it is the reference, Let's think of it this way. This might be the key point I have been missing.

Lets think deeper. What if head is the object. then the third statement will not make sense.    
What if head is just the reference. Then new_node.next will point to what head points to, and first is also pointing to newLink. This can make sense too. So which one is the right one.

One thing to notice is head is a pointer that doesn't have a next reference. Head is just a reference. so newLink.next = first; actually is just the new node pointing what the first/head is referencing. And first = newLink; is the reference, which doesn't change address, pointing to the object of the new node.

###### The deleteFirst method 
This method is the reverse of insertFirst(). It disconnects the first link by rerouting first to point to the second link.

		public Link deleteFirst() // delete first item
		{                         // (assumes list not empty)
			Link temp = first; // save reference to link
			first = first.next; // delete it: first-->old next
			return temp; // return deleted link
		}
temp is the reference of the object of where first points to. first reference now points to the next which belongs to where the first points to.

Notice that the deleteFirst() method assumes the list is not empty. Before calling it, your program should verify this fact with the isEmpty() method.

###### The displayList() Method
To display the list, you start at first and follow the chain of references from link to link. A variable current points to (or technically refers to) each link in turn. It starts off pointing to first, which holds a reference to the first link. The statement

		current = current.next;
		
changes current to point to the next link because that’s what’s in the next field in each link. Here’s the entire displayList() method:

		public void displayList()
		{
			System.out.print(“List (first-->last): “);
			Link current = first; // start at beginning of list
			while(current != null) // until end of list,
			{
				current.displayLink(); // print data
				current = current.next; // move to next link
			}
			System.out.println(“”);
		}

###### Finding and Deleting Specific Links

This is the find code

		public Link find(int key) // find link with given key
		{ // (assumes non-empty list)
			Link current = first; // start at 'first'
			while(current.iData != key) // while no match,
			{
				if(current.next == null) // if end of list,
					return null; // didn’t find it
				else // not end of list,
					current = current.next; // go to next link
			}
			return current; // found it
		}
		
MY: One question I have is, why here it it has a if current.next==null check but displayList doesn't have it..? in find() it can stop before checking the null pointer which is also the tail. so it won't evaluate current.iData. I will change it around to give it a check to see if it will throw an error.

Result: yes, it will throw a nullPointerException    
Because I am doing null.iData, which will throw error

And delete makes sense too. I just need a way to remember insertFirst,deleteFirst,find, and delete

### Double-End Lists
Everything is the same as regular linklist except: a reference to the last link as well as to the first

Access to the end of the list as well as the beginning makes the double-ended list suitable for certain situations that a single-ended list can’t handle efficiently. One such situation is implementing a queue


		public void insertFirst(long dd) // insert at front of list
		{
		    Link newLink = new Link(dd); // make new link
		    if( isEmpty() ) // if empty list,
		        last = newLink; // newLink <-- last
		    newLink.next = first; // newLink --> old first
		    first = newLink; // first --> newLink
		}
		
Why last =newlink??? Oh, it's when it's empty, then last will point to the first element that's entered, which is the last.

		public void insertLast(long dd) // insert at end of list
		{
		    Link newLink = new Link(dd); // make new link
		    if( isEmpty() ) // if empty list,
		        first = newLink; // first --> newLink
		    else
		        last.next = newLink; // old last --> newLink
		    last = newLink; // newLink <-- last
		}

when its empty, first and last point to the new node, if its not empty, last will point to new link and the previous will point to the new link.

		public long deleteFirst() // delete first link
		{ // (assumes non-empty list)
		long temp = first.dData;
		if(first.next == null) // if only one item

		    last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
		}

when its the last element, last=null;

Unfortunately, deleteing the last node won't be an option because there is still no reference to the next to last node, whose next field would need to be changed to null if the last node were deleted. To achieve that, you need doubly linkedlist

### Time Efficiency
Insertion and deletion is O(1)    
Finding, deleting or inserting next to a specific item are O(N). An array is also O(N) for these operations, but the linked list is nevertheless faster because nothing needs to be moved when an item is inserted or deleted. The increased efficiency can be significant, epecially if a copy takes much longer than a comparison.

### Abstract Data types
In array implementation of stack, push and pop are as:

	arr[++top]=data;
	data=arr[top--];

In linklist implementation of stack, it is:

	theList.insertFirst(data)
	data = theList.deleteFirst()

### ADT List
You can insert an item, delete an item, and usually read an item from a specific location (the third item, say).

Don't confuse the ADT list with the linked list. A list is defined by its interface: the specific methods used to interact with it. This interface can be implemented by various structures, including arrays and linked lists. The list is an abstraction of such data structures.

### Sorted List 
In general you can use a sorted list in most situations in which you use a sorted array. The advantages of a sorted list over a sorted array are speed of insertion (because elements don’t need to be moved) and the fact that a list can expand to fill available memory, while an array is limited to a fixed size. However, a sorted list is somewhat more difficult to implement than a sorted array

A sorted list can also be used to implement a priority queue, although a heap is a more common implementation.

		public void insert(long key) // insert in order
		{
			Link newLink = new Link(key); // make new link
			Link previous = null; // start at first
			Link current = first;
			// until end of list,
			while(current != null && key > current.dData)
			{ // or key > current,
				previous = current;
				current = current.next; // go to next item
			}
			if(previous==null) // at beginning of list
				first = newLink; // first --> newLink
			else // not at beginning
				previous.next = newLink; // old prev --> newLink
			newLink.next = current; // newLink --> old current
		} // end insert()
		
Okay, I checked the implementation of a simple linked list, the implementation is again a little bit different. It uses previous here and a simple linked list use first in its insertFirst.

### List Insertion Sort 
Imagine you put an unsorted array into a sorted linklist, and then put it back to the array. This turns out to be substantially more efficient than the more usual insertion sort within an array. 

However, each item is copied only twice: once from the array to the list and once from the list to the array. N*2 copies compares favorably with the insertion sort within an array, where there are about N^2 copies.

The drawback of it is it takes twice the memory.

### Doubly Linked lists

		class Link
		{
		public long dData; // data item
		public Link next; // next link in list
		public link previous; // previous link in list
		...
		}
		
The upside is you can traverse backward, the downside is every time you insert or delete a link you must deal with four links instead of two: two attachments to the previous link and two attachments to the following one.

Traverse backward:

		Link current = last; // start at end
		while(current != null) // until start of list,
		current = current.previous; // move to previous link

### Insertion 
There are insertFirst(), insertLast(), and insertAfter() now

Unless the list is empty, the insertFirst() routine changes the previous field in the old first link to point to the new link and changes the next field in the new link to point to the old first link. Finally, it sets first to point to the new link. 

If the list is empty, the last field must be changed instead of the first.previous field.

		if( isEmpty() ) // if empty list,
		last = newLink; // newLink <-- last
		else
		first.previous = newLink; // newLink <-- old first
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink

The insertLast() method is the same process applied to the end of the list; it’s a mirror image of insertFirst().

First, the link with the specified key value must be found. This procedure is handled the same way as the find() routine in the linkList2.java program (Listing 5.2). Then, assuming we’re not at the end of the list, two connections must be made between the new link and the next link, and two more between current and the new link.

If the new link will be inserted at the end of the list, its next field must point to null, and last must point to the new link. 

		if(current==last) // if last link,
		{
		newLink.next = null; // newLink --> null
		last = newLink; // newLink <-- last
		}
		else // not last link,
		{
		newLink.next = current.next; // newLink --> old next
		// newLink <-- old next
		current.next.previous = newLink;
		}
		newLink.previous = current; // old current <-- newLink
		current.next = newLink; // old current --> newLink
		
There got to be some way to remember it, maybe coding it myself once will be a good idea? I will write the question in the review question page.

		current.next.previous
		
means the previous field of the link referred to by the next field in the link current.

### Deletion
There are three deletion routines: deleteFirst(), deleteLast(), and deleteKey()

Assuming the link to be deleted is neither the first nor the last one in the list, the next field of current.previous (the link before the one being deleted) is set to point to current.next (the link following the one being deleted), and the previous field of current.next is set to point to current.previous. 

MY: Again, I need some way to remember it

		if(current==first) // first item?
		first = current.next; // first --> old next
		else // not first
		// old previous --> old next
		current.previous.next = current.next;
		if(current==last) // last item?
		last = current.previous; // old previous <-- last
		else // not last
		// old previous <-- old next
		current.next.previous = current.previous;
		
[The implementation](./workable/DoublyLinked.java)

The deletion methods and the insertAfter() method assume that the list isn’t empty



### Doubly Linked List as Basis for Deques
A doubly linked list can be used as the basis for a deque, mentioned in the preceding chapter. In a deque you can insert and delete at either end, and the doubly linked list provides this capability.


### Iterator
A data structure that allows you step from link to link    
A reference called current that is incremented to move to the next link    
However, how many references are needed. There really isn't an answer. Thus, it seems easier to allow the user to create as many such references as necessary.    
To make this possible in an object-oriented language, it's natural to embed each reference in a class object. This object can't be the same as the list class because there;s only one list object, so it is normally implemented as a separate class

To use such an iterator, the user might create a list and then create an iterator object associated with the list. Actually, as it turns out, letting the list create the iterator is easier, so it can pass the iterator certain information, such as a reference to its first field. 


		public static void main(...)
		{
		LinkList theList = new LinkList(); // make list
		ListIterator iter1 = theList.getIterator(); // make iter
		Link aLink = iter1.getCurrent(); // access link at iterator
		iter1.nextLink(); // move iter to next link
		}
		
The iterator always points to some link in the list. It’s associated with the list, but it’s not the same as the list or the same as a link. 

### Additional Iterator Features
We’ve seen several programs in which the use of a previous field made performing certain operations simpler, such as deleting a link from an arbitrary location. Such a field is also useful in an iterator.

Also, it may be that the iterator will need to change the value of the list’s first field—for instance, if an item is inserted or deleted at the beginning of the list. If the iterator is an object of a separate class, how can it access a private field, such as first, in the list? One solution is for the list to pass a reference from itself to the iterator when it creates the iterator. This reference is stored in a field in the iterator. The list must then provide public methods that allow the iterator to change first. These LinkList methods are getFirst() and setFirst(). (The weakness of this approach is that these methods allow anyone to change first, which introduces an element of risk.)

		class ListIterator()
		{
		private Link current; // reference to current link
		private Link previous; // reference to previous link
		private LinkList ourList; // reference to “parent” list
		public void reset() // set to start of list
		{
		current = ourList.getFirst(); // current --> first
		previous = null; // previous --> null
		}
		public void nextLink() // go to next link
		{
		previous = current; // set previous to this
		current = current.next; // set this to next
		}
		...
		}
		
The nextLink need to be looked into a little more closely in the future

### Iterator Methods
All operations previously performed by the class that involve iterating through the list, such as insertAfter(), are more naturally performed by the iterator.

List of methods:
* reset() -- Sets the iterator the start of the list 
* nextLink()--move the iterator the next link 
* getCurrent()--returns the link at the iterator
* atEnd-- Return true if the iterator is at the end of the list
* insertAfter()
* insertBefore()
* deleteCurrent()

Deciding which tasks should be carried out by an iterator and which by the list itself
is not always easy. An insertBefore() method works best in the iterator, but an
insertFirst() routine that always inserts at the beginning of the list might be more
appropriate in the list class. We’ve kept a displayList() routine in the list, but this operation could also be handled with getCurrent() and nextLink() calls to the iterator.

[iterator implementation](./workable/interIterator.java)

MY: how linklist encapsulate iterator is interesting too. It has a function that return a new iterator that accepts a parameter of a linked list object, replaced with this keyword.


When you delete an item with deleteCurrent(), should the iterator end up pointing
to the next item, to the previous item, or back at the beginning of the list? Keeping
the iterator in the vicinity of the deleted item is convenient because the chances are
the class user will be carrying out other operations there. However, you can’t move it
to the previous item because there’s no way to reset the list’s previous field to the
previous item. (You would need a doubly linked list for that task.) Our solution is to
move the iterator to the link following the deleted link. If we’ve just deleted the item at the end of the list, the iterator is set to the beginning of the list.

Traverse a list

		iter1.reset(); // start at first
		long value = iter1.getCurrent().dData; // display link
		System.out.println(value + “ “);
		while( !iter1.atEnd() ) // until end,
		{
		iter1.nextLink(); // go to next link,
		long value = iter1.getCurrent().dData; // display it
		System.out.println(value + “ “);
		}

Sample Code:

	class InterIterApp
	{
	public static void main(String[] args) throws IOException
	{
	LinkList theList = new LinkList(); // new list
	ListIterator iter1 = theList.getIterator(); // new iter
	iter1.insertAfter(21); // insert links
	iter1.insertAfter(40);
	iter1.insertAfter(30);
	iter1.insertAfter(7);
	iter1.insertAfter(45);
	theList.displayList(); // display list
	iter1.reset(); // start at first link
	Link aLink = iter1.getCurrent(); // get it
	if(aLink.dData % 3 == 0) // if divisible by 3,
	iter1.deleteCurrent(); // delete it
	while( !iter1.atEnd() ) // until end of list,
	{
		iter1.nextLink(); // go to next link
	aLink = iter1.getCurrent(); // get link
	if(aLink.dData % 3 == 0) // if divisible by 3,
	iter1.deleteCurrent(); // delete it
	}
	theList.displayList(); // display list
	} // end main()
	} // end class InterIterApp


Other methods like **find()** and **replace()**. This is up for exercise

## 6. Recursion

Intuitive way of coming out the solution of triangular number:    
1.First, think of it as combination of 2 components. In this case, n and the sum of the remaining column.

		int triangle(int n)
		{
		return( n + sumRemainingColumns(n) ); // (incomplete version)
		}
		
however, that the sum of all the remaining columns for term n is the same as the sum of all the columns for term n-1. Thus, if we knew about a method that summed all the columns for term n, we could call it with an argument of n-1 to find the sum of all the remaining columns for term n:

		int triangle(int n)
		{
		return( n + sumAllColumns(n-1) ); // (incomplete version)
		}
		
Then it becomes:

		int triangle(int n)
		{
		return( n + triangle(n-1) ); // (incomplete version)
		}
		
Passing the buck:    
but in this way, the buck is continuously passed down 

The buck stop here:

To prevent an infinite regress, the person who is asked to find the first triangular number of the series, when n is 1, must know, without asking anyone else, that the answer is 1. There are no smaller numbers to ask anyone about, there’s nothing left to add to anything else, so the buck stops there. We can express this by adding a condition to the triangle() method:

		int triangle(int n)
		{
		if(n==1)
		return 1;
		else
		return( n + triangle(n-1) );
		}


### Anagram

Anagram is hard.

And there are so many ways to implement it. I am gonna find all of them.

		public static void doAnagram(int newSize)
		{
		if(newSize == 1) // if too small,
		return; // go no further
		for(int j=0; j<newSize; j++) // for each position,
		{
		doAnagram(newSize-1); // anagram remaining
		if(newSize==2) // if innermost,
		displayWord(); // display it
		rotate(newSize); // rotate word
		}
		}

* Ok my thinking process goes from I don't get it    
* To maybe there are resource that helps me understand it    
* To I don't get that either or I can't find the same thing(divide into its too long, too many code, too dense)    
* Back to maybe reading the section again can help    
* reading through the whole thing now finally and still don't get it(divide into thinking about not getting it and reading the next line and get something)    
* Now thinking I need to know more about recursion before I can solve this anagram problem
* Now I draw recursive function call on paper    
* Now what's display word    
So the function call looks like a k-ary tree basically,    
* Now I am thinking I need to read other implementation because this implementation is "different"
* the implementation is definitely different. Some other implementation is based on **swap** and not **rotate**
[Swap implementation](https://www.youtube.com/watch?v=AfxHGNRtFac&t=343s)
* Now I have a decision to whether dive into it or check more implementation
* Now I thought about knowing recursion in a bigger picture and maybe go through recursion videos in mycodeschool
* now I am wondering the pattern between recursive call tree and the structure of recursive function(graphical representation)
* One thing between reading science and liberal art. For science if you don't understand something, you don't proceed.
* realize the pattern of recursive call must be figured out by writing code, or reading more code. I do hope theres a video talking about tips on different pattern though.
* Now I am thinking I should watch all the recursion videos on youtube
* find a course on [recursion](https://www.udemy.com/recursion-for-programmers/)
* **The last 5 steps go wrong** I shouldn't check the big picture.
* Spend 3 hours and still can't figure it out, maybe I should look for helps

(The next day)

* Okay, I watched some videos on [here](https://www.youtube.com/watch?v=78t_yHuGg-0&list=RDQMaaAa5TOUq40&index=25). This seems to be the standard implementation of permutation of a string.
* Visited back the geekforgeek [implementation](https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/) of swap. Don't get it

* The standard implementation:

		void permutation helper(String s, String chosen){
			if(s.empty()){
				System.out.println(chosen);
			}else{
				fo(int i=0; i<s.length();i++){
					char c=s.charAt(i);
					chosen+=c;
					s.erase(i,1);
					permuteHelper(s,chosen);
					s.insert(i,1,c);
					chosen.erase(chosen.length()-1,1)
				}
			}
		}

* Print only once:

		void permutation helper(String s, String chosen, Set<string>alreadyPrinted){
			if(s.empty()){
				if(!alreadyPrint.contain(chosen)){
					System.out.println(chosen);
					alreadyPrinted.add(chosen);
				}
			}else{
				fo(int i=0; i<s.length();i++){
					char c=s.charAt(i);
					chosen+=c;
					s.erase(i,1);
					permuteHelper(s,chosen,alreadyPrinted);
					s.insert(i,1,c);
					chosen.erase(chosen.length()-1,1)
				}
			}
		}

* Realize a concept called backtracking
* Just find out there's explanation on backtracking on The Algorithm Design Textbook
* I now have a decision on whether continue to explore youtube and textbook or dive into backtracking in Algorithm Design Textbook, or search backtracking on youtube or google
* Finish up the other half of geekforgeek swap implementation. Finally getting it.(MY: I might not able to absorb dense material that easily, but I think everyone at the beginning is the same?)
* Making a decision, expand on more by exploring is expand my knowledge in recursion, reading backtracking and searching backtracking is expanding my knowledge in backtracking. So in fact, I don't need to do any of them.
* case close, have covered everything related to this permutation question


### Recursive Binary Search


		private int recFind(long searchKey, int lowerBound,
		int upperBound)
		{
		int curIn;
		curIn = (lowerBound + upperBound ) / 2;
		if(a[curIn]==searchKey)
		return curIn; // found it
		else if(lowerBound > upperBound)
		return nElems; // can’t find it
		else // divide range
		{
		if(a[curIn] < searchKey) // it’s in upper half
		return recFind(searchKey, curIn+1, upperBound);
		else // it’s in lower half
		return recFind(searchKey, lowerBound, curIn-1);
		} // end else divide range
		} // end recFind()


		public int find(long searchKey)
		{
		return recFind(searchKey, 0, nElems-1);
		}
		
### The Towers of Hanoi

A bit variation away from the book to make it look like from geekforgeek

		////////////////////////////////////////////////////////////////
		class TowersApp
		{
		static int nDisks = 3;
		public static void main(String[] args)
		{
		doTowers(nDisks, ‘A’,  ‘C’, ‘B’);
		}
		//-----------------------------------------------------------
		public static void doTowers(int topN,
		char from, , char to,char inter)
		{
		if(topN==1)
		System.out.println(“Disk 1 from “ + from + “ to “+ to);
		else
		{
		doTowers(topN-1, from, inter,to); // from-->inter
		System.out.println(“Disk “ + topN +
		“ from “ + from + “ to “+ to);
		doTowers(topN-1, inter,  to,from); // inter-->to
		}
		}
		//----------------------------------------------------------
		} // end class TowersApp
		////////////////////////////////////////////////////////////////
		
Read through this and have no idea what happens.    
GeekforGeek has the same implementation    

Okay, I watch geekforgeek and its video [here](https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/). The code makes sense now, but how does anyone able to come up this solution from scratch??

A digression here. The udemy recursion course is on sale. Watching it now. So far it isn't very useful, it's very beginner material, but it does give me a better view of how recursion visually looks like.    
For example, if you have code above and below will be like many boxes containing one after the other. A for loop wraps around a recursive call will be like k-ary tree.     
And there is a way to step through recursive function with debugger.

Back to Tower of Hanoi. I understand the logic of it now, but how does it comes to the code??    
Ok I kind of get it now, it uses the auxilary rod to act as the middle man to transfer smaller rode    
Watching the geekforgeek visualization really helps so doTower(3,fromA,toB,auxiC) can break down into doTower(2,fromA,toC,auxiB ) , from fromA to toB, and doTower(2,fromC,toB,auxiA), and pretty much goes from there    
Case close

So I guess why at the very beginning I don't get it is because there are too many information right at the beginning with all the call stack and there is no direction. After watching the visualization and the logic between Tower of Hanoi I can get it now.

So Tower of Hanoi goes from the big picture to the smaller one, binary search is divide and conquer. Fibinaci and factorial goes from smaller case to bigger case

Let me just read the textbook for once to get a sense where I feel I don't get it    
Okay, I missed the detail of source rod, imtermediate rod and destination rod.    
By the time I read the code and read the largest text of printed text, I lose direction and decided it didn't make sense    
So the lesson learned here is to pay closer attention to algorithm logic explanation.
And then I watched through geekforgeek explanation and realized about the logic, read through the logic and then come back to geekforgeek and realize the importance of auxilary rod, and figure it out.    
Case closed

### Mergesort
if N is 10,000, then N^2 is 100,000,000, while N*logN is only 40,000. If sorting this many items reqquired 40 seconds with the mergesort, it would take almost 28 hours for the insertion sort.    
Mergesort is also fairly easy to implement. It's conceptually easier than quicksort and the shell sort.    
The downside of the mergesort is that it requires an addtional array in memeory, equal in size to the one being sorted.

The heart of the mergesort algorithm is the merging of two already-sorted array.
MY: essentially it is comparing two array, and put the smaller element to the new empty array

[mergesort implementation from the book](.workable/merge.java)

The merge() method has three while loops

### Sorting by Merging
The idea in the mergesort is to divide an array in half, sort each half, and then use the merge() method to merge the two halves into a single sorted array

The way to do it is to divide the half into two quarters, sort each the quarter and merge them to make a sorted half. MY: so it's a divide an conquer method

**MY: mergesort is like a diamond expanding and shrinking tree**

You may wonder where all these subarrays are located in memory. Basically The subarrays are stored in sections of the workspace array. After each merge, the workspace array is copied back into the original array

Many steps involve the mergeSort() method calling itself or returning. Comparisons and copies are performed only during the merge process.

You can't see the merge happening because the workspace isn't shown. However, you can see the result when the appropriate section of the workspace is copied back into the original(visible) array

		private void recMergeSort(long[] workSpace, int lowerBound,
		int upperBound)
		{
		if(lowerBound == upperBound) // if range is 1,
		return; // no use sorting
		else
		{ // find midpoint
		int mid = (lowerBound+upperBound) / 2;
		// sort low half
		recMergeSort(workSpace, lowerBound, mid);
		// sort high half
		recMergeSort(workSpace, mid+1, upperBound);
		// merge them
		merge(workSpace, lowerBound, mid+1, upperBound);
		} // end else
		} // end recMergeSort
		
[The whole mergeSort implementation](./workable/mergeSort.java)

There are many small things that I don't get/I need to pay attention to:
1. mid is (lowerBound+upperBound)/2
2. Base case is a return empty;
3. highPtr at geekforgeek is called "m"
4. inside merge() mid =highPtr-1
5. To be honest, I like this implementation more than geekforgeek
6. There is a step of copying workspace array to the real array "theArray"

### Mergesort O(N*logN)??
To know the efficiency, we have to calculate the copying and the comparing, because they are the most time-consuming operation; that the recurive calls and return don't add much overhead.
###### Number of copies
A way to look at it is that, sort 8 items requires 3 levels, each of which involves 8 copies. A level means all copies in to the same size subarray. In the first level, there are four 2-element subarrays, in the second level, there are two 4-element subarrays; and in the third level, there is one 8-element subarary. Each level has 8 elements, so again there are 3*8 or 24 copies

Actually, the items are not only copied into the workspace, they're also copies back into the original array. This doubles the number of copies, (so total copies is 2*N*logN)

###### Number of Comparison
In the mergesort algorithm, the number of comparisons is always somewhat less than the number of copies. 

The maximum number of comparisons is always one less than the number of items being merged, and the minimum is half the number of items being merged

<img src="assets/mergesort_comparison.png">

### Eliminating Recursion 
Is there a way to not use recursion? There is! by using stack.

There is a close relationship between recursion and stacks

SKIP
 
page 295

*A bit of digression here. I can read about 10 pages everyday, anything more I feel overwhelmed for some reason, starting checking ahead and feel fatigued, maybe feeling a bit dense headed instead of fresh headed when first starting the day*

### More interesting applications of recursion
1. Raise a number to a power
2. Knapsack problem
3. Combination: (n, k) = (n – 1, k – 1) + (n – 1, k)
page 306

## Chapter 7: Advanced Sorting
Shellsort is O(N*(logN)^2), and quicksort is O(N*logN). Shellsort is almost as easy to implement as mergesort, while quicksort is the fastest of all the general-purpose sorts

### Shellsort
Shellsort is good for medium-sized arrays, perhaps up to a few thousand items. It's not quite as fast as quicksort and other O(N*logN) sort, so it's not optimum for very large files. However, it's much faster than the O(N^2) sorts like the selection sort and the insertion sort.

The worst-case performance is not significantly worse than the average performance. (The worst case performance for quicksort can be much worse unless precautions are taken). Some experts(Sedgewick) recommends starting with a Shellsort for almost any sorting project and changing to a more advanced sort, like quicksort, only if Shellsort proves too slow in practice.

Shellsort is the improvement of insertion sort

The sequence of numbers used to generate the intervals is called the interval sequence or gap sequence

page 325

for insertion sort implemention: [Insertion Sort](workable/selecSort.java)

		public void insertionSort()
		{
		int in, out;
		for(out=1; out<nElems; out++) { // out is dividing line
		    long temp = a[out]; // remove marked item
		    in = out; // start shifts at out
		    while(in>0 && a[in-1] >= temp) // until one is smaller,
		    {
		        a[in] = a[in-1];  // shift item to right
		        --in; // go left one position
		        }
		        a[in] = temp; // insert marked item
		    } // end for
		} // end insertionSort()
		
And with this [video](https://www.youtube.com/watch?v=3yUSDJVDk4E). Shellsort is figured out

### Partition 
Notice that partitioning is not stable. That is, each group is not in the same order itwas originally. In fact, partitioning tends to reverse the order of some of the data in each group.


Just blew right through the shellsort implementation and partition implementation

Okay just figure out shellsort. So the key to figure out code is use some example array to walk through the steps. The video takes 16 minutes, so it's expected you will be walk it through for more than 16 minutes to figure it out.

But after the first walkthrough, it's relatively easier to figure out what the code is for.

I want to walk through partition myself this time. 

*Walk through partition completely* Probably takes like 5 minutes.

PS: this implementation doesn't check end of array exception if all elements are bigger than the pivot value so leftpointer will go from left to all the way right

If it's equal key, there will be unnecessary swapping, but it's okay.

Partition is O(N). Maximum N/2

### Quicksort

		public void recQuickSort(int left, int right)
		{
		if(right-left <= 0) // if size is 1,
		return; // it’s already sorted
		else // size is 2 or larger
		{
		// partition range
		int partition = partitionIt(left, right);
		recQuickSort(left, partition-1); // sort left side
		recQuickSort(partition+1, right); // sort right side
		}
		}

### Choosing a pivot value
Pick the value on the most right and insert it in between left and right    
And we will just swap it for faster run time    
And then the pivot value won't move anymore

[quicksort implementation](workable/quickSort1.java)

The test for preventing the left to go out of the array is by:

leftPtr < right

Just went through the quickSort implementation. The key of swapping the an element of the right group is with while( theArray[++leftPtr] < pivot ), leftPtr will always be a step ahead. This is explained in the part of "delicate code"

Notice that leftptr starts from left-1, and rightptr starts from right, so rightptr starts from the pivot, so it starts out outside of the partition too. The reason why they start outside of the partition is because they will be incremented and decremented, respectively, before they’re used the first time

Page 344
### Degenerate to O(N^2) Performance 
* Have two equal subarrays is the optimum situation for the quicksort algorithms
* If you sort a inversely sorted array, it will run much more slowly and that many more dotted horizontal lines are generated, indicating more and larger subarrays are being partitioned.
* If it has to sort one large and one small array, it's less efficient because the larger subarray has to be subdivided more times.
* The worst situation results when a subarray with N elements is divided into one subarray with 1 element and the other with N-1 elements. If this 1 and N-1 division happens with every partition, then every element requires a separate partition step. This is in fact what takes place with inversely sorted data: In all the subarrays, the pivot is the smallest item, so every partition results in N-1 elements in one subarray and only the pivot in the other
* There is another problem besides being slow. The number of recursive function calls also increase. If there are too many calls, the machine stack may overflow and paralyze the system
* If the data is truly random, quicksort will be a good option

### Median-of-Three Partitioning
* To find the median of the first, last , and middle elements of the array
* Finding the median of three items is obviously much faster than finding the median of all the items, and yet it successfully avoid picking the largest or smallest item in case where the data is already sorted or inversely sorted

### Radix Sort
* divide into 10 groups, according to their 1s digit
* sort by 0 to 9
* divide by 10 groups again, but according to their 10s digit this time
* instead of using an array of 10 arrays, used an array of 10 linked list
* An outer loop looks at each digit of the keys in turn. There are two inner loops: The first takes the data from the array and puts it on the lists; the second copies it from the lists back to the array
* To keep the sub-sort stable, you need th data to come out of each list in the same order it went in.
* at first glance, it feels like a O(N)
* but as as the key grows. The number of copies is proportional to the number of data items times the number of digits in the key. The number of digits is the log of the key values, so in most situations we're back to O(N*logN).

## Chapter 8 Tree

It combines the best of two other structures: an ordered array and a linked list. You can search a tree quickly, as you can an ordered array, and you can also insert and delete items quickly, as you can with a linked list.

Insertion is slow in an ordered array    
Searching is slow in a linked list    
Tree has quick insertion and deletion like a linked list, and quick searching like an ordered array    
Might be the most interesting data structure.

* If every node in a tree can have at most two children, the tree is called a binary tree
* binary search is: the left child will always be smaller than parent, and the right child bigger
* MY: but child of child can be smaller or bigger???

#### How do Binary Search Tree Work
Operation:
* find a node
* insert a node 
* traverse a tree 
* delete a node

When a tree is unbalanece, the tree efficiency can be seriously degraded.    
How to deal with unbalance will be talked about more at Chapter 9

		class Node
		{
		int iData; // data used as key value
		double fData; // other data
		node leftChild; // this node’s left child
		node rightChild; // this node’s right child
		public void displayNode()
		{
		// (see Listing 8.1 for method body)
		}
		} 
		
If its an object

		class Node
		{
		person p1; // reference to person object
		node leftChild; // this node’s left child
		node rightChild; // this node’s right child
		}
		class person
		{
		int iData;
		double fData;
		}

Tree class:

		class Tree
		{
		private Node root; // the only data field in Tree
		public void find(int key)
		{
		}
		public void insert(int id, double dd)
		{
		}
		public void delete(int id)
		{
		}
		// various other methods
		} // end class Tree

A TreeApp: 

		class TreeApp
		{
		public static void main(String[] args)
		{
		Tree theTree = new Tree; // make a tree
		theTree.insert(50, 1.5); // insert 3 nodes
		theTree.insert(25, 1.7);
		theTree.insert(75, 1.9);
		node found = theTree.find(25); // find node with key 25
		if(found != null)
		System.out.println(“Found the node with key 25”);
		else
		System.out.println(“Could not find node with key 25”);
		} // end main()
		} // end class TreeApp

Find():

		public Node find(int key) // find node with given key
		{ // (assumes non-empty tree)
			Node current = root; // start at root
			while(current.iData != key) // while no match,
			{
				if(key < current.iData) // go left?
				current = current.leftChild;
				else
				current = current.rightChild; // or go right?
				if(current == null) // if no child,
					return null; // didn’t find it
			}
		return current; // found it
		}
		
		
Code for insert:

		public void insert(int id, double dd)
		{
		Node newNode = new Node(); // make new node
		newNode.iData = id; // insert data
		newNode.dData = dd;
		if(root==null) // no node in root
		root = newNode;
		else // root occupied
		{
		Node current = root; // start at root
		Node parent;
		while(true) // (exits internally)
		{
		parent = current;
		if(id < current.iData) // go left?
		{
		current = current.leftChild;
		if(current == null) // if end of the line,
		{ // insert on left
		parent.leftChild = newNode;
		return;
		}
		} // end if go left
		else // or go right?
		{
			current = current.rightChild;
		if(current == null) // if end of the line
		{ // insert on right
		parent.rightChild = newNode;
		return;
		}
		} // end else go right
		} // end while
		} // end else not root
		} // end insert()
		// -------------------------------------------------------------

#### Traverse the Tree
* Preorder
* Inorder 
* Postorder

#### Inorder Traversal
* Inorder traversal(MY: not preorder!) will cause all the nodes to be visited in ascending order. If you want to create a sorted list of the data in a binary tree, this is one way to do it
* It uses recursion. Basically: 1. Call itself to traverse the node's left subtree; 2. visit the node; 3. call itself to traverse the node's right subtree

		private void inOrder(node localRoot)
		{
		if(localRoot != null)
		{
		inOrder(localRoot.leftChild);
		System.out.print(localRoot.iData + “ “);
		inOrder(localRoot.rightChild);
		}
		}

#### Preorder and Postorder Traversal
* Preorder and postoder can be useful in writing program that parse or analyze algebraic expression
* Preorder sequence: 1. visit the node, 2. call itself to traverse the node's left subtree; 3. call itself to traverse the node's right subtree
* postorder sequence: 1. call itself to traverse the node's left subtree; 2. call itself to traverse the node's right subtree; 3. visit the node
* compare to using stack, we store entire subtree in a binary tree

Here are the steps when we encounter an operand:
1. Make a tree with one node that holds the operand.
2. Push this tree on the stack

Here are the steps when we encounter an operator:
1. pop two operand trees B and C off the stack
2. Create a new tree A with the operator in its root
3. Create B as the right child of A
4. Attach C as the left child of A
5. Push the resulting tree back on the stack

Detail isn't shown

##### Finding Maxium and Minimum Values

		public Node minimum() // returns node with minimum key value
		{
		Node current, last;
		current = root; // start at root
		while(current != null) // until the bottom,
		{
		last = current; // remember node
		current = current.leftChild; // go to left child
		}
		return last;
		}
		
##### Deleting a Node
* Deleting a node is the most complicated common operation required for binary search trees
* You sart by finding the node you want to delete, using the same approach we saw in find() and insert(). When you've found the node, there are three cases to consider:
1. The node to be deleted is a leaf(have no children)
2. The node to be deleted has one children
3. The node to be deleted has two children

###### First Case: is a leaf

		public boolean delete(int key) // delete node with given key
		{ // (assumes non-empty list)
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		while(current.iData != key) // search for node
		{
		parent = current;
		if(key < current.iData) // go left?
		{
		isLeftChild = true;
		current = current.leftChild;
		}
		else // or go right?
		{
			isLeftChild = false;
		current = current.rightChild;
		}
		if(current == null) // end of the line,
		return false; // didn’t find it
		} // end while
		// found node to delete
		// continues...
		}
		
After we've found the node, we check first to verify that it has no children. When this is true, we check the special case of the root. If that's the node to be delted, we simply set it to null; this empties the tree. Otherwise, we set the parent's leftChild or rightChild field to null to disconnect the parent from the node.

		// delete() continued...
		// if no children, simply delete it
		if(current.leftChild==null &&
		current.rightChild==null)
		{
		if(current == root) // if root,
		root = null; // tree is empty
		else if(isLeftChild)
		parent.leftChild = null; // disconnect
		else // from parent
		parent.rightChild = null;
		}
		// continues...

##### Case 2: The Node to Be Deleted Has One Child
The second case isn't so bad either. The node has only two connections: to its parent and to its only child. You want to "snip" the node out of this sequence by connecting its parent directly to its child

		// delete() continued...
		// if no right child, replace with left subtree
		else if(current.rightChild==null)
		if(current == root)
		root = current.leftChild;
		else if(isLeftChild) // left child of parent
		parent.leftChild = current.leftChild;
		else // right child of parent
		parent.rightChild = current.leftChild;
		// if no left child, replace with right subtree
		else if(current.leftChild==null)
		if(current == root)
		root = current.rightChild;
		else if(isLeftChild) // left child of parent
		parent.leftChild = current.rightChild;
		else // right child of parent
		parent.rightChild = current.rightChild;
		// continued...
		
		
##### Delete Node with two Children
The trick is to replace the node with its inorder successor

###### Finding the successor
* from human eye, it's easy, but for computer, we need an algorithm
* First, the program goes to the original node's right child, which must have a key larger than the node. Then it goes to this right child's left child(if it has one), and to this left child's left child, and so on, following down the path of left child.
* For the demo, you may want to make sure the successor has no children of its own.

#### The code to find the sucessor:

		// returns node with next-highest value after delNode
		// goes to right child, then right child’s left descendants
		private node getSuccessor(node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild; while(current != null)
		{
		successorParent = successor; successor = current;
		current = current.leftChild; }
		if(successor != delNode.rightChild) {
		// go to right child // until no more
		// left children,
		// go to left child
		// if successor not // right child,
		// make connections
		successorParent.leftChild = successor.rightChild; successor.rightChild = delNode.rightChild;
		}
		return successor; }

PAGE 397

delete a node in recursion in [mycodeschool](https://www.youtube.com/watch?v=gcULXE7ViZw)

Inorder successor that I haven't [watched](https://www.youtube.com/watch?v=5cPbNCrdotA)

MY: slowly realize this textbook is missing something. Gonna watch mycodeschool for binary tree now.

[introduction to tree](https://www.youtube.com/watch?v=qH6yxkw0u78&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=25)
* Depth of x=length of path from root to x or no. of edges in path from root to x
* height of x=no. of edges in longest path from x to a leaf
* height of leaf node is 0
* height of the tree=height of the root node 

[second vid](https://www.youtube.com/watch?v=H5JubkIy_p8&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=26)
* strict/propert binary: each node can only have either 2 or 0 Children
* complete binary tree: all level except possibly the last are completely filled and all nodes are as left as possible
* perfect binary tree: all level are completely filled
* maxium no. of nodes in a tree with heigh h=2^0+2^1+...2^h=2^(h+1)-1
* balanced binary bree: difference between height of left and right subtree for every node is not more than k( mostly 1), aka if the difference is 2, it is not balanced
* height of an empty tree=-1

MY: okay 2 videos in that 30 minutes clocked in today



third video: [Binary Search Tree](https://www.youtube.com/watch?v=pYT9F8_LFTM&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=27)
* Just in-depth into BST 

Fourth video: [implementation](https://www.youtube.com/watch?v=COZK7NATh4k&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=28)

MY: okay, 30 mins in. Had horrible flashback on studying computer science right at 7am in the morning. Well lol.

	void Insert(BstNode* root, int data){
		if(root==NULL){
			root=GetNewNode(data);
			
		}
		else if (data<=root->data){
			root->left=Insert(root->left,data)
		}
		else {
			root->right=Insert(root->right,data)
		}
		return root;
	}

(tip): recursion is going to be used all the time in tree	

Code for searching:

	bool Search(BstNode* root, int data){
		if(root==NULL) return false;
		else if (root->data==data) return true;
		else if(data<=root->data) return Search(root->left,data)
		else return Search(root->right, data);
	}

This recursive implementation is definitely easier.

MY: Why I had flashback last week? I was reading and learning and watching video right at 9am, and then felt horrible heartache. Maybe I am just not a morning person so never do complex thinking in the morning again. Wait until at least 10:30am.

MY: Learning computer science is like you have to endure some boring stuff for a really low speed, and when you thought you know what is going on, all of the sudden you will be hit by some really complex idea with lots of details, and before you know it, the teacher has gone right through it, and its back to the boring stuff again, leaving you confused and mad.

(BST implementation, memory allocation)[https://www.youtube.com/watch?v=hWokyBoo0aI&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=29]
* a good explanation of stack and heap, better understanding of memory allocation now

MY: 30 minutes in. from 11am to 12am.

(find min and max in BST)[https://www.youtube.com/watch?v=Ut90klNN264&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=30]

	int FindMind(BstNode* root){
		if (root==NULL){
			cout<<"Error: Tree is empty";
			return -1;
		}
		while (root->left !=null){
			root= root->left;
		}
		return root->data;
	}
	
Recursive implementation:

	int FindMin(BstNode* root){
		if(root==NULL){
			cout<<"Error: Tree is empty";
			return -1;
		}
		else if (root->left==NULL){
			return root->data;
		}
		return FindMin(root->left);
	}

(find height of a binary tree)[https://www.youtube.com/watch?v=_pnqMz5nrRs&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=31]
* big O is O(n)

	findHeight(root){
		if(root is null){
			return -1;
		}
		leftHeight<-FindHeight(root->left);
		rightHeight<-FindHeight(root->right);
		return max(leftHeight,rightHeight);
	}
(Binary Tree Traversal: breadth-first and depth-first)[https://www.youtube.com/watch?v=9RHO6jU--GU&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=32]
* Breadth-first: Level order traversal
* root-left-left: Preorder
* left-root-right: inorder 
* left-right-root: postorder
* in order traversal of a binary search tree will give you a sorted list

MY: have a flashback of being brain-tired and trying to focus on a lecture. Whole body is hot. Let's see how long I can last

(level order traversal)[https://www.youtube.com/watch?v=86g8jAQug04&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=33]
* How to traversal with level order?
* use queue(FIFO)

MY: 30 minutes in studying while tired, head hot. Let's end here

	void LevelOrder(Node* root){
		if(root==NULL) return;
		queue<Node*> Q;
		Q.push(root);
		while(!Q.empty()){
			Node* current=Q.front();
			cout<<current->data<<" ";
			if(current->left !=NULL)Q.push(current->left);
			if(current->right !=NULL) Q.push(current.right);
			Q.pop();
		}
	}
(preorder,inorder,postorder)[https://www.youtube.com/watch?v=gm8DUJJhmY4&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=34]

	void Preorder(Node* root){
		if(root==NULL) returnl;
		printf("%c ",root->data);
		Preorder(root->left);
		Preorder(root->right);
	}

(check if a binary tree is binary search tree)[https://www.youtube.com/watch?v=yEwSGhSsT0U&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=35]
* MY:it doesn't have to be balanced
* The first implementation's big O is O(n^2)
* The second is O(n);
* there is a third implementaion. Do inorder traveral and it should be sorted

	bool IsSubtreeLesser(Node* root,int data);
	bool IsSubtreeGreater(Node* root,int data);
	bool IsBinarySearchTree(Node* root){
		if(root==NULL) return true;
		if(IsSubtreeLesser(root->left,root->data)
			&&IsSubtreeGreater(root->right,root->data)
			&&IsBinarySearchTree(root->left)
			&&IsBinarySearchTree(root->right)){
				return true;
			}else{
				return false;
			}
	}

	bool IsSubtreeLesser(Node* root, int value){
		if(root==NULL) return true;
		if(root->data<=value
			&&IsSubtreeLesser(root->left,value)
			&&IsSubtreeLessor(root->right,value)){
				return true;
			}else{
				return false;
			}
	}
	
	bool IsSubtreeGreater(Node* root, int value){
		if(root==NULL) return true;
		if(root->data<=value
			&&IsSubtreeGreater(root->left,value)
			&&IsSubtreeGreater(root->right,value)){
				return true;
			}else{
				return false;
			}
	}
	
	=====
	
	bool IsBstUtil(Node* root, int minValue, int maxValue){
		if(root==NULL) return true;
		if(root->data>minValue
			&&root->data<maxValue
			&&IsBstUtil(root->left,minValue,root->data)
			&&IsBstUtil(root->right,minValue,root->data)){
				return true;
			}else{
				return false;
			}
	}
	
	bool IsBinarySearchTree(Node* root){
		return IsBstUtil(root,INT_MIN,INT_MAX);
	}

(delete a node from binary search tree)[https://www.youtube.com/watch?v=gcULXE7ViZw&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=36]
* delete a node that has no child
* delete a node that has 1 child
* delete a node that has 2 child
* find min in the right-subtree, copy the value in targetted node, delete duplicate from right-subtree


	struct Node* Delete(struct Node* root, int data){
		if(root==NULL)return root;
		else if(data<root->data)root->left=Delete(root->left,data);
		else if(data>root->data) root->right=Delete(root->right,data);
		else{
			if(root->left==NULL&&root->right==NULL){
				delete root;
				root=NULL;
				
			}else if(root->left==NULL){
				struct Node* temp=root;
				root=root->right;
				delete temp;
				
			}else if(root->right==NULL){
				struct Node* temp=root;
				root=root->left;
				delete temp;
				
			} else{
				//2 children
				struct Node* temp=FindMin(root->right);
				root->data=temp->data;
				root->right=Delete(root->right,temp->data);
			}
		}
		return root;
	}

(inorder successor)[https://www.youtube.com/watch?v=5cPbNCrdotA&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=37]
* insertion and deletion and search is O(h)=O(logn);
* case 1:node has right subtree: go deep to leftmost node in the right subtree, or, find min in right subtree
* case 2: no right subtree: go to the nearest ancestor for which given node would be in left subtree

	struct Node* FindMin(struct Node* root){
		if(root==NULL)return NULL;
		while(root->left!=NULL){
			root=root->left;
			
		}
		return root;
	}

	struct Node* Getsuccessor(struct Node* root, int data){
		//search the node - O(h)
		struct Node* current=Find(root,data);
		if(current==NULL) return NULL;
		//case 1: node has right subtree 
		if(current->right!=NULL){
			<!-- struct Node* temp=current->right;
			while(temp->left!=NULL)temp=temp->left;
			return temp; -->
			return FindMin(current->right);
		}
		//case 2:no right subtree
		else{
			struct Node* successor=NULL;
			struct Node* ancestor=root;
			while(ancestor!=current){
				if(current->data<ancestor->data){
					successor=ancestor; //so far this is the ddepest node for which current node is on the left 
					ancestor=ancestor->left;
				}else{
					ancestor=ancestor->right;
				}
			}
			return successor;
		}
	}
	
MY:{Okay, from 397 to 422. I have 2 days to do it

Done.
}

###### Extra: Huffman code

Done tree.


Digression here: I always want to make a file navigator in react, and file navigator requires tree I realize (than the normal dumb way of whatever I was using). Specifically a k-ary tree, and I need add function. (Actually thats basically it, just add function), well because its in react so its gonna be in javascript

		function Node(data) {
		    this.data = data;
		    this.parent = null;
		    this.children = [];
		}
		
		function Tree(data) {
		    var node = new Node(data);
		    this._ root = node;
		}


		var tree = new Tree('CEO');
		 
		// {data: 'CEO', parent: null, children: []}
		tree._ root;
		
		
		var tree = new Tree('one');
 
		tree._ root.children.push(new Node('two'));
		tree._ root.children[0].parent = tree;
		 
		tree._ root.children.push(new Node('three'));
		tree._ root.children[1].parent = tree;
		 
		tree._ root.children.push(new Node('four'));
		tree._ root.children[2].parent = tree;
		 
		tree._ root.children[0].children.push(new Node('five'));
		tree._ root.children[0].children[0].parent = tree._ root.children[0];
		 
		tree._ root.children[0].children.push(new Node('six'));
		tree._ root.children[0].children[1].parent = tree._ root.children[0];
		 
		tree._ root.children[2].children.push(new Node('seven'));
		tree._ root.children[2].children[0].parent = tree._ root.children[2];
		
So when click any item, the level of that level shows, all the children shows,

# Chapter 9: Red Black Tree
* Searching works the same way in a red-black tree as it does in an ordinary binary tree. On the other hand, insertion and deletion, while based on the algorithm in an ordinary tree, are extensively modified
* there is top-down insertion and bottom-up insertion
* In a red-black tree, balance is achieved during insertion( and also deletion). As an item is being inserted, the insertion routine checks that certain characteristics of the tree are not violated. If they are, it takes corrective action, restructuring the tree as necessary. By maintaining these characteristics, the tree is kept balanced.

##### Red-Black Rules 
1. Every node is either red or Black
2. The root is always black 
3. If a node is red, its children must be black(although the converse isn't necessarily true)
4. Every path from the root to a leaf, or to a null child, must contain the same number of black nodes

* In this book, duplicate key is assumed to be not allowed
* Note that color rules and node color changes are used only to help decide when to perform a rotation
* if you are doing a right rotation, the top node has a left child. Similarly, if you are doing a left rotation, the top node must have a right child

MY: now I am confused. The book says black node with two red children is a 

SKIM and SKIP

(geekforgeek explaination)[https://www.geeksforgeeks.org/red-black-tree-set-1-introduction-2/]
* most of the self-balancing BST library functions like map and set in C++(Or TreeSet and TreeMap in Java) use Red Black Tree
* Red black tree is a self-balancing binary search tree

(MIT red black tree)[https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-046j-introduction-to-algorithms-sma-5503-fall-2005/video-lectures/lecture-10-red-black-trees-rotations-insertions-deletions/]

(geekforgeek insertion)[https://www.geeksforgeeks.org/red-black-tree-set-2-insert/]

(implementation)[https://www.geeksforgeeks.org/c-program-red-black-tree-insertion/]

(deletion)[https://www.geeksforgeeks.org/red-black-tree-set-3-delete-2/]

MY: so it's now a good time to define the scope of my learning. Purpose of learning data structure is to be able to do interview question, so red black tree is not included; however, this is fundamental knowledge

MY: check Cracking the Coding Interview, red black tree is included. The rotation and color change don't make sense to me.

page 463