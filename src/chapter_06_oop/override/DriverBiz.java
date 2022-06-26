package chapter_06_oop.override;


import java.util.List;
import java.util.Map;

public class DriverBiz extends TmsBiz {


    public int saveExcelList(List<Map<String, Object>> list, String gridId) {
        for(Map map : list) {
            map.put("rowStatus", "I");
        }
        int retVal = 0;
        retVal += saveWithAddr(list);
        checkDup(retVal);
        saveForMobileUser(list);
        return retVal;
    }


    public ExcelEnumIF getExcelHeaderEnum(String fieldName) {
        for (ExcelEnumIF rows : DriverExcelEnum.values()) {
            if(rows.getFieldName().equals(fieldName)) return rows; } return null; }


}

