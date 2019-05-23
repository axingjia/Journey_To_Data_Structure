// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
class Link
{
public int iData; // data item (key)
public double dData; // data item
public Link next; // next link in list
// -------------------------------------------------------------

public Link(int id, double dd) // constructor
{
iData = id; // initialize data
dData = dd; // ('next' is automatically
} // set to null)
// -------------------------------------------------------------
public void displayLink() // display ourself
{
System.out.print("{" + iData + ", " + dData + "} ");
}
} // end class Link
////////////////////////////////////////////////////////////////
class LinkList
{
private Link first; // ref to first link on list
// -------------------------------------------------------------
public LinkList() // constructor
{
first = null; // no items on list yet
}
// -------------------------------------------------------------
public boolean isEmpty() // true if list is empty
{
return (first==null);
}
// -------------------------------------------------------------
// insert at start of list
public void insertFirst(int id, double dd)
{ // make new link
Link newLink = new Link(id, dd);
newLink.next = first; // newLink --> old first
first = newLink; // first --> newLink
}
// -------------------------------------------------------------
public Link deleteFirst() // delete first item
{ // (assumes list not empty)
Link temp = first; // save reference to link
first = first.next; // delete it: first-->old next
return temp; // return deleted link
}

// -------------------------------------------------------------
public void displayList()
{
System.out.print("List (first-->last): ");
Link current = first; // start at beginning of list
while(current != null) // until end of list,
{
current.displayLink(); // print data
current = current.next; // move to next link
}
System.out.println("");
}
// -------------------------------------------------------------
public Link find(int key) // find link with given key
{ // (assumes non-empty list)
    Link current = first; // start at 'first'
    while(current.iData != key) // while no match,
    {
        // if(current.next == null) // if end of list,
            // return null; // didn’t find it
        // else // not end of list,
            current = current.next; // go to next link
    }
    return current; // found it
}
// -------------------------------------------------------------
public Link delete(int key) // delete link with given key
{ // (assumes non-empty list)
Link current = first; // search for link
Link previous = first;
while(current.iData != key)
{
if(current.next == null)
return null; // didn’t find it
else
{
previous = current; // go to next link
current = current.next;
}
} // found it
if(current == first) // if first link,
first = first.next; // change first
else // otherwise,
previous.next = current.next; // bypass it
return current;
}
// -------------------------------------------------------------

} // end class LinkList
////////////////////////////////////////////////////////////////
class LinkListApp
{
public static void main(String[] args)
{
LinkList theList = new LinkList(); // make new list
theList.insertFirst(22, 2.99); // insert four items
theList.insertFirst(44, 4.99);
theList.insertFirst(66, 6.99);
theList.insertFirst(88, 8.99);
theList.displayList(); // display list
while( !theList.isEmpty() ) // until it’s empty,
{
Link aLink = theList.deleteFirst(); // delete link
System.out.print("Deleted "); // display it
aLink.displayLink();
System.out.println("");
}
theList.displayList(); // display list
} // end main()
} // end class LinkListApp
////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////
class LinkList2App
{
public static void main(String[] args)
{
LinkList theList = new LinkList(); // make list
theList.insertFirst(22, 2.99); // insert 4 items
theList.insertFirst(44, 4.99);
theList.insertFirst(66, 6.99);
theList.insertFirst(88, 8.99);
theList.displayList(); // display list
Link f = theList.find(55); // find item
if( f != null)
System.out.println("Found link with key " + f.iData);
else
System.out.println("Can’t find link");
Link d = theList.delete(66); // delete item
if( d != null )
System.out.println("Deleted link with key " + d.iData);
else
System.out.println("Can’t delete link");
theList.displayList(); // display list
} // end main()
} // end class LinkList2App
////////////////////////////////////////////////////////////////