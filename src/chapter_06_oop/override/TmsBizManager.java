package chapter_06_oop.override;


import java.util.Map;


public class TmsBizManager {

    // UploadBiz의 upload 함수헤서 매뉴코드를 전달해줌
    IUploaderBiz getTmsBiz(Map<String, Object> paramMap) {
        IUploaderBiz uploaderBiz = null;

        switch((String)paramMap.get("MENU_CD")) {
            case "MENU_VHC_TP_MGMT":
                uploaderBiz = vehicleTypeBiz;
                break;
            case "MENU_HIPASS_AP_MGMT":
                uploaderBiz = hipassApBiz;
                break;
            case "MENU_ROTATION_MGMT":
                uploaderBiz = rotationBiz;
                break;
            case "MENU_DISPATCH_MGMT_NOBRAND" :
                uploaderBiz = reviewDispatchNobrandBiz;
                break;
            case "MENU_DRVR_MGMT" :
                uploaderBiz = driverBiz;
                break;
            case "MENU_LANG_PACK" :
                uploaderBiz = languagePackBiz;
                break;
            case "MENU_WKD_MGMT" :
                uploaderBiz = workdaysBiz;
                break;
            case "MENU_USER_PLAN_MGMT" :
                uploaderBiz = userplanBiz;
                break;
        }
        //해당 Biz의 클래스
        return uploaderBiz;
    }
}

