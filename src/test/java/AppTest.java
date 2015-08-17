import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }


  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle Test");
  }

  @Test
    public void IsNotATriangle() {
      goTo ("http://localhost:4567/");
      fill ("#sideA").with("2");
      fill("#sideB").with("2");
      fill("#sideC").with("50");
      submit(".btn");
      assertThat(pageSource()).contains("not a triangle");
    }

  @Test
    public void IsEquilateral() {
      goTo ("http://localhost:4567/");
      fill ("#sideA").with("2");
      fill ("#sideB").with("2");
      fill ("#sideC").with("2");
      submit(".btn");
      assertThat(pageSource()).contains("Your triangle is an equilateral");
    }

    @Test
     public void IsIsoceles(){
       goTo ("http://localhost:4567/");
       fill ("#sideA").with("5");
       fill ("#sideB").with("5");
       fill ("#sideC").with("3");
       submit(".btn");
       assertThat(pageSource()).contains("Your triangle is an isoceles");
     }

     @Test
     public void IsScalene() {
       goTo ("http://localhost:4567/");
       fill ("#sideA").with("3");
       fill ("#sideB").with("4");
       fill ("#sideC").with("5");
       submit(".btn");
       assertThat(pageSource()).contains("Your triangle is a scalene");
     }
}
