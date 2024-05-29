package SchoolWork3;

public class PyramidPattern {
    public static void main(String[] args) {
        int height = 8;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%3d\t",2 << k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.printf("%3d\t",2 << l);
            }
            System.out.println();
        }
    }
}

