package Array;
//Merge two sorted Arrays without extra space 
/*
 * 1.)Store both arrays in new array and sort the array T(C)=O(n+m)+sorting algo T(C)
 * 2.)Compare both array and add smaller element in new array 
 * */
public class Arr3 {
	public int[] solution(int[] arr1,int[] arr2) {
		int l1=arr1.length;
		int l2=arr1.length;
		int[] array=new int[l1+l2];
		int i1=0;
		int i2=0;
		int i=0;
		while(i1<l1 || i2<l2) {
			if(i1>=l1 && i2<l2) {
				array[i]=arr2[i2];
				i2++;
			}
			else if(i2>=l2 && i1<l1) {
				array[i]=arr1[i1];
				i1++;
			}
			else {
				if(arr1[i1]<=arr2[i2]) {
					array[i]=arr1[i1];
					i1++;
				}
				else {
					array[i]=arr2[i2];
					i2++;
				}
			}
			i++;
		}
		return array;
	} 
}
