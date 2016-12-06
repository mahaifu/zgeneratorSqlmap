

public class TestThread {

	int j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t =new TestThread();
		inc in = t.new inc();
		dec de = t.new dec();
		for(int i=0;i<2;i++){
			
			Thread t1 = new Thread(in);
			t1.start();
				   t1=new Thread(de);
			t1.start();
		}
	}

	private synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName()+"-inc "+j);
	}
	private synchronized void dec(){
		j--;
		System.out.println(Thread.currentThread().getName()+"-dec "+j);
	}
	
	class inc implements Runnable{
		public void run() {
			for(int i=0;i<100;i++){
				inc();
			}
		}
	}
	class dec implements Runnable{
		public void run() {
			for(int i=0;i<100;i++){
				dec();
			}
		}
	}
	
}

 
