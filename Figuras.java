package formasGeometricas;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		/*Crear una clase llamada Figuras, que en su método main, haga lo siguiente:
		o Cree e inicialice dos objetos de la clase punto y muestre la distancia entre ellos
		o Cree un objeto de la clase Circulo, calcule su área y su perímetro y muestre la
		distancia hasta el primero de los puntos creados anteriormente
		o Cree un objeto de la clase Triangulo, calcule su área y su perímetro*/ 
		
		
	
		
		Scanner teclado = new Scanner(System.in);
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

		double radio = 0;
					
		System.out.println("Introduzca la coordenada x para el centro del circulo");
		double a = teclado.nextDouble();
		System.out.println("Introduzca la coordenada y para el centro del circulo");
		double b = teclado.nextDouble();
		System.out.println("Introduzca el radio del circulo");
		radio = teclado.nextDouble();
		Circulo c =new Circulo(a,b,radio);
		c.calcularArea(c.getRadio());
		c.calcularPerimetro(c.getRadio());
		
		System.out.println("Distancia del primer punto al centro del círculo: "+p1.calcularDistanciaPunto(c.getCentro()));
		
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
		t.mostrarPuntos(t.p1,t.p2,t.p3);
				
		teclado.close();
	}

}
