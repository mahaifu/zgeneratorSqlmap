import java.util.Collection;

public class T{
	
//	public static String translate (String str) { 
//		   String tempStr = ""; 
//		   try { 
////		     tempStr = new String(str.getBytes("ISO-8859-1"), "GBK"); 
//		     tempStr = new String(str.getBytes("UTF-8"), "gbk"); 
//		     tempStr = tempStr.trim(); 
//		   } 
//		   catch (Exception e) { 
//		     System.err.println(e.getMessage()); 
//		   } 
//		   return tempStr; 
//		 } 
	 
	int j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t =new T();
		Inc in = t.new Inc();
		Dec d = t.new Dec();
		for(int i=0;i<2;i++){
			Thread tr = new Thread(in);
			tr.start();
				   tr = new Thread(d);
				   tr.start();
		}
		
//		System.out.println(translate("哈啊"));
	}

	private synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName()+"-inc"+j);
	}
	private synchronized void dec(){
		j--;
		System.out.println(Thread.currentThread().getName()+"-dec"+j);
	}
	class Inc implements Runnable{
		@Override
		public void run() {
			for(int i=0;i<100;i++){
				inc();	
			}
		}
	}
	
	class Dec implements Runnable{
		@Override
		public void run() {
			for(int i=0;i<100;i++){
				dec();	
			}
		}
	}
}
