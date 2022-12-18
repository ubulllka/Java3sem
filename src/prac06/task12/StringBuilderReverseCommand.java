package prac06.task12;

public class StringBuilderReverseCommand implements Command
{
    // класс команды разворота строки
    StringBuilder str;
    StringBuilder lastStr;

    public StringBuilderReverseCommand(StringBuilder str) {
        this.str = str;
    }

    public void execute(String str, int...pos)
    {
        lastStr = new StringBuilder(this.str);
        this.str.reverse();
    }

    public void undo()
    {
        str.replace(0, str.length(), lastStr.toString());
    }
}
