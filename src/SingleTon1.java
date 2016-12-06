
/*
 * 饥汉模式
 */
public class SingleTon1 {
	private SingleTon1(){}
	private static SingleTon1 instance =null;
	public static synchronized SingleTon1 getInstance(){
		if(instance ==null){
			instance =new SingleTon1();
		}
		return instance;
	}
}
