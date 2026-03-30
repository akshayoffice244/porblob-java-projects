package ArrayProblems;

public class ReverseAnArrayWithGivenGroupSize {

	public static void main(String[] args) {
		int  k = 3;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = arr.length;
		for(int i = 0; i < n; i+= k) {
			
			int left = i;
			int right = Math.min(i + k - 1, n-1);
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
				left++;
			}
		}
	
		
		for(int m = 0; m < arr.length; m++) {
			if(m != arr.length -1) {
				System.out.print(arr[m]+", ");
			}else{
				System.out.print(arr[m]+" ");
			}
		}
	}

}
