// input case
//  1 2 3
//  4 5 6
//  7 8 9
//Output: 1 2 3 -- 6 5 4 -- 7 8 9
	static void printwave(int arr[][]){
	    for(int i=0;i<arr.length;i++){
	        if(i%2==0){                                                   // if even row print left to right else right to left
	            for (int var : arr[i]) System.out.print(var+" ");
	        }else{
	            for (int j=arr[0].length-1;j>=0;j--) System.out.print(arr[i][j]+" ");
	        }
	    }
	}
