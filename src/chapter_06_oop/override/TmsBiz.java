package chapter_06_oop.override;




import java.util.List;
import java.util.Map;



public abstract class TmsBiz implements IUploaderBiz
{
    // for Excel upload
    public int saveExcelList(List<Map<String, Object>> list, String gridId) {
        return 0;
    }

    public ExcelEnumIF getExcelHeaderEnum(String fieldName) {
        return null;
    }

    //------------------------------------------------------> Protected Method <------------------------------------------------------//

}
