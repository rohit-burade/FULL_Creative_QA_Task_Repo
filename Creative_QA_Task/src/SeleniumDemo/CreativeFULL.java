package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreativeFULL {

	public static void main(String[] args) throws InterruptedException
	{
		 
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://trello.com/home");
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS); //Applying Implicit Wait - to get all WebElement loaded properly
		 
		 //LOGIN:
		 driver.findElement(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).click();
		 Thread.sleep(2000);
		 
		 //USERNAME:
		 driver.findElement(By.xpath("//input[@id='user']")).sendKeys("rohit.burade101091@gmail.com");
		 Thread.sleep(2000);
		 
		 //PASSWORD:
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tihor@1234");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[@class='css-178ag6o'])[1]")).click();
		 Thread.sleep(2000);
		 
		 //Clicking on Board
		 WebElement Board = driver.findElement(By.xpath("//span[@class='DD3DlImSMT6fgc XQSLFE3ZZrvms3']"));
		 Board.click();
		 	
		 
		 //Creating Board - FULL Creative Task
		 //STEP 1:
		 Thread.sleep(2000);
		 WebElement CreateYourFirstBoard = driver.findElement(By.xpath("//button[contains(text(),'Create your first board')]"));
		 CreateYourFirstBoard.click();
		 Thread.sleep(3000);
		 
		 //STEP 2:
		 WebElement BoardTitleTxtbox = driver.findElement(By.xpath("//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']"));
		 BoardTitleTxtbox.sendKeys("FULL Creative Task");
		 Thread.sleep(2000);
		 
		 //STEP 3:
		 WebElement CreateButton = driver.findElement(By.xpath("//button[@class='ijFumaLuInvBrL bxgKMAm3lq5BpA SdamsUKjxSBwGb SEj5vUdI3VvxDc']"));
		 CreateButton.click();
		 Thread.sleep(3000);
		 
		
		 //Creating List A
		 WebElement TxtBox1 = driver.findElement(By.xpath("//a[@class='open-add-list js-open-add-list']"));
		 TxtBox1.click();
		 Thread.sleep(2000);
		 WebElement TxtBox2 = driver.findElement(By.xpath("//input[@class='list-name-input']"));
		 TxtBox2.sendKeys("List A");
		 Thread.sleep(2000);
		 WebElement AddListButton = driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']"));
		 AddListButton.click();
		 Thread.sleep(2000);
				 
		 //Creating List B
		 driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List B");
		 Thread.sleep(3000);
		 WebElement AddListButton1 = driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']"));
		 AddListButton1.click();
		 Thread.sleep(2000);
			
		 //Adding (Drag and Drop Element) Card with in List A
		 WebElement AddCard = driver.findElement(By.xpath("//span[@class='js-add-a-card']"));
		 AddCard.click();
		 Thread.sleep(2000);
		 WebElement AddCardtxtbox = driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']"));
		 AddCardtxtbox.sendKeys("Drag and Drop Element");
		 Thread.sleep(2000);	 
		 WebElement AddCardButton = driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']"));
		 AddCardButton.click();
		 Thread.sleep(2000);
			 
			 
		 //Creating paths for Drag and Drop 
		 WebElement Draggable = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		 WebElement Droppable = driver.findElement(By.xpath("(//span[@class='js-add-a-card'])[2]"));
		 Actions a1 = new Actions(driver);
		 a1.dragAndDrop(Draggable, Droppable).perform();
			 
		 //Location of (Drag and Drop Element) Dragged Element
		 Point point = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']")).getLocation();
		 System.out.println("X co-ordinate for 'Drag and Drop Element' =>  "+point.x);
		 System.out.println("Y co-ordinate for 'Drag and Drop Element' =>  "+point.y);
		 Thread.sleep(2000);
			 
		 //LogOut Operation (2 Clicks)
		 WebElement RB = driver.findElement(By.xpath("(//div[@class='OUdAuicP657Tka'])[1]"));
		 RB.click();
		 Thread.sleep(2000);
		 WebElement LogOut = driver.findElement(By.xpath("(//span[@class='_OHV1cSBxHNA1V'])[9]"));
		 LogOut.click(); 
	 
	 
	}

}
