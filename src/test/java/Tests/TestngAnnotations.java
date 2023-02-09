package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.OpenBrowser;

@Listeners(ListenTest.class)
public class TestngAnnotations extends OpenBrowser {

	@BeforeSuite
public void method1 () {
	System.out.println("this test is under annotation -BeforeSuite ");
}
	@BeforeTest
public void method2 () {
	System.out.println("this test is under annotation -BeforeTest ");
}
	@BeforeClass
public void method3 () {
	System.out.println("this test is under annotation -BeforeClass ");
}
	@BeforeMethod
public void method4 () {
	System.out.println("this test is under annotation -BeforeMethod ");
}
	@Test
public void method5 () {
	System.out.println("this test is under annotation -Test ");
}
	@AfterSuite
public void method6 () {
	System.out.println("this test is under annotation -AfterSuite ");
}
	@AfterTest
public void method7 () {
	System.out.println("this test is under annotation -AfterTest ");
}
	@AfterClass
public void method8 () {
	System.out.println("this test is under annotation -AfterClass ");
}
	@AfterMethod
public void method9 () {
	System.out.println("this test is under annotation -AfterMthod ");
}
}
