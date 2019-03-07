package pages

  import org.openqa.selenium.By
  import utils.Chrome


  object Page extends Chrome {


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

  }

}


