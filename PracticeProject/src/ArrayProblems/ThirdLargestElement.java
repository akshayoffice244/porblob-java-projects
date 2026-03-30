package ArrayProblems;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int[] arr = {1, 14, 2, 16, 10, 20};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > largest) {
				secondLargest = largest;
				
				largest =num;
			}else if( num > secondLargest && num < largest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			}else if(num > thirdLargest && num < secondLargest){
				thirdLargest = num;
			}
		}
		System.out.println("second Largest " + secondLargest);
		System.out.println("Third Largest " + thirdLargest);

	}

}
