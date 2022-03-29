package algorithm.ex12948;


public class SolutionEx {
    public static void main(String[] args){
        String answer = "";
        String phone_number = "027778888";

        //' 뒷자리 4개 제외 나머지 *로 가림
        String front = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]","*");
        String back = phone_number.substring(phone_number.length()-4);
        answer = front + back;

        System.out.println(answer);
    }
}
