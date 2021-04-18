package d0406;

import d0406.Operation;

public class Multiplication extends Operation {

    static String ch = "X";

    public Multiplication(int n) {
        super(ch,n);
    }

    @Override
    public void operation() {
        correctAnswer = op1 * op2;
    }

    @Override
    public void isNumRight() {}

    public void setRange(){
        minRange = 0;
        maxRange = maxInt * maxInt;
    }

}
