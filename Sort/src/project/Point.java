package project;

import java.util.Comparator;

public class Point {

    private final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    public int compareTo(Point that){
        if (this.y > that.y)
            return 1;
        else if (this.y == that.y && this.x > that.x)
            return 1;
        else if (this.y == that.y && this.x == that.x)
            return 0;
        else
            return -1;
    }

    public double slopeTo(Point that){
        if (this.y == that.y && this.x == that.x)
            return -Integer.MAX_VALUE;
        int numerator = that.y - this.y;
        int denominator = that.x - this.x;
        if (denominator == 0 && numerator != 0){
            return Integer.MAX_VALUE;
        }
        return numerator/denominator;
    }

    private class SlopeOrder implements Comparator<Point>{

        public int compare(Point p1, Point p2){
            double p1_slope = slopeTo(p1);
            double p2_slope = slopeTo(p2);

            return Double.compare(p1_slope, p2_slope);
        }

    }
}
