package effectiveJava.chapter9.item57;

import effectiveJava.chapter9.item57.util.CommonUtils;
import effectiveJava.chapter9.item57.vo.StampInfoVO;
import effectiveJava.chapter9.item57.vo.StepInfoVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Item57Main {
    final static int STEP_MAX = 6;
    static List<StepInfoVO> stepList = new ArrayList<>(); // 회원의 스탬프 회차 및 적립 건수를 조회해왔다고 가정.
    static List<StampInfoVO> stampList = new ArrayList<>(); // 회차에 적립된 스탬프 개수 및 영수증 정보 저장

    public static void main(String[] args){
        makeStampMetaData();


        boolean isAcrlStamp = stampAcrlReq("A", 5);
        System.out.println(isAcrlStamp
                ? "스탬프 적립에 성공했습니다."
                : "스탬프 적립에 실패했습니다.");

        System.out.println(stepList);
        System.out.println(stampList);

    }



    /**
     *   1회차에 2개, 1개 적립한상태.
     */
    private static void makeStampMetaData() {
        String stepRid = CommonUtils.getNewRid();
        StepInfoVO stepInfoVO = new StepInfoVO("A", stepRid, 1, 4);
        StampInfoVO stampInfoVO1 = new StampInfoVO(CommonUtils.getNewRid(), 2, "RCPT1", stepRid);
        StampInfoVO stampInfoVO2 = new StampInfoVO(CommonUtils.getNewRid(), 2, "RCPT2", stepRid);
        stepList.add(stepInfoVO);
        stampList.add(stampInfoVO1);
        stampList.add(stampInfoVO2);
    }



    /** 스탬프 회차, 회차별 스탬프를 저장합니다.
     *
     * @param acrlStamp 적립 요청 개수
     * @return
     */
    private static boolean stampAcrlReq(String ridMbr, int acrlStamp) {

        if(acrlStamp == 0){
            return false;
        }

        int reqAcrlCnt = acrlStamp;

        stepList.sort((o1, o2) -> o1.getStep() > o2.getStep() ? 1 : 0);
        StepInfoVO currentStepSearchVo   = stepList.stream()
                .filter(s -> STEP_MAX > s.getAcrlCntSum()).findFirst().orElse(null);


        for(int i = acrlStamp; i>= 0; i--){
            StepInfoVO currentStepVo = stepList.stream()
                    .filter(s -> {
                        assert currentStepSearchVo != null;
                        return currentStepSearchVo.getStep() == s.getStep();
                    }).findFirst().orElse(null);

            if(ObjectUtils.isEmpty(currentStepVo )){  //
                currentStepVo  = StepInfoVO.firstStepInfoVO(ridMbr);
            }
            if(currentStepVo.getAcrlCntSum() == STEP_MAX){
                currentStepSearchVo.nextStep();
                continue;
            }
            int stepLeftCnt = STEP_MAX - currentStepVo.getAcrlCntSum();
            //int calcCnt = leftAcrlCnt >= stepLeftCnt ? stepLeftCnt : leftAcrlCnt;
            int calcCnt = Math.min(i, stepLeftCnt);  // (a <= b) ? a : b

            boolean isNewStep = StringUtils.isEmpty(currentStepVo.getRid());
            String stepRid = isNewStep ? CommonUtils.getNewRid() : currentStepVo.getRid();
            if(isNewStep){
                stepList.add(currentStepVo);
            }else{
                StampInfoVO stampInfoVO = new StampInfoVO(CommonUtils.getNewRid()
                        , calcCnt, CommonUtils.getRcptNo(),  stepRid);
                stampList.add(stampInfoVO);

                StepInfoVO finalCurrentStepVo = currentStepVo;
                stepList.stream().filter(s -> s.getRid().equals(finalCurrentStepVo.getRid()))
                        .forEach(s -> s.setAcrlCntSum(s.getAcrlCntSum() + calcCnt));
            }

            i -= calcCnt;
            currentStepSearchVo.nextStep();

        }


        return true;
    }
}
