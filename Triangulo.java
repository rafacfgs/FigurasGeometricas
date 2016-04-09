package formasGeometricas;

/*· Crear la clase Triangulo. Se supone que es un triangulo rectángulo para calcular el area
	o Atributos: p1, p2, p3 de tipo Punto
	o Constructores:
	 Triangulo(): inicializa a 0 todos los puntos
	 Triangulo (p1 Punto, p2 Punto, p3 Punto)
	 Triangulo (x1 double, y1 double, x2 double, y2 double, x3 double, y3
	double)
	o Métodos getter y setter
	o Crera los métodos :
	 calcularArea()
	 calcularPerimetro()*/

public class Triangulo {
	
	Punto p1;
	Punto p2;
	Punto p3;
	
	public Triangulo(){// constructor sin argumentos 
	}
 
	public Triangulo(Punto punto1, Punto punto2, Punto punto3){//constructor con argumentos
		punto1=p1;
		punto2=p2;
		punto3=p3;
	}
	 public Triangulo(double x1,double y1,double x2,double y2,double x3,double y3){
		 //constructor con tres puntos por coordenadas
			//Triangulo t=new Triangulo(x1,y1,x2,y2,x3,y3);
			Punto p1=new Punto(x1,y1);
			Punto p2=new Punto(x2,y2);
			Punto p3=new Punto(x3,y3);
			this.p1=p1;
			this.p2=p2;
			this.p3=p3;

		}
	 
	 public Punto getp1()	{
	      // retorna el valor de la variable p1
		 return p1;
	}
	 public void setp1(Punto p1){
	      // asigna el valor del parametro a la variable p1 
		 this.p1 = p1;
	}
	 public Punto getp2()	{
	      // retorna el valor de la variable p2
		 return p2;
	}
	 public void setp2(Punto p2){
	      // asigna el valor del parametro a la variable p2
		 this.p2 = p2;
	}
	 public Punto getp3()	{
	      // retorna el valor de la variable p3
		 return p3;
	}
	 public void setp3(Punto p3){
	      // asigna el valor del parametro a la variable p3
		 this.p3 = p3;
	}

	 public void calcularArea(Punto punto, Punto punto2, Punto punto3){
		 
		 System.out.println("El area del triangulo es: "+((p1.calcularDistanciaPunto(p2))*(p1.calcularDistanciaPunto(p3))/2));
	 }
	 
	 public void calcularPerimetro(Punto punto, Punto punto2, Punto punto3){
		 
		 double perimetro=p1.calcularDistanciaPunto(p2)+p2.calcularDistanciaPunto(p3)+p3.calcularDistanciaPunto(p1);
		 
		 System.out.println("El perimetro del triangulo es "+perimetro);
	 }
	 
	 public void mostrarPuntos(Punto p1, Punto p2, Punto p3){
				
		 System.out.println("Los puntos del triangulo son: P1="+toString(p1)+" P2="+toString(p2)+" P3="+toString(p3));
				 
	 }
	
	  public String toString(Punto p){
          String a= +p.getx()+","+p.gety();
		return a;
   }
	 
}
