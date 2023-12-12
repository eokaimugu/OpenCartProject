package practice;

public class Interview {

	public static void main(String[] args) {

//			WebDriver driver = new ChromeDriver();		
//			Actions act = new Actions(driver);
//			WebElement source = driver.findElement(By.id(""));
//			WebElement target = driver.findElement(By.id(""));	
//			act.dragAndDrop(source, target).build().perform();

		String p = "abcbaz";
		String r = "";

		for (int i = p.length() - 1; i >= 0; i--) {

			r = r + p.charAt(i);
		}
		if (r.equals(p)) {
			System.out.println("Palindrome is proven " + r);

		} else {
			System.out.println("This is weired, abcbaz is not a Palindrome");
		}

		String e = "Eric";

		for (int i = e.length() - 1; i >= 0; i--) {

			r = r + e.charAt(i);

		}

		System.out.println(r);
	}
}
