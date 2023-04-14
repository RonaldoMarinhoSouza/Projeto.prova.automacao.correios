package steps;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.MetodosDeTestes;
import runner.Executa;

public class BuscarCep {
	
	Elementos elemento = new Elementos();
	MetodosDeTestes metodo = new MetodosDeTestes();
	
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador(true);
		
	}
	
	@Test
	public void buscarCep() {
		
		metodo.clicar(elemento.btnAceito);
		metodo.escrever(elemento.campoBuscarCep, "02275130");
		metodo.clicar(elemento.lupaBuscarCep);
	}
	
	@Test
	public void buscarCepInvalido() {
		
		metodo.clicar(elemento.btnAceito);
		metodo.escrever(elemento.campoBuscarCep, "02200130");
		metodo.clicar(elemento.lupaBuscarCep);
	}
}
