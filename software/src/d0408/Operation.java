package d0408;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public abstract class Operation {
	protected int op1, op2, op3, remainder, usersRemainder, n, correctAnswer, usersAnswer, maxInt = 1;
	protected String ch, ch1, ch2, ch3;
	protected long minRange, maxRange;
	String p = "";

	public Operation(String ch, String ch1, String ch2, String ch3, int n) {
		super();
		this.ch = ch;
		this.ch1 = ch1;
		this.ch2 = ch2;
		this.ch3 = ch3;
		this.n = n;
	}

	public abstract void operation();

	public abstract void isNumRight();

	public abstract void setRange();

	public void setUsersAnswer(int usersAnswer, int usersRemainder) {

		this.usersAnswer = usersAnswer;
		this.usersRemainder = usersRemainder;
	}

	public void setUsersAnswer(int usersAnswer) {
		setUsersAnswer(usersAnswer, -1);
	}

	public String isCorrect() {
		if (usersAnswer == correctAnswer && usersAnswer != 0)
			return "回答正确";
		else
			return "回答错误";
	}

	public  String printQuestion() {
		isNumRight();

		Random r = new Random();

		do {
			op1 = (int) (Math.random() * Math.pow(10, n));
			op2 = (int) (Math.random() * Math.pow(10, n));
			op3 = (int) (Math.random() * Math.pow(10, n));
			int a = r.nextInt(4);
			int b = r.nextInt(4);
			if (a == 0 && b == 0) {
				correctAnswer = op1 + op2 + op3;
				p = op1 + " " + ch + " " + op2 + ch + " " + op3 + " =";
				
			} else if (a == 0 && b == 1) {
				correctAnswer = op1 + op2 - op3;
				p = op1 + " " + ch + " " + op2 + ch1 + " " + op3 + " =";
			} else if (a == 0 && b == 2) {
				correctAnswer = op1 + op2 * op3;
				p = op1 + " " + ch + " " + op2 + ch2 + " " + op3 + " =";
			} else if (a == 0 && b == 3) {
				op3 += 1;
				correctAnswer = op1 + op2 / op3;
				p = op1 + " " + ch + " " + op2 + ch3 + " " + op3 + " =";
			} else if (a == 1 && b == 0) {
				correctAnswer = op1 - op2 + op3;
				p = op1 + " " + ch1 + " " + op2 + ch + " " + op3 + " =";
			} else if (a == 1 && b == 1) {
				correctAnswer = op1 - op2 - op3;
				p = op1 + " " + ch1 + " " + op2 + ch1 + " " + op3 + " =";
			} else if (a == 1 && b == 2) {
				correctAnswer = op1 - op2 * op3;
				p = op1 + " " + ch1 + " " + op2 + ch2 + " " + op3 + " =";
			} else if (a == 1 && b == 3) {
				op3 += 1;
				correctAnswer = op1 - op2 / op3;
				p = op1 + " " + ch1 + " " + op2 + ch3 + " " + op3 + " =";
			} else if (a == 2 && b == 0) {
				correctAnswer = op1 * op2 + op3;
				p = op1 + " " + ch2 + " " + op2 + ch + " " + op3 + " =";
			} else if (a == 2 && b == 1) {
				correctAnswer = op1 * op2 - op3;
				p = op1 + " " + ch2 + " " + op2 + ch1 + " " + op3 + " =";
			} else if (a == 2 && b == 2) {
				correctAnswer = op1 * op2 * op3;
				p = op1 + " " + ch2 + " " + op2 + ch2 + " " + op3 + " =";
			} else if (a == 2 && b == 3) {
				op3 += 1;
				correctAnswer = op1 * op2 / op3;
				p = op1 + " " + ch2 + " " + op2 + ch3 + " " + op3 + " =";
			} else if (a == 3 && b == 0) {
				op2 += 1;
				correctAnswer = op1 / op2 + op3;
				p = op1 + " " + ch3 + " " + op2 + ch + " " + op3 + " =";
			} else if (a == 3 && b == 1) {
				op2 += 1;
				correctAnswer = op1 / op2 - op3;
				p = op1 + " " + ch3 + " " + op2 + ch1 + " " + op3 + " =";
			} else if (a == 3 && b == 2) {
				op2 += 1;
				correctAnswer = op1 / op2 * op3;
				p = op1 + " " + ch3 + " " + op2 + ch2 + " " + op3 + " =";
			} else if (a == 3 && b == 3) {
				op2 += 1; op3 += 1;
				correctAnswer = op1 / op2 / op3;
				p = op1 + " " + ch3 + " " + op2 + ch3 + " " + op3 + " =";
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
