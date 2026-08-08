import java.io.*;
class Employee{
int empid,bsal=0;
double DA,PF,HRA,Gsal,Nsal;
String name;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void read()throws IOException {
System.out.print("Enter Your Emlpoyee Id :");
empid=Integer.parseInt(br.readLine());
System.out.print("Enter Your Name :");
name=br.readLine();
System.out.print("Enter your base salary :" );
bsal=Integer.parseInt(br.readLine());
DA=bsal*0.04;
PF=bsal*0.12;
HRA=bsal*0.2;
Gsal=bsal+DA+HRA;
Nsal=Gsal-PF;
}
void show(){
System.out.println(empid+"\t"+name+"\t"+bsal+"\t"+DA+"\t"+PF+"\t"+HRA+"\t"+Gsal+"\t"+Nsal);
}
}
class Main{
public static void main(String arr[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Nmber of records? :");
int n=Integer.parseInt(br.readLine());
Employee e[]=new Employee[n];
for(int i=0;i<n;i++){
e[i]=new Employee();
e[i].read();
}
System.out.println("Id\tName\tBsalary\tDA\tPF\tHRA\tGs\tNs" );
for(int i=0;i<n;i++){
e[i].show();
}
double maxS=e[1].bsal,avg=0;
double minS=e[1].bsal;
int maxI=1,minI=1;
for(int i=0;i<n;i++){
if(e[i].bsal>maxS){
maxS=e[i].bsal;
maxI=i;
}
avg=avg+e[i].bsal;
if(e[i].bsal<minS){
minS=e[i].bsal;
minI=i;
}
}
avg=avg/n;
System.out.println("Max Salary :"+e[maxI].empid+" "+e[maxI].name+" "+e[maxI].bsal);
System.out.println("Min Salary :"+e[minI].empid+" "+e[minI].name+" "+e[minI].bsal);
System.out.println("Avg Salary :"+avg);
}
}




