package com.ccz.screencap;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringEscapeUtils;

public class Screencap {
	
	/*public static void main (String[] args) throws Exception {
		String ds = "HI";
		screencap(ds);
	}*/

	public static void screencap(String s) throws Exception {
		
		System.out.println("Please enter filename");
		//Scanner scan = new Scanner(System.in);
		//String s = scan.next();
		String results = StringEscapeUtils.escapeJava(s);
		
		Robot robot = new Robot();
		Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image = robot.createScreenCapture(area);
		
		File file = new File(results + ".png");
		ImageIO.write(image, "png", file);
		
		System.out.println("Image captured at " + System.currentTimeMillis() + "with filename " + file);
		
	}

}
