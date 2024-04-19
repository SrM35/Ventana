package ventana;

public class Obstaculo {
	int x;
	int y;
	int a;
	int l;
	String color;

	public Obstaculo() {

	}

	public Obstaculo(int x, int y, int a, int l, String color) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.l = l;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void seTocaron(int x, int y, int a, int l, int xp, int yp, int ap, int lp) {
		if (x+a>=xp && xp+ap >=x && y+l>=yp && yp+lp >= y) {
			System.out.println("se tocan");
		} 
	}
}
