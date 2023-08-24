package Sorting;
import java.util.Scanner;

public class BubbleSortingApplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"elements to be store");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println(" before sorting array contents aree...");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		//Descending order
		Sorting sorting=new Sorting();
		sorting.bubbleSort(arr);
		System.out.println();
		System.out.println("After sorting array contents aree...");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
