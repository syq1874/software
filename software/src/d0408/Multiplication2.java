package d0408;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Multiplication2 extends Operation {

	static String ch = "+";
	static String ch1 = "-";
	static String ch2 = "×";
	static String ch3 = "÷";

	public Multiplication2(int n) {
		super(ch, ch1, ch2, ch3, n);
	}

	@Override
	public void operation() {

	}

	@Override
	public void isNumRight() {
	}

	public void setRange() {
		minRange = 0;
		maxRange = maxInt * maxInt;
	}

	public String printQuestion() {
		isNumRight();

		Random r = new Random();

		do {
			op1 = (int) (Math.random() * Math.pow(10, n));
			op2 = (int) (Math.random() * Math.pow(10, n));
			op3 = (int) (Math.random() * Math.pow(10, n));
			int a = r.nextInt(4); // 0+,1-,2*,3/
			int b = r.nextInt(4); // 0+,1-,2*,3/
			int c = r.nextInt(3); // c=0：没有括号，c=1：括号1,2位，c=2：括号2,3位
			if (a == 0) {
				if (c == 1) {
					if (b == 0) {
						correctAnswer = op1 + op2 + op3;
						p = op1 + ch + op2 + ch + op3 + " =";
					} else if (b == 1) {
						correctAnswer = op1 + op2 - op3;
						p = op1 + ch + op2 + ch1 + op3 + " =";
					} else if (b == 2) {
						correctAnswer = (op1 + op2) * op3;
						p = "(" + op1 + ch + op2 + ")" + ch2 + op3 + " =";
					} else if (b == 3) {
						op3 += 1;
						correctAnswer = (op1 + op2) / op3;
						p = "(" + op1 + ch + op2 + ")" + ch3 + op3 + " =";
					}
				} else {
					if (b == 0) {
						correctAnswer = op1 + op2 + op3;
						p = op1 + ch + op2 + ch + op3 + " =";
					} else if (b == 1) {
						correctAnswer = op1 + op2 - op3;
						p = op1 + ch + op2 + ch1 + op3 + " =";
					} else if (b == 2) {
						correctAnswer = (op1 + op2) * op3;
						p = op1 + ch + op2 + ch2 + op3 + " =";
					} else if (b == 3) {
						op3 += 1;
						correctAnswer = (op1 + op2) / op3;
						p = op1 + ch + op2 + ch3 + op3 + " =";
					}
				}
			} else if (a == 1) {
				if (c == 1) {
					if (b == 0) {
						correctAnswer = op1 - op2 + op3;
						p = op1 + ch1 + op2 + ch + op3 + " =";
					} else if (b == 1) {
						correctAnswer = op1 - op2 - op3;
						p = op1 + ch1 + op2 + ch1 + op3 + " =";
					} else if (b == 2) {
						correctAnswer = (op1 - op2) * op3;
						p = "(" + op1 + ch1 + op2 + ")" + ch2 + op3 + " =";
					} else if (b == 3) {
						op3 += 1;
						correctAnswer = (op1 - op2) / op3;
						p = "(" + op1 + ch1 + op2 + ")" + ch3 + op3 + " =";
					}
				} else {
					if (b == 0) {
						correctAnswer = op1 - op2 + op3;
						p = op1 + ch1 + op2 + ch + op3 + " =";
					} else if (b == 1) {
						correctAnswer = op1 - op2 - op3;
						p = op1 + ch1 + op2 + ch1 + op3 + " =";
					} else if (b == 2) {
						correctAnswer = (op1 - op2) * op3;
						p = op1 + ch1 + op2 + ch2 + op3 + " =";
					} else if (b == 3) {
						op3 += 1;
						correctAnswer = (op1 - op2) / op3;
						p = op1 + ch1 + op2 + ch3 + op3 + " =";
					}
				}
			} else if (a == 2) {
				if (c == 2) {
					if (b == 0) {
						correctAnswer = op1 * (op2 + op3);
						p = op1 + ch2 + "(" + op2 + ch + op3 + ")" + " =";
					} else if (b == 1) {
						correctAnswer = op1 * (op2 - op3);
						p = op1 + ch2 + "(" + op2 + ch + op3 + ")" + " =";
					} else if (b == 2) {
						correctAnswer = op1 * op2 * op3;
						p = op1 + ch2 + op2 + ch2 + op3 + " =";
					} else if (b == 3) {
						op3 += 1;
						correctAnswer = op1 * op2 / op3;
						p = op1 + ch2 + op2 + ch3 + op3 + " =";
					}
				} else {
					if (b == 0) {
						correctAnswer = op1 * op2 + op3;
						p = op1 + ch2 + op2 + ch + op3 + " =";
					} else if (b == 1) {
						correctAnswer = op1 * op2 - op3;
						p = op1 + ch2 + op2 + ch + op3 + " =";
					} else if (b == 2) {
						correctAnswer = op1 * op2 * op3;
						p = op1 + ch2 + op2 + ch2 + op3 + " =";
					} else if (b == 3) {
						op3 += 1;
						correctAnswer = op1 * op2 / op3;
						p = op1 + ch2 + op2 + ch3 + op3 + " =";
					}
				}
			} else if (a == 3) {
				if (c == 2) {
					if (b == 0) {
						op2 += 1;
						correctAnswer = op1 / (op2 + op3);
						p = op1 + ch3 + "(" + op2 + ch + op3 + ")" + " =";
					} else if (b == 1) {
						if (op2 >= op3) {
							op2 += 1;
							correctAnswer = op1 / (op2 - op3);
							p = op1 + ch3 + "(" + op2 + ch + op3 + ")" + " =";
						} else {
							int s = op3;
							op3 = op2;
							op2 = s;
							correctAnswer = op1 / (op2 - op3);
							p = op1 + ch3 + "(" + op2 + ch + op3 + ")" + " =";
						}
					} else if (b == 2) {
						op2 += 1;
						correctAnswer = op1 / op2 * op3;
						p = op1 + ch3 + op2 + ch2 + op3 + " =";
					} else if (b == 3) {
						op2 += 1;
						op3 += 1;
						correctAnswer = op1 / op2 / op3;
						p = op1 + ch3 + op2 + ch3 + op3 + " =";
					}
				} else {
					if (b == 0) {
						op2 += 1;
						correctAnswer = op1 / op2 + op3;
						p = op1 + ch2 + op2 + ch + op3 + " =";
					} else if (b == 1) {
						op2 += 1;
						correctAnswer = op1 / op2 - op3;
						p = op1 + ch2 + op2 + ch + op3 + " =";
					} else if (b == 2) {
						op2 += 1;
						correctAnswer = op1 / op2 * op3;
						p = op1 + ch2 + op2 + ch2 + op3 + " =";
					} else if (b == 3) {
						op2 += 1;
						op3 += 1;
						correctAnswer = op1 / op2 / op3;
						p = op1 + ch2 + op2 + ch3 + op3 + " =";
					}
				}
			}
		} while (correctAnswer < 0);
		return p;

	}

	public String ptintQA() {
		operation();
		return "答案：" + p + correctAnswer;
	}

	public void writeToFile(File aFile) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(aFile, true));
			out.println("题目：" + p);
			out.println("你的答案：" + usersAnswer + "    " + "正确答案：" + correctAnswer);
			out.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
