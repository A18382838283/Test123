import java.io.FileInputStream;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App
 {
    static String[] name;
    static double[] cpu;
    static int[] id;
    static String[] path;

    public static void main(String[] args) throws Exception
    {
        //sort();
        System.out.println("Bitte geben Sie hier ihr Passwort ein:");
        char[] passwort = new char[32];
        passwort = System.console().readPassword();

        JComboBox box = new JComboBox<>();
        box.setVisible(true);
        box.setSize(120,453);

        JLabel label = new JLabel("Sergej");
        label.setVisible(true);
        label.setSize(200,100);

        JFrame fenster = new JFrame("Sergej");
        fenster.setSize(1000, 1000);
        fenster.setVisible(true);
        fenster.add(box);
        fenster.add(label);



        String pw = "";
        for (int i = 0; i < passwort.length; i ++)
            pw = pw + passwort[i];
        System.out.println(passwort);


        try 
        {
            importCSV("prozesse.csv");
            for(int i = 0; i < name.length; i ++)
                System.out.println(name[i] + ' ' + cpu[i] + ' ' + id[i] + ' ' + path[i]);               
        } 
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }        

        //Calculator calc = new Calculator();
        //calc.add(12.5);
        //calc.add(15.2);
        //calc.add(4.25);
        //calc.showValues();
    }

    public static void sort()
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

    public static void importCSV(String aFileName) throws Exception
    {
        FileInputStream fis;
        Scanner sc;

        int i = 0;
        fis  = new FileInputStream(aFileName);
        sc = new Scanner(fis);
        while(sc.hasNextLine())
        {
            i++;
            sc.nextLine();
        }

        sc.close();

        name = new String[i];
        cpu = new double[i];
        id = new int[i];
        path = new String[i];

        fis = new FileInputStream(aFileName);
        sc = new Scanner(fis);
        for (i = 0; i < name.length; i ++)
        {
            String line = sc.nextLine();
            String field[] = line.split(",");         
            name[i] = field[0]; 
            cpu[i] = Double.parseDouble(field[1]);
            id[i] = Integer.parseInt(field[2]);
            path[i] = field[3];            

        }

        sc.close();
    }
}
