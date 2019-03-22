package framwork.bean;

public class Helloworld {
	public String id;
	public String name;
	public Helloworld(String id,String name) {
		this.id=id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Helloworld [id=" + id + ", name=" + name + "]";
	}
	
}
