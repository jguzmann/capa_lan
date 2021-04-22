package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import static com.sun.activation.registries.LogSupport.log;

public class PaginaInicioPo extends BasePage {


    public PaginaInicioPo(WebDriver driver) {
        super(driver);
    }

    // ELEMENTOS


    String url = "https://www.latamairlines.com/cl/es";

    @FindBy(id = "txtInputOrigin_field")
    WebElement origen;

    @FindBy(id = "btnItemAutoComplete_0")
    WebElement selectIda;

    @FindBy(id = "txtInputDestination_field")
    WebElement destino;

    @FindBy(css = "#btnItemAutoComplete_0")
    WebElement selectRegreso;

    @FindBy (css = "#departureDate")
    WebElement selectfechaIda;

    @FindBy (xpath = "(//tbody//td//span[@class='sc-fEVUGC cOtign' and contains(text(),'30')])[2]")
    WebElement fHoy;

    @FindBy (xpath = "(//tbody//td//span[@class='sc-fEVUGC cOtign' and contains(text(),'30')])[2]")
    WebElement fVuelta;

    @FindBy (id = "arrivalDate")
    WebElement selectfechaVuelta;

    @FindBy (id = "btnSearchCTA")
    WebElement btnBuscar;

    //@FindBy (xpath = "(//*[@class = 'sc-bOCYYb bpIvuu'])[1]")
    @FindBy (xpath = "//span[contains(text(),'Duración')]")
    WebElement cardVuelo;

    @FindBy (xpath = "//body/div[@id='__next']/div[@id='flight-seleccion-wrapper']/main[@id='main-content']/div[1]/div[1]/div[1]/ol[2]/li[1]/div[1]/ol[1]/li[2]/div[1]/div[1]/div[2]/div[2]")
    WebElement basic;

    @FindBy (id = "button9")
    WebElement btnContinuar;


    //Banner
    @FindBy (css = "#dialog0-0")
    WebElement banner;

    //hoy = Integer.toString(c.get(Calendar.DATE));


    // METODOS
    // Clase > Metodos > Elementos

    public void start() {
        Log("iniciando el test");
        driver.get(url);
        waitFor(3);
    }

    public void ingreseOrigen() {
        origen.click();
        waitFor(1);
        origen.sendKeys("Santiago de Chile");
        selectIda.click();
    }

    public void ingreseDestino() {
        destino.click();
        waitFor(1);
        destino.sendKeys("Temuco");
        selectRegreso.click();
    }

    public void idaFecha(){
        selectfechaIda.click();
        waitFor(2);
        fHoy.click();
    }

    public  void vueltaFecha(){
        selectfechaVuelta.click();
        fVuelta.click();
        btnBuscar.click();
        waitFor(5);
        cardVuelo.click();

        waitFor(5);
       // waitForClick(basic);
        new Actions(driver).moveToElement(basic,1,1).click().perform();


        waitFor(15);
        btnContinuar.click();



        waitFor(5);
    }

}