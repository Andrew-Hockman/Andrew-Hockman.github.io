public class Jet extends AirCraft{
  private int jetPower = 3;
 
  public void setjetPower(int J) {
    jetPower = J;
  }
  public int  getjetPower(){
    return jetPower;
  }
  
  public int calcJCost(){
  return (getjetPower()*75);
  } 
}