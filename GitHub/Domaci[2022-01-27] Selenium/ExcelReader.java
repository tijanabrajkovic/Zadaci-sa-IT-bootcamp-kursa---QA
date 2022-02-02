import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    /*
     Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove Brojevi
     (sami izaberite neke random brojeve). U tabeli svi brojevi se nalaze u prvoj koloni. Program treba da cita red po
      red iz tabele i upisane brojeve dodaje na sumu. Ukupnu sumu na kraju treba ispisati na standardnom izlazu.
       Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.
     */
        File file;
        FileInputStream fis;
        XSSFWorkbook wb;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        public ExcelReader(String filePath) throws IOException {
            file = new File(filePath);
            fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        }

        public String getStringData(String sheetName, int rowNumber, int cellNumber) {
            sheet = wb.getSheet(sheetName);
            row = sheet.getRow(rowNumber);
            cell = row.getCell(cellNumber);
            return cell.getStringCellValue();
        }

        public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
            sheet = wb.getSheet(sheetName);
            row = sheet.getRow(rowNumber);
            cell = row.getCell(cellNumber);
            return (int) cell.getNumericCellValue();
        }

        public int getLastRow(String sheet) {
            this.sheet = wb.getSheet(sheet);
            return this.sheet.getLastRowNum();
        }

    }
