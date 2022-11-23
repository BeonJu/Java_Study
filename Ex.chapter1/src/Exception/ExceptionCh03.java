package Exception;

public class ExceptionCh03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"100", "1oo"};
		
		for(int i=0; i<=str.length; i++) {
			try {
				int value = Integer.parseInt(str[i]);
				System.out.println("str["+i+"]: "+value);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
