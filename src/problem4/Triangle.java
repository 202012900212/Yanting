package problem4;

public class Triangle  extends Graph{
    double side;
    public Triangle(String name,double side){
        super(name);
        this.side=side;
    }
    double getPerimeter(){return this.side+3;}
    String show() {
        return  this.name+"。，面积为"+Math.sqrt(this.side*this.side-this.side/2-this.side/2);
    }
}
