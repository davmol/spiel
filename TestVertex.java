package willnurspielen;

public class TestVertex {
	public static void main(String [] args){
	    Vertex v1 = new Vertex(17,4);
	    Vertex v2 = new Vertex(42,23);
	    Vertex v3 = new Vertex(0,0);
	    Vertex v4 = new Vertex(42,23);
	             
	   System.out.println(v2.toString());
	   System.out.println("v1 = "+v1);
	   
	   System.out.println("v2 = "+v2);
	   System.out.println("Strecke zu v1 = "+v1.length());
	   System.out.println("Strecke zu v2 = "+v2.length());
	   System.out.println("Strecke zu v3 = "+v3.length());
	   System.out.println("Strecke zu v4 = "+v4.length());
	   
	   System.out.println("v1 *0.8 = "+v1.skalarMult(0.8));
	   System.out.println("v1 = "+v1);
	   
	   v1.skalarMultMod(0.8);
	   System.out.println("v1*0,8 multmod  = "+v1);
	   
	   System.out.println("v1 + v2 = "+v1.add(v2));
	   System.out.println("v1 = "+v1);
	   System.out.println("v2 = "+v2);
	   
	   v1.addMod(v2);
	   System.out.println("v1 new = v.1admod(v2)  = "+v1);
	   System.out.println("v2 = "+v2);
	   
	   System.out.println("v1.x = "+v1.getX());
	   System.out.println("v1.y = "+v1.getY());
	   
	  
	   System.out.println("v1 equals v2?: "+v1.equals(v2));
	   System.out.println("v1 equals v3?: "+v1.equals(v3));
	   System.out.println("v2 equals v4?: "+v2.equals(v4));
	   System.out.println("v4 equals v2?: "+v4.equals(v2));
	   
	   System.out.println("v2.sub(v2) = "+v2.sub(v2));
	   System.out.println("v1.distance(v2) = "+v1.distance(v2));
	   System.out.println("v1.normalized = "+v1.normalized());

	}
}
