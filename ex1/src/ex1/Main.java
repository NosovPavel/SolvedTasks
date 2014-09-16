package ex1;

public class Main {

	public static void main(String[] args) {
		int[][] points;
        points = new int[4][2];
        points[0][0] = 10;
        points[0][1] = 10;
        points[1][0] = 20;
        points[1][1] = 10;
        points[2][0] = 20;
        points[2][1] = 15;
        points[3][0] = 5;
        points[3][1] = 8;
        
        findMinDistance(points);
	}
	
	public static int findMinDistance(int points[][]) {
        int x = points.length;
        int min = 0;
        int j = 0;
        int[] b = new int[points.length-1];
        for (int i = 0; i < x; i++) {
            if (points[i][0] < points[i][1]) {
                if ((points[i][1] - points[i][0]) != 0) {                    
                    b[j] = points[i][1] - points[i][0];
                    j++;
                }
            } else {
                if ((points[i][0] - points[i][1]) != 0) {                   
                    b[j] = points[i][0] - points[i][1];
                    j++;
                }

            }
        }
        min = b[0];
        for (int n = 0; n < b.length; n++) {
            if (min > b[n]) {
                min = b[n];
            }
        }
        System.out.println("Мин разница: " + min);
        return min;
    }

}
