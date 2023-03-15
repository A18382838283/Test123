import java.util.ArrayList;
import java.util.List;

public class Calculator 
{
    private List<Double> list;

    public Calculator()
    {
        list = new ArrayList<Double>(); 
    }
 
    public void add(double aValue)
    {
        list.add(list.size(), aValue);
    }

    public void showValues()
    {
        for(int i = 0; i < list.size(); i ++) 
        {
            System.out.println(list.get(i));
        }
    }
}
