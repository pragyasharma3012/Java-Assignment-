import java.io.*;
abstract class Employee{
int eid,bsal;
String ename;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Employee(int x,int y,String z){
eid=x;
bsal=y;
ename=z;
}
abstract double calculateSalary();
void displayEmployee(){
System.out.println("Employee Id:"+eid);
System.out.println("Employee Name:"+ename);
System.out.println("Employee Basic Salary:"+bsal);
}
}
class PermanentEmployee extends Employee{
double HRA,DA,PF,Gsal,Netsal;
PermanentEmployee(int eid,int bsal,String ename,double HRA,double DA,double PF){
super(eid,bsal,ename);
this.HRA=HRA;
this.DA=DA;
this.PF=PF;
}
double calculateSalary(){
DA=bsal*0.04;
PF=bsal*0.12;
HRA=bsal*0.2;
Gsal=bsal+DA+HRA;
Netsal=Gsal-PF;
return Netsal;
}
}
class ContractEmployee extends Employee{
double Gsal;
ContractEmployee(int eid,int bsal,String ename,double Gsal){
super(eid,bsal,ename);
this.Gsal=Gsal;
}
double calculateSalary(){
Gsal=bsal+0.10*bsal;
return Gsal;
}
}
class Main{
public static void main(String[] args)throws IOException{
Employee e;
e = new PermanentEmployee(101,10000,"pragya",1000,200,300);
e.displayEmployee();
System.out.println("Net calculated Salary of Permanent employee"+e.calculateSalary());
e=new ContractEmployee(102,20000,"bhavya",2000);
e.displayEmployee();
System.out.println("Net calculated Salary of Contract Employee"+e.calculateSalary());
}
}






