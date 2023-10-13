package selenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 0;



    @Before
    public void  setUp (){
        numberOfCase ++;
        System.out.println("Se esta ejecutando el ecenario nro:" + numberOfCase);
        System.setProperty("webdriver.chrome.driver","C:\\Reactz\\Proyecto1-PreWORK\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void  tearDown(){
        System.out.println("El ecenario nro:" + numberOfCase + "Se ejecuto correctamente");
        driver.quit();
    }


    public  static  ChromeDriver getDriver(){
        return driver;
    }
}
