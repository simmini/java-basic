package oop1.ex;

public class Ractangle {
    int width;
    int height;

 /*   int area;

    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = calculateArea();
    }
*/
    int calculateArea(){
        return this.width*this.height;
    }
     int calculatePerimeter(){
        return 2*(this.width+this.height);
    }
     boolean isSquare(){
        return this.width==this.height;
    }
}
