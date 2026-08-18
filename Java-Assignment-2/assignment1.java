import java.io.*;
class Student{
int rollno,marks1,marks2,marks3;
String name;
int totalmarks,avg;
double percentage;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void read() throws IOException{
System.out.println("Enter your name:");
name=br.readLine();
System.out.println("Enter your marks1:");
marks1=Integer.parseInt(br.readLine());
System.out.println("Enter your marks2:");
marks2=Integer.parseInt(br.readLine());
System.out.println("Enter your marks3:");
marks3=Integer.parseInt(br.readLine());
totalmarks=marks1+marks2+marks3;
percentage=(marks1+marks2+marks3)*0.3;
avg=(marks1+marks2+marks3)/3;
}
void show(){
System.out.println("Name"+name);
System.out.println("Marks1"+marks1);
System.out.println("Marks2"+marks2);
System.out.println("Marks3"+marks3);
System.out.println("Total Marks:"+totalmarks);
System.out.println("Percentage:"+percentage);
System.out.println("Average Marks:"+avg);
if(avg>=90){
System.out.println("You secured A+ grade");
}else if(avg>=80 && avg<=89){
System.out.println("You secured A grade");
}else if(avg>=70 && avg<=79){
System.out.println("You secured B grade");
}else if(avg>=60 && avg<=69){
System.out.println("You secured C grade");
}else if(avg>=50 && avg<=59){
System.out.println("You secured D grade");
}else{
System.out.println("You secured F grade");
}
}
}
class Main{
public static void main(String[] args)throws IOException{
Student s1=new Student();
s1.read();
s1.show();
Student s2=new Student();
s2.read();
s2.show();
}
}











