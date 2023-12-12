package staticTableDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Find the total number of rows in the table
		// Approach 1 THIS IS THE PREFERRED APPROACH
		// driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("The total number of rows is: " + rows);

		// Approach 2 by using tagname tr. Use this approach if only you have a single
		// table
		// The presence of other tables can influence the result
		/*
		 * int rows = driver.findElements(By.tagName("tr")).size();
		 * System.out.println("The total number of rows is: "+rows);
		 */

		// To find the total number of columns in the table
		// driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		// int columns = driver.findElements(By.tagName("th")).size();
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("The total number of columns is: " + columns);

		// To read specific row and column data from the table
		// String value =
		// driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[7]/td[2]")).getText();
		// System.out.println(value);

		// Read data from all the rows and columns
		/*
		 * for(int r=2; r<=rows; r++) { for(int c=1; c<=columns; c++) { String value =
		 * driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+
		 * c+"]")).getText(); System.out.print(value+ "\t"); } System.out.println(); }
		 */

		// Print book names whose author is Amit
		/*
		 * for(int r=2; r<=rows; r++) { String author =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).
		 * getText();
		 * 
		 * if(author.equals("Amit")) { String bookName =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).
		 * getText(); System.out.println(author+" "+bookName); } }
		 */

		// Find the sum of prices for all books

		int sum = 0;
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[4]")).getText();
			sum = sum + Integer.parseInt(price);
		}
		System.out.println("Total price of all books " + sum);
	}

}
