package Array;
/*Repeat and Missing Number
 * given an unsorted array of size n find which number is missing and which is repeted from(1..n)
 **********
 *1.)Sort an array and traverse to check which is missing and which is repeated
 *2.)Hashing-store all in hash function and check if already hashed then repeated and if hash is missing then missing
 *3.)traverse and store sum of all and sum of square of all (fro given array and original array )
 *		let A = repeating no. and B =	missing no.	
 *		difference in sum of elements =A-B
 *		and difference in sum of square of elements =(A-B)(A+B)  
 */
//return answer in array of length 2 where repeating number at 0 index and missing at 1 index
public class Arr2 {
	public int[] solution(int[] array) {
		int[] answer=new int[2];
		int n=array.length;
		//s=sum of all elements of original array
		int s=n*(n+1)/2;
		//s2= sum of square of all elements of original array
		int s2=n*(n+1)*((2*n)+1)/6;
		//S=sum of all elements of given array
		int S=0;
		//S2= sum of square of all elements of given array
		int S2=0;
		for(int i:array) {
			S=S+i;
			S2=S2+(i*i);
		}
		int diff=S-s;
		int sum=(S2-s2)/diff;
		answer[0]=(sum+diff)/2;
		answer[1]=sum-answer[0];
				
		return answer;
	}
}
