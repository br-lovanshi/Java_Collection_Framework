package Day3Practise;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("start  ");
		
		try {
			String n = "a";
			String m = "299";
			String s  = null;
			
			int num1 = Integer.parseInt(m);
			int num2 = Integer.parseInt(n);
			String hello ;
			
			int ans = num2/num1;
			System.out.println(s.length());
			
			if(ans>5) {
				System.out.println(hello = "hello");
			}else {
				System.out.println("hii");
			}
			System.out.println("just chill bro!");
		}catch(ArithmeticException ae ) {
//			ae.getMessage();
			System.out.println(ae.getMessage());
//			ae.getStackTrace();
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage() + " nfe");
		}
		catch(NullPointerException np) {
			System.out.println(np.getMessage() + " npe");
		}
		catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println(ab.getMessage());
		}
		catch(TypeNotPresentException tp ) {
			System.out.println(tp.getMessage() + "tp");
		}
		catch(Exception ex ) {
			System.out.println(ex.getMessage());
		}
		System.out.println("end");
	}
}
