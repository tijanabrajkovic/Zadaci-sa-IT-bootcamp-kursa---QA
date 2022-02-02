import POMbase.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Domaci {
    /*
    Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove Brojevi
     (sami izaberite neke random brojeve). U tabeli svi brojevi se nalaze u prvoj koloni. Program treba da cita red po
      red iz tabele i upisane brojeve dodaje na sumu. Ukupnu sumu na kraju treba ispisati na standardnom izlazu.
       Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.
     */
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;

    @BeforeMethod
    public void setUp() throws IOException {

        excelReader = new ExcelReader("C:\\Users\\Budo\\Desktop\\TestBook3.xlsx");

    }

    @Test
    public void izracunavanjeSume(){
        int suma=0;
        for(int i=0; i<= excelReader.getLastRow("Brojevi"); i++){
            int broj= excelReader.getIntegerData("Brojevi",i,0);
            suma= suma+broj;
        }
        System.out.println("Suma unetih brojeva je: " + suma);
    }
}
