package proxy_sample;

public class Logger {
	
	public static void before(String methodname, Object args) {
		System.out.println("����"+methodname+"�ѼƬ�"+args);
	}
	
	public static void after(String methodname, Object result) {
		System.out.println(methodname+"��X���G��"+result);
	}
	
	public static void error() {
		System.out.println("Error!!");
	}
}
