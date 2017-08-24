import java.awt.*;

public class Main extends Canvas {
	void main() {
		for (;;) {
			print("IchigoCafe alpha!");
			wait(60);
			cls();
			wait(60);
		}
	}
	// functions like IchigoJam
	void wait(int n) {
		try {
			Thread.sleep(n * 1000 / 60);
		} catch (Exception e) {
		}
	}
	void print(String s) {
		scr = s;
		repaint();
	}
	void cls() {
		scr = "";
		repaint();
	}
	public Main() {
		new Thread() {
			public void run() {
				main();
			}
		}.start();
	}
	static final int SW = 8 * 32;
	static final int SH = 8 * 24;
	
	String scr = "";
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(10, 10, 10 + SW, 10 + SH);
		g.setColor(Color.white);
		g.drawString(scr, 10 + 16, 10 + SH / 2);
	}
	public static void main(String[] args) throws Exception {
		Frame f = new Frame("IchigoCafe");
		f.setSize(300, 260);
		f.setLayout(new BorderLayout());
		f.add(BorderLayout.CENTER, new Main());
		f.setVisible(true);
	}
}
