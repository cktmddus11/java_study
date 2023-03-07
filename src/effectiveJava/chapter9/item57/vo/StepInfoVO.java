package effectiveJava.chapter9.item57.vo;

import effectiveJava.chapter9.item57.util.CommonUtils;

public class StepInfoVO {
    private String ridMbr;
    private String rid;
    private int step;

    /**
     * 회차에 적립된 스탬프의 합계
     */
    private int acrlCntSum;


    /**
     * @param ridMbr
     * @param rid
     * @param step
     * @param acrlCntSum
     */
    public StepInfoVO(String ridMbr, String rid, int step, int acrlCntSum) {
        this.ridMbr = ridMbr;
        this.rid = rid;
        this.step = step;
        this.acrlCntSum = acrlCntSum;
    }
    public static StepInfoVO firstStepInfoVO(String ridMbr) {
        return new StepInfoVO(ridMbr, null, 1, 0);
    }


    public String getRidMbr() {
        return ridMbr;
    }

    public String getRid() {
        return rid;
    }

    public int getStep() {
        return step;
    }

    public int getAcrlCntSum() {
        return acrlCntSum;
    }

    public void setAcrlCntSum(int acrlCntSum) {
        this.acrlCntSum = acrlCntSum;
    }

    public void nextStep() {
        this.step = ++step;
    }

    @Override
    public String toString() {
        return "StepInfoVO{" +
                "ridMbr='" + ridMbr + '\'' +
                ", rid='" + rid + '\'' +
                ", step=" + step +
                ", acrlCntSum=" + acrlCntSum +
                '}';
    }
}

