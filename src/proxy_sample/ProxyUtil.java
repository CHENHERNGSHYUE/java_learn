package proxy_sample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
	
	private Calculate cal;
	
	public ProxyUtil(Calculate cal) {
		super();
		this.cal = cal;
	}
	
	public Object getProxy() {
		ClassLoader loader = this.getClass().getClassLoader(); //get the proxy class's loader
		
		Class[] interfaces = cal.getClass().getInterfaces(); //取得要代理對象的所有接口方法
		
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				Logger.before(method.getName(), Arrays.toString(args));
				Object result = method.invoke(cal, args); //動態代理對象實現功能
				Logger.after(method.getName(), result);
				return result;
			}
		};
		return Proxy.newProxyInstance(loader, interfaces, handler);
	}

}
