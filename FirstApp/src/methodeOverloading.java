
public class methodeOverloading {
	private int id;
	private String str;
	
	public methodeOverloading(int id, String str) {
		this.id = id;
		this.str = str;
	}
	
	void methode1(String x) {
		System.out.println("String x");
		
	}
	void methode1(Object x) {
		System.out.println("Object x");
		
	}
	public static void main(String[] args) {
		methodeOverloading mo=new methodeOverloading(23,"string");
		 mo.methode1(null);
		 mo.methode1(null);
		 
	}

}
