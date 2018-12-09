// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp ////////////////////////////////////////////////////////////////
class HighArray
{
private long[] a; // ref to array a
private int nElems; // number of data items
//-----------------------------------------------------------
 public HighArray(int max) {
  a = new long[max]; nElems = 0;
  }
// constructor
// create the array // no items yet
//-----------------------------------------------------------
public boolean find(long searchKey)
{
  int j;
  for(j=0; j<nElems; j++)
  if(a[j] == searchKey)
  // find specified value
  // for each element, // found item?
  break;   // exit loop before end
  if(j == nElems)  // gone to end?
    return false;  // yes, can’t find it
  else
    return true; // no, found it

} // end find()
//-----------------------------------------------------------

public void insert(long value) {
  a[nElems] = value;
  nElems++;
}





//-----------------------------------------------------------
public boolean delete(long value)
{
  int j;
  for(j=0; j<nElems; j++) // look for it
    if( value == a[j] )
      break;
    if(j==nElems)
      return false; // can’t find it
    else { // found it
      for(int k=j; k<nElems; k++)  // move higher ones down
      a[k] = a[k+1];
      nElems--;  // decrement size
      return true;
    }


} // end delete() //-----------------------------------------------------------
public void display() // displays array contents
{
  for(int j=0; j<nElems; j++) // for each element,
  System.out.print(a[j] + " "); // display it
  System.out.println("");
}
//-----------------------------------------------------------
} // end class HighArray ////////////////////////////////////////////////////////////////
class HighArrayApp
{
public static void main(String[] args)
{
int maxSize = 100;
HighArray arr;
arr = new HighArray(maxSize);
arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(00); arr.insert(66); arr.insert(33);
arr.display();
int searchKey = 35;
if( arr.find(searchKey) )
// array size
// reference to array
// create the array
// insert 10 items
System.out.println("Found " + searchKey); else
System.out.println("Can’t find " + searchKey);
arr.delete(00); arr.delete(55); arr.delete(99); // delete 3 items
arr.display(); // display items again
} // end main()
} // end class HighArrayApp

////////////////////////////////////////////////////////////////
