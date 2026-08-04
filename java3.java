import java.io.*;
class Demo{
public static void main(String [] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] num=new int[10];
System.out.println("Enter ten numbers:");
for(int i=0;i<10;i++){
System.out.println("Numbers:"+(i+1));
num[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<10;i++){
for(int j=0;j<10;j++){
if(num[i]<num[j]){
int temp=num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
System.out.println("Maximum number:"+num[9]);
System.out.println("Minimum number:"+num[0]);
int sum=0;
for(int i=0;i<10;i++){
sum+=num[i];
}
int avg=sum/10;
System.out.println("Average of ten numbers is:"+avg);
int even=0;
int odd=0;
for(int i=0;i<10;i++){
if(num[i]%2==0){
even++;
}else{
odd++;
}
}
System.out.println("Enter the number you want to search: ");
int target=Integer.parseInt(br.readLine());
int match=0;
for(int i=0;i<10;i++){
if(num[i]==target){
match++;
}
}
if(match>0){
System.out.println("yes the number is present");
}else{
System.out.println(" the number is not present");
}
System.out.println("array in reverse order");
for(int i=9;i>=0;i--){
System.out.println(num[i]);
}
}
}










