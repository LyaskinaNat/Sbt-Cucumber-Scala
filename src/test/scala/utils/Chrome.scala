
package utils

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

trait Chrome {


  val driverPath = "/Users/natalialyaskina/Downloads/chromedriver-2"
  val chromeOptions = new ChromeOptions
  System.setProperty("webdriver.chrome.driver", driverPath)
  var driver = new ChromeDriver()
  driver.manage().window().maximize()


}




