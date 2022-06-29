package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//data types
		//primitive data types
		//Integer family:byte,short,long,int
		//floating family:double,float
		//character:char
		//boolean:boolean-true,false
		
		//1.byte:
		//size:8 bits = 1 byte
		//range : -128 to 127
		byte b = 10;
		b = 20;
		byte b1 = 0;
		byte b2 = -10;
		
		//2.short:
		//size:16 bits = 2 bytes
		//range : -32768 to 32767
		short s = 10;
		
		//3.int:
		//size: 4 bytes = 32 bits
		//range : -2^31 to 2^32-1
		int i = 1000;
		int i1 = 10;
		int i2 = -10;
		int i3 = 0;
		
		//4.long :
		//size: 8 bytes = 64 bits
		//range: -2^63 to 2^63-1
		long l = 100000;
		long l1 = 1111111111;
		long l2 = 10;
		
		//float :
		//size : 4 bytes = 32 bits
		//after point it can take upto 7 digits
		float f = 12.8f;
		float f1 = (float)10;
		
		//double :
		//size 8 bytes = 64 bits
		// range  after point it can take upto 15 digits
		double d = 100.998989;
		double d1 = -12.243343;
		double d2 = 1000;
		
		//char  : only single digit value
		//size: 16 bits = 2 bytes
		char c = 'a';
		char c1 = '$';
		char c2 = '1';
		
		//boolean :
		//size :~1 bits
		boolean flag = true;
		boolean flag1 = false;
		System.out.println(flag);
		
		byte t = 065;//octal number
		System.out.println(t);
		//065 = (0*8^2) + (6*8^1) + (5*8^0) = 53
		
		//maximum octal number is 077
	}

}
