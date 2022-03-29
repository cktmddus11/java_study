package algorithm.ex12947;

public class SolutionEx {
    public static void main(String[] args){
        int x = 13;
        boolean answer = true;
            // String.valueOf(x).split 사용해도되겟다
        String[] xx = (x+"").split("");
        int sum = 0;
        for(int i = 0;i<xx.length;i++){
            sum += Integer.parseInt(xx[i]);
        }
        answer = x % sum == 0;

        /*int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        answer = x % sum == 0;*/

        /*String n = String.valueOf(x);
        int hap = 0;
        for(int i = 0;i<n.length();i++){
            hap += n.charAt(i) - 48;
        }
        answer = x % hap == 0;*/

      /*  int sum = 0;
        Integer.toString(x).chars().forEach(c -> sum += c - '0');*/
      //???? 안되는뎅


        System.out.println(answer);
    }
}
