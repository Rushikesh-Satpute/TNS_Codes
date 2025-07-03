package BloodDonation;
import java.util.*;

public class BloodDonation {
	
	public static String DonatorCheck(int age , int wt) {
		if ((age>=18) && (age<65)) {
			if (wt>45) {
				return "You are eligible to donate blood...!";
			}
		}
		return "You are not eligible to donate blood...!";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your weight: ");
		int wt = sc.nextInt();
		
		System.out.println(DonatorCheck(age , wt));

	}

}
