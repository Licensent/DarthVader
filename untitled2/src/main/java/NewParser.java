/**
 * Created by DarthVader on 20.06.2016.
 */

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class NewParser {
    private static String fileName2 = "C://projects/DarthVader/untitled2/2.txt";

    InputStream in = null;
    HSSFWorkbook wb = null;

    public String XXX(List<File> a) {
        for (File name : a) {
            try {
                in = new FileInputStream(name);
                wb = new HSSFWorkbook(in);
                parser(wb);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String parser(HSSFWorkbook wb) {
        String result = "";
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        result += cell.getStringCellValue() + " ";
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        result += "[" + cell.getNumericCellValue() + "]";
                        break;

                    case Cell.CELL_TYPE_FORMULA:
                        result += "[" + cell.getNumericCellValue() + "]";
                        break;
                    default:
                        result += "|";
                        break;
                }
            }
            result += "\n";
        }
        FileWorker.write(fileName2, result);
        System.out.println(result);
        return result;


    }

}

