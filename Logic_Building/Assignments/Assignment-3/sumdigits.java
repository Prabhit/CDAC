public class sumdigits{
public static void main(String arg[]){
int num = 9876;
int sum =0;
while(num!=0){

int n = num%10;
sum=sum+n;
num = num /10;
}
System.out.println(sum);
}
}