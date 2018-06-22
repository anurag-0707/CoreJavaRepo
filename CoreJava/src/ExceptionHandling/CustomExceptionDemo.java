package ExceptionHandling;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int x=0;
		try {
			x = 10 / 0;
		} catch (ArithmeticException ae) {
			// throw new CustomException("Division By zero not allowed");
			System.out.println("Divisor is 0, please Change");
			
		}
		finally{
		System.out.println(x);
	}
	}
}
