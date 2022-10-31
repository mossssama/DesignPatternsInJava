package prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPattern {

    public static void main(String[] args) {

        Circle circle=new Circle();             circle.x=10;        circle.y=20;            circle.color="red";
        Rectangle rectangle=new Rectangle();    rectangle.width=10; rectangle.length=20;    rectangle.color="blue";
        
        List<Shape>shapesList=new ArrayList();
        shapesList.add(circle);
        shapesList.add(rectangle);
        
        Circle circleCopy=(Circle) circle.clone();
        Rectangle rectangleCopy=(Rectangle) rectangle.clone();
        //or
        Shape circleCopy2=circle.clone();
        Shape rectangleCopy2=rectangle.clone();
                
    }
}
