package tmodel;

public class Toon6 {
	public String toonName;
	public String toonId;
	public String src;

	public String toFile() {
		return this.toonName + "#" + this.toonId;
	}

	public Toon6(String name, String toonId, String src) {
		// 이곳에 생성자 코드 작성할 것
		this.toonName = name;
		this.toonId = toonId;
		this.src = src;
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