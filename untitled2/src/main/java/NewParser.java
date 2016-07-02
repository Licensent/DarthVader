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
import java.util.ArrayList;
import java.util.List;

public class NewParser {

    private static String fileName2 = "C://projects/DarthVader/untitled2/2.txt";
    InputStream in = null;
    HSSFWorkbook wb = null;

    public void XXX(List<File> a) {
        for (File name : a) {
            try {
                in = new FileInputStream(name);
                wb = new HSSFWorkbook(in);
                parser(wb);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void parser(HSSFWorkbook wb) {
        List<Person> persons = new ArrayList<>();
        String result = "";
        Sheet sheet = wb.getSheetAt(0);
        for (Row row : sheet) {
            for (Cell cell : row) {
                List<Double> doubleList = new ArrayList<>();
                List<String> stringList = new ArrayList<>();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        result += cell.getStringCellValue() + " ";
                        stringList.add(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        result += "[" + cell.getNumericCellValue() + "]";
                        doubleList.add(cell.getNumericCellValue());
                        break;

                    case Cell.CELL_TYPE_FORMULA:
                        result += "[" + cell.getNumericCellValue() + "]";
                        break;
                    default:
                        result += "|";
                        break;
                }
                Person person = new Person(doubleList.get(0), stringList.get(0), stringList.get(1), stringList.get(2));
                personadd(person);
            }
            result += "\n";
        }
        FileWorker.write(fileName2, result);
        System.out.println(result);

    }

    public List<Person> personadd(Person person) {
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        System.out.println(persons);
        return persons;
    }
}

