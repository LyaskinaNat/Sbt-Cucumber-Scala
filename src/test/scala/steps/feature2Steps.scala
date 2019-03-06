package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.scalatest.Matchers
import pages.Page

class feature2Steps extends ScalaDsl with EN with Matchers
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


  Given("""that i am on the google search""")
  {
    () =>

      Page.navigateToPage("https://www.google.com/")

      //Wait for 1000 ms
      Thread.sleep(1000)

  }

  When("""i enter 'Udemy' in search""")
  {
    () =>

      //Wait for 2000 ms
      Thread.sleep(1000)

      Page.findElement_sendKeys("//input[@title='Search']", "Udemy")



  }

  And("""^i submit google search""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      Page.findElement_Click("//div[@class='VlcLAe']//input[@value='Google Search']")

  }

  And("""^i click on the first link listed""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)
      Page.findElement_Click("//h3[contains(text(),'Udemy: Online Courses - Learn Anything, On Your Sc')]")

  }

  Then("""^i can validate that I am on the Udemy website""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      actualUrl = Page.getUrl()
      Assert.assertTrue(actualUrl.contains(("https://www.udemy.com")))

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
