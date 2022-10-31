package singletondesignpattern;

public class SingletonDesignPattern {

    public static void main(String[] args) {
      //illegal construct;  Compile Time Error: The constructor SingleObject() is not visible;  SingleObject object = new SingleObject();

      Singleton object = Singleton.getInstance();     //Get the only object available

      object.showMessage();                                  //show the message
    }
    
}
