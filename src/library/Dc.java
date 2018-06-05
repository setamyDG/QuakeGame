package library;

public class Dc {

	private float x, y;



	public Dc(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public float x() {
		return x;
	}


	public Dc setX(float x) {
		this.x = x;
		return this;
	}


	public float y() {
		return y;
	}


	public Dc setY(float y) {
		this.y = y;
		return this;
	}




}
