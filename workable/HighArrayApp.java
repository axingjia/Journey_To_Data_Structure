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
public int find_binary(long searchKey){
  int lowerBound = 0;
  int upperBound = nElems-1;
  int curIn;
  while(true) {
  curIn = (lowerBound + upperBound) / 2; if(a[curIn]==searchKey)
    return curIn; //    found it
  else if(lowerBound > upperBound)
    return nElems; //   can’t find it
  else // divide range
  {
    if(a[curIn] < searchKey)
      lowerBound = curIn + 1; // it’s in upper half
    else
      upperBound = curIn - 1; // it’s in lower half
    } // end else divide range
  } // end while



 } //end find()


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
//programming project 2.1
public long findMax(){
  if(nElems==0){
    // System.out.println(-1);
    return -1;
  }
  long max=0;
  for(int i=0;i<nElems;i++){
    if(a[i]>max){
      max=a[i];
    }
  }
  return max;

}

public boolean removeMax(){
  if(nElems==0){
    // System.out.println(-1);
    return false;
  }
  long max=0;
  for(int i=0;i<nElems;i++){
    if(a[i]>max){
      max=a[i];
    }
  }
  delete(max);
  return true;
}

public int length(){
  return nElems;
}
//-----------------------------------------------------------
} // end class HighArray ////////////////////////////////////////////////////////////////
class HighArrayApp
{
public static void main(String[] args)
{
int maxSize = 100; // array size
HighArray arr; // reference to array
arr = new HighArray(maxSize); // create the array
arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(00); arr.insert(66); arr.insert(33); // insert 10 items
arr.display();
int searchKey = 35;
if( arr.find(searchKey) )
  System.out.println("Found " + searchKey);
else
  System.out.println("Can’t find " + searchKey);
System.out.println("binary:" + arr.find_binary(searchKey));
arr.delete(00); arr.delete(55); arr.delete(99); // delete 3 items
arr.display(); // display items again
System.out.println("print max");
System.out.println(arr.findMax());
// arr.removeMax();
// arr.display();
HighArray secondArr=new HighArray(100);
System.out.println(arr.length());
int theLength=arr.length();
for(int i=0;i<theLength;i++){
  long max=arr.findMax();
  secondArr.insert(max);
  arr.removeMax();
  secondArr.display();
  System.out.println(i);
}
System.out.println("the second array ordered");
arr.display();
secondArr.display();

} // end main()
} // end class HighArrayApp

////////////////////////////////////////////////////////////////
