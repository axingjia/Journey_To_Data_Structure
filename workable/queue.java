// queue.java
// demonstrates queue
// to run this program: C>java QueueApp ////////////////////////////////////////////////////////////////
import java.util.*;
class Queue
{
private int maxSize; private long[] queArray; public int front; public int rear; private int nItems;
//--------------------------------------------------------------
public Queue(int s) // constructor
{
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    // rear=0; 
    nItems = 0;
}
//--------------------------------------------------------------
public void insert(long j) { // put item at rear of queue
  if(rear == maxSize-1) // deal with wraparound
    rear = -1;
  queArray[++rear] = j; // increment rear and insert
  nItems++; // one more item
  //MY: the beginning rear is -1, at the very beginning rear is become 0, if rear is getting to the end of the array, rear is turn to -1, and then add back to 0, aka the beginning of the array
/*
If I want to do it */
    // if(rear==maxSize-1){
    //     rear=0;
    // }
    // 
    // queArray[rear]=j;
    // rear++;
    // nItems++;
    //but why it is giving me a wrong result?
/**/
}
//--------------------------------------------------------------
public long remove() // take item from front of queue
{
    long temp = queArray[front++]; // get value and incr front
    if(front == maxSize) // deal with wraparound
      front = 0;
    nItems--; // one less item
    return temp;
}
//--------------------------------------------------------------
public long peekFront() // peek at front of queue
{
  return queArray[front];
} //--------------------------------------------------------------
public boolean isEmpty() // true if queue is empty
{
return (nItems==0);
} //--------------------------------------------------------------
public boolean isFull() // true if queue is full
{
return (nItems==maxSize);
} //--------------------------------------------------------------
public int size() // number of items in queue
{
return nItems;
} //--------------------------------------------------------------
    public void print(){
        while( !this.isEmpty() ) { // remove and display // all items

          long n = this.remove(); // (40, 50, 60, 70, 80) 
          System.out.print(n);
          System.out.print(" ");
        }
        System.out.println("");
    }
    
    public void arrayPrint(){
        if( !this.isEmpty() ) { 
            System.out.println("As array is: "+Arrays.toString(queArray));
        }
    }
    
    public void frontAndRear(){
        System.out.println("Front is "+this.front+",rear is "+this.rear);
    }
} // end class Queue ////////////////////////////////////////////////////////////////
class QueueApp
{
public static void main(String[] args)
 {
Queue theQueue = new Queue(5);// queue holds 5 items
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
theQueue.arrayPrint();
// System.out.println("");
theQueue.print();

//MY WAY will: rear 0: 0th element=10, 1st=20
} // end main()
} // end class QueueApp
