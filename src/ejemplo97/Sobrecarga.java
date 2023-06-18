package ejemplo97;

public class Sobrecarga {
	public void prueba ()
	{
		System.out.println("Metodo sin Argumentos");
	}
	//Sobrecarga de prueba() con1 paramtor tipo int
	public void sobrecarga (int x)
	{
		System.out.print("Metodo 1 con argumento. ");
		System.out.println(" x =" + x);
	}
	//sobrecarga de prueba()  con 2 parametros tipo int
	public void sobrecarga(int x, int y)
	{
		System.out.print(" Metodo 2 con argumentos. ");
		System.out.println(" x = " + x + "; y = "+y);
	}
	//sobrecarga de prueba () con 3 parametros
	public void sobrecarga (double x, double y, double z)
	{
		System.out.print(" Metodo con 3 argumentos. ");
		System.out.println(" x =" + x + "; y =" + y + "; z =" + z);
	}
	
}


