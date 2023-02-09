package Tests;

import org.testng.annotations.Test;

public class TestNGkeywords {

	@Test(priority=1) // 1...................
	public void method1() {
		System.out.println("this test has priority 1 ");
	}
	@Test(priority=2,timeOut=2000) //2........................
	public void method2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("priority=2 & timeout=2000...default by Millisecond");
	}
	@Test(priority=3,invocationCount=2) //3................................
	public void method3() {
		System.out.println("priority=3 & invocation count=2...so this method will run 2 times");
	}
	@Test(priority=4,dependsOnMethods={"method1"}) //4................................
	public void method4() {
		System.out.println("priority=4 & depends on methods/test 1,3...if any one of them get failed it will get skipped");
	}
	@Test(enabled=false) //5...............................
	public void method5() {
		System.out.println(" this test will ........SKIP.......");
	}
	@Test(groups="groups no 1") //6.............................
	public void method6() {
		System.out.println("test/method6 & groups no 1");
	}
	
	@Test(groups="groups no 1")
	public void method7() {
		System.out.println("test/method7 & groups no 1");
	}
	
	@Test(groups="groups no 2")
	public void method8() {
		System.out.println("test/method8 & groups no 2");
	}
	
	@Test(groups="groups no 2")
	public void method9() {
		System.out.println("test/method9 & groups no 2");
	}
	
}
