public class TriangleDrawer {

    public static void drawTriangle(){
        // System.out.println("Hello cs61bl!");
        int i = 0;
        int SIZE = 5;
        while(i < SIZE) {
            int j = 0;
            while(j <= i){
                System.out.print("*");
                j += 1;
            }
            if(i != SIZE - 1){
                System.out.println();
            }
            i += 1;
        }
    }

    public static void main(String[] args) {
        drawTriangle();
    }
}
