// input cases:-
// Here you can't run loop from end, i.e., parameter index = 0 is must;
// 0 3 1 8 1    --> data: 0 (0)
// 10 10 10 10  --> data: 10 (3)
// 1 4 2 5 7    --> data: 3 (-1)
static int lastIndex(int arr[], int index,int data){
	    if(index == arr.length) return -1;                      // overflow element not found

	    if(lastIndex(arr,index+1, data) == -1){                 // next element is end of array
	        if(arr[index] == data){
	            return index;                                   // return index if before end element found our data

	        }
	        else{
	            return -1;                                       // return -1 no data found

	        }
	    }else{
	        return lastIndex(arr,index+1, data);                  // continue searching
	    }
	}
