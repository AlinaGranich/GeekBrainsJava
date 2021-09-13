public class lesson3 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }

        System.out.println("=======================");

        int[] days = new int[100];
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
            System.out.println(days[i]);
        }
        System.out.println("=======================");

        int [] umn  = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0 ; i < umn.length; i++ ){
            if (umn [i] < 6) {
                umn [i] = umn [i] * 2;
            }
            System.out.println(umn [i]);

        }
        System.out.println("=======================");

        int [] [] dva = new int [8] [8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i - j == 0 )  {
                    dva[i][j] = 1;
                }
                if (i + j == 7){
                    dva[i][j] = 1;
                }
                System.out.print(dva [i] [j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("=======================");

        int[] array = arguments(8, 8);
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }



    }
    public static int[] arguments (int len, int initialValue ){
        int [] arg = new int [len];
        for (int i =  0; i < len; i++){
            arg [i] = initialValue;
        }

        return arg;
    }
}