// Name : Hasnat Jani Rafin
// ID   : 20172507
import java.util.*;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		int LUS1, LUS2;
		String UString1, us2, prefixString = "";
		Scanner ips = new Scanner(System.in);
		System.out.print("***** Enter the first string : ");
		UString1 = ips.nextLine();LUS1 = UString1.length();
		System.out.print("***** Enter the second string: ");
		us2 = ips.nextLine();LUS2 = UString1.length();
		for (int strIndex = 0; strIndex < (LUS1 > LUS2 ? LUS2 : LUS1); strIndex++) {
			if (UString1.charAt(strIndex) == us2.charAt(strIndex)) {
				prefixString += UString1.charAt(strIndex);continue;}
			break;}
		if (prefixString.length() != 0)
			System.out.println(" The common prefix is " + prefixString);
		else
			System.out.printf("%s and %s have no common prefix ", UString1, us2);
			ips.close();
	}
}