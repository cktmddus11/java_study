package algorithm.ex12909;

import java.util.Stack;

public class SolutionEx {
    public static void main(String[] args){
        String s = "(()(";
        boolean answer = true;
        // 올바르지 않은 괄호
        // 1. 빈스택에 ) 부터 들어왔을 때
        // 2. 문자열을 다 돌았을 때 스택에 괄호가 남아있을 때

        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i); // 이게 좋나...;;
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
        // 아래코드 효율성탈락...
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
        // 아래부분 isEmpty()메서드 리턴값이 boolean이니까 그대로 answer에도 넣어도됨.
        /*if(!stack.isEmpty()){
            answer = false;
        }*/
        answer = stack.isEmpty();


        System.out.println(answer);
    }
}
