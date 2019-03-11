// queue.java
// demonstrates queue
// to run this program: C>java QueueApp ////////////////////////////////////////////////////////////////
class Queue
{
private int maxSize; private long[] queArray; private int front; private int rear; private int nItems;
//--------------------------------------------------------------
public Queue(int s) // constructor
{
maxSize = s;
queArray = new long[maxSize];
front = 0;
// rear = -1;
rear=0; 
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
    // // rear=0; 
    // queArray[rear]=j;
    // rear++;
    // nItems++;
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
} // end class Queue ////////////////////////////////////////////////////////////////
class QueueApp
{
public static void main(String[] args)
 {
Queue theQueue = new Queue(5);// queue holds 5 items
theQueue.insert(10); theQueue.insert(20); theQueue.insert(30); theQueue.insert(40); // insert 4 items
theQueue.remove(); theQueue.remove(); theQueue.remove();// remove 3 items // (10, 20, 30)
theQueue.insert(50); theQueue.insert(60); theQueue.insert(70); theQueue.insert(80); // insert 4 more items // (wraps around)
while( !theQueue.isEmpty() ) { // remove and display // all items

  long n = theQueue.remove(); // (40, 50, 60, 70, 80) 
  System.out.print(n);
System.out.print(" ");
}
System.out.println("");
} // end main()
} // end class QueueApp
