package Sorting;

import java.util.Scanner;

public class SelectionSortApplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"elements to be stored");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("array before sorting");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		SelectionSort sort=new SelectionSort();
		sort.selectionSort(arr);
		System.out.println();
		System.out.println("after sorting array contents are");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	

}
