public class pattern5{
public static void main(String arg[]){
int n=5;
        for(int i= 1; i<=n; i++) {
            for(int j=1; j<=(2*n)-1;j++) {
                if(j>=n+i){
                    break;
                }
                if(j<=n-i) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
            
        }
}
}