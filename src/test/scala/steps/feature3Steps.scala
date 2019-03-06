package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.scalatest.Matchers
import pages.Page


class feature3Steps extends ScalaDsl with EN with Matchers
{


  val expectedUrl: String = "https://www.udemy.com"
  var actualUrl: String = ""
  /*val driverPath = "/Users/natalialyaskina/Downloads/chromedriver-2"
  val chromeOptions = new ChromeOptions
  System.setProperty("webdriver.chrome.driver", driverPath)
  val driver = new ChromeDriver()
  driver.manage().window().maximize()
  def getTitle() = {
    driver.getTitle
  }

  def navigateToPage(url: String) = {
    driver.navigate().to(url)
  }

  def findElement_sendKeys(xPath: String, key: String): Unit = {
    driver.findElement(By.xpath(xPath)).sendKeys(key)
  }

  def findElement_Click(xPath: String): Unit = {
    driver.findElement(By.xpath(xPath)).click()
  }

  def findElement_getText(xPath: String): String = {
    driver.findElement(By.xpath(xPath)).getText()
  }

  def getUrl(): String = {
    driver.getCurrentUrl()
  }

  def driverQuit():Unit = {
    driver.close()
    driver.quit()
  }*/


  Given("""that i am on the google home page""")
  {
    () =>

      Page.navigateToPage("https://www.google.com/")

      //Wait for 1000 ms
      Thread.sleep(1000)

  }

  When("""i enter 'Opencast Software' in search""")
  {
    () =>

      //Wait for 2000 ms
      Thread.sleep(1000)

      Page.findElement_sendKeys("//input[@title='Search']", "Opencast software")



  }

  And("""^i submit my search""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      Page.findElement_Click("//div[@class='VlcLAe']//input[@value='Google Search']")

  }

  And("""^i click on the first option listed""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)
      Page.findElement_Click("//a[@href='https://opencastsoftware.com/']//h3[@class='LC20lb'][contains(text(),'Opencast Software')]")

  }

  Then("""^i can validate that I am on the Opencast Software website""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      actualUrl = Page.getUrl()
      Assert.assertTrue(actualUrl.contains(("https://opencastsoftware.com")))

      if (actualUrl.contains("https://www.udemy.com")) {
        println("Test pass")
      }
      else {
        println("Test failed")
      }

      Thread.sleep(1000)

      Page.driverQuit()

  }







}
