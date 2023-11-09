package modulo6D.projetoCucumberCorreios.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modulo6D.projetoCucumberCorreios.config.InicializarTeste;
import modulo6D.projetoCucumberCorreios.pages.HomePage;

public class ConsultaCepTeste {

	HomePage home = new HomePage();
	
	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {
		InicializarTeste.encerrarTeste();
	}

	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
    home.buscarCepEndereco("04314-095");
		
	}

	@Then("validar os dados retorno")
	public void validarOsDadosRetorno() {
		home.validarDadosRetornados("Rua Arantes Nogueira", "Vila Guarani (Z Sul)", "São Paulo/SP", "04314-095");

	}

}
