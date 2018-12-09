package xiancheng;

public class Strack {
private char[] data=new char[5];
private int index;

//进栈
public  void push(char ch) {
data[index] =ch;
index++;//元素+1
System.out.println(ch + "进栈");
//数组遍历
for (int i = 0; i < index; i++) {
	System.out.println(data[i]);
}
}
// 出栈
public void pop() {
System.out.println(data[index-1] + "出栈");//从栈里面出去要-1
data[index-1]='\0';//空出来的位置用\0代替
index--;//元素-1
for (int i = 0; i < index; i++) {
	System.out.println(data[i]);
}
}
}

