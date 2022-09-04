

public class BubbleSort {
	public static void main(String args[]) {
		int[] a = new int[]{36, 19, 29, 12, 5};
		
		System.out.println("Given array elements>> ");
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+ " ");
		}
		
		int temp;
		for(int i=0; i<a.length; i++) {
			
			int flag = 0;
			for(int j=0; j<a.length-1-i; j++) {
				
				if(a[j]>a[j+1]) {   //a[j].compareTo(a[j+1]) is used for String array 
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		
		System.out.println("\nSorted elements are>>");
		for(int l=0; l<a.length; l++) {
			System.out.print(a[l]+ " ");
		}
	}

}
