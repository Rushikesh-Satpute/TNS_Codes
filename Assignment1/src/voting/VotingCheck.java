package voting;
import java.util.*;

public class VotingCheck {
	
	public static String VoterCheck(int age){
		if (age >= 18) {
			return "You are eligible for voting...!";
		}
		return "You are not eligible for voting...!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		System.out.println(VoterCheck(age));
	}

}
