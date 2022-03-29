package javaStudy.thread;
// https://wakestand.tistory.com/93
public class Ahri extends Thread{
    String skill_name;

    public Ahri(String cmd){
        skill_name = cmd;
    }

    public void run(){
        System.out.println("시전한 스킬 : "+skill_name);

        for(int i = 1;i<=3;i++){
            System.out.println(skill_name+"스킬을  "+i+"초간 시전중입니다.");
        }
        System.out.println("시전 끝난 스킬 : "+skill_name);

    }

    public static void main(String[] args){
        String[] cmd = new String[]{"Q", "W", "E"};

        for(int i = 0;i<cmd.length;i++){
            Ahri b = new Ahri(cmd[i]);
            b.start(); // Thread extends 후 start()메서드 사용시
            // run()메서드 호출하게됨.
        }
    }


}
