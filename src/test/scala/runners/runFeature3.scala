package runners

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("classpath:steps"),
  plugin = Array("pretty",
    "html:target/test",
    "json:target/test.json"),
  tags = Array("@feature3"),
  strict = true
)
class runFeature3
