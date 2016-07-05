import java.util.Scanner;

public class FtoC{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Insert degrees in Fahrenheit: ");
		String line = sc.nextLine(); 

        double f = Double.valueOf(line);
        double c = 5 * (f-32)/9;
        System.out.println(c);
    }
}
