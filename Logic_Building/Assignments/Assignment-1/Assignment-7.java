

public class Largest {

    public static void main(String[] args) {
        
      int n1 = 6;
	int n2 = 5;
	int n3 = 8;
	int largest;

        if (n1 >= n2 && n1 >= n3) {
            largest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largest = n2;
        } else {
            largest = n3;
        }

      
        System.out.println("The largest number is: " + largest);

		
        
        
        
    }
}
