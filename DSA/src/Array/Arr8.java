package Array;
//Pascal Triangle 
import java.util.*;
public class Arr8 {
	public ArrayList<int[]> solution(int n){
		ArrayList<int[]> answer =new ArrayList<int[]>();
		for(int i=0;i<n;i++) {
			int[] array=new int[i];
			if(i==0 || i==1) {
				array[0]=1;
				array[i-1]=1;
			}
			else {
				array[0]=1;
				array[i]=1;
				int[] previous=answer.get(i-1);
				for(int j=1;j<i-1;j++) {
					array[j]=previous[j-1]+previous[j];
				}
			}
			answer.add(array);
		}
		return answer;
	}
}
