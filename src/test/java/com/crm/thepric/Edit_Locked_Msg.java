package com.crm.thepric;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thepric.Genric.BaseCLass;
import com.thepric.Genric.RandomNumber;
import com.thepric.POM.pric;


@Listeners(com.crm.Listeners.Edit_Existing_locked_Mesg.class)
public class Edit_Locked_Msg extends BaseCLass{
	@Test
	public void edit_mesg() throws IOException, InterruptedException
	{
		//preCondition();
		//login();
     	pric p=new pric(driver);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Vaibhav");
 	    p.preminumContent.sendKeys("210");
		p.submit.click();
       p.edit.click();
       p.visible_Mesg.clear();
       p.visible_Mesg.sendKeys("sdfg");
       p.submit.click();
       p.Home.click();
}
}
