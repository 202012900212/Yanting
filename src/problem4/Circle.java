package problem4;

public class Circle extends Graph{
    double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius=radius;

    }
    double getPerimeter(){
        return 3.14*2*this.radius;
    }
    String show(){
        return this.name+",面积为"+3.14*this.radius*this.radius;
    }
}

