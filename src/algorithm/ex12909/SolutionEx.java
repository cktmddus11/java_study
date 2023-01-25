package algorithm.ex12909;

import java.util.Stack;

public class SolutionEx {
    public static void main(String[] args){
        String s = "(()(";
        boolean answer = true;
        // �ùٸ��� ���� ��ȣ
        // 1. ���ÿ� ) ���� ������ ��
        // 2. ���ڿ��� �� ������ �� ���ÿ� ��ȣ�� �������� ��

        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i); // �̰� ����...;;
            if(c == '('){
                stack.push(c);
            }else {
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    answer = false;
                    break;
                }
            }
        }
        // �Ʒ��ڵ� ȿ����Ż��...
       /* Stack<String> stack = new Stack<>();
        String []splitStr = s.split("");
        for(String c : splitStr){
            if("(".equals(c)){
                stack.push(c);
            }else {
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    answer = false;
                    break;
                }
            }
        }*/
        // �Ʒ��κ� isEmpty()�޼��� ���ϰ��� boolean�̴ϱ� �״�� answer���� �־��.
        /*if(!stack.isEmpty()){
            answer = false;
        }*/
        answer = stack.isEmpty();


        System.out.println(answer);
    }
}
