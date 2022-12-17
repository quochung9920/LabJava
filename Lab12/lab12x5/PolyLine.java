package Lab12.lab12x5;

import java.util.ArrayList;
import java.util.List;
public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<Point>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        this.points.add(new Point(x, y));

    }

    public double getLength() {
        double sumLength = 0;
        for (int i = 0; i < points.size()-1; i++) {
            int j = i + 1;
            sumLength += Math.sqrt(Math.pow(points.get(j).getX() - points.get(i).getX(), 2) +
                    (Math.pow(points.get(j).getY() - points.get(i).getY(), 2)));
        }
        return sumLength;
    }

}