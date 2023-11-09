package modulo6D.projetoCucumberCorreios.pages;

import modulo6D.projetoCucumberCorreios.elementos.Elementos;
import modulo6D.projetoCucumberCorreios.metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();

	public void buscarCepEndereco(String dado) {
		metodo.escrever(Elementos.buscaCepEndereco, dado);
	}

	public void validarDadosRetornados(String logradouro, String bairro, String localidade, String cep) {
		metodo.mudarAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_UF, localidade);
		metodo.validarTexto(Elementos.cep, cep);
		
		//continuar na página 135 das anotações
	}

}
