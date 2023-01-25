package algorithm.ex72412;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(String[] info, String[] query){
        int[] answer = new int[query.length];

        List<Info> infoList = getInfoList(info);
        //System.out.println(infoList);

        for(int i = 0;i<query.length;i++) {
            String splitQuery[] = getQueryArr(query[i]);
            //System.out.println(Arrays.toString(splitQuery));
            for (Info infoDto : infoList) {
                boolean pass = checkPass(infoDto, splitQuery);
                if(pass){
                    answer[i]++;
                }
                // System.out.println("pass : :"+pass+"/"+ infoDto.toString());
            }
        }
        return answer;

    }

    private boolean checkPass(Info infoDto, String[] splitQuery) {
        boolean pass = true;
        // 언어
        if (!splitQuery[0].equals(infoDto.getLang()) && !splitQuery[0].equals("-")) {
            pass = false;
            return pass;
        }
        // 직군
        if (!splitQuery[1].equals(infoDto.getGroup()) && !splitQuery[1].equals("-")) {
            pass = false;
            return pass;
        }
        // 경력
        if (!splitQuery[2].equals(infoDto.getCareer()) && !splitQuery[2].equals("-")) {
            pass = false;
            return pass;
        }
        // 소울푸드 and 점수
        String []splitLast = splitQuery[3].split(" ");
        if (!splitLast[0].equals(infoDto.getFood()) && !splitLast[0].equals("-")){
            pass = false;
            return pass;
        }
        if(Integer.parseInt(splitLast[1]) > Integer.parseInt(infoDto.getScore())){
            pass = false;
            return pass;
        }

        return pass;
    }

    private String[] getQueryArr(String query) {
        return query.replaceAll(" and ", "|").split("\\|");
    }

    private List<Info> getInfoList(String[] info) {
        List<Info> list = Arrays.stream(info).map(d -> {
            String splitInfo[] = d.split(" ");
            return new Info(splitInfo[0], splitInfo[1], splitInfo[2], splitInfo[3], splitInfo[4]);
        }).collect(Collectors.toList());

        return list;
    }
}




class Info {
    private String lang;
    private String group;
    private String career;
    private String food;
    private String score;


    public Info(String lang, String group, String career, String food, String score) {
        this.lang = lang;
        this.group = group;
        this.career = career;
        this.food = food;
        this.score = score;
    }

    public String getLang() {
        return lang;
    }

    public Info setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public Info setGroup(String group) {
        this.group = group;
        return this;
    }

    public String getFood() {
        return food;
    }

    public Info setFood(String food) {
        this.food = food;
        return this;
    }

    public String getScore() {
        return score;
    }

    public Info setScore(String score) {
        this.score = score;
        return this;
    }

    public String getCareer() {
        return career;
    }

    public Info setCareer(String career) {
        this.career = career;
        return this;
    }

    @Override
    public String toString() {
        return "Info{" +
                "lang='" + lang + '\'' +
                ", group='" + group + '\'' +
                ", career='" + career + '\'' +
                ", food='" + food + '\'' +
                ", score='" + score + '\'' +
                '}' + "\n";
    }
}