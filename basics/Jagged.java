class Jagged {
    public static void main(String[] args) {
        System.out.println("JAGGED ARRAY");

        int jagged[][] = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        for (int i = 0; i < jagged.length; i++) {

            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : jagged) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}