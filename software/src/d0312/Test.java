package d0312;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("请输入等级：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		work w = new work();
		work1 w1 = new work1();
		work2 w2 = new work2();
		if (a == 1) {
			w1.Grade();
		}else if(a==2){
			w.Grade();
		}else if(a==3){
			w2.Grade();
		}
	}

}
