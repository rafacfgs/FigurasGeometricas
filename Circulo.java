package formasGeometricas;

/*· Crear una clase Circulo que tenga:
	o Dos atributos private: centro de tipo Punto y radio de tipo double
	o Un constructor por defecto que inicialice todo a 0
	o Un constructor que pase un Punto y un double (radio)
	o Un constructor con tres parámetros double: un valor x, un valor y, y el radio. En
	este caso x,y indican el centro
	o Crear los setter y los setter
	o Crear los métodos:
	 calcularArea()
	 calcularPerimetro()
	 calcularDistanciaDesde(Punto param_punto )*/

public class Circulo {

	private double radio;
	private Punto centro;
	
	 public Circulo(){// constructor sin argumentos 
		}
	 
	 public Circulo(Punto c, double r){//constructor con argumentos
			centro= c;
			radio = r;
		}
	 
	 public Circulo(double x, double y, double radio){//constructor con dos puntos y radio
			Punto p=new Punto(x,y);
			centro=p;
			this.radio=radio;
		}
	 
	 public double getRadio()	{
	      // retorna el valor de la variable x
		 return radio;
	}
	 
	 public Punto getCentro()	{
	      // retorna el valor de la variable x
		 return centro;
	}
	 public void setRadio(double radio){
	      // asigna el valor del parametro a la variable x 
	 this.radio = radio;
	}
	 public void setCentro(Punto centro){
	      // asigna el valor del parametro a la variable x 
	 this.centro = centro;
	}
	 
	 public void calcularArea(double d){
		 
		System.out.println("El area del circulo es: "+Math.PI*radio*radio);
		
	 }
	 
	 public void calcularPerimetro(double d){
		 
		 System.out.println("El perimetro del circulo es: "+2*Math.PI*radio);
				 
	 }
	
}
