package xiancheng;

public class TestQiuhe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Qiuhe []qiuhe=new Qiuhe[10];
		for(int i=0; i<10;i++){
			(qiuhe[i]= new Qiuhe(i*10+1,i*10+10)).start();		
		}
		for(int  i=0;i<10;i++) {
			
			while(!qiuhe[i].ifOver()) {
			}
			qiuhe[i].print();
		}

	}

}
