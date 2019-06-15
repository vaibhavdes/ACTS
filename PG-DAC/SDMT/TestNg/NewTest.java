package com.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private Add add;	
	private File input,output;
	private Scanner sc1,sc2;

  @Test
  public void f()  {
		Assert.assertEquals(add.Addition(sc1.nextInt(),sc1.nextInt(),sc1.nextInt()),sc2.nextInt());
  }
  
  @Test
  public void p()  {
		Assert.assertEquals(add.Addition(5,9,7),23);
  }
  
  @BeforeTest
  public void beforeTest() {
	  add = new Add();
	  input = new File("C:\\Users\\dac\\Videos\\inputs.txt"); 
	  output = new File("C:\\Users\\dac\\Videos\\outputs.txt"); 
	  try {
		sc1 = new Scanner(input);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  try {
		sc2 = new Scanner(output);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
