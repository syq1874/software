package d0312;

import java.util.Scanner;
import java.util.Stack;


public class Test1 {
    private Stack<Integer> stack = new Stack<>();
    public int run(String str){
        if(str==null||str.length()==0) {
            return 0;
        }
        str=str.replace(" ","");
        int n=0;
        char op='+';
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            }
            if(!Character.isDigit(c)||i==str.length()-1){
                switch(op){
                    case '+': stack.push(n);
                        break;
                    case '-': stack.push(-n);
                        break;
                    case '*':
                        stack.push(stack.pop()*n);
                        break;
                    case '/':
                        stack.push(stack.pop()/n);
                        break;
                }
                op=c;
                n=0;
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入表达式：");
        String str = scanner.next();
        Test1 calculator = new Test1();
        System.out.println(calculator.run(str));
    }
}
