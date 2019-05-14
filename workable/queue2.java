// queue.java
// demonstrates queue
// to run this program: C>java QueueApp ////////////////////////////////////////////////////////////////
import java.util.*;
class Queue2
{
// private int maxSize; 
private long[] arr; public int front; public int rear; 
int size;
// private int nItems;
//--------------------------------------------------------------
public Queue2(int s) // constructor
{
    // maxSize = s;
	front=rear=-1;
	size=s;
    arr = new long[s];
    // front = 0;
    // rear = -1;
    // nItems = 0;
}
//--------------------------------------------------------------
public void insert(long value) { // put item at rear of queue
  // if(rear == maxSize-1) // deal with wraparound
  //   rear = -1;
  // queArray[++rear] = j; // increment rear and insert
  // nItems++; // one more item
  if((front==0&&rear==size-1)|| (rear==(front-1)%(size-1))){
	  /*if front =1 size =8; rear=0 or front=8 and rear=7 will indicate its full
	  //no 
	  //if size=8
	  front 1 rear 0
	  front 2 rear 1
	  front 3 rear 2
	  ...
	  front 7 rear 6
	  front 8 rear 0 but thats impossible???
	  what is going on here 
	  can front be bigger or equal to size???
	  freaking hell, it doesn't do this check
	  okay, so 
	  if rear =0 and size=8, front can be 8 or 1 or 15 I have no idea why this check exist because front can never be greater than size but whatever
	  
	  */
	  
	  System.out.println("\nQueue is Full");
	  return;
  }else if(front==-1){
	  front=rear=0;
	  arr[rear]=value;
  }else if(rear==size-1 &&front!=0){
	  rear=0;
	  arr[rear]=value;
  }else{
	  rear++;
	  arr[rear]=value;
  }

}
//--------------------------------------------------------------
public long remove() // take item from front of queue
{
    // long temp = queArray[front++]; // get value and incr front
    // if(front == maxSize) // deal with wraparound
    //   front = 0;
    // nItems--; // one less item
    // return temp;
	if(front==-1){
		System.out.println("\nQueue is Empty");
		return Integer.MIN_VALUE;
	}
	long data=arr[front];
	arr[front]=-1;
	if(front==rear){
		front=-1;
		rear=-1;
	}else if(front==size-1){
		front=0;
	}else{
		front++;
	}
	return data;
}
//--------------------------------------------------------------
public long peekFront() // peek at front of queue
{
  return arr[front];
} //--------------------------------------------------------------
// public boolean isEmpty() // true if queue is empty
// {
// return (nItems==0);
// } //--------------------------------------------------------------
// public boolean isFull() // true if queue is full
// {
// return (nItems==maxSize);
// } //--------------------------------------------------------------
// public int size() // number of items in queue
// {
// return nItems;
// } //--------------------------------------------------------------
    // public void print(){
    //     while( !this.isEmpty() ) { // remove and display // all items
	// 
    //       long n = this.remove(); // (40, 50, 60, 70, 80) 
    //       System.out.print(n);
    //       System.out.print(" ");
    //     }
    //     System.out.println("");
    // }
	// 
    // public void arrayPrint(){
    //     if( !this.isEmpty() ) { 
    //         System.out.println("As array is: "+Arrays.toString(queArray));
    //     }
    // }
	// 
    // public void frontAndRear(){
    //     System.out.println("Front is "+this.front+",rear is "+this.rear);
    // }
	
	public void displayQueue(){
		if(front==-1){
			System.out.println("\nQueue is empty");
			return;
		}
		// printf("\nElements in Circular Queue are: "); 
		System.out.println("\nElements in Circular Queue are: ");
	    if (rear >= front) 
	    { 
	        for (int i = front; i <= rear; i++) 
	            // printf("%d ",arr[i]);
				System.out.println(arr[i]); 
	    } 
	    else
	    { 
	        for (int i = front; i < size; i++) 
	            // printf("%d ", arr[i]);
				System.out.println(arr[i]); 
				 
	  
	        for (int i = 0; i <= rear; i++) 
	            // printf("%d ", arr[i]); 
				System.out.println(arr[i]); 
	    } 

	}
} // end class Queue ////////////////////////////////////////////////////////////////
class QueueApp2
{
public static void main(String[] args)
 {
Queue2 theQueue = new Queue2(5);// queue holds 5 items
theQueue.insert(10); theQueue.insert(20); theQueue.insert(30); theQueue.insert(40); // insert 4 items
// theQueue.arrayPrint();


System.out.println("new remove "+theQueue.remove());
// theQueue.frontAndRear(); 
// theQueue.arrayPrint();
// System.out.println("");
System.out.println("new remove "+theQueue.remove()); 
// theQueue.frontAndRear(); 
// theQueue.arrayPrint();
// System.out.println("");
System.out.println("new remove "+theQueue.remove()); 
// theQueue.frontAndRear(); 
// theQueue.arrayPrint();
// System.out.println("");
theQueue.insert(50); 
// theQueue.arrayPrint();
// System.out.println("");
theQueue.insert(60); 
// theQueue.arrayPrint();
// System.out.println("");
theQueue.insert(70); 
// theQueue.arrayPrint();
// System.out.println("");
theQueue.insert(80); // insert 4 more items // (wraps around)
// theQueue.arrayPrint();
// System.out.println("");
// theQueue.print();
theQueue.displayQueue();

//MY WAY will: rear 0: 0th element=10, 1st=20
} // end main()
} // end class QueueApp
