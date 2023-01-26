import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyRectangle extends MyBoundedShape {

	// constructor
	public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean isFull) {
		super(x1, y1, x2, y2, color, isFull);
		// TODO Auto-generated constructor stub
	}

	@Override
	// draw method override from
	public void draw(GraphicsContext gc) {
		// set shape's stroke & color
		gc.setStroke(this.getColor());
		gc.strokeRect(this.getX1(), this.getY1(), this.getX2(), this.getY2());
		if (this.isFull()) {
			// if the shape is full - fill it with the wished color
			gc.setFill(this.getColor());
			gc.fillRect(this.getX1(), this.getY1(), this.getX2(), this.getY2());
		}
	}

}
