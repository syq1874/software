package d0408;

import d0408.Operation;

public class Multiplication extends Operation {

    static String ch = "+";
    static String ch1 = "-";
    static String ch2 = "×";
    static String ch3 = "÷";

    public Multiplication(int n) {
        super(ch,ch1,ch2,ch3,n);
    }

    @Override
    public void operation() {
       
    }

    @Override
    public void isNumRight() {}

    public void setRange(){
        minRange = 0;
        maxRange = maxInt * maxInt;
    }

}
