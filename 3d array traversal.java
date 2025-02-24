public class Main {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            },
            {
                {13, 14, 15},
                {16, 17, 18}
            }
        };

        for (int i = 0; i < array.length; i++) {         // Traverse the 1st dimension (depth)
            for (int j = 0; j < array[i].length; j++) {  // Traverse the 2nd dimension (rows)
                for (int k = 0; k < array[i][j].length; k++) {  // Traverse the 3rd dimension (columns)
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

