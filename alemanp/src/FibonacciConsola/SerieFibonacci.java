package FibonacciConsola;

public class SerieFibonacci {

	public static void main(String[] args) {
		
		int valor1 = 0;
        int valor2 = 1;

        int iteraciones = 10;

        System.out.println(valor1);
        System.out.println(valor2);
        int xl = 0;
        
        do{

            
            int valor3 = valor1 + valor2;

            System.out.println(valor3);

            valor1=valor2;
            valor2 = valor3;

            xl++;


        }while(xl <= iteraciones);

	}

}
