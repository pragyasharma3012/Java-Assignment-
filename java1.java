import java.io.*;
class Main{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your maths score:");
int math=Integer.parseInt(br.readLine());
System.out.println("Enter your physics core:");
int phy=Integer.parseInt(br.readLine());
System.out.println("Enter your chemistry score:");
int chem=Integer.parseInt(br.readLine());
System.out.println("Enter your biology score:");
int bio=Integer.parseInt(br.readLine());
System.out.println("Enter your english score:");
int eng=Integer.parseInt(br.readLine());
int n=math+phy+chem+bio+eng;
System.out.println("Your Total Marks :"+n);
int avg=n/5;
System.out.println("Your average marks:"+avg);
if(avg>=90){
System.out.println("You secured A grade");
}else if(avg>=75 && avg<=89){
System.out.println("You secured B grade");
}else if(avg>=60 && avg<=74){
System.out.println("You secured C grade");
}else{
System.out.println("You secured D grade");
}
}
}

