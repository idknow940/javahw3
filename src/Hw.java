public class Hw {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        // matrix //
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
        //1
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j == i ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //2
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j == matrix.length - i - 1 ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //3
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j <= i ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //4
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j >= i ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //5
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j >= matrix[i].length - i - 1 ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //6
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j <= matrix[i].length - i - 1 ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //7
        for (int i = 0; i < matrix.length/2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j <= i ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        for (int i = matrix.length/2; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j <= matrix[i].length - i - 1 ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        //8
        for (int i = 0; i < matrix.length/2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j >= matrix[i].length - i - 1 ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        for (int i = matrix.length/2; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(j >= i ? matrix[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
        System.out.println();
        /*
        [ 0 0 0 0 0 ]
        [ 0 0 0 0 0 ]
        [ 0 0 0 0 0 ]
        [ 0 0 0 0 0 ]
        [ 0 0 0 0 0 ]

        [ 0         ]
        [   0       ]
        [     0     ]
        [       0   ]
        [         0 ]

        [         0 ]
        [       0   ]
        [     0     ]
        [   0       ]
        [ 0         ]

        [ 0         ]
        [ 0 0       ]
        [ 0 0 0     ]
        [ 0 0 0 0   ]
        [ 0 0 0 0 0 ]

        [ 0 0 0 0 0 ]
        [   0 0 0 0 ]
        [     0 0 0 ]
        [       0 0 ]
        [         0 ]

        [         0 ]
        [       0 0 ]
        [     0 0 0 ]
        [   0 0 0 0 ]
        [ 0 0 0 0 0 ]

        [ 0 0 0 0 0 ]
        [ 0 0 0 0   ]
        [ 0 0 0     ]
        [ 0 0       ]
        [ 0         ]

        [ 0         ]
        [ 0 0       ]
        [ 0 0 0     ]
        [ 0 0       ]
        [ 0         ]

        [         0 ]
        [       0 0 ]
        [     0 0 0 ]
        [       0 0 ]
        [         0 ]
         */
    }
}
