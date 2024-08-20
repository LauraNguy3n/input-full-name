package inputFullName;
	import java.util.Scanner;

		public class InputFullName {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("enter your first name ");
		String a = sc.nextLine();
		System.out.println("enter your middle name ");
		String b = sc.nextLine();
		System.out.println("enter your last name ");
		String c = sc.nextLine();
		

		System.out.println("Your full name is " + a + " " + b + " " + c + "! :D");
	}

}
