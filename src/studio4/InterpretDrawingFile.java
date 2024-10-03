package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		

		if(shape.equals("rectangle") ){
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.setPenColor(R, G, B);
			if(isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
			
		}
		if(shape.equals("ellipse") ){
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			StdDraw.setPenColor(R, G, B);
			if(isFilled) {
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			else {
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			
		}
		if(shape.equals("triangle") ){
			double x1 = in.nextDouble();
			double x2 = in.nextDouble();
			double x3 = in.nextDouble();
			double x4 = in.nextDouble();
			
			double[] xt = {x,x1,x2};
			double[] yt = {y,x3,x4};
			
			StdDraw.setPenColor(R, G, B);
			if(isFilled) {
				StdDraw.filledPolygon(xt,yt);
			}
			else {
				StdDraw.polygon(xt, yt);
			}
			
		}
		
	}
}
