package Mypackg;

public class Conversion {

	public static void main(String[] args) {
		public static List<Integer> extractNumbers(String input) {
		    String[] words = input.split(" ");
		    List<Integer> numbers = new ArrayList<Integer>();
		    for (String word : words) {
		        try {
		            int number = Integer.parseInt(word);
		            if (number > 0) {
		                numbers.add(number);
		            }
		        } catch (NumberFormatException e) {
		            // ignore non-integer words
		        }
		    }
		    return numbers;
		}

	}

}
