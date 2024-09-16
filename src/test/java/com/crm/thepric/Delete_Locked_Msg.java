package com.crm.thepric;


import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thepric.Genric.BaseCLass;
import com.thepric.Genric.RandomNumber;
import com.thepric.POM.pric;



@Listeners(com.crm.Listeners.DeleteLockedMsg.class)
public class Delete_Locked_Msg extends BaseCLass{
	@Test
	public void delete_mesg() throws IOException, InterruptedException
	{
		
     	pric p=new pric(driver);
	
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Vaibhav");
 	    p.preminumContent.sendKeys("2010");
		p.submit.click();
		p.delete_icon.click();
		Thread.sleep(6000);
		p.delete_button.click();
		driver.navigate().refresh();
		p.Home.click();
}
}