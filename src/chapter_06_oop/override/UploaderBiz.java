package chapter_06_oop.override;



import java.util.List;
import java.util.Map;


@Component
public class UploaderBiz extends TmsBiz {

    private final TmsBizManager tmsBizManager;

    //엑셀 업로드시 호출되는 함수
    int upload(ValueChainData valueChainData) {
        //메뉴코드 전송됨
        Map<String, Object> paramMap = valueChainData.getParameterMap();
        // 메뉴코드에 맵핑되는 Biz 클래스 전달
        IUploaderBiz uploaderBiz = tmsBizManager.getTmsBiz(paramMap);

        List<Map<String, Object>> list;
        try {
            ValueChainFileVo valueChainFileVo = MultipartFileUtil.saveMultipartFile(valueChainData, "Upload");
            aipBiz.decrypt(valueChainFileVo);
            //해당 biz클래스가 오버라이딩 하고 있는 getExcelDataList 함수 호출
            list = getExcelDataList(uploaderBiz, getUploadVo(paramMap, valueChainFileVo));
            DeleteFile(valueChainFileVo);
        }catch (Exception e){
            throw new ValueChainException(e.getMessage());
        }

        return saveExcel(list, paramMap);
    }

}

