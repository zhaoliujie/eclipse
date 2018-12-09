package fanshe;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo01 {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, SecurityException, NoSuchMethodException,
			IllegalArgumentException, InvocationTargetException {
		Class c2 = User.class;
		User user = (fanshe.User) c2.newInstance();
		Method method = c2.getMethod("setAge", int.class);
		method.invoke(user, 20);
		Method metho2 = c2.getMethod("getAge");
		int age = (Integer) metho2.invoke(user);// 后是object类型，需强转为Integer类型
		System.out.println(age);
	}

}
