package prac06.task13;

public class Display implements Observer, Displays
{
    private static int count = 0;

    private StringBuilder str;
    private int id;

    public Display()
    {
        count++;
        id = count;
        str = new StringBuilder();
    }

    public void update(StringBuilder st)
    {
        str.replace(0, str.length(), st.toString());
    }

    public void display()
    {
        System.out.println("Display " + id + ": " + str);
    }
}
