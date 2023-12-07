package HomePage;

import BaseTest.Basetest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuits extends Basetest {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        driver.findElement(By.xpath(menu)).click();

//1.2 This method should click on the menu whatever name is passed as parameter.
driver.findElement(By.xpath("//div[@class='header-menu']/ul")).click();
//1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
//select the Menu and click on it and verify the page navigation.
    }
    @Test
    public void verifyPageNavigation(){
driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]")).click();
String actualText= driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]")).getText();
        System.out.println(actualText);
      String expectedResult= "Computers\n" +
              "Electronics\n" +
              "Camera & photo\n" +
              "Cell phones\n" +
              "Others\n" +
              "Apparel\n" +
              "Digital downloads\n" +
              "Books";

    }
}