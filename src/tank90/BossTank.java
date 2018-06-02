package tank90;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class BossTank extends Tank {

	Random random = new Random();

	long t = 0;

	Image[] images = {
			new ImageIcon(getClass().getResource("/bossyellow_left.png"))
					.getImage(),
			new ImageIcon(getClass().getResource("/bossyellow_right.png"))
					.getImage(),
			new ImageIcon(getClass().getResource("/bossyellow_up.png"))
					.getImage(),
			new ImageIcon(getClass().getResource("/bossyellow_down.png"))
					.getImage() };

	public BossTank(int x, int y, int huong) {
		super(x, y, huong);
		// TODO Auto-generated constructor stub
		anh = images[DOWN];
	}

	void sinhHuong() {
		int huongMoi = random.nextInt(4);
		int t = random.nextInt(100);
		if (t > 96) {
			huong = huongMoi;
			anh = images[huongMoi];
		}

	}

	Bullet ban() {
		long t2 = System.currentTimeMillis();
		if (t2 - t >= 500) {
			t=t2;
			return super.ban();
		} else {
			return null;
		}
	}
}