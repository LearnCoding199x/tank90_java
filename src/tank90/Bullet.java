package tank90;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Bullet {
	int x, y;
	int huong;
	Image image = new ImageIcon(getClass().getResource("/bullet.png"))
			.getImage();

	public Bullet(int x, int y, int huong) {
		super();
		this.x = x - image.getWidth(null) / 2;
		this.y = y - image.getHeight(null) / 2;
		this.huong = huong;
	}

	void ve(Graphics2D g2d) {
		g2d.drawImage(image, x, y, null);
	}

	boolean diChuyen() {

		int speed = 4;
		if (huong == Tank.LEFT) {
			x -= speed;
			if (x <= 0) {
				return false;
			}
		} else if (huong == Tank.RIGHT) {
			x += speed;
			if (x >= (MyFrame.W)) {
				return false;
			}
		} else if (huong == Tank.UP) {
			y -= speed;
			if (y <= 0) {
				return false;
			}
		} else if (huong == Tank.DOWN) {
			y += speed;
			if (y >= (MyFrame.H)) {
				return false;
			}
		}
		return true;
	}

	Rectangle getRect() {
		Rectangle rectangle = new Rectangle(x, y, image.getWidth(null),
				image.getHeight(null));
		return rectangle;
	}
	
}
