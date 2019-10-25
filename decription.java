import javax.swing.Timer;
class Decription{
	public static void main (String[] args) {
		for (int i = 0; true ; i++) {
			long time = System.nanoTime();
		if(i < 100){
			long x = System.currentTimeMillis();
			System.out.println (i);
			System.out.println((System.nanoTime() - time) + "ns per million");
		}else if(i < 1000){
			System.out.println (i);
			System.out.println((System.nanoTime() - time) + "ns per million");
		
		}else if(i < 10000){
			System.out.println (i);
			System.out.println((System.nanoTime() - time) + "ns per million");
		
		}else if(i < 100000){
			System.out.println (i);
			System.out.println((System.nanoTime() - time) + "ns per million");
		
		}else if(i < 1000000){
			System.out.println (i);
			System.out.println((System.nanoTime() - time) + "ns per million");
		
		}else if(i < 10000000){
			System.out.println (i);
			System.out.println((System.nanoTime() - time) + "ns per million");
		
		}
		
		
    }
    
    }
	
}
//cdscvdsvdfvdfvdf