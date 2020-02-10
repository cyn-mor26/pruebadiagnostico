package Prueba_diagnostico;

public class Alternativa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int cantidad = 834034;
			int dígitos = 0;
			do { cantidad /=10; dígitos++; 
			}	
			while ( cantidad > 0 );
			System.out.println(dígitos);
			
	

}
}
