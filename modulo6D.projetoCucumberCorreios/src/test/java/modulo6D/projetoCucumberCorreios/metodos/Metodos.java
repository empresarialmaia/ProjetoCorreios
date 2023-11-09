package modulo6D.projetoCucumberCorreios.metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import modulo6D.projetoCucumberCorreios.drivers.DriverConexao;

public class Metodos extends DriverConexao {

	public void escrever(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("********* Causa do erro ********" + e.getCause());
			System.out.println("******* Mensagem do erro ******" + e.getMessage());
		}

	}

	public void clicar(By locator) {
	try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			System.out.println("********* Causa do erro ********" + e.getCause());
			System.out.println("******* Mensagem do erro ******" + e.getMessage());
	}
	}
	public void submit(By locator) {
try {
		 driver.findElement(locator).submit();	
		} catch (Exception e) {
			System.out.println("********* Causa do erro ********" + e.getCause());
			System.out.println("******* Mensagem do erro ******" + e.getMessage());
	}
	}
	public void validarTexto(By locator, String textoEsperado) {
		try {
		String textoCapturado = driver.findElement(locator).getText();
		assertEquals(textoEsperado, textoCapturado);
	} catch (Exception e) {
		System.out.println("********* Causa do erro ********" + e.getCause());
		System.out.println("******* Mensagem do erro ******" + e.getMessage());
}
	}
	
	public void mudarAba() {
		try {
			String janelaPrincipal = driver.getWindowHandle();
			Set<String> todasAsJanelas = driver.getWindowHandles();
			for(String janela : todasAsJanelas) {
				if(!janela.equals(janelaPrincipal)) {
					driver.switchTo().window(janela);
				}
				
			}
					
		} catch (Exception e) {
			System.out.println("********* Causa do erro ********" + e.getCause());
			System.out.println("******* Mensagem do erro ******" + e.getMessage());
	
		}
}
	}


