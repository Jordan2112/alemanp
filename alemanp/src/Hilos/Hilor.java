package Hilos;

public class Hilor implements Runnable{

	private String Nombre;
	
	
	public Hilor(String Nombre) {
		
		this.Nombre = Nombre;
		
	}


	@Override
	public void run() {
		
		 try {
	            for (int x=1; x<=10; x++) {
	            	
	                int espera = (int)(Math.random()*100);
	                
	                System.out.println(Nombre + " " +  x + " " + espera);
	                
	                Thread.sleep(espera);
	                
	                
	            }
	        } catch (Exception exc) {
	        	
	              System.out.println("Excepcion");
	        }
		 
	}
	
	
	 public static void main(String[] args) {

	        Hilor h1 = new Hilor("Hilo1");
	        Hilor h2 = new Hilor("Hilo2");
	        Hilor h3 = new Hilor("Hilo3");
	        Hilor h4 = new Hilor("Hilo4");

	        Thread t1 = new Thread(h1);
	        Thread t2 = new Thread(h2);
	        Thread t3 = new Thread(h3);
	        Thread t4 = new Thread(h4);

	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();

	        System.out.println("Termina Main");
	    }
	
}


