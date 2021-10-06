package StringSplit;

public class SplitWithDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aivnash.verma.java@gmail.com";
		String str1 []  =  str.split("[.]",0);
		for(String str2 : str1) {
			System.out.println(str2);
		}

	}

}
