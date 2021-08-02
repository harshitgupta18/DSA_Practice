package Array;

/*Sort an array of 0’s 1’s 2’s without using extra space or sorting algorithm */
/*
 *1.)Can be done by sorting an array - it's T(C) depends on T(C) of sorting algorithms
 *2.) using 2 pointer algorithm - maintaining 2 pointers one for maintaining last index of 0 and another to maintain first index of 2 
 **/
public class Arr1 {
	public int[] solution(int[] array) {
		int index1=0;
		int index2=array.length-1;
		int i=0;
		while(i<index2) {
			if(array[i]==0) {
				if(i==index1) {
					i++;
				}
				else {
					array=swap(array,i,index1);
					}
				index1++;
				}
			if(array[i]==1) {
				i++;
			}
			if(array[i]==2) {
				array=swap(array,i,index2);
				index2--;
			}
		}
		
		return array;
	}
	/*Swap function to wap values at given indexes*/
	private int[] swap(int[] arr,int ind1,int ind2) {
		int temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
		return arr;
	}
	
}
