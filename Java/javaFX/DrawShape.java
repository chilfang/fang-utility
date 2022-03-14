package self.javafx.helper;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;

public class DrawShape {
	private Color color = Color.BLACK;
	private Group root;
	private String style = "-fx-font: 24 arial;";
	
	public DrawShape(Group root) {
		this.root = root;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public void setFontSize(int size) {
		this.style = "-fx-font: " + size + " arial;";
	}
	
	public void drawRectangle(int x, int y, int width, int height) {
		Rectangle rect = new Rectangle(x, y, width, height);
		rect.setFill(color);
		root.getChildren().add(rect);
	}
	public void drawRectangle(Rectangle rect) {
		rect.setFill(color);
		root.getChildren().add(rect);
	}
	
	public void drawLine(int x, int y, int x2, int y2) {
		Line line = new Line(x, y, x2, y2);
		line.setFill(color);
		root.getChildren().add(line);
	}
	public void drawLine(Line line) {
		line.setFill(color);
		root.getChildren().add(line);
	}
	
	public void drawString(int x, int y, String string) {
		Text text = new Text(x, y, string);
		text.setStyle(style);
		text.setFill(color);
		root.getChildren().add(text);
	}
	public void drawString(Text text) {
		text.setStyle(style);
		text.setFill(color);
		root.getChildren().add(text);
	}
}
