package utils

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

trait Driver {


    Thread.sleep(1000)
    val driverPath = "/Users/natalialyaskina/Downloads/chromedriver-2"
    val chromeOptions = new ChromeOptions
    System.setProperty("webdriver.chrome.driver", driverPath)
    val driver = new ChromeDriver()
    driver.manage().window().maximize()


}


