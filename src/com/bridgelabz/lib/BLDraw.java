package com.bridgelabz.lib;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
public class BLDraw {
	private static final int DEFAULT_SIZE = 512;
	private static int width = DEFAULT_SIZE;
	private static int height = DEFAULT_SIZE;

	// default pen radius
	private static final double DEFAULT_PEN_RADIUS = 0.002;


    // current pen radius
    private static double penRadius;
    private static BufferedImage offscreenImage;
    private static Graphics2D offscreen, onscreen;

    // show we draw immediately or wait until next show?
    private static boolean defer = false;

    // boundary of drawing canvas, 0% border
    // private static final double BORDER = 0.05;
    private static final double BORDER = 0.00;
    private static double xmin, ymin, xmax, ymax;
	private static Object mouseLock = new Object();

	public static void setXscale(double min, double max) {
		validate(min, "min");
		validate(max, "max");
		double size = max - min;
		if (size == 0.0)
			throw new IllegalArgumentException("the min and max are the same");
		synchronized (mouseLock) {
			xmin = min - BORDER * size;
			xmax = max + BORDER * size;
		}
	}
	 public static void point(double x, double y) {
	        validate(x, "x");
	        validate(y, "y");

	        double xs = scaleX(x);
	        double ys = scaleY(y);
	        double r = penRadius;
	        float scaledPenRadius = (float) (r * DEFAULT_SIZE);

	        if (scaledPenRadius <= 1) pixel(x, y);
	        else offscreen.fill(new Ellipse2D.Double(xs - scaledPenRadius/2, ys - scaledPenRadius/2,
	                                                 scaledPenRadius, scaledPenRadius));
	        draw();
	    }
	  private static void draw() {
	        if (!defer) show();
	    }

	  private static void pixel(double x, double y) {
	        validate(x, "x");
	        validate(y, "y");
	        offscreen.fillRect((int) Math.round(scaleX(x)), (int) Math.round(scaleY(y)), 1, 1);
	    }

	public static void setPenRadius() {
		setPenRadius(DEFAULT_PEN_RADIUS);
	}
	 public static void line(double x0, double y0, double x1, double y1) {
	        validate(x0, "x0");
	        validate(y0, "y0");
	        validate(x1, "x1");
	        validate(y1, "y1");
	        offscreen.draw(new Line2D.Double(scaleX(x0), scaleY(y0), scaleX(x1), scaleY(y1)));
	        draw();
	    }
	    public static void setPenRadius(double radius) {
	        validate(radius, "pen radius");
	        validateNonnegative(radius, "pen radius");

	        penRadius = radius;
	        float scaledPenRadius = (float) (radius * DEFAULT_SIZE);
	        BasicStroke stroke = new BasicStroke(scaledPenRadius, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
	        // BasicStroke stroke = new BasicStroke(scaledPenRadius);
	        offscreen.setStroke(stroke);
	    }
	private static void validate(double x, String name) {
		if (Double.isNaN(x))
			throw new IllegalArgumentException(name + " is NaN");
		if (Double.isInfinite(x))
			throw new IllegalArgumentException(name + " is infinite");
	}

	private static void validateNonnegative(double x, String name) {
		if (x < 0)
			throw new IllegalArgumentException(name + " negative");
	}

	private static double scaleX(double x) {
		return width * (x - xmin) / (xmax - xmin);
	}

	private static double scaleY(double y) {
		return height * (ymax - y) / (ymax - ymin);
	}

	private static double factorX(double w) {
		return w * width / Math.abs(xmax - xmin);
	}

	private static double factorY(double h) {
		return h * height / Math.abs(ymax - ymin);
	}
	private static JFrame frame;
	public static void show() {
		onscreen.drawImage(offscreenImage, 0, 0, null);
		frame.repaint();
	}

	public static void filledRectangle(double x, double y, double halfWidth, double halfHeight) {
		validate(x, "x");
		validate(y, "y");
		validate(halfWidth, "halfWidth");
		validate(halfHeight, "halfHeight");
		validateNonnegative(halfWidth, "half width");
		validateNonnegative(halfHeight, "half height");

		double xs = scaleX(x);
		double ys = scaleY(y);
		double ws = factorX(2 * halfWidth);
		double hs = factorY(2 * halfHeight);
		if (ws <= 1 && hs <= 1)
			pixel(x, y);
		else
			offscreen.fill(new Rectangle2D.Double(xs - ws / 2, ys - hs / 2, ws, hs));
		draw();
	}

}
