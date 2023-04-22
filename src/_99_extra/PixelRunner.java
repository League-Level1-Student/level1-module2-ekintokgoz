package _99_extra;

public class PixelRunner {
	public static void main(String[] args) {
		PixelParty party = new PixelParty();
		party.setColor(0, 0, 255);
		party.drawRectangle(40,100, 100, 230);
		party.drawRectangle(24, 400, 50, 80);
		party.drawCircle(360, 40, 25);
		party.drawCircle(286, 234, 71);
		party.drawTriangle(60, 40, 50, 90, 100, 70);
		party.drawTriangle(25, 98, 125, 100, 67, 85);
		party.saveImage();
		party.displayImage();
	}
}
