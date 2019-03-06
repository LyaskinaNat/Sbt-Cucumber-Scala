package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.scalatest.Matchers
import pages.Page

class feature1Steps extends ScalaDsl with EN with Matchers
{
var selectedSocks: String = ""
var link: String = ""
  /*val expectedUrl: String = "https://www.udemy.com"
  var actualUrl: String = ""
  val driverPath = "/Users/natalialyaskina/Downloads/chromedriver-2"
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


  Given("""that i am on the amazon website""")
  {
    () =>

      Page.navigateToPage("https://www.amazon.co.uk/")

      //Wait for 1000 ms
      Thread.sleep(1000)

  }

  When("""i enter 'socks' in search""")
  {
    () =>

      //Wait for 2000 ms
      Thread.sleep(1000)

      Page.findElement_sendKeys("//*[@id='twotabsearchtextbox']", "socks")



  }

  And("""^i submit search""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      Page.findElement_Click("//*[@id='nav-search']/form/div[2]/div/input")

  }

  And("""^i click on the first item listed""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)
      link = Page.findElement_getText("//li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/h2[1]")
      Page.findElement_Click("//li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/h2[1]")

  }

  Then("""^i can validate that I am on the selected item page""")
  {
    () =>

      //Wait for 1000 ms
      Thread.sleep(1000)

      selectedSocks = Page.findElement_getText("//span[@id='productTitle']")
      Assert.assertEquals(link, selectedSocks)

      if (link == selectedSocks) {
        println("Test pass")
      }
      else {
        println("Test failed")
  }

     Thread.sleep(1000)

      Page.driverQuit()

  }







}
