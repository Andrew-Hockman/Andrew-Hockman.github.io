import java.util.Scanner;

class MakeAirCraft{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Do you want your AirCraft to be a jet or propeller based?");
    String units = keyboard.nextLine();
    Propeller myPropeller = new Propeller();
    Jet myJet = new Jet();
    
    if(units.equals("p\ropeller")){
      
      
      System.out.println("Length of the AirCraft?");
      int inputL = keyboard.nextInt();
      myPropeller.setLength(inputL);
      System.out.println("Width of the AirCraft?");
      int inputW = keyboard.nextInt();
      myPropeller.setWidth(inputW);
      System.out.println("Height of the AirCraft?");
      int inputH = keyboard.nextInt();
      myPropeller.setHeight(inputH);
      
      
      System.out.println("Area you want the Propeller to be?");
      int inputP = keyboard.nextInt();
      myPropeller.setpropellerArea(inputP);
      
      
      System.out.println("Your AirCraft length: " + myPropeller.getLength());
      System.out.println("Your AirCraft width: " + myPropeller.getWidth());
      System.out.println("Your AirCraft height: " + myPropeller.getHeight()); 
      System.out.println("Propeller area: " + myPropeller.getpropellerArea());
      System.out.println("Propeller cost: " + myPropeller.getpropellerArea()*100);
      
    }else if(units.equals("jet")){
      
      
    System.out.println("Length of the AirCraft?");
      int inputL = keyboard.nextInt();
      myJet.setLength(inputL);
      System.out.println("Width of the AirCraft?");
      int inputW = keyboard.nextInt();
      myJet.setWidth(inputW);
      System.out.println("Height of the AirCraft?");
      int inputH = keyboard.nextInt();
      myJet.setHeight(inputH);
      
      //set prop count
      System.out.println("Input your Jet's power?");
      int inputJ = keyboard.nextInt();
      myJet.setjetPower(inputJ);
      
      //tell user what they inputed
      System.out.println("Your AirCraft length: " + myJet.getLength());
      System.out.println("Your AirCraft width: " + myJet.getWidth());
      System.out.println("Your AirCraft height: " + myJet.getHeight());
      
      //tell results
      System.out.println("Jet's power: " + myJet.getjetPower());
      System.out.println("Cost of jet: " + myJet.getjetPower()*75);
      
    }else{
      System.out.println("INVALID");
    }  
  } 
}