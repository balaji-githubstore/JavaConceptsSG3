package com.sg.oops;

//set of rules
//interface WebDriverDemo {
//	
//}

interface TakescreenshotDemo
{
	void getScreenshot();
}

class ChromeDriverDemo implements WebDriverDemo,TakescreenshotDemo {
	public ChromeDriverDemo() {
		System.out.println("chrome launch");
	}

	public void get(String url) {
		System.out.println("chrome navigate url");
	}

	public void quit() {
		System.out.println("chrome close browser");
	}

	

	public void chromeOnly() {

	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}

class FirefoxDriverDemo implements WebDriverDemo,TakescreenshotDemo {
	public FirefoxDriverDemo() {
		System.out.println("firefox launch");
	}

	public void get(String url) {
		System.out.println("firefox navigate url");

	}

	public void quit() {
		System.out.println("firefox close browser");
	}

	public String getTitle() {
		return "";
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

}

public class BrowserTest {

	public static void main(String[] args) {

		String browser="ff";
		
		WebDriverDemo driver;
		
		if(browser.equals("ch"))
		{
			 driver = new ChromeDriverDemo();
		}
		else
		{
			driver=new FirefoxDriverDemo();
		}
		
		driver.get("url");
		driver.getTitle();
//		driver.quit();
		
		driver.quit();
		
		TakescreenshotDemo ts= (TakescreenshotDemo) driver;
		
		ts.getScreenshot();
		
	

		
		
	}

}



