public class pattern8 {
    public static void main(String[] args) {
int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>i){
                    break;
                }
                if(j>1){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}