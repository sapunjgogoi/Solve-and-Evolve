public class floydsTriangle {
    public static void main(String[] args) {
        int n = 4; // Use Scanner class for user input 
        int num = 1; // starting number from 1

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
