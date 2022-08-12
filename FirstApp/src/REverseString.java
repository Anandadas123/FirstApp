import java.util.*;

public class REverseString {
	public static void main(String[] args) {
		
		String ch = "dsbkfnvldfxnvkrn";
		char str[] = ch.toCharArray();
		for (int i = 0, j = str.length - 1; i < j; i++, j--) {

			char c = str[i];
			str[i] = str[j];
			str[j] = c;
		}
		System.out.println(rec(ch));
	}

	public static String rec(String s) {
		if (s.isEmpty() ||s.length() == 0) {
		  return null;
		}
		
		return  rec(s.substring(1))+s.charAt(0);
	}
}
//9933025901 - 