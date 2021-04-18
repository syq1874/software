package d0312;

import java.util.Random;
import java.util.Scanner;

public class work2 {

	public void Grade() {
		Random r = new Random();
		System.out.println("请输入题目数：");
		Scanner sc = new Scanner(System.in);
		int o = sc.nextInt();
		String p = "";
		int score = 0;
		for (int i = 0; i < o; i++) {
			int num = 0;
			do {
				int a = r.nextInt(4);
				int b = r.nextInt(100);
				int c = r.nextInt(100);
				int d = r.nextInt(4);
				int e = r.nextInt(100);
				int f = r.nextInt(3);

				if (a == 0) {
					if (f == 1) {
						if (d == 0) {
							p = b + "+" + c + "+" + e;
						} else if (d == 1) {
							p = +b + "+" + c + "-" + e;
						} else if (d == 2) {
							p = "(" + b + "+" + c + ")" + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = "(" + b + "+" + c + ")" + "÷" + e;
						}
					} else {
						if (d == 0) {
							p = b + "+" + c + "+" + e;
						} else if (d == 1) {
							p = +b + "+" + c + "-" + e;
						} else if (d == 2) {
							p = b + "+" + c + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = b + "+" + c + "÷" + e;
						}
					}
				} else if (a == 1) {
					if (f == 1) {
						if (d == 0) {
							p = b + "-" + c + "+" + e;
						} else if (d == 1) {
							p = b + "-" + c + "-" + e;
						} else if (d == 2) {
							p = "(" + b + "-" + c + ")" + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = "(" + b + "-" + c + ")" + "÷" + e;
						}
					} else {
						if (d == 0) {
							p = b + "-" + c + "+" + e;
						} else if (d == 1) {
							p = b + "-" + c + "-" + e;
						} else if (d == 2) {
							p = b + "-" + c + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = b + "-" + c + "÷" + e;
						}
					}
				} else if (a == 2) {
					if (f == 2) {
						if (d == 0) {
							p = b + "×(" + c + "+" + e + ")";
						} else if (d == 1) {
							p = b + "×(" + c + "-" + e + ")";
						} else if (d == 2) {
							p = b + "×" + c + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = b + "×" + c + "÷" + e;
						}
					} else {
						if (d == 0) {
							p = b + "×" + c + "+" + e;
						} else if (d == 1) {
							p = b + "×" + c + "-" + e;
						} else if (d == 2) {
							p = b + "×" + c + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = b + "×" + c + "÷" + e;
						}
					}
				} else if (a == 3) {
					c += 1;
					if (f == 2) {
						if (d == 0) {
							p = b + "÷(" + c + "+" + e + ")";
						} else if (d == 1) {
							p = b + "÷(" + c + "-" + e + ")";
						} else if (d == 2) {
							p = b + "÷" + c + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = b + "÷" + c + "÷" + e;
						}
					} else {
						if (d == 0) {
							p = b + "÷" + c + "+" + e;
						} else if (d == 1) {
							p = b + "÷" + c + "-" + e;
						} else if (d == 2) {
							p = b + "÷" + c + "×" + e;
						} else if (d == 3) {
							e += 1;
							p = b + "÷" + c + "÷" + e;
						}
					}
				}

				if (p.equals(b + "+" + c + "+" + e)) {
					num = b + c + e;
				} else if (p.equals(b + "+" + c + "-" + e)) {
					num = b + c - e;
				} else if (p.equals(b + "+" + c + "×" + e)) {
					num = b + c * e;
				} else if (p.equals(b + "+" + c + "÷" + e)) {
					num = b + c / e;
				} else if (p.equals(b + "-" + c + "+" + e)) {
					num = b - c + e;
				} else if (p.equals(b + "-" + c + "-" + e)) {
					num = b - c - e;
				} else if (p.equals(b + "-" + c + "×" + e)) {
					num = b - c * e;
				} else if (p.equals(b + "-" + c + "÷" + e)) {
					num = b - c / e;
				} else if (p.equals(b + "×" + c + "+" + e)) {
					num = b * c + e;
				} else if (p.equals(b + "×" + c + "-" + e)) {
					num = b * c - e;
				} else if (p.equals(b + "×" + c + "×" + e)) {
					num = b * c * e;
				} else if (p.equals(b + "×" + c + "÷" + e)) {
					num = b * c / e;
				} else if (p.equals(b + "÷" + c + "+" + e)) {
					num = b / c + e;
				} else if (p.equals(b + "÷" + c + "-" + e)) {
					num = b / c - e;
				} else if (p.equals(b + "÷" + c + "×" + e)) {
					num = b / c * e;
				} else if (p.equals(b + "÷" + c + "÷" + e)) {
					num = b / c / e;
				} else if (p.equals("(" + b + "+" + c + ")" + "×" + e)) {
					num = (b + c) * e;
				} else if (p.equals("(" + b + "+" + c + ")" + "÷" + e)) {
					num = (b + c) / e;
				} else if (p.equals("(" + b + "-" + c + ")" + "×" + e)) {
					num = (b + c) * e;
				} else if (p.equals("(" + b + "-" + c + ")" + "÷" + e)) {
					num = (b + c) / e;
				} else if (p.equals(b + "÷(" + c + "+" + e + ")")) {
					num = b / (c + e);
				} else if (p.equals(b + "÷(" + c + "-" + e + ")")) {
					num = b / (c - e);
				} else if (p.equals(b + "÷(" + c + "+" + e + ")")) {
					num = b / (c + e);
				} else if (p.equals(b + "÷(" + c + "-" + e + ")")) {
					num = b / (c - e);
				}

			} while (num < 0);

			System.out.println(p);
			System.out.println("请输入答案：");
			Scanner sc1 = new Scanner(System.in);
			int p1 = sc1.nextInt();
			if (p1 == num) {
				score++;
				System.out.println("答案正确！得分为:"+score);
			} else {
				System.out.println("答案错误！得分为:"+score);
			}

		}
	}
}
