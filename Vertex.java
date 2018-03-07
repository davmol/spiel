package willnurspielen;
public class Vertex{
	// Felddefinition: Definition der Objekteigenschaften x,y  (von v1) 
	public double x;
	public double y;

	// Konstruktor (auch eine Methode) ertzeugt ein Objekt (Bauanleitung für Objekte)
	public Vertex(double xx, double yy){
	x=xx;
	y=yy;
	}

	public static void main(String[] args) {
		// Aufruf der Konstruktors mit Wertezuweisung(initialisieren) zum Erzeugen von Objekten
		// Objekte haben als Typ die Klasse von der sie erzeugt werden
		Vertex v1 = new Vertex(17,4);
		Vertex v2 = new Vertex(42,0);
		Vertex v3 = new Vertex(0,0);

		//Aufrug der Eigenschaften x,y des Objekts in der selben Klasse mit v1.x und v1.y
		System.out.println("v1.x = "+v1.x+"; v1.y = "+v1.y+";");
		System.out.println("v2.x = "+v2.x+"; v2.y = "+v2.y+";");
		System.out.println("v3.x = "+v3.x+"; v3.y = "+v3.y+";");
		System.out.println("------------");
		System.out.println(v1);
		
		//gleiche .equals()
		//selbe == gleiches Objekt?
		String s1="hallo";
		String s2="HALLO".toLowerCase();
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
	
	

	

	//Methodendefinition
	public String toString(){
		return "("+x+","+y+")";
		}
	public double length(){
		return Math.sqrt(x*x+y*y);
		}
	public Vertex skalarMult(double s){
		return new Vertex(x*s,y*s);
		}
	public void skalarMultMod(double s){	x=s*x;y=s*y;
	}
	public Vertex add(Vertex v2){
		return new Vertex(x+v2.x,y+v2.y);}
	public void addMod(Vertex v2){x=x+v2.x;y=y+v2.y;
	}

	public void setX(double x){
		this.x=x;
		}
	public void setY(double y){
		this.y = y;
		}

	public double getX(){
		return x;
		}
	public double getY(){
		return y;
		}
	
	//check ob Objekte beide vom typ Vertex sind und die gleichen x,y haben
	public boolean equals(Object thatObject){ 
		if (thatObject instanceof Vertex){
			//cast von thahtObject to type Vertex
			Vertex that = (Vertex)thatObject;
			return this.x==that.x && this.y == that.y;
			}
		return false;}
	
	public Vertex sub(Vertex that){
		return new Vertex(x-that.x,y-that.y);
		}
	
	public double distance(Vertex that){
		return (Math.sqrt(Math.pow((this.x-that.x),2)+Math.pow((this.y-that.y),2)));
		}
	
	public Vertex normalized() {
		return new Vertex((1/this.length())*this.x, (1/this.length())*this.y);
		}
			
	
}