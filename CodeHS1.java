 class Shape
{
   public String getShapeName()
   {
       return "Shape";
   }
}

 class Rectangle extends Shape
{
   public String getShapeName()
   {
       return "Rectangle";
   }
}

 class Square extends Rectangle {}

public class Oval extends Shape
{
    public String getShapeName() 
    {
        return "Oval";
    }
}

 class Circle extends Oval
{
    public String getShapeName()
    {
        return "Circle";
    }
}
class main()
{
    public static void main(String[] args){
    Shape shape1 = new Shape();
    Shape shape2 = new Rectangle();
    Shape shape3 = new Square();
    Shape shape4 = new Circle();

    System.out.println(shape1.getShapeName());
    System.out.println(shape2.getShapeName());
    System.out.println(shape3.getShapeName());
    System.out.println(shape4.getShapeName());
    }   
}