public class largestdigit{
public static void main(String arg[]){
int n = 4825;
int b =0;
while(n!=0){
int a = n%10;

if(a>b){
b=a;
}
n=n/10;
}
System.out.println(b);
}
}