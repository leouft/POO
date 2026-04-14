package entities;

public class Student {
    public String name;
    public double[] points = new double[3];

    public double finalGrade() {
        return points[0]+points[1]+points[2];
    }

    public boolean result() {
        return finalGrade() >= 60;
    }

    public double missingPoints() {
        return 60-finalGrade();
    }
}
