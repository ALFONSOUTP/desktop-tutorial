package ejemplo97;

public class demoSobrecarga {
	public static void main (String [] ar)
	{
		Sobrecarga objeto = new Sobrecarga();
		//llamada a los metodos sobrecargados
		objeto.prueba();
		objeto.sobrecarga(29);
		objeto.sobrecarga(21, 19);
		objeto.sobrecarga(-2.5, 10.0, 5.1);
	
		
	}
}
