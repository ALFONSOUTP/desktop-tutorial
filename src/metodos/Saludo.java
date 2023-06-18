package metodos;


	class Saludo
	{
		//otras partes de la clase
		void saludoBienvenida()
		{
			System.out.println("¡Hola");
			System.out.println("Metodo llamado saludoBienvenida");
			System.out.println("que contiene tres sentencias");
		}
		public static void main (String [] args)
		{
			Saludo unObjeto = new Saludo();
			unObjeto.saludoBienvenida();
		}
	}

		
	

