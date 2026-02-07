package Number_based;

public class Program8 {

	public static void main(String[] args) {
		int num = 2375; 
        String result = "";
        boolean foundPrime = false;

        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
 
                result = digit + " " + result;
                foundPrime = true;
            }
            temp /= 10;
        }

        if (foundPrime) {
            System.out.println("Prime Digits: " + result.trim());
        } else {
            System.out.println("Prime Digits: None");
        }

	}

}
