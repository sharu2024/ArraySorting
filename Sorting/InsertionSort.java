package Sorting;

public class InsertionSort {
	void insertionSort(int arr[]) {
		int item;
		for(int i=1;i<=arr.length-1;i++) {
			item=arr[i];
			int j=i-1;
			while(arr[j]>=0&&arr[j]>item) {
				arr[j+1]=arr[j];
				 j--;
			}
			arr[j-1]=item;
			
				}
		}
	}

