1. pseudo code for circular queue
A: Where do I find it...

2. Array private public variable: array and size

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
		
* * *
		for j in 0...sizeOfArray{
			if arr[j]==searchKey{
				break;
			}
		}
		if j==sizeOfArray{
			return false;
		}else{
			for k in j...sizeOfArray-1{
				arr[k]==arr[k+1]
			}
			sizeOfArray--; 
			return true;
		}


* * *
4. different way to implement the array interface

[lowArray](./workable/lowArray.java):have set and get 
[highArray](./workable/highArray.java): have find and insert at the end of the array 
* * *
5. Binary array search of ordered array

		while (true){
			currentIndex=(lowerbound+upperbound)/2;
			if(a[currentIndex]==searchKey){
				return currentIndex;
			}else if(lowbound>upperBound){
				return sizeOfArray;
			}else{
				if(arr[currentIndex]<searchKey){
					lowerBound=currentIndex+1
				}else{
					upperBound=currentIndex-1;
				}
			}
		}
		
6. bubble sort 

for (out=sizeOfArray-1;out>1;out--){
	for (int=0;in<out;in++){
		if(a[in]>a[in+1]){
			swap(in,in+1);
		}
	}
}

* * *
for (i=0;i<sizeOfArray-1;i++){
	for(j=0;j<sizeOfArray-i-1){
		if(a[j]>a[j+1]){
			swap(j,j+1);
		}
	}
}

Logic: when i is 0; j go from 0 to sizeOfArray-1, and swap the smaller one to the right side one by one, meaning putting the biggest one on the most right, etc.
* * *

7. selection sort

for(out=0; out<nElems-1; out++) { 
	min = out; 
	for(in=out+1; in<nElems; in++) 
		if(a[in] < a[min] )  
			min = in;  
		swap(out, min); // swap them
	} 
} 

(This is the same as geekforgeek)

* * *


Logic: setting min to some default number, in this case it is the current out position's element.when out is 0, in goes from 1 to sizeOfArray, check in compare to default number, and swap it, meaning the smallest goes to the out position, min will be at the in position, (so min essentially goes from out position, and then **everything on the right, it doesn't just stay at one position**)
(its not like a find min/max question that min/max just holds a variable)

In real life, it appears as, picking the smallest element(person in a queue) on the right side and put it to the left. There isn't a step for puting the intermediate element on the left.




