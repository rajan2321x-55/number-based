package Number_based;

public class Program3 {

	public static void main(String[] args) {
		int num = 234; 
        int sum = 0;


        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            sum += digit;      
            num = num / 10;     
        }

        System.out.println(sum);

	}

}
