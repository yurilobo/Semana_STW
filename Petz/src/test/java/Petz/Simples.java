//1.nome do pacote
package petz;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.Bibliotecas importadas

//3.Classe
public class Simples {
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
}















































