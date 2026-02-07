package Number_based;

public class Program4 {

	public static void main(String[] args) {
		int num = 123;
        int product = 1;

     
        if (num == 0) {
            product = 0;
        } else {
            num = Math.abs(num);
            while (num > 0) {
                int digit = num % 10;
                product *= digit; 
                num = num / 10;
            }
        }

        System.out.println(product);

	}

}
