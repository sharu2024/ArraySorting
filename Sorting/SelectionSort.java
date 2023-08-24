package Sorting;

public class SelectionSort {
     void selectionSort(int arr[]) {
    	 int mid;
    	 int pos=0;
    	 int help;
    	 for(int i=0;i<=arr.length-2;i++) {
    		 for(int j=i+1;j<=arr.length-1;j++) {
    			 if(arr[j]<arr[i]) {
    				 mid=arr[j];
    				 pos=j;
    			 }
    		 }
    		 help=arr[i];
    		 arr[i]=arr[pos];
    		 arr[pos]=help;
    	 }
     }
}
