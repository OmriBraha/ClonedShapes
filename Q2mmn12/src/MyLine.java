import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {

	// constructor
	public MyLine(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, x2, y2, color);
	}

	// equals method
	public boolean equals(MyLine other) {
		return this.calcLength() == other.calcLength();
	}

	// calculate length method
	// - calculate the length of a Line by the length formula:
	// - D = square root[(x1-x2)^2 + ( y1-y2 )^2]
	private double calcLength() {
		return Math.sqrt(Math.pow(this.getX1() - this.getX2(), 2) + Math.pow(this.getY1() - this.getY1(), 2));

	}

	@Override
	// draw method override from
	public void draw(GraphicsContext gc) {
		// get the stroke color ( will be defined in controller to be green )
		gc.setStroke(this.getColor());
		gc.strokeLine(this.getX1(), this.getY1(), this.getX2(), this.getY2());

	}

}
