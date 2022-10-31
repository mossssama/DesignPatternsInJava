package singletondesignpattern;

public class Singleton {
    
   private static Singleton instance = new Singleton();             //create an object of SingleObject
   
   private Singleton(){}                                              //make the constructor private so that this class cannot be instantiated
   
   public static Singleton getInstance(){return instance;}          //Get the only object available
   
   public void showMessage(){System.out.println("Hello World!");}   
   
}
