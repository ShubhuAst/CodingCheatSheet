// some input cases
// 3 2 5 3 2 10 -----> need sorting first as binary search applied on sorted data only
// 2 2 5 8 9 9  -----> here no need to sort
static int findLowerBound(int arr[], int l, int u,int num){
	while(l<=u){
		int mid = l+(h-l)/2;                      // update mid
	  if(arr[mid] == num){
			return mid;                             // element found
	  }else if(num > arr[mid]){
			l = mid +1;                             // element is present at right part of array
	  }else {
			u = mid -1;                             // element is present at left part of array
	  }
	}
	return -1;
}

int arr[] = {8,5,8,9,51,100},i=2;
if(findLowerBound(arr,0,i-1, arr[i]) ==-1){  // lower bound dosen't exist means the element itself is it's lower bound
	System.out.println(i);
}else {
	System.out.println(findLowerBound(arr,0,i-1, arr[i]));   // found lower bound of element at i i.e., arr[i]
}
// Time complexity O(logn) for recursive and iterative both
// Auxiliary space complexity O(1) for iterative, O(n) for recursive due to stack.
// for upper bound..........DIY :). Ping me if stucked.

/*
Here, we use l+(h-l)/2 not l+h/2
because, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high
is greater than the maximum positive int value(2^31 – 1 ).
The sum overflows to a negative value and the result stays -ve. In java, it throws ArrayIndexOutOfBoundException.
arr[mid] ------> some -ve value
*/
