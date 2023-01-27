package q1;

public class AverageCalculator {
	public static String findAverage(double a, double b, double c) {
		double avg = (a+b+c)/3;
		return String.format("%.2f", avg);
	}
	public static String findAverage(double a, double b, double c, double d) {
		double avg = (a+b+c+d)/4;
		return String.format("%.2f", avg);
	}
	public static String findAverage(double a, double b, double c, double d, double e) {
		double avg = (a+b+c+d+e)/5;
		return String.format("%.2f", avg);
	}
}