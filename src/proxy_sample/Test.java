package proxy_sample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyUtil proxy = new ProxyUtil(new Calculate());
		Calculate_interface proxy_new = (Calculate_interface)proxy.getProxy();
		int x = proxy_new.div(4, 0);
		System.out.print(x);
	}

}
