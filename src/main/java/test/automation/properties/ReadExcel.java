package test.automation.properties;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class ReadExcel {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("Excel/test.xlsx");
        LinkedList<Employee> employees = new LinkedList<>();

        for (Sheet sheet : workbook) {
            for (Row row : sheet) {

                if (row.getRowNum() == 0)
                    continue;
                Employee employee = new Employee();

                for (Cell cell : row) {

                    switch (cell.getColumnIndex()) {
                        case 0:
                            employee.setId((long) Double.parseDouble(cell.toString()));
                            break;

                        case 1:
                            employee.setUsername(cell.getStringCellValue());
                            break;

                        case 2:
                            employee.setPassword(cell.getStringCellValue());
                            break;


                        default:
                            System.out.println("The cell \"" + sheet.getRow(0).getCell(cell.getColumnIndex()) + "\" is not mapped");
                    }
                }
                employees.add(employee);
            }
        }
        employees.forEach(employee -> {
            System.out.println(employee.toString());
        });
    }
}
