package StringSplit;

public class SplitWithAtTheRate {

	public static void main(String[] args) {
		String str = "aivnash.verma.java@gmail.com";
		String str1 []  =  str.split("@",0);
		for(String str4 : str1) {
			System.out.println(str4);
		}
		System.out.println();
		String str2 []  =  str1[0].split("[.]",0);
		for(String str3 : str2) {
			System.out.println(str3);
		}
	}

}
