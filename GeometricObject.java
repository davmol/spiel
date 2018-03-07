package willnurspielen;

public class GeometricObject {

	public Vertex pos;
	public double width;
	public double height;
	
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	public Vertex getPos() {return pos;}
	
	public GeometricObject(double w, double h, Vertex poss) {
		pos=poss;
		width=w;
		height=h;
		if (width<0) {
			width = - width;
			pos.x = pos.x - width;
		}
		if (height<0) {
			height = - height;
			pos.y = - height;
			
		}
	}
	//Objekt mit Ursprung 0
	public GeometricObject(double w, double h){
		this(w,h,new Vertex(0,0)); //im Rumpf eines Konstruktors ein solcher Aufruf zu einem anderen Konstruktor nur als erster Befehl auftreten
	}
	// Breite gleich der Höhe w*w
	public GeometricObject(double w){
		this(w,w);
		}
	//Breite=Höhe=10 im Urpsrung
	public GeometricObject(){
		this(10);
		}
	//Objekt nur Punkt von Vertex (kein Breite keine Höhe)
	public GeometricObject(Vertex pos){
		this(0,0,pos);
		}
	
	public String toString(){
		return "width="+width+", height="+height+", pos="+pos;
	}
	
	public double circumference(){
		return 2*(width+height);
		}
	
	public double area(){
		return width*height;
		}
	
	public boolean contains(Vertex v){
		  return  v.x >= pos.x && v.x <= pos.x+width   //x is within
		       && v.y >= pos.y && v.y <= pos.y+height; //y is within
		}
	
	public boolean isLargerThan(GeometricObject that){
		  return this.area() > that.area();
		}
	
	public void moveTo(Vertex pos){
		this.pos=pos;
		}
	
	public void moveTo(double x, double y){
		moveTo(new Vertex(x,y));
		 }
	public void move(Vertex v){
		moveTo(pos.add(v));
		}
	
	
	public static void main(String[] args) {
		GeometricObject o1 = new GeometricObject(1,1);
		GeometricObject o2 = new GeometricObject(1,1,new Vertex(3,0));
		GeometricObject o3 = new GeometricObject(1,1,new Vertex(1,0));
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		
		
		
	}
	
	 public boolean equals(Object thatObject){
		   if (thatObject instanceof GeometricObject){
		     GeometricObject that = (GeometricObject)thatObject;
		     return that.width==this.width
		         && this.height==that.height
		         && this.pos.equals(that.pos);
		   }
		   return false;
		 }
	 
	 public boolean touches(GeometricObject that) {
		 if ( this.pos.x+this.width  >= that.pos.x
				 && this.pos.x <= that.pos.x+that.width
			&& this.pos.y+this.height >= that.pos.y
				&& this.pos.y <= that.pos.y+that.height)
				{
			 return true;}
		 return false;
		 }
			
		 
	 }
