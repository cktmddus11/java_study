package javaStudy.ch14;

import java.util.List;
import java.util.function.BiConsumer;

public class ConsumerEx {
    public static void main(String[] args){
       /* Triple<Integer, Integer, StatusResDto> resPair = this.excelService
                .executeExcelDataUpload(filePullPath, SystemBatchRgstMapper.class, SystemTierBatchRgstExcelUploadReqDto.class, (mapper, itemList) -> {
                    List<String> mbrList = itemList.stream()
                            .map(SystemTierBatchRgstExcelUploadReqDto::getMbrNo).collect(Collectors.toList());
                    reqDto.setMbrList(mbrList);
                    reqDto.setTierUploadRid(CommonUtil.newRid());
                    reqDto.setBrdCd(brdCd);
                    reqDto.setUploadCnt(itemList.size());

                    // TODO 이전등급 넣기
                    mapper.insertTierUpload(reqDto);
                    mapper.insertTierUploadItem(reqDto);
                });*/
    }











  /*  public <M, T> Triple<Integer, Integer, StatusResDto> executeExcelDataUpload(String excelFileFullPath
            , Class<M> mapperClass, Class<T> targetClass, BiConsumer<M, List<T>> consumer){
                                    // BiConsumer 매개변수는 있고 리턴값은 없음.
        ExcelReader<T> vo = null;
        try{
            SqlSession session = this.factory.openSession(ExecutorType.BATCH, false);
            M mapper = sessin.getMapper(mapperClass);
            vo = new ExcelReader<>(excelFileFullPath, targetClass);
            Pair<Integer, Integer> rowCounts = vo.proceed(itemList ->{
                consumer.accept(mapper, itemList);
                session.flushStatements();
                session.commit();
            })
        }catch(Exception ex) {

        }
    }*/



}

