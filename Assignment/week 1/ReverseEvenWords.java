package seleniumSample1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
				System.out.print(split[i]);
			}
			if (i % 2 != 0) {
				System.out.print(" ");
				char[] evenWords = (split[i]).toCharArray();
				for (int j = evenWords.length - 1; j >= 0; j--) {
					System.out.print(evenWords[j]);
				}
			}
		}
	}

}
