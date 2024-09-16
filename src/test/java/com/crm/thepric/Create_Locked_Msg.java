package com.crm.thepric;

import org.testng.annotations.Test;
import com.thepric.Genric.BaseCLass;
import com.thepric.POM.pric;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

public class Create_Locked_Msg extends BaseCLass{
	
	@Test
	public void create_mesg() throws IOException, InterruptedException
	{
		pric p=new pric(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		p.amount.sendKeys("1020");
		p.visible_Mesg.sendKeys("Vaibhav");
		p.preminumContent.sendKeys("1020");
		p.submit.click();
		p.Home.click();

		
	}

}