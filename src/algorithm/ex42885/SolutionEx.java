package algorithm.ex42885;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        String s = "01110";
        int[] answer = new int[2];
        // 3���� ���� ��ȯ�� �ϴµ��� 3���� 0�� ����

        //int cnt = 0;
        int cnt = 0;
        int loop = 0;
        while(s.length() != 1){// !"1".equals(s)
          /*  for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    cnt++;
                }
            }*/
            cnt = s.length();
            // cnt�� replaceó�� �Ŀ� ���� ������ �Ǵµ�...;;;; ������� �����ϴϱ� for������...
            int removeZeroStr  =  s.replaceAll("0", "").length();
            cnt += cnt - removeZeroStr;  // cnt ��ó��
           // System.out.println( s.length() - removeZeroStr);
            s = Integer.toBinaryString(removeZeroStr);
            loop++;
        }
        answer[0] =loop;
        answer[1] = cnt;

        System.out.println(Arrays.toString(answer));

    }
}
