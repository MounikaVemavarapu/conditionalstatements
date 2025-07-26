public class Marks{
	public static void main(String[] args) {
		int m1 = 72, m2 = 43, m3 = 95, m4 = 54, m5 = 30;
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {
            int avg = (m1 + m2 + m3 + m4 + m5) / 5;
            if (avg >= 90) {
                System.out.println("Outstanding");
            } else if (avg >= 75) {
                System.out.println("Distinction");
            } else if (avg >= 60) {
                System.out.println("First Class");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Sneha failed.");
        }

	}

}