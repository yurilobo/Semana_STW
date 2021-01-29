package petz;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ComprarProduto {
//3.1 Atributos
	String url;
	WebDriver driver;//objeto do selenium Web drive
	
	
	//3.2 Metodos ou fun��es
	
	
	@Before//antes do teste
	public void iniciar() {
		url = "https://www.petz.com.br";
		
		System.setProperty("webdriver.chrome.driver","drivers/88/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();//maximizar a janela do brozer
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);//tempo de esera
	}
	@After //Depois do teste
	public void finalizar() {
		driver.quit();
	}
	
	@Test //O teste
	public void abrirPagina() {
		driver.get(url);//abre a pagina do site
		assertEquals("Pet Shop: Petz o maior pet shop do Brasil",driver.getTitle());//validar o text
	}

	
	@Dado("^que acesso o site Petz$")
	public void que_acesso_o_site_Petz() {
	    
	}
	
	@Quando("^busco por \"([^\"]*)\" e pressiono Enter$")
	public void busco_por_e_pressiono_Enter(String arg1){
	   
	}
	
	@Entao("^exibe uma lista de produtos relacionados com \"([^\"]*)\"$")
	public void exibe_uma_lista_de_produtos_relacionados_com(String arg1) throws Throwable {
	    
	}
	
	@Quando("^escolho \"([^\"]*)\"$")
	public void escolho(String arg1){
	    
	}
	
	@Entao("^exibe para o \"([^\"]*)\" o preco de \"([^\"]*)\"$")
	public void exibe_para_o_o_preco_de(String arg1, String arg2) {
	    
	}
	

}
