package Number_based;

public class Program6 {

	public static void main(String[] args) {
		int num = 789;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit;
            num = num / 10;       
        }

        System.out.println(reversed);

	}

}
