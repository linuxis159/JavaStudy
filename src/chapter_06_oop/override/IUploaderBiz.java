package chapter_06_oop.override;

import java.util.List;
import java.util.Map;

public interface IUploaderBiz {
    int saveExcelList(List<Map<String, Object>> list, String gridId);
    ExcelEnumIF getExcelHeaderEnum(String fieldName);
}

