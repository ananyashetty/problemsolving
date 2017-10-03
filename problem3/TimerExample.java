package problem3;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TimerExample {
	
	public static <T> T getProxy(T t, Class<?> clazz) {
		InterceptMethod<T> intercept = new InterceptMethod<T>(t);
		return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, intercept);
	}
	
	public static void main(String[] args) {
		//time taken by ArrayList for contains method in a list of 25000
		List<String> ls = new ArrayList<>();
		for(int i=0; i < 25000; i++) {
			ls.add("Shourien" + i);
		}
		List<String> list = getProxy(ls, List.class);
		System.out.println(list.contains("Shourien24000"));
	}
}
