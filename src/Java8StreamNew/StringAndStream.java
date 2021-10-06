package Java8StreamNew;

public class StringAndStream {

	public static void main(String[] args) {
		{
	        String str = "kjafjlfjjjj";
	        
	        char ch = 'j';
	 
	        str = str.chars()        // IntStream
	                .sorted()
	                .collect(StringBuilder::new,
	                        StringBuilder::appendCodePoint,
	                        StringBuilder::append)
	                .toString();
	 
	        System.out.println(str);
	        
	        long count = str.chars().filter(e->e==ch).count();
	        System.out.println(count);
	    }
		
	}

}
