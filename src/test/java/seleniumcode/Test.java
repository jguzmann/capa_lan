package seleniumcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Test extends testBase {
    @Given("^Como cliente ingreso a la url \"([^\"]*)\"$")
    public void como_cliente_ingreso_a_la_url(String arg1) throws Exception {
        paginaInicioPo.start();
    }

    @Given("^escojo la ruta de inicio$")
    public void escojo_la_ruta_de_inicio() throws Exception {
        paginaInicioPo.ingreseOrigen();
    }

    @Given("^escojo la ruta de retorno$")
    public void escojo_la_ruta_de_retorno() throws Exception {
        paginaInicioPo.ingreseDestino();
        paginaInicioPo.idaFecha();
        paginaInicioPo.vueltaFecha();
    }

    @Given("^escojo el asiento$")
    public void escojo_el_asiento() throws Exception {


    }

    @Then("^y obtengo la ruta mas barata$")
    public void y_obtengo_la_ruta_mas_barata() throws Exception {

    }

}
