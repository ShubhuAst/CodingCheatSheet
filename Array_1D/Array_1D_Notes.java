Array:-

/* fixed size */
int[] array=null;                         //Create a reference of int array (no arrays created yet)
array = new int[]
array = new int[size]                // size is variable entered from user or can be passed in code.
array = new int[n]                   // create new array and now points to array having size n not size.


/* wanna take elements without entering size of array  from single line*/
// input Eg.:-(2 3 61 8 1 44)
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();         //taking the whole line as input
String temp[] = str.split(" ");     //split by Space and put it into string array
int arr[] = new int[temp.length];   //now you can get size of your array
// convert string array elements to integer
for(int i=0;i<arr.length;i++){
	arr[i] = Integer.parseInt(temp[i]);
}
// now you can use your array
for(int var: arr){
	System.out.print(var+" ");
}

/*wanna take elements without entering size of array from multiple lines*/
/* input Eg. :- (3
                 5
								 2
								 7
								 4) */
Scanner sc = new Scanner(System.in);
String str = "";                              // use string to add all lines in single string
while(sc.hasNextLine()){
	str += sc.nextLine()+",";                   // adding ',' every time to split it after this
}

String temp[] = str.split(",");               // split to store in array
int arr[] = new int[temp.length];
for(int i=0;i<arr.length;i++){
	arr[i] = Integer.parseInt(temp[i]);         // convert to string array
}
