public class Objekt {

  public static void main(String[] args) {
    Bil volvo240 = new Bil();
    volvo240.setReg("ABC 123");
    
    Bil volvo940 = new Bil();
    volvo940.setReg("CBA 321");
    System.out.println("240: '" + volvo240.getReg() + "' 940: '" + volvo940.getReg() + "'");
    
  }
  
}

class Bil {
  
   	String regnr;
    String fabrikat;
    int årsmodell;
    double vikt;
    int effekt;   
  
  public String getReg() {
  	return regnr;
  	}
  public void setReg(String newReg) {
  		regnr = newReg;
 	 } 
}
