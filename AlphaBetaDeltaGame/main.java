public class Main
{
	public static void main(String[] args) {
		divide_game(30);
	}
	
	public static void divide_game(int n) {
	    for (int i=1; i<= n; i++) {
	        String str = new String("");
	        if (i % 2 == 0) {
	            str = str.concat("Alpha");
	        }
	        if (i % 3 == 0) {
	            str = str.concat("Beta");
	        }
	        if (i % 5 == 0) {
	            str = str.concat("Gamma");
	        }
	        
	        if (str.length() != 0) {
	            System.out.println(str);
	        }
	        else {
	            System.out.println(i);
	        }
	    }
	   
	}
}
