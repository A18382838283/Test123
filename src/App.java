public class App
 {
    public static void main(String[] args) throws Exception
    {
        double[] unsortedarr = {12, 1, 9, 3, 2, 5, 8, 4, 10};
        System.out.println("Unsortiertes Array:");
        for(int i = 0; i < unsortedarr.length; i++)
            System.out.println(unsortedarr[i]);
        
        bubbleSort(unsortedarr);

        System.out.println("Sortiertes Array:");
        for(int i = 0; i < unsortedarr.length; i++)
            System.out.println(unsortedarr[i]);
    }

    public static void bubbleSort(double[] arr)
    {
        boolean sorted = false;
        do
        {
            sorted = true;
            for(int i = 0; i < arr.length - 1; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    sorted = false;
                    double cache = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = cache;
                }
            }
        }
        while(!sorted);
    }
}
