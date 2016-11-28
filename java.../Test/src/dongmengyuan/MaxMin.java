package dongmengyuan;

import java.util.Scanner;

public class MaxMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, max, min;
		Scanner input  = new Scanner(System.in);
		int []s = new int[10];
		for(i = 0; i < s.length; i++) {
			s[i] = input.nextInt();
		}
		max = min = s[0];
		for(i = 1; i < 10; i++) {
			if(max < s[i]) {
				max = s[i];
			}
			else if(min > s[i]) {
				min  = s[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
