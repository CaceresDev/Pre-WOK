package selenium;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver = Hooks.getDriver();


    @Given("^El usuario se encuentra en la pagina Home de imailttsjd$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imailttsjd() throws Throwable {

        String titleHomePage= "Testing | imalittletester";
        Assert.assertEquals(titleHomePage,driver.getTitle());

    }

    @When("^Hace clicl sobres el boton  The little testet comic$")
    public void hace_clicl_sobres_el_boton_The_little_testet_comic() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("comp-iiyocj9v5label"));
        titleComicsLocator.click();

    }

    @Then("^Se debe dirigir a la pantalla comic$")
    public void se_debe_dirigir_a_la_pantalla_comic() throws Throwable {
       WebElement pageTitleLocator = driver.findElement(By.xpath("//*[@id=\"comp-lc61aui31\"]/h2"));
        Assert.assertTrue("Verification failed: Element1 and Element2 are not same.",pageTitleLocator.isDisplayed() );
        Assert.assertEquals("THE LITTLE TESTER COMICS SERIES", pageTitleLocator.getText());



    }



}
