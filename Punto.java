package formasGeometricas;

/* Crear una clase Punto que tenga:
	o Dos atributos private de tipo double (x e y)
	o Un constructor con dos parámetros de tipo double que inicialicen los atributos
	o Un constructor por defecto sin parámetros que inicialice a 0
	o Los setter y getter correspondientes
	o Un método calcularDistanciaDesde(Punto param_punto), que reciba un objeto
	Punto como parámetro y devuelva un double que sea la distancia a dicho punto*/

public class Punto {

	private double x;
	private double y;
	
	
	public Punto(double puntox, double puntoy){//constructor con argumentos
		x = puntox;
		y = puntoy;
				}
				   
	public Punto(){// constructor sin argumentos 
		}
	
	public double getx()	{
	      // retorna el valor de la variable x
	return x;
	}
	public void setx(double x){
	      // asigna el valor del parametro a la variable x 
	this.x = x;
	}
	public double gety()	{
	return y;// retorna el valor de la variable y
	}
	public void sety(double y)	{
	this.y = y; // asigna el valor del parametro a la variable y 
	}
	
	
	public double calcularDistanciaPunto(Punto p){
		double distancia;
		double px=p.getx();
		double py=p.gety();
		distancia=Math.sqrt((Math.pow((px-this.x),2))+(Math.pow((py-this.y),2)));
		
		return distancia;
	}
	
	
	
}
