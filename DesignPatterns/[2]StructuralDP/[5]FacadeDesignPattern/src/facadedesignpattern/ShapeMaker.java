package facadedesignpattern;

public class ShapeMaker {
   private Shape circle,rectangle,square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){    circle.draw();      }
   public void drawRectangle(){ rectangle.draw();   }
   public void drawSquare(){    square.draw();      }
}
