package Exception;

public class TrywithReadResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try() 괄호 안에 열고 싶은 리소스 객체 생성
		try(Resource res = new Resource("A")) {
			String data = res.read1("ㅎ");
			String data1 = res.read1("z");
			int value = Integer.parseInt(data);
			int value1 = Integer.parseInt(data1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
