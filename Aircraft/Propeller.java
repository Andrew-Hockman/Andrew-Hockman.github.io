public class Propeller extends AirCraft{
  private int PropellerArea = 45;

  public void setpropellerArea(int P) {
    PropellerArea = P;
  }
   public int  getpropellerArea(){
    return PropellerArea;
  }
   
   public int calcPCost(){
  return (getpropellerArea()*100);
  }  
}