package DayNine;

import java.util.HashSet;
import java.util.Set;

public record Point(int x, int y) {
        // even snel om te testen of ie werkt:
        public static void main(String[] args) {
            Set<Point> points = new HashSet<>();
            points.add(new Point(2, 3));
            points.add(new Point(4, 5));
            points.add(new Point(6, 7));

            System.out.println(points.contains(new Point(1, 1)));
            System.out.println(points.contains(new Point(2, 3)));
            System.out.println(points.contains(new Point(6, 7)));
            System.out.println(points.contains(new Point(6, 6)));
            System.out.println(points.contains(new Point(7, 7)));

            System.out.println(new Point(3, 100));
        }
    }

