package prototypedesignpattern;

public class Rectangle extends Shape {
    public int width,length;
    
    public Rectangle(){}
    
    public Rectangle(Rectangle target){
        super(target);
        if(target!=null){this.width=target.width;   this.length=target.length;}
    }

    @Override
    public Shape clone() {return new Rectangle(this);}  
}








