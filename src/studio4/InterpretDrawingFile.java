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
		String shapeType = in.next();
		System.out.println(shapeType);
		int redComponent = in.nextInt();
		System.out.println(redComponent);
		int greenComponent = in.nextInt();
		System.out.println(greenComponent);
		int blueComponent = in.nextInt();
		System.out.println(blueComponent);
		boolean isFilled = in.nextBoolean();
		System.out.println(isFilled);
		double parameterOne = in.nextDouble();
		System.out.println(parameterOne);
		double parameterTwo = in.nextDouble();
		System.out.println(parameterTwo);
		double parameterThree = in.nextDouble();
		System.out.println(parameterThree);
		double parameterFour = in.nextDouble();
		System.out.println(parameterFour);
		StdDraw.setCanvasSize(500, 500);
		if (shapeType.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.clear();
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.clear();
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
	}
}
