import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrator

 *
 */
public class CheckVoteEligibility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age..");
		int age=s.nextInt();
		if(age>=18)
		{System.out.print("You can vote");}
		else
		{System.out.println("You cannot vote");}
		s.close();
 
	}

}
