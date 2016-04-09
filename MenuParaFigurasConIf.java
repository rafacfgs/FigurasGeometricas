package formasGeometricas;

import java.util.Scanner;

import formasGeometricas.Punto;

public class MenuParaFigurasConIf {

	public static void main(String[] args) {
		// Hacer un menu para conseguir el area de cuadrado, circulo y rectangulo y si no se introduce el 
		// numero bien, volver a pedirlo.
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		
		
		System.out.println("Elige una opcion: \n1: Punto \n2: Circulo \n3: Triangulo \n4: Salir");
		//Creo menu con \n para que vaya uno debajo del otro, con salto de linea
		int figura=teclado.nextInt();
				
		while (figura>4) {// Repetitiva que pide el numero correcto hasta que es menor que cuatro.
			
			System.out.println("No has ingresado un numero correcto para el menú, introduce uno correcto");
			System.out.println("Elige una opcion: \n1: Punto \n2: Circulo \n3: Triangulo \n4: Salir");
			figura=teclado.nextInt();
		}
		
		if (figura==1){		
			
			System.out.println("Coordenada x primer punto");
			double x = teclado.nextDouble();
			System.out.println("Coordenada y primer punto");
			double y = teclado.nextDouble();
			System.out.println("Coordenada x segundo punto");
			double puntox = teclado.nextDouble();
			System.out.println("Coordenada y segundo punto");
			double puntoy = teclado.nextDouble();
			Punto p1= new Punto(x,y);
			Punto p2= new Punto(puntox,puntoy);
			System.out.println("Distancia del primer al segundo punto: "+p1.calcularDistanciaPunto(p2));
		}
		if (figura==2){
			
			System.out.println("Introduzca la coordenada x para el centro del circulo");
			double a = teclado.nextDouble();
			System.out.println("Introduzca la coordenada y para el centro del circulo");
			double b = teclado.nextDouble();
			System.out.println("Introduzca el radio del circulo");
			double radio = teclado.nextDouble();
			Circulo c =new Circulo(a,b,radio);
			c.calcularArea(c.getRadio());
			c.calcularPerimetro(c.getRadio());
			
			//EL PROBLEMA SURGE CON EL p1 QUE ESTA ENCAPSULADO EN EL PRIMER IF, EN EL MENU CON MAIN
			//LO INTENTO SOLUCIONAR LLAMANDO A LOS COSNTRUCTORES DE x E y Y NO LO CONSIGO
			//System.out.println("Distancia del primer punto al centro del círculo: "+p1.calcularDistanciaPunto(c.getCentro()));
			
		}
		if (figura==3){
		
			System.out.println("Intruduzca las coordenadas de los puntos que delimitaran el triangulo");
			System.out.println("Coordenada x primer punto");
			double p1x = teclado.nextDouble();
			System.out.println("Coordenada y primer punto");
			double p1y = teclado.nextDouble();
			System.out.println("Coordenada x segundo punto");
			double p2x = teclado.nextDouble();
			System.out.println("Coordenada y segundo punto");
			double p2y = teclado.nextDouble();
			System.out.println("Coordenada x tercer punto");
			double p3x = teclado.nextDouble();
			System.out.println("Coordenada y tercer punto");
			double p3y= teclado.nextDouble();
			Triangulo t=new Triangulo(p1x,p1y,p2x,p2y,p3x,p3y);
			t.calcularArea(t.getp1(),t.getp2(),t.getp3());
			t.calcularPerimetro(t.getp1(),t.getp2(),t.getp3());
			t.mostrarPuntos(t.p1,t.p2,t.p3);}
				
				
		if (figura==4){
			
			System.out.println("Adios");}
		
		
		teclado.close();	
	}//cierra main
	
}// cierra class
