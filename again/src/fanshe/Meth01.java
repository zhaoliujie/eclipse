package fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Meth01 {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class c1=User.class;
		User user=(User) c1.newInstance();
Method me=c1.getMethod("setName", String.class);
me.invoke(user, "sun");
Method me2=c1.getMethod("getName");
 String name=(String) me2.invoke(user);
 System.out.println(name);
	}

}
