// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp ////////////////////////////////////////////////////////////////
class ArraySel
{
private long[] a; // ref to array a private
int nElems; // number of data items
//--------------------------------------------------------------
public ArraySel(int max) { // constructor
a = new long[max]; // create the array
nElems = 0; // no items yet
}
//--------------------------------------------------------------
public void insert(long value) { // put element into array
a[nElems] = value;  // insert it
nElems++; // increment size
}



//--------------------------------------------------------------
public void display() // displays array contents
{
for(int j=0; j<nElems; j++) // for each element,
System.out.print(a[j] + " "); // display it
System.out.println("");
}
//--------------------------------------------------------------
public void selectionSort()
{
int out, in, min;
for(out=0; out<nElems-1; out++) { // outer loop
min = out; // minimum
for(in=out+1; in<nElems; in++) // inner loop
if(a[in] < a[min] )  // if min greater,
min = in;  // we have a new min
swap(out, min); // swap them
} // end for(out)
} // end selectionSort()
//--------------------------------------------------------------
private void swap(int one, int two)
{
long temp = a[one];
a[one] = a[two];
a[two] = temp;
}

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






//--------------------------------------------------------------
} // end class ArraySel
////////////////////////////////////////////////////////////////
class SelectSortApp
 {
public static void main(String[] args)
{
int maxSize = 100; // array size
ArraySel arr; // reference to array
arr = new ArraySel(maxSize);  // create the array
arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(00); arr.insert(66); arr.insert(33); // insert 10 items
arr.display(); // display items
// arr.selectionSort(); // selection-sort them
arr.insertionSort(); // insertion-sort them
arr.display();  // display them again
} // end main()
} // end class SelectSortApp




////////////////////////////////////////////////////////////////
