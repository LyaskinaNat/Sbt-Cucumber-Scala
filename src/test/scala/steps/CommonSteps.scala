package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.scalatest.Matchers

class CommonSteps extends ScalaDsl with EN with Matchers
{
  var driver: WebDriver = null
  val driverPath = "/Users/khalidshaheen/Desktop/Automation Testing/chromedriverMac"
  var baseURL = "https://www.amazon.co.uk/"
  val chromeOptions = new ChromeOptions

  Given("""that i am on the amazon website""")
  {
    () =>

      System.setProperty("webdriver.chrome.driver", driverPath)

      //Maximise Window//
      chromeOptions.addArguments("--kiosk")
      driver = new ChromeDriver(chromeOptions)

      //Navigate to Home page//
      driver.get(baseURL)

      //Wait for 1000 ms
      Thread.sleep(1000)

  }

  When("""i enter 'socks' in search""")
  {
    () =>

      //Wait for 2000 ms
      Thread.sleep(2000)

      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("socks")

  }

  And("""^i submit search""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click()

  }

  And("""^i click on the first item listed""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      driver.findElement(By.xpath("//li[contains(@id,'result_0')]")).click()

  }

  Then("""^i can validate that I am on the selected item page""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      val selectedSocks = driver.findElement(By.xpath("//*[@id='productTitle']"))
      Assert.assertEquals(true, selectedSocks.isDisplayed)

      //Wait for 2000 ms
      Thread.sleep(2000)

      driver.quit()

  }







}
