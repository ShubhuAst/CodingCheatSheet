// Some input cases
// 2 5 3 7
// 9 3 6 4
// 8 9 2 1
// 2 2 2 2

static void findMaxMinANDTheirSecondToo(int[] arr){
	int max,secMax,min,secMin;
	boolean flag = false;
  max = secMax = Integer.MIN_VALUE;
	min = secMin = Integer.MAX_VALUE;

	for (int i=0;i<arr.length ;i++){
		// max is smaller change value from current index value and put max value to second max
		if(max < arr[i]){
			secMax = max;
		  max = arr[i];
		}else if(secMax < arr[i] && arr[i] != max) secMax = arr[i];   // second max is after max
	}

	if(secMax == Integer.MIN_VALUE) flag = true;                    // second max is still MIN_VALUE? no 2nd max exist. Eg. input(1 1 1 1)
	if(flag){
		System.out.println(max+" "+ "Second element not exist");
		return;
	}
	System.out.println(max+" "+secMax);
}
// takes O(n)
// finding code for min, second min, Third min?.......... DIY :), ping me if stucked.











//some input cases
// 1 1 1 1
// 9 8 3 2
// 9 9 2 9
// 3 5 9 0
static void findMaxMinANDTheirSecondToo(int[] arr){
	int max,secMax,min,secMin,thirdMax;
	boolean flagForSecond,flagForThird;
	flagForSecond = flagForThird = false;
	max = secMax = thirdMax = Integer.MIN_VALUE;
	min = secMin = Integer.MAX_VALUE;

	for (int i=0;i<arr.length ;i++){
		if(max < arr[i]){
			thirdMax = secMax;
		  secMax = max;
		  max = arr[i];
	  }else if(secMax < arr[i] && arr[i]!= max){
			thirdMax = secMax;
		  secMax = arr[i];
    }else if(thirdMax < arr[i] && arr[i]!=secMax && arr[i]!=max) thirdMax = arr[i];
  }
	if(secMax == Integer.MIN_VALUE) flagForSecond = true;
	if(thirdMax == Integer.MIN_VALUE) flagForThird = true;

	if (flagForSecond && flagForThird){
		System.out.println(max+" "+"Second element not exist"+" "+"Third element not exist");
		return;
	}
	if(flagForSecond){
		System.out.println(max+" "+"Second element not exist"+" "+thirdMax);
		return;
	}
	if(flagForThird){
		System.out.println(max+" "+secMax+" "+"Third element not exist");
		return;
	}
	System.out.println(max+" "+secMax+" "+thirdMax);
}
