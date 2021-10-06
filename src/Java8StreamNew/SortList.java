package Java8StreamNew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<String> list =
				Arrays.asList("abc_7081", "xyz_0102", "abc_1152", "kll_5682", "abc_0120", "abc_0102");
		Collections.sort(list);
		
		System.out.println(list);
	}
}
