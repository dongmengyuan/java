package dongmengyuan;

import java.util.Scanner;

public class Zhishu {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,flag = 0,a = 0;
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		j = input.nextInt();
		while(true) {
			flag = 0;
			i++;
			if(i % 2 == 0) {
				continue;
			}
			else {
				for(int t = 2; t < Math.sqrt(i); t++) {
					if(i % t == 0) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					System.out.println(i);
					a++;
				}
			}
			if(a == j)
				break;
		}
	}
}
