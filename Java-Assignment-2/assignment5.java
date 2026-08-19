import java.io.*;
interface Payment {
    void makePayment(double amount);
    void paymentDetails();
}
class CreditCardPayment implements Payment {
int cardNumber;
String cardHolderName;
double amount;
public CreditCardPayment(String cardHolderName, int cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

public void makePayment(double amount) {
this.amount = amount;
System.out.println("Payment Successful!");
}
 public void paymentDetails() {
 System.out.println("Payment Mode  : Credit Card");
 System.out.println("Card Holder   : " + cardHolderName);
 System.out.println("Card Number   : " + cardNumber);
 System.out.println("Amount        :  " + amount);
}
}
class UPIPayment implements Payment {
 int upiId;
 String userName;
 double amount;  
public UPIPayment(String userName, int upiId) {
        this.userName = userName;
        this.upiId = upiId;
    }

 public void makePayment(double amount) {
 this.amount = amount;
 System.out.println("Payment Successful!");
    }
public void paymentDetails() {
System.out.println("Payment Mode  : UPI");
System.out.println("User Name     : " + userName);
System.out.println("UPI ID        : " + upiId);
System.out.println("Amount        : " + amount);
    }
}
class CashPayment implements Payment {
 String customerName;
 double amount;
 public CashPayment(String customerName) {
        this.customerName = customerName;
    }

public void makePayment(double amount) {
this.amount = amount;
System.out.println("Payment Successful!");
}
public void paymentDetails() {
System.out.println("Payment Mode  : Cash");
System.out.println("Customer Name : " + customerName);
System.out.println("Amount        : " + amount);
}
}
class PaymentSystem {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("1. Credit Card");
System.out.println("2. UPI");
System.out.println("3. Cash");
System.out.print("Enter Choice: ");
int choice =Integer.parseInt(br.readLine());
double amount;
switch (choice) {
case 1:
System.out.print("Enter Card Holder Name: ");
String name = br.readLine();
System.out.print("Enter Card Number: ");
int cardNum =Integer.parseInt(br.readLine());
System.out.print("Enter Amount: ");
amount =Double.parseDouble(br.readLine());
CreditCardPayment cc = new CreditCardPayment(name, cardNum);
cc.makePayment(amount);
cc.paymentDetails();
break;

case 2:
System.out.print("Enter User Name: ");
String userName =br.readLine();
System.out.print("Enter UPI ID: ");
int upid = Integer.parseInt(br.readLine());
System.out.print("Enter Amount: ");
amount =Double.parseDouble(br.readLine()); 
UPIPayment upi = new UPIPayment(userName, upid);
upi.makePayment(amount);
upi.paymentDetails()
break;
               
case 3:
System.out.print("Enter Customer Name: ");
String custName =br.readLine();
System.out.print("Enter Amount: ");
amount = Double.parseDouble(br.readLine());  
CashPayment cash = new CashPayment(custName);
cash.makePayment(amount);
cash.paymentDetails()
break; 
        
default:
System.out.println("Invalid Choice!");
              
}
}
}
