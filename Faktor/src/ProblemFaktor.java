import java.util.Scanner;
import java.lang.Math;
public class ProblemFaktor {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in))
				{
		String number;
        number = scan.nextLine();
        String[] split = number.split("\\s+");
		
        int numberarticles = (Integer.valueOf(split[0]));
        int rounding = (Integer.valueOf(split[1]));
        
        int result;
        result = (numberarticles * (rounding -1) + 1); 
        System.out.println(result);
				}
		catch (Exception e) {
			// TODO: handle exception
		}
				
	}

}