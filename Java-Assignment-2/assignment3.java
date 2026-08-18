import java.io.*;
abstract class Shape{
abstract double area();
abstract double perimeter();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
}
class Rectangle extends Shape{
double length;
double breadth;
Rectangle(double x,double y){
length=x;
breadth=y;
}
double area(){
return length*breadth;
}
double perimeter(){
return 2*(length+breadth);
}
}
class Circle extends Shape{
double radius;
Circle(double a){
radius=a;
}
double area(){
return 3.14*radius*radius;
}
double perimeter(){
return 2*3.14*radius;
}
}
class Triangle extends Shape{
double base,height,side1,side2,side3;
Triangle(double base,double height,double side1,double side2,double side3){ 
this.base=base;
 this.height=height;
 this.side1=side1;
 this.side2=side2;
 this.side3=side3;
}
double area(){
return 0.5*base*height;
}
double perimeter(){
return side1+side2+side3;
}
}
class Demo{
public static void main(String[] args)throws IOException{
Shape s[]=new Shape[3];
s[0]=new Rectangle(4,5);
s[1]=new Circle(3);
s[2]=new Triangle(2,3,6,7,8);
for(int i=0;i<s.length;i++){
String shapename=s[i].getClass().getSimpleName();
System.out.println("Shape name"+shapename);
System.out.println("Area"+s[i].area());
System.out.println("Perimeter"+s[i].perimeter());
}
}
}