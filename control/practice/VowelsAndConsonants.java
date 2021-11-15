import java.util.Random;

public class VowelsAndConsonents {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0; i<100; i++) {
			int c = random.nextInt(26) + 'a';
			System.out.printf("%c is a ", (char)c);
			switch(c) {
				case 'a':
				case 'i':
				case 'o':
				case 'e':
				case 'u':
					System.out.println("vowel.");
					break;
				case 'w':
				case 'y':
					System.out.println("sometimes vowel.");
					break;
				default:
					System.out.println("Consonent.");
			}
		}
		
	}
}
