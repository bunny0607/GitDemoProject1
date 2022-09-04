import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		int[] a = {1,2,3,4,5,6};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Key>> ");
		int key = scanner.nextInt();
		
		int first = 0;
		int last = a.length-1;
		int mid = (first + last)/2;
		
		while(first<=last) {
			if(a[mid]<key) {
				first = mid + 1;
			}else if(a[mid]==key) {
				System.out.println("Element is found at index--> " +mid);
				break;
			}else {
				last = mid - 1;
			}
			mid = (first +last)/2;
			
		}
		if(first>last) {
			System.out.println("Element is not found");
		}
	}

}
