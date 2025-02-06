package BDD.step_def;

import BDD.utillities.ExcelUtils;

public class ExcelTest {


    public static void main(String[] args) {
        ExcelUtils excelUtils = new ExcelUtils("C:\\Users\\sergi\\OneDrive\\Desktop\\RTR_-_Skills_Sheet_-_QA_Automation_Engineer_#2343.xlsx","Skills Worksheet");
        System.out.println(excelUtils.getCellData(6, 0));

    }

}
