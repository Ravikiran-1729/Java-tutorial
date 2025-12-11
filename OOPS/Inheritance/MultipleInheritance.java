interface LandInfo {
  default void landInfo(){
    System.out.println("This is a land info");
  }
}

interface WaterInfo{
  default void waterInfo(){
    System.out.println("This is a water info");
  }
}

class AmbitiousInfo implements LandInfo, WaterInfo{
  AmbitiousInfo(){
    System.out.println("This is a ambitious info");
  }
}



public class MultipleInheritance {

  public static void main(String[] args) {
    AmbitiousInfo a = new AmbitiousInfo();
    a.landInfo();
    a.waterInfo();
  }
}