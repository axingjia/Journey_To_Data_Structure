1. pseudo code for circular queue
A: Where do I find it...


2. Array search 
for j in 0...sizeofArray{
	if arr[j]== searchkey{
		break
	}
	
}
return j;
* * *
for j in 0...sizeOfArray{
	if arr[j]==searchKey{
		return j
	}
}

3. Delete Element from Array
for j in 0...sizeOfArray{
	if arr[j]==searchKey{
		break;
	}
}
for k in j...sizeOfArray-1{
	arr[k]==arr[k+1]
}
sizeOfArray--; 