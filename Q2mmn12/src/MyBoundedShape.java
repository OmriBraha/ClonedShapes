import javafx.scene.paint.Color;

public abstract class MyBoundedShape extends MyShape {

	// declare this argument that is special to shapes that are not a line
	private boolean isFull;

	// constructor
	public MyBoundedShape(int x1, int y1, int x2, int y2, Color color, boolean isFull) {
		super(x1, y1, x2, y2, color);
		this.setFull(isFull);
	}

	// getters & setters
	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	// equals method
	public boolean equals(MyBoundedShape other) {
		// compare x2,y2 as those are the values that represent the width & height of a bounded shape
		return other.getX2() == this.getX2() && other.getY2() == this.getY2();
	}

}
