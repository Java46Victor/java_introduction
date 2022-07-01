package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while(res > 0) {
			res =(byte) (res * 2);	
		}
		return (byte) (res-1);
	}

	public static byte getMinByte() {
		byte res = 1;
		while(res > 0) {
			res =(byte) (res * 2);	
		}
		return (byte) (res);
	}

	public static int getLengthByte() {
		return getLength(getMaxByte());
	}

	public static char getMaxChar() {
		char res = 1;
		while(res > 0) {
			res =(char) (res * 2);	
		}
		return (char) (res-1);
	}

	public static char getMinChar() {
		char res = 1;
		while(res > 0) {
			res =(char) (res * 2);	
		}
		return (char) (res);
	}

	public static int getLengChar() {
		return getLength(getMaxChar());
	}

	public static short getMaxShort() {
		short res = 1;
		while(res > 0) {
			res = (short)(res * 2);		
		}
		return (short) (res-1);
	}

	public static short getMinShort() {
		short res = 1;
		while(res > 0) {
			res = (short)(res * 2);		
		}
		return (short) (res);
	}

	public static int getLengthShort() {
		return getLength(getMaxShort());
	}

	public static int getMaxInt() {
		
		return (int) getMinInt() -1;
	}

	public static int getMinInt() {
		int res = 1;
		while(res > 0) {
			res = res * 2;		
		}
		return res;
	}

	public static int getLengthInt() {
		return getLength(getMaxInt());
	}

	public static long getMaxLong() {
		long res = 1;
		while(res > 0) {
			res = res * 2;
		}
		return res-1;
	}

	public static long getMinLong() {
		long res = 1;
		while(res > 0) {
			res = res * 2;
		}
		return res;
	}

	public static int getLengthLong() {
		return getLength(getMaxLong());
	}
	
	private static int getLength(long x) {
		long value = 1;
		int count = 1;
		while(value < x && value > 0) {
			value *= 2;
			count++;
		}
		return count / 8;
	}

}
