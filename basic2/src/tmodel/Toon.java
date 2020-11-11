package tmodel;

public class Toon {
	public String toonName;
	public String toonId;

	public String toFile() {
		return this.toonName + "#" + this.toonId;
	}

	public Toon(String name, String toonId) {
		// 이곳에 생성자 코드 작성할 것
		this.toonName = name;
		this.toonId = toonId;
	}

	public boolean checkContain(String value) {
		if (toonName.contains(value)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return toonName + " : " + toonId;
	}
}