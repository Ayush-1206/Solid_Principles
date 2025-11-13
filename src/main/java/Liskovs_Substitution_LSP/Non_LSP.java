package Liskovs_Substitution_LSP;


class Rectangle{
    protected int height;
    protected int width;

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public double getArea(){
        System.out.println("Area -:" + height*width);
        return height*width;
    }
}

class Square extends Rectangle{

    @Override
    public void setHeight(int height){
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width){
        this.height = width;
        this.width = width;
    }
}
class non_LSP {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.setHeight(10);
        R.setWidth(5);
        R.getArea(); //50

        Rectangle S = new Square();
        S.setHeight(10);
        S.setWidth(5);
        S.getArea(); //25
    }
}


// Rectangle R = new Rectangle();
// Rectangle S = new Square();

//LSP child class is substitutable with the base class
//But we are getting wrong ans for area
//Problem If we use a Square where a Rectangle is expected:
