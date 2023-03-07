package effectiveJava.chapter9.item57.vo;

public class StampInfoVO {
    private String rid;
    private int acrlCnt;
    private String rcptNo;

    /**
     * 스탬프가 속한 회차 RID
     */
    private String stepRid;

    public StampInfoVO(String rid, int acrlCnt, String rcptNo, String stepRid) {
        this.rid = rid;
        this.acrlCnt = acrlCnt;
        this.rcptNo = rcptNo;
        this.stepRid = stepRid;
    }

    public String getRid() {
        return rid;
    }

    public int getAcrlCnt() {
        return acrlCnt;
    }

    public String getRcptNo() {
        return rcptNo;
    }

    public String getStepRid() {
        return stepRid;
    }

    @Override
    public String toString() {
        return "StampInfoVO{" +
                "rid='" + rid + '\'' +
                ", acrlCnt=" + acrlCnt +
                ", rcptNo='" + rcptNo + '\'' +
                ", stepRid='" + stepRid + '\'' +
                '}';
    }
}
