package Number_based;

public class Program1 {

	public static void main(String[] args) {
int num = 1234; // Sample Input
        
        if (num == 0) {
            System.out.print(0);
        }

        while (num > 0) {
            int digit = num % 10;      
            System.out.print(digit + " "); 
            num = num / 10;       
        }

	}

}
