import java.io.*;
class Bill{
public static void main(String arr[]) throws IOException
{
double bill=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Consumer Name: ");
String name=br.readLine();
System.out.print("Enter Consumer Number: ");
int conNo=Integer.parseInt(br.readLine());
System.out.print("Enter Unit Consumed: ");
int units=Integer.parseInt(br.readLine());
if(units<=100){
bill=units*3;
}
else {
if(units>=100 && units<=200){
bill=(units-100)*5+(100*3);
}
else {
if(units>=200 && units<=500){
bill=(units-200)*7+(200-100)*5+(100*3);
}
else {
bill=(units-300)*10+(300-200)*7+100*5+100*3;
}
}
}
System.out.println("Consumer Name: "+name);
System.out.println("Consumer Number: "+conNo);
if(bill>5000){
bill=bill+(bill*0.05);
System.out.println("Your Total Bill Amount Including Surcharge is "+bill);
}
else{
System.out.println("Your Total Bill Amount without Surcharge is "+bill);
}
}
}