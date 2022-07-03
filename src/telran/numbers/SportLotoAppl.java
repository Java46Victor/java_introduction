package telran.numbers;

public class SportLotoAppl {

	public static void main(String[] args) {
		int[] res = new int[7];
		
		for(int i = 0; i < res.length; i++) {
			int number = getUniqueNumber(res, 1, 49);
			System.out.println(number);
			res[i] = number;
		}
	}
	
	private static int getUniqueNumber(int[] res, int i, int j) {
		int number = 0;
		do {
			number = getRandomNumber(i, j);
		}while(ArrayInt.indexOf(res, number) >= 0);
		return number;
	}

	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}
