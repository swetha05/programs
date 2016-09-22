package programming;

public class RS {
	
	public static void main(String args[]) {

		String sentence = "are you hello";
		String[] words = sentence.split(" ");
		String revstring = "";
		try {
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				String reword = "";
				for (int j = word.length()-1; j >= 0; --j) {
					reword = reword + word.charAt(j);
				}
				revstring+=reword+" ";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(revstring);
	}
}
