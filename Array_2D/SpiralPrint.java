//input case:-
// 1 2 3
// 4 5 6
// 7 8 9
//Output:- 1 2 3 -- 6 9 -- 8 7 -- 4 -- 5
  static void displaySprial(int arr[][]){
	    int top, bottom, left,right, count, dir;
	    top = 0;
	    bottom = arr.length-1;
	    left = 0;
	    right = arr[0].length-1;
	    count = (bottom+1) * (right+1);                            // contains no. of element in 2D array
	    dir = 1;                                                   // direction, 1-> left to right, 2-> top to bottom,
	    while(left <= right && top <= bottom && count > 0){        // 3-> right to left, 4-> bottom to top
	        if(dir == 1){
	            for (int i = left; i<= right;i++ ) {
	                System.out.print(arr[top][i]+" ");
	                count--;
	            }
	            top++;
	            dir = 2;
	        }else if(dir == 2){
	            for (int i = top; i<= bottom;i++ ) {
	                System.out.print(arr[i][right]+" ");
	                count--;
	            }
	            right--;
	            dir = 3;
	        }else if(dir == 3){
	            for (int i = right; i>= left;i-- ) {
	                System.out.print(arr[bottom][i]+" ");
	                count--;
	            }
	            bottom--;
	            dir = 4;
	        }else if(dir == 4){
	            for (int i = bottom; i>= top;i-- ) {
	                System.out.print(arr[i][left]+" ");
	                count--;
	            }
	            left++;
	            dir = 1;
	        }
	    }
  }
