
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

		/*BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/home/neha/eclipse-workspace/HelloWorld/src/inputfile"));
			String line;

			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				for(int i = 0; i<= line.length(); i++) {
					str[i] = line[i];
					
				}
				System.out.println(str);
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
		}*/
	}

	public Text(){
		super (0,0); 
		
	}
	
	public Text(String s) {
		super(0,0);
		str = s;
	}
	
	

	/**
	 * Drawing method for circles.
	 */
	public void draw(Graphics g) {
		g.drawString(str, x, y);

	}

	private String str = "abc";
	private int x = 100;
	private int y = 100;
	//private String str[]; 
	
}