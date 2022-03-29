package algorithm.queue;

import java.io.*;
import java.util.StringTokenizer;

public class ITES {
    // N개의 신호중 합이 K인 구간의 수를 출력
    public static int K, N;
    public static double AIndexValue;
    public static double m = Math.pow(2, 32); // 429496729
    public static double b = 2531011;
    public static double d = 214013;

    private static int nextSignal() {
        AIndexValue = (AIndexValue * d + b) % m;
        return (int) (AIndexValue % 1000 + 1);
    }

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        System.setIn(new FileInputStream("src/algorithm/queue/ITESSample.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalTc = Integer.parseInt(br.readLine());
        System.out.println(totalTc);

        for(int tc = 0;tc < totalTc;tc++){ // 3개의 테스트 케이스 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            //System.out.println(K+":"+N);
            bw.write(getITESArray());
        }

        bw.write(System.currentTimeMillis() - start + "ms\n");

        br.close();
        bw.flush();
        bw.close();
    }
// https://gseok.gitbooks.io/algorithm/content/c790-b8cc-ad6c-c870-bb38-c81c/c678-acc4-c2e0-d638-bd84-c11d.html
// https://algospot.com/judge/problem/read/ITES
    private static String getITESArray() {
        AIndexValue = 1983;
        int queue[] = new int[5000001];

        int qHeadPoint = 0;
        int qTailPoint = 0;

        int sameKCount = 0;
        int sum = 0;

        for(int n = 0;n<N;n++){
            int signal = nextSignal();

            System.out.println(signal);
            // add input signal in queue
            queue[qTailPoint] = signal;
            qTailPoint++;

        }




        return null;
    }


}
