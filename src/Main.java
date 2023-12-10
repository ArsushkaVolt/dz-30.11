import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{1,2,3,4};
        String[] arr2 = new String[]{"А", "Б", "В"};
        int[][] arr3 = new int[3][3];
        float[][] arr4 = new float[3][3];
        arr3[0][0] = 1;
        arr3[1][1] = 1;
        arr3[2][2] = 1;

        arr4[0][0] = 1.5f;
        arr4[1][1] = 1.25f;
        arr4[2][2] = 1.55f;

        ArrOutput(arr1);
        System.out.println(" ");
        ArrOutput(arr2);
        System.out.println(" ");
        ArrOutput(arr3);
        System.out.println(" ");
        ArrOutput(arr4);

    }

    public static void ArrOutput(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void ArrOutput(String[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void ArrOutput(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void ArrOutput(float[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


}