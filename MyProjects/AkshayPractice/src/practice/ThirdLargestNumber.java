package practice;

public class ThirdLargestNumber {
	static void getThirdLargestNumber(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > firstLargest) 
			{	secondLargest  = firstLargest;
				firstLargest = num;
			}else if( secondLargest < num && num < firstLargest  ) {
				thirdLargest = secondLargest;
				secondLargest  = num;
			}else if(thirdLargest < num && num < secondLargest){
				thirdLargest = num;
			}
		}
		
		System.out.println("Third Largest Number: " + thirdLargest);
	}

	public static void main(String[] args) {
		int arr[] = {19, -10, 20, 14, 2, 16, 10};
		 getThirdLargestNumber(arr);
	
	}

}
