package com.crm.thepric;



import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thepric.Genric.BaseCLass;
import com.thepric.Genric.RandomNumber;
import com.thepric.POM.pric;


@Listeners(com.crm.Listeners.EdgeCase_ErrorHandling.class)
public class Edge_Case_Error_Handling extends BaseCLass{

	@Test
	public void edit_mesg() throws InterruptedException, IOException
	{
		 
     	 pric p = new pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Vaibhav");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"This is verify");
		
		p.Home.click();
		
}
}