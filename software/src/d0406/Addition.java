package d0406;

import d0406.Operation;

public class Addition extends Operation {

    static String ch = "+";

    public Addition(int n) {
        super(ch,n);
    }

    @Override
    public void operation() {
        correctAnswer = op1 + op2;
    }

    public void isNumRight(){}

    public void setRange(){
        minRange = 0;
        maxRange = maxInt + maxInt;
    }
}
