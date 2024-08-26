class primenumbers{
public static void main(String arg[]){
System.out.print("2 3 5 7 ");
int n=3;
int count=0;
while(true){
if(count==5){
break;
}
if(n%2==0 || n%3==0 || n%5==0  || n%7==0){

}
else{
System.out.print(n+" ");
count++;
}
n++;

}
}
}