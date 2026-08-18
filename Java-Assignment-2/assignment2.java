import java.io.*;
class BankAccount{
int accno,bal,deposit,withdraw;
String accname;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BankAccount(){
System.out.println("BankAccount class constructor called");
accno=0;
bal=0;
accname="null";
deposit=0;
withdraw=0;
}
BankAccount(int x,int y,String z){
System.out.println("Person class with argument type constructor");
accno=x;
bal=y;
accname=z;
deposit=0;
withdraw=0;
}
void read() throws IOException{
System.out.println("Enter your account number:");
accno=Integer.parseInt(br.readLine());
System.out.println("Enter your accountholder name:");
accname=br.readLine();
System.out.println("Enter your balance:");
bal=Integer.parseInt(br.readLine());
}
void deposit() throws IOException{
System.out.println("Enter the amount you want to deposit:");
deposit=Integer.parseInt(br.readLine());
bal+=deposit;
System.out.println("Updated Balance:"+bal);

}
void withdraw() throws IOException{
System.out.println("Enter the amount you want to withdraw:");
withdraw=Integer.parseInt(br.readLine());
if(withdraw<=bal) {
bal-=withdraw;
System.out.println("Updated Balance:"+bal);
}else {
System.out.println("Withdrawal is not possible");
}
}
void displayAccount(){
System.out.println("Account Number:"+accno);
System.out.println("Balance:"+bal);
System.out.println("Account Name:"+accname);
}
}
class Main{
public static void main(String arg[]) throws IOException{
BankAccount b1=new BankAccount();
b1.displayAccount();
b1.read();
b1.deposit();
b1.withdraw();
BankAccount b2=new BankAccount(101,1000,"Pragya");
b2.displayAccount();
b2.deposit();
b2.withdraw();
}
}









