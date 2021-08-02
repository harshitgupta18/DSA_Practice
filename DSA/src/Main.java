import Array.Arr5;

import java.util.ArrayList;

import Array.Arr3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr5 o=new Arr5();
		int[][] arr1= {{1,3},{2,5},{6,10},{7,15},{11,13}};
		
		
		ArrayList<int[]> array=o.solution(arr1);
		for(int[] i:array) {
			System.out.println(i[0]+" "+i[1]);
		}
	}

}
