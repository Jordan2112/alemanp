package Hilos;

public class Hilot extends Thread{
	
	private String Nombre;
	
	public Hilot(String Nombre) {
		
		this.Nombre = Nombre;
		
	}
	
	
	 
	    public void run ( ) {
	    	
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

	        Hilot h1 = new Hilot("Hilo1");
	        Hilot h2 = new Hilot("Hilo2");
	        Hilot h3 = new Hilot("Hilo3");
	        Hilot h4 = new Hilot("Hilo4");

	        h1.start();
	        h2.start();
	        h3.start();
	        h4.start();

	        System.out.println("Termina Main");
	    }
	    
	    
	    
	

}
