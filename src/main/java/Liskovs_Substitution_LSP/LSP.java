package Liskovs_Substitution_LSP;

interface Shape{
    double getArea();
}
class Rectngle implements Shape{
    private int height;
    private int width;

    public Rectngle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea(){
        System.out.println("Area -:" + height*width);
        return height*width;
    }
}

class Squre implements Shape{
    private int side;

    public Squre(int side){
        this.side = side;
    }

    @Override
    public double getArea(){
        System.out.println("Area of square : " + side*side);
        return side * side;
    }


}
public class LSP {
    public static void main(String[] args) {
        Shape rect = new Rectngle(10, 5);
        Shape square = new Squre(5);

        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Square area: " + square.getArea());
    }
}
