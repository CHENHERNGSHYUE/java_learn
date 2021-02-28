package proxy_sample;

public class Logger {
	
	public static void before(String methodname, Object args) {
		System.out.println("執行"+methodname+"參數為"+args);
	}
	
	public static void after(String methodname, Object result) {
		System.out.println(methodname+"輸出結果為"+result);
	}
	
	public static void error() {
		System.out.println("Error!!");
	}
}
