public class TriangleDrawer2 {
    public static void drawTriangle() {
        int SIZE = 5;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            if(i != SIZE - 1) {
                System.out.println();
            }
        }
    }
}
