public class fibonacci{
public static void main(String arg[]){
int a=0;
int b=1;
int c;
System.out.print(a + " ");
while(true){
System.out.print(b + " ");
c=a+b;
a=b;
b=c;
if(b>21){
break;
}


}
}
}