package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class dataExcelUtils {

    public static  void getRowCount() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\valcantara\\IdeaProjects\\Gitlal Lb_Selenium\\labseleniumintellijcommunity\\Lb_Selenium\\data excel");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
    }
}
