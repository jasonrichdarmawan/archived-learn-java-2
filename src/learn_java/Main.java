package learn_java;

public class Main {
	public static void main(String[] args) {
		// Java data types
		// Primitive data types: byte, short, int, long, float, double, boolean, and char
		// Non-primitive data types: string, arrays, classes.

		// Primitive data specifies the size and type of variable values.
		// System.out.println(Integer.BYTES) will output 4 (in bytes). Note, 1 byte = 8 bit.
		// Hence, the total value of integer is 2^32 - 1, Integer.MAX_VALUe is 2^31 - 1, Integer.MIN_VALUE is -2^31

		// byte
		System.out.println("Byte.BYTES: " + Byte.BYTES);
		System.out.println("Byte in bit: " + Byte.SIZE);

		// integer
		int i = 10;
		System.out.println("integer value i: " + i);
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("Integer.BYTES: " + Integer.BYTES);
		System.out.println("Integer in bit: " + Integer.SIZE);

		// Java Operators

		System.out.println("");

		int int1 = 5;
		int int2 = 3;

		int result;

		// addition
		result = int1 + int2;
		System.out.println("addition 5 + 3: " + result);
		// addition using printf
		System.out.printf("addition with printf %d + %d = %d \n",int1,int2,result);

		// substraction
		result = int1 - int2;
		System.out.println("substraction 5 - 3: " + result);

		// multiplication
		result = int1 * int2;
		System.out.println("multiplication 5 * 3: " + result);

		// integer division
		result = int1 / int2;
		System.out.println("integer division 5 / 3: " + result);
		// float division
		float float1 = 5;
		float float2 = 3;
		float result2;
		result2 = float1 / float2;
		System.out.println("float division 5 / 3: " + result2);

		// modulo
		result = int1 % int2;
		System.out.println("modulo 5 % 3: " + result);

		// Java Type Conversion

		// Int (4 bytes) -> Long (8 bytes): no problem
		int int3 = 256; // 32 bit
		long long1 = int3; // 64 bit
		System.out.println("Java type conversion int (32 bit) -> long (64 bit): " + long1);

		// Int (4 bytes) -> Byte (1 byte): problem occured, solution: use data type casting
		// byte byte1 = int3;
		byte byte2 = (byte) int3;
		System.out.println("int (4 bytes) -> byte (1 byte) with the data type casting. Expected output: 256, actual output: " + byte2);
		System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);

		// problem: calculation using different data types
		int int4 = 10;
		int int5 = 4;
		
		float result3 = int4 / int5;
		System.out.println("int division with float result 10 / 4: " + result3);

		// solution: use the result3 data type in one of the variable.
		int int6 = 10;
		float float3 = 4;
		result3 = int6 / float3;
		System.out.println("division with different data types 10 / 4: " + result3);

		// solution: use data type casting
		int int7 = 10;
		int int8 = 4;
		float result4 = (float) int7 / int8;
		System.out.println("int division with float result: 10 / 4" + result4);

		// Java Unary Operator

		int int9 = 10;
		System.out.printf("unary '-' %d to: %d \n", int9, -int9);

		// Unary increment and decrement
		int int10 = 10;
		int10++; // int10--
		System.out.println("unary increment int10++ from 10 to: " + int10);

		// Unary prefix and postfix
		int int11 = 10;
		System.out.printf("unary prefix ++int11. Expected output: 11, actual output: %d \n", ++int11);

		int int12 = 10;
		System.out.printf("unary postfix int11++. Expected output: 11, actual output: %d \n", int12++);
		System.out.println("variable int12 was printed before the calculation. This is the updated variable int12: " + int12);

		// unary boolean negation
		boolean boolean1 = true;
		System.out.println("unary without negation boolean1: " + boolean1);
		System.out.println("unary with negation !boolean1: " + !boolean1);

	}
}