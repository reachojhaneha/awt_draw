
//package read_file;

import java.awt.Graphics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Circle class. The coordinates represent the circle’s center.
 */
class Text extends Figure {
	/**
	 * Constructor: the first two parameters are the coordinates, the third is the
	 * diameter.
	 */
	public Text(String s1, int inX, int inY) {
		super(inX, inY);
		 str = s1;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(str));
			String line;

			while ((line = br.readLine()) != null) {
				
					str1 = line;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Text(){
		super (defx,defy);
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(str));
			String line;

			while ((line = br.readLine()) != null) {
				
					str1 = line;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public Text(String s) {
		super(defx,defy);
		str = s;
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(str));
			String line;

			while ((line = br.readLine()) != null) {
				
					str1 = line;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	


	/**
	 * Drawing method for circles.
	 */
	public void draw(Graphics g) {
		g.drawString(str1, x, y);

	}

	private String str1;// = "abc";
	private static int defx = 100;
	private static int defy = 100;
	private static String str = "/home/neha/eclipse-workspace/awt_draw/src/inputfile";
	
	
}