package Exception;

public class Resource implements AutoCloseable{ // 자동으로 리소스 close 해주는 인터페이스
private String name;

public Resource (String name) {this.name = name; System.out.println("Resource " + name + " 열기");}

public String read1(String name) {System.out.println("Resource " + name + " 읽기"); return "100";}
public String read2(String name) {System.out.println("Resource " + name + " 읽기"); return "ABC";}

@Override
public void close() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("닫기");
}

}
