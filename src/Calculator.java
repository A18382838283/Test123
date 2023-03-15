import java.util.ArrayList;
import java.util.List;

public class Calculator 
{
    List<Double> list;

    public Calculator()
    {
        list = new ArrayList<Double>(); 
    }
 
    public void add(double aValue)
    {
        list.add(list.size() - 1, aValue);
    }
}
