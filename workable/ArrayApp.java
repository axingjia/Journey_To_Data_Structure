import java.io.*;

class ArrayApp
{
public static void main(String[] args)
//The Basics of Arrays in Java 41
 {
    long[] arr;
    arr = new long[100]; int nElems = 0;
    // reference to array // make array
    // number of items

    // loop counter
    long searchKey; // key of item to search for
     int j;
    arr[0] = 77; arr[1] = 99; arr[2] = 44; arr[3] = 55; arr[4] = 22; arr[5] = 88; arr[6] = 11; arr[7] = 00; arr[8] = 66; arr[9] = 33; nElems = 10;
    // insert 10 items
    // now 10 items in array //--------------------------------------------------------------
    for(j=0; j<nElems; j++) // display items
      System.out.print(arr[j] + " ");
      System.out.println(""); //--------------------------------------------------------------
    searchKey = 66; for(j=0; j<nElems; j++)
      if(arr[j] == searchKey) break;
    // find item with key 66
    // for each element,
    // found item?
    // yes, exit before end // at the end?
    if(j == nElems)
      System.out.println("Can’t find " + searchKey); // yes
    else
      System.out.println("Found " + searchKey); // no
    //-------------------------------------------------------------- searchKey = 55; // delete item with key 55
    for(j=0; j<nElems; j++)
    if(arr[j] == searchKey)
      break;
    for(int k=j; k<nElems-1; k++)
      arr[k] = arr[k+1]; nElems--;
    // look for it
    // move higher ones down
    // decrement size //--------------------------------------------------------------
    for(j=0; j<nElems; j++) // display items
      System.out.print( arr[j] + " ");
      System.out.println("");
    } // end main()
} // end class ArrayApp
