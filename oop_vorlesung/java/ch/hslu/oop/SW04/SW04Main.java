package ch.hslu.oop.SW04;

public class SW04Main {

    public static void main(final String[] args) {
        Line line = new Line(5, 10, 15, 20);
        System.out.println(line.getStartOfLine());
        System.out.println(line.getEndOfLine());

        line.setStartOfLine(25, 30);
        line.setEndOfLine(35, 40);
        System.out.println(line.getStartOfLine());
        System.out.println(line.getEndOfLine());
    }
}

