package algorithm.kakao.SolutionEx2;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/*
* 아이디의 길이는 3자 이상 15자 이하여야 합니다.
아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
*
*
* https://zzang9ha.tistory.com/322
*https://programmers.co.kr/learn/courses/30/lessons/72410
* */

public class SolutionEx2 {
    public static void main(String[] args){
        String new_id = "=.=";  // => bat.y.abcdefghi
        //String new_id = "1234567891234564sdfaab..cd.";
        //String new_id = "ab";
        String answer = "";

        if(!containUpperCaseIdCheck(new_id)){ // 소문자로만 이루어져있는지 확인
            new_id = convertLowerCaseId(new_id);
        }
        if (!containSpecialCharIdCheck(new_id)){
            new_id = convertSpecialCharId(new_id);
        }
        if(containContinueDotIdCheck(new_id)){
            new_id = convertContainContinueDotId(new_id);
        }
        if(!containFirstLastDotIdCheck(new_id)){
            new_id = convertFirstLastDotIdCheck(new_id);
        }
        if(containNullIdCheck(new_id)){
            new_id = convertNullIdCheck(new_id);
        }
        if(newIdLength16Check(new_id)){
            new_id = convertNewIdLength16(new_id);
        }
        if(newIdLength2Check(new_id)){
            new_id = convertNewIdLength2(new_id);
        }




        answer = new_id;
        System.out.println(answer);

    }
    private static String convertNewIdLength2(String new_id) {
        String lastWord = new_id.substring(new_id.length()-1);
        new_id = new_id + StringUtils.repeat(lastWord.toCharArray()[0], 3 - new_id.length());
        return new_id;
    }

    private static boolean newIdLength2Check(String new_id) {
        return new_id.length() <= 2 ? true : false;
    }
    private static String convertNewIdLength16(String new_id) {
        new_id = new_id.substring(0, 15);
        if(Pattern.matches("[.]$", new_id)){
            new_id.replaceAll("[.]$", "");
        }
        return new_id;
    }

    private static boolean newIdLength16Check(String new_id) {
        return new_id.length() >= 16 ? true : false;
    }

    private static boolean containUpperCaseIdCheck(String new_id){
        String pattern = "^[a-z]*$"; // a ~ z 중 하나의 문자 제외 /
        return Pattern.matches(pattern, new_id); // true : 소문자, false : 대문자 포함
    }
    private static String convertLowerCaseId(String new_id){
        return new_id.toLowerCase();
    }
    private static boolean containSpecialCharIdCheck(String new_id){
        String pattern = "[^a-z\\\\d\\\\-_.]*";
        return Pattern.matches(pattern, new_id);
    }
    private static String convertSpecialCharId(String new_id){
        String regex = "[^a-z\\\\d\\\\-_.]";
        return new_id.replaceAll(regex, "");
    }
    private static boolean containContinueDotIdCheck(String new_id){
        String pattern = "[.]{2,}"; // a ~ z 중 하나의 문자 제외 /
        return Pattern.matches(pattern, new_id); // true : 소문자, false : 대문자 포함
    }
    private static String convertContainContinueDotId(String new_id){
        String regex = "[.]{2,}";
        return new_id.replaceAll(regex, ".");
    }
    private static boolean containFirstLastDotIdCheck(String new_id){
        String pattern = "^[.]|[.]$";
        return Pattern.matches(pattern, new_id);
    }
    private static String convertFirstLastDotIdCheck(String new_id){
        String regex = "^[.]|[.]$";
        return new_id.replaceAll(regex, "");
    }
    private static boolean containNullIdCheck(String new_id){
        return new_id.isEmpty() ? true : false;
    }
    private static String convertNullIdCheck(String new_id){
        return new_id = "a";
    }
    /*
        [] : 한개의 문자
        [^a-z] : a ~ z 이외의 문자 -> [] 안에 ^ => not / ^[] => 문자열의 시작
        *   * : 없음 또는 한개 이상
        $ : 문자열의 종료
    */
}