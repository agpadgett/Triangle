public class Triangle {
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC){
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA(){
    return mSideA;
  }

  public int getSideB(){
    return mSideB;
  }

  public int getSideC(){
    return mSideB;
  }

  public boolean isTriangle(){
    boolean tri = false;
    if ((mSideA * mSideA) + (mSideB * mSideB) < (mSideC * mSideC)){
      tri = false;
    } else if ((mSideA * mSideA) + (mSideC * mSideC) < (mSideB * mSideB)){
      tri = false;
    } else if ((mSideB * mSideB) + (mSideC * mSideC) < (mSideA * mSideA)){
      tri = false;
    } else {tri = true;}

    return tri;
  }

    public String triangleType(){
      String triangleIs = "";
      if (mSideA == mSideB && mSideB == mSideC && mSideA == mSideC){
        triangleIs = "equilateral";
      } else if (mSideA == mSideB || mSideA == mSideC || mSideB == mSideC){
        triangleIs = "isoceles";
      } else {
        triangleIs = "scalene";
      }

      return triangleIs;
    }
}
