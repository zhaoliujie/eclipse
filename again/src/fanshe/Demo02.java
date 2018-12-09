package fanshe;

import java.lang.reflect.Field;

public class Demo02 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchFieldException {
	Class c1=User.class;
	User user=(User) c1.newInstance();
 Field f=c1.getDeclaredField("age");
 System.out.println(f);
 f.setAccessible(true);//取消访问检查
 f.setInt(user, 20);
 System.out.println(f.getInt(user));
}
}
