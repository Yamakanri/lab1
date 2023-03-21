
public class lab1 {
    public static void main(String[] args){ //базовая штука
        int[] a = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}; // задаем массив int с числами от 4 до 16
        double[][] y = new double[13][11];// заранее создаем двумерный массив 13х11
        float[] x = new float[11]; // создаем массив float состоящий из 11 чисел
        for (int i = 0; i < x.length; i++) //  создаем цикл для выведения массива начиная перебор от 0
        // перебор меньше длины массива (проверка условия)// увеличение i на еденицу(выполнение вычисления)
        {
            x[i] = Float.parseFloat(Math.random() * (3 + 5) - 5.0 + ""); //заполняем массив случайнми числами от -5 до 3
        }
        //System.out.println(Arrays.toString(x)); // выводит подобранные значения массива float
        for (int i = 0; i<13; i++) // цикл перебора x
        {
            for (int j = 0; j<11;j++)
            {
                switch ((int) a[i]) //переменная по которой сравниваем
                {
                    case 12 -> y[i][j] = Math.pow((Math.tan(Math.atan((x[j]-1)/8))), Math.log((2*Math.abs(x[j])))); // 1 формул
                    case 6,9,10,14,15,16 -> y[i][j] = Math.pow(Math.E, Math.cos(Math.tan(x[j]))); // 2 формула
                    default -> y[i][j] = Math.pow(0.25 / Math.pow(Math.log(Math.acos((x[j]-1)/8)),2/(Math.cos(Math.cbrt(x[j]))+1)),3);
                }
            }
        }
        for(double[] i : y)
        {
            for(double j : i)
            {
                if (Double.isNaN(j))
                {
                    System.out.printf("|   %.3f   |", j);
                }
                else {
                    System.out.printf("|  %.3f  |", j);
                }
            }
            System.out.println();
        }
    }
}

