1. Bubble Sort
2. Selection Sort
3. Insertion Sort



1.
// Bubble sort (acending order)
// remove the multi-line comments inside bubbleSort function to optimize it
static void bubbleSort(int arr[]){
	/* -  boolean swapped = false;  -*/
	for(int counter = 0;counter < arr.length-1;counter++){         // the value of counter specify the no. of variable sorted
		/* -  swapped = false;  -*/                                  // use this variable to verify is element is swapped or not
		for (int j = 0;j < arr.length-1-counter;j++ ){               // arr.length -1 -counter because we don't need to check for sorted element
			if(arr[j] > arr[j+1]){                                     // swapping if element j is greater then element at j+1
				arr[j] = arr[j] + arr[j+1];
	      arr[j+1] = arr[j] - arr[j+1];
	      arr[j] = arr[j] - arr[j+1];
				/* - swapped = true; - */
	    }
	  }
		/* - if(swapped == false) break;  - */                        // if not a single element is swapped in array then array is already sorted.
  }
}
// for decending..........DIY :). Ping me if stucked.



2.
//Selection sort (acending order)
/*
Link to Image for better understanding:-
https://www.w3resource.com/w3r_images/selection-short.png
*/
static void selectionSort(int arr[]){
	    for (int counter=0; counter<arr.length-1 ;counter++ ){
	        int min = counter;                                    //taking min to store the index of smallest value in unsorted array, assumeing currently min is at 0.
	        for(int j=counter+1;j< arr.length;j++){               // finding smallest value index
	            if(arr[j] < arr[min]) min = j;
	        }
	       int temp = arr[counter];                               // swapping the smallest value with what we assume is smallest
	       arr[counter] = arr[min];
	       arr[min] = temp;
         //---------- XXX ----------//
				 // arr[counter] = arr[counter] + arr[min];             // don't use swapping without 3rd variable because if next element is placed,
				 // arr[min] = arr[counter] - arr[min];                 // in its own position then min and counter will holding same index,
				 // arr[counter] = arr[counter] - arr[min];             // causing this whole calculation result to 0. arr[min]=arr[counter]=0
	    }
	}
// for decending..........DIY :). Ping me if stucked.

// Optimized Selection Sort (acending order)
static void optimizedSelectionSort(int arr[]){
		int n = arr.length;
		for (int i = 0, j = n - 1; i < j; i++, j--){                // i for sort from start, j for sort from end of array --> results loop to run n/2(n->no. of element)
				int min = arr[i], max = arr[i];                         // keeping track of maximum element and its index, doing same for minimum.
					int min_i = i, max_i = i;
					for (int k = i; k <= j; k++){                         // start index from i not 1+1 as ith element can be maximum or minimum. Going till j because after j,
                                                                // element are sorted from end
							if (arr[k] > max){
									max = arr[k];
									max_i = k;
							}
							else if (arr[k] < min){
									min = arr[k];
									min_i = k;
							}
					}

					swap(arr, i, min_i);
					if (arr[min_i] == max) swap(arr, j, min_i);            // if my maximum element is swapped with minimum value, but minimum index is still same, So using,
					                                                       // minimum index to track down new position of maximum element.
					else swap(arr, j, max_i);
			}
}

static void swap(int arr[], int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
}
// for decending..........DIY :). Ping me if stucked.



3.
// insertion sort (acending order)
static void insertionSort(int arr[]){
	for (int counter = 1;counter < arr.length ;counter++ ){      // loop starts from 1 bcz we divide array in 2 parts,
		int val = arr[counter];                                    // sorted part, unsorted part and we assume 1st element is in sorted part.
	  int j = counter-1;
	  while(j>=0 && arr[j] > val ){                              // this loops shifts the sorted array so that next un sorted element,
			arr[j+1] = arr[j];                                       // can be placed in their place
	    j--;
	  }
	  arr[j+1] = val;                                            // placing next unsorted element to appropriate place in sorted part.
	}
}
// for decending..........DIY :). Ping me if stucked.
