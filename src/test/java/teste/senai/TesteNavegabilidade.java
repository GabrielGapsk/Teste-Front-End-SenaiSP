package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNavegabilidade {
	private WebDriver driver;    //driver do google Chrome
	
	//pré-teste
	@Before
	public void PreTeste () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gabri\\chromedriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();  /// maximiza a tela
		driver.get("https://informatica.sp.senai.br/");   /// vai até a pagina
	}
	
	//teste
	@Test
 	public void Teste () {
 		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
 		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
 	
	//pós-teste
	@After
	public void PosTeste () {
		
	}
}
