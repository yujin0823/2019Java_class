package model;

public class Toon {
	private String name;
	private String id;
	
	public String toFile() {
		return this.name + "#" + this.id;
	}
	
	public boolean checkEqual(String id) {
		return this.id.equals(id);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Toon(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean checkContain(String value) {
		if(name.contains(value)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Toon [name=" + name + ", id=" + id + "]";
	}
	
}
