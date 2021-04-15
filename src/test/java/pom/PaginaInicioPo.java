package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy (id = "departureDate")
    WebElement dateIdaRegreso;


    // METODOS
    // Clase > Metodos > Elementos

    public void start() {
        Log("iniciando el test");
        driver.get(url);
        waitFor(3);
    }


    public void ingreseOrigen() {
        waitFor(3);
        origen.click();
        waitFor(3);
        origen.sendKeys("Santiago de Chile");
        selectIda.click();
    }

    public void ingreseDestino() {
        waitFor(3);
        destino.click();
        waitFor(3);
        destino.sendKeys("Temuco");
        waitFor(2);
        selectRegreso.click();
        waitFor(5);
    }

    public void fechaIdaRegeso(){
        waitFor(3);
        dateIdaRegreso.click();
        waitFor(5);
        
    }


}