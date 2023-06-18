package sobrecargaconstructores;

public class DemoRacional {
	public static void main (String [] a)
	{
		Racional r1,r2,r3;
		r1=new Racional(); //crea un numero racional 0/1
		r2=new Racional(1,5); //crea un numero racional 1/5
		r1=new Racional(r2); //crea un numero racional igual que r2
		r3=r2.sumar(r1);
		System.out.print("r1 = "); r1.mostrar();
		System.out.print("r2 = "); r2.mostrar();
		System.out.print("r1+r2 = "); r3.mostrar();
	}
}
