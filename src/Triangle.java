import java.awt.*;

/**
 * A square that can be drawn in a window. The coordinates represent the upper
 * left corner of the square.
 */
class Triangle extends Figure {
	/**
	 * Constructor: first two parameters are the coordinates, the third is the side.
	 */
	public Triangle(int inX[], int inY[]) {
		super(inX[0], inY[0]);
		firstvar = inX;
		secondvar = inY;
		//System.out.println(firstvar[0]);
		//System.out.println(secondvar[0]);
		

	}	
	
	public Triangle() {
		super(0,0);
		//firstvar = firstvar1; 
		//secondvar = secondvar1;
		//System.out.println(firstvar[0]);
		//System.out.println(secondvar[0]);
		

	}

	/**
	 * Drawing method for squares.
	 */
	public void draw(Graphics g) {
		
		for (i = 0; i < firstvar.length; i++)
		{
			temp[i] = firstvar[i];
			//System.out.println(firstvar[i]);
			i++;
		}
		for (j = 0; j < secondvar.length; j++)
		{
			temp1[j] = secondvar[j];
			//System.out.println(secondvar[j]);
			j++;
		}
		g.drawPolygon(temp, temp1, 3);
	}

	private int i,j;
	private int[] temp = new int[3];
	private int[] temp1 = new int[3];
	int firstvar[] = { 200, 100, 10 };
	int secondvar[] = { 200, 100, 100 };
	private int[] inX = new int[3];
	private int[] inY = new int[3];
	//int firstvar1[] = { 200, 200, 10 };
	//int secondvar1[] = { 200, 200, 100 };

	// Square side
}