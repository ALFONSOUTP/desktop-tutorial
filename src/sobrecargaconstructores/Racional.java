package sobrecargaconstructores;

public class Racional {
	private int numerador, denominador;
	public Racional()
	{
		numerador =0;
		denominador=1;
	}
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public Racional (Racional r)
	{
		numerador=r.numerador;
		denominador=r.denominador;
	}
	public Racional sumar(Racional r2)
	{
		Racional sumar = new Racional (numerador+ r2.numerador, denominador + r2.denominador);
	return sumar;	
	}
	//metodos para operar con numeros racionales
	public void mostrar ()
	{
		System.out.println(numerador + "/" + denominador);
	}
}
