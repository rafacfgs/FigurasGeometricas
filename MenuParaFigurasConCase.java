package formasGeometricas;

import java.util.Scanner;

import formasGeometricas.Punto;

public class MenuParaFigurasConCase 
{
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) 
	{	
		// menu eleccion figura geometrica
		System.out.println("Elige una opcion: \n1: Punto \n2: Circulo \n3: Triangulo \n4: Salir");
		
		int figura=teclado.nextInt();
				
		while (figura>4)
		{// Repetitiva que pide el numero correcto hasta que es menor que cuatro.
			
			System.out.println("No has ingresado un numero correcto para el menu, introduce uno correcto");
			System.out.println("Elige una opcion: \n1: Punto \n2: Circulo \n3: Triangulo \n4: Salir");
			figura=teclado.nextInt();
		}
		
		switch (figura)
		{//Usamos switch para la creacion del objeto que haya decidido el usuario
		
		case 1:
			// creacion PUNTOS
			
			System.out.println("Coordenada x primer punto");
			double x = teclado.nextDouble();
			
			System.out.println("Coordenada y primer punto");
			double y = teclado.nextDouble();
			
			// creacion 1º punto
			Punto p1= new Punto(x,y);
			
			// uso las mismas variables x e y para el siguiente punto
			
			System.out.println("\nCoordenada x segundo punto");
			x = teclado.nextDouble();
			
			System.out.println("Coordenada y segundo punto");
			y = teclado.nextDouble();
			
			// creacion 2º punto
			Punto p2= new Punto(x,y);
			
			System.out.println("Distancia del primer al segundo punto: "+p1.calcularDistanciaPunto(p2));
			
			break;
		
		case 2:
			// creacion CIRCULO
			
			System.out.println("Introduzca la coordenada x para el centro del circulo");
			double a = teclado.nextDouble();
			System.out.println("Introduzca la coordenada y para el centro del circulo");
			double b = teclado.nextDouble();
			
			System.out.println("Introduzca el radio del circulo");
			double radio = teclado.nextDouble();
			
			Circulo c = new Circulo(a,b,radio);
			
			// imprime Area y Perimetro 
			c.calcularArea(c.getRadio());
			c.calcularPerimetro(c.getRadio());
		
			// calcular distancia de un punto respecto al centro del circulo
			
			System.out.println("Coordenadas de un punto (x, y):");
			a = teclado.nextDouble();
			b = teclado.nextDouble();
			
			Punto p3 = new Punto(a, b);
			System.out.println("Distancia del primer punto al centro del circulo: "+p3.calcularDistanciaPunto(c.getCentro()));
			
			break;
			
		case 3:
		
			// creacion TRIANGULO
			
			System.out.println("Intruduzca las coordenadas de los puntos que delimitaran el triangulo");
			
			// 1º vertice
			System.out.println("Coordenada x primer punto");
			double p1x = teclado.nextDouble();
			System.out.println("Coordenada y primer punto");
			double p1y = teclado.nextDouble();
			
			// 2º vertice
			System.out.println("Coordenada x segundo punto");
			double p2x = teclado.nextDouble();
			System.out.println("Coordenada y segundo punto");
			double p2y = teclado.nextDouble();
			
			// 3º vertice
			System.out.println("Coordenada x tercer punto");
			double p3x = teclado.nextDouble();
			System.out.println("Coordenada y tercer punto");
			double p3y= teclado.nextDouble();
			
			Triangulo t=new Triangulo(p1x,p1y,p2x,p2y,p3x,p3y);
			
			// muestra por pantalla Area, Perimetro y los Veritices del triangulo
			t.calcularArea(t.getp1(),t.getp2(),t.getp3());
			
			t.calcularPerimetro(t.getp1(),t.getp2(),t.getp3());
			
			t.mostrarPuntos(t.p1,t.p2,t.p3);
				
			break;
				
		case 4:
			// SALIDA del programa
			
			System.out.println("Adios majo/a");		
			
			break;	
				
		}//cierra switch
		
		
		
	}//cierra main
	
}// cierra class
