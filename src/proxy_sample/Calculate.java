package proxy_sample;

public class Calculate implements Calculate_interface{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
