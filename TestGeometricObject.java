package willnurspielen;

public class TestGeometricObject {
	public static void main(String [] args){

	GeometricObject o1 = new GeometricObject(1,1);
	GeometricObject o2 = new GeometricObject(1,1,new Vertex(3,0));
	GeometricObject o3 = new GeometricObject(1,1,new Vertex(3,3));
	
	System.out.println(o1.touches(o2));
	System.out.println(o1.touches(o3));
}
}