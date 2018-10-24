import java.util.Scanner;
import java.lang.Math;
public class App {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in))
				{
		String number;
        number = scan.nextLine();
        String[] split = number.split("\\s+");
		
        int h = (Integer.valueOf(split[0]));
        int v = (Integer.valueOf(split[1]));
        
        double result;
        result = h / Math.sin(Math.toRadians(v));
        System.out.println((int)Math.ceil(result));
				}
		catch (Exception e) {
			// TODO: handle exception
		}
				
	}

}
