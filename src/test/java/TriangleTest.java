import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest{

  @Test
  public void newTriangle_instantiatesCorrectlty(){
      Triangle testTriangle = new Triangle(3, 3, 3);
      assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isTriangle_whenNotATriangle_false(){
    Triangle testTriangle = new Triangle(100, 50, 1);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void isTriangle_whenATriangle_true(){
    Triangle testTriangle = new Triangle (3,4,5);
    assertEquals(true, testTriangle.isTriangle());
  }

  @Test
  public void triangleType_whenEquilateral_Equilateral(){
    Triangle testTriangle = new Triangle (1, 1, 1);
    assertEquals("equilateral", testTriangle.triangleType());
  }

  @Test
  public void triangleType_whenIsoceles_Isoceles(){
    Triangle testTriangle = new Triangle (5, 5, 3);
    assertEquals("isoceles", testTriangle.triangleType());
  }

  @Test
  public void triangleType_whenScalene_Scalene(){
    Triangle testTriangle = new Triangle (3, 4, 5);
    assertEquals("scalene", testTriangle.triangleType());
  }
}
