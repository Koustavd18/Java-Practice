class ThreeD {
    public static void main(String[] args) {
        System.out.println("3D Array");
        int arr[][][] = new int[2][2][2];


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int n[][] : arr) {
            for (int m[] : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int arr2[] = {1, 2, 3, 5, 5, 6};

        System.out.println("The length of arr2 is => " + arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}