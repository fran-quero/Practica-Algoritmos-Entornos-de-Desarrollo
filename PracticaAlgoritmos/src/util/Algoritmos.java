package util;

public abstract class Algoritmos {
	
	/**
	 * Devuelve el numero de fibonacci
	 * @param numero	el numero del indice que queremos obtener de la secuencia fibonacci
	 * @return			el numero fibonacci del indice pasado
	 */
	
	public static int fibonacci(int num) {
		int num1=0, num2=1, aux, numFinal=0;
		
		if(num==0) {
			numFinal=num1;
		}
		else if(num==1) {
			numFinal=num2;
		}
		else{
			for(int i=2;i<=num;i++) {
				aux=num2;
				num2+=num1;
				num1=aux;
				
				numFinal=num2;
			}	
			
		}
                
                return numFinal;
    }

}