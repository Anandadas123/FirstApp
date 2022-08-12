import java.util.Objects;

public class employee  extends Object {
	
	private int id;
	private String name;
	
	public employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		employee e1= new employee(12,"debu");
		employee e2= new employee(14,"anand");
		if(e1.equals(e2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");

		}	      
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

