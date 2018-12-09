package xiancheng;
/**
 * 10个线程求1-100的和
 * @author Admin
 *  1-10
 *  11-20
 *  21-30
 *  31-40
 *  41-50
 *  ----
 */
public class Qiuhe extends Thread {
	int begin;//第一个数 
	int end;//最后一个数
	int sum;//和

public Qiuhe(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		
	}
@Override
public void run() {
	sum=(begin+end)*(end-begin+1)/2;
}
public boolean ifOver() {
	
	return false;
}
public void print() {
	
	
}

}
