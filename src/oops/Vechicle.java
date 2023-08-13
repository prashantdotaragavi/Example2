package oops;

//class Lodding{  
//static int add(int a, int b){return a+b;}  
//static double add(double a, double b){return a+b;}  
//
//  
//public static void main(String[] args){  
//System.out.println(Lodding.add(11,11));  
//System.out.println(Lodding.add(12.3,12.6));  
//}}  


//Creating a parent class.  
class Vechicle{  
  //defining a method  
  void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class Bike2 extends Vechicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
  Bike2 obj = new Bike2();//creating object  
  obj.run();//calling method  
  }  
} 