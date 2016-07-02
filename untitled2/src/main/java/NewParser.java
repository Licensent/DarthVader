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
                List<Person> persons = parser(wb);
                writePersons(persons);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writePersons(List<Person> persons) {
        for (Person person : persons) {
            FileWorker.write(fileName2, person.toString() + "\n");
            System.out.println(person.toString());
        }
    }

    public List<Person> parser(HSSFWorkbook wb) {
        List<Person> persons = new ArrayList<>();
        Sheet sheet = wb.getSheetAt(0);
        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                continue;
            }
            persons.add(getPerson(row));
        }
        return persons;


    }

    private Person getPerson(Row row) {
        Person.PersonBuilder personBuilder = new Person.PersonBuilder();
        for (Cell cell : row) {
            String cellValueString = getCellValueString(cell);

            if (getColumnName(cell).equals("Name")) {
                personBuilder.setName(cellValueString);
            } else if (getColumnName(cell).equals("LastName")) {
                personBuilder.setLastname(cellValueString);
            } else if (getColumnName(cell).equals("TelNumber")) {
                personBuilder.setPhone(cellValueString);
            }
            if (getColumnName(cell).equals("Number")) {
                if (cellValueString != null) {
                    personBuilder.setNumber(Double.valueOf(cellValueString));
                }
            }

        }
        return personBuilder.build();
    }

    private String getCellValueString(Cell cell) {
        int cellType = cell.getCellType();
        switch (cellType) {
            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            case Cell.CELL_TYPE_NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            default:
                return null;
        }

    }

    private String getColumnName(Cell cell) {
        return cell.getRow().getSheet().getRow(0).getCell(cell.getColumnIndex()).getStringCellValue();
    }

    public List<Person> personadd(Person person) {
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        System.out.println(persons);
        return persons;
    }
}

