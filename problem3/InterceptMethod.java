package problem3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InterceptMethod<T> implements InvocationHandler {

	private T t;
	
	public InterceptMethod(T t) {
		this.t = t;
	}
	
	@Override
	public Object invoke(Object type, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		Object obj = method.invoke(t, args);
		System.out.println("Time taken " + ((System.currentTimeMillis() - startTime)) + "ms");
		return obj;
	}

}
