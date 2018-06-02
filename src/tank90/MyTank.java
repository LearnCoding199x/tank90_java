package tank90;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MyTank extends Tank {

	Image[] images = {
			new ImageIcon(getClass().getResource("/player_green_left.png"))
					.getImage(),
			new ImageIcon(getClass().getResource("/player_green_right.png"))
					.getImage(),
			new ImageIcon(getClass().getResource("/player_green_up.png"))
					.getImage(),
			new ImageIcon(getClass().getResource("/player_green_down.png"))
					.getImage() };

	public MyTank(int giaTriX, int giaTriY, int giaTriHuong) {
		super(giaTriX, giaTriY, giaTriHuong);
		// TODO Auto-generated constructor stub
		anh = images[UP];
	}

	void doiHuong(int huongMoi) {
		huong = huongMoi;
		anh = images[huongMoi];
	}

}
