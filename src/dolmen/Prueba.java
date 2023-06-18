import dolmen.*;

public class Prueba {
	public static void main (String ar[])
	{
		Segunda st =new Segunda(); //cre un onjeto
		Primera pt = new Primera(); //crea objeto
		st.balsas(); //llamada correcta por tener acceso publico
		pt.homero(); //llamada correcta por  tener acceso publico
		pt.salustio(); //error, el acceso es el paquete domen
		
	}
}
