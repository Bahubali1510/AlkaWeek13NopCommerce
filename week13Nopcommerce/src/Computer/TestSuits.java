package Computer;

import BaseTest.Basetest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuits extends Basetest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void TestName() throws InterruptedException {
        //1.1 Click on Computer Menu.
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[1]/a")).click();
        //1.2 Click on Desktop
        driver.findElement(By.xpath("//html[@lang='en']/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();

        //1.3 Select Sort By position "Name: Z to A"
        Thread.sleep(1000);
       // driver.findElement(By.id("id=products-orderby")).click();
        driver.findElement(By.xpath("//div[@class='master-column-wrapper']/div[3]/div/div[2]/div[1]/div[2]/select[1]/option[3]")).click();
        //1.4 Verify the Product will arrange in Descending order.
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {


//    2.1 Click on Computer Menu.
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[1]/a")).click();
//            2.2 Click on Desktop
driver.findElement(By.xpath("//html[@lang='en']/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
//2.3 Select Sort By position "Name: A to Z"
        driver.findElement(By.xpath("//div[@class='master-column-wrapper']/div[3]/div/div[2]/div[1]/div[2]/select[1]/option[2]")).click();

//            2.4 Click on "Add To Cart"
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
        //driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
//            2.5 Verify the Text "Build your own computer"
Thread.sleep(1000);
String actualTest = driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1")).getText();
        System.out.println(actualTest);


//            2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/dl/dd[1]")).click();
//2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='product_attribute_2']/option[4]")).click();

//            2.8 Select HDD radio "400 GB [+$100.00]"
          Thread.sleep(1000);
          driver.findElement(By.xpath("//dd[@id='product_attribute_input_3']/ul/li[2]/label")).click();

////            2.9 Select OS radio "Vista Premium [+$60.00]"
       Thread.sleep(1000);
       driver.findElement(By.xpath("//dd[@id='product_attribute_input_4']/ul/li[1]/label")).click();
////    A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
       Thread.sleep(1000);
       driver.findElement(By.xpath("//dd[@id='product_attribute_input_5']/ul/li[1]/label")).click();

////            2.11 Verify the price "$1,475.00"
     // Thread.sleep(1000);

//           2.12 Click on "ADD TO CARD" Button.
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();
////2.13 Verify the Message "The product has been added to your shopping cart" on Top
       Thread.sleep(1000);
       String actualText = driver.findElement(By.xpath("//div[@id='bar-notification']/div/p")).getText();
        System.out.println(actualText);
        String expectedText= "The product has been added to your shopping cart";
        Assert.assertEquals(actualText, expectedText);


////    After that close the bar clicking on the cross button.
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='bar-notification']/div/span")).click();
////            2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
      Thread.sleep(1000);
      driver.findElement(By.xpath("//li[@id='topcartlink']/a/span[1]")).click();
////2.15 Verify the message "Shopping cart"
       Thread.sleep(1000);
       String actualText1 = driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[1]/h1")).getText();
        System.out.println(actualText1);
////            2.16 Change the Qty to "2" and Click on "Update shopping cart"
       Thread.sleep(1000);
       driver.findElement(By.xpath("//form[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[5]")).click();
     //  driver.findElement(By.xpath("//form[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[5]")).sendKeys("2");

////            2.17 Verify the Total"$2,950.00"
        Thread.sleep(1000);
        String actualText2= driver.findElement(By.xpath("//form[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[6]")).getText();
        System.out.println(actualText2);
////            2.18 click on checkbox “I agree with the terms of service”
       Thread.sleep(1000);
       driver.findElement(By.xpath("//form[@id='shopping-cart-form']//div[3]/div[2]/div[3]/label")).click();
//           2.19 Click on “CHECKOUT”
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@id='checkout']")).click();
//           2.20 Verify the Text “Welcome, Please Sign In!”
       Thread.sleep(1000);
       String actualText4 = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[1]/h1")).getText();
        System.out.println(actualText4);
        String expectedText4 = "Welcome, Please Sign In!";
        Assert.assertEquals(actualText4, expectedText4);

//           2.21Click on “CHECKOUT AS GUEST” Tab
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();

//2.22 Fill the all mandatory field
       Thread.sleep(1000);
       driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Alka");
driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Jadeja");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("India");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Vadodara");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("abc");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("pqr");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("123");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
////2.23 Click on “CONTINUE”
    Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='billing-buttons-container']/button[4]")).click();
////            2.24 Click on Radio Button “Next Day Air($0.00)”
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@id='shipping-methods-form']/ul/li[2]/div[1]")).click();
////            2.25 Click on “CONTINUE”
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/button")).click();

//           2.26 Select Radio Button “Credit Card”
      Thread.sleep(1000);
     driver.findElement(By.id("paymentmethod_1")).click();
     driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/button")).click();

//            2.27 Select “Master card” From Select credit card dropdown
       Thread.sleep(1000);
       driver.findElement(By.xpath("//select[@id='CreditCardType']/option[2]")).click();
//2.28 Fill all the details
        Thread.sleep(1000);
driver.findElement(By.id("CardholderName")).sendKeys("Alka");
driver.findElement(By.id("CardNumber")).sendKeys("5555 1234 1234");
driver.findElement(By.xpath("//select[@id='ExpireMonth']/option[3]")).click();
driver.findElement(By.xpath("//select[@id='ExpireYear']/option[2]")).click();
driver.findElement(By.id("CardCode")).sendKeys("123");

////2.29 Click on “CONTINUE”
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/button")).click();
////            2.30 Verify “Payment Method” is “Credit Card”
//      Thread.sleep(1000);
//      String actualText5 = driver.findElement(By.xpath("//div[@id='checkout-confirm-order-load']/div/div/div/div/div[1]/div[2]/ul/li")).getText();
//        System.out.println(actualText5);

////            2.32 Verify “Shipping Method” is “Next Day Air”
//
////            2.33 Verify Total is “$2,950.00”
//
////            2.34 Click on “CONFIRM”
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/button")).click();
////            2.35 Verify the Text “Thank You”
       Thread.sleep(1000);
       String actualText6= driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[1]/h1")).getText();
        System.out.println(actualText6);
        String expectedText6 = "Thank you";
        Assert.assertEquals(actualText6, expectedText6);
////            2.36 Verify the message “Your order has been successfully processed!”
       Thread.sleep(1000);
        String actualText7= driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div/div[1]/strong")).getText();
        System.out.println(actualText7);
        String expectedText7 = "Your order has been successfully processed!";
        Assert.assertEquals(actualText7, expectedText7);
////            2.37 Click on “CONTINUE”
        Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div/div[3]/button")).click();

////            2.37 Verify the text “Welcome to our store”
      Thread.sleep(1000);
        String actualText8= driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div/div[2]/div[1]/h2")).getText();
        System.out.println(actualText6);
        String expectedText8 = "Welcome to our store";
        Assert.assertEquals(actualText8, expectedText8);
    }
}