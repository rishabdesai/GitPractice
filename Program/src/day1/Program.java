package day1;

public class Program {
	
	public static int binarySearch(int[] arr, int key) {
		int left=0;
		int right=arr.length-1;
		int mid;
		
		while(left <=right) {
			mid= (left+right)/2;
			if(key ==arr[mid])
				return mid;
			if (key < arr[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {5,6,3,2,4,5};
		int index = binarySearch(arr, 5);
		if (index == -1)
			System.out.println("no number found");
			
	}

}
