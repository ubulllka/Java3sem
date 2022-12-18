package prac06.task12;

public class StringBuilderAppendCommand implements Command
{
    // класс команды объединения строк
    StringBuilder str;
    StringBuilder lastStr;

    public StringBuilderAppendCommand(StringBuilder str)
    {
        this.str = str;
    }

    public void execute(String str, int...args)
    {
        lastStr = new StringBuilder(this.str);
        this.str.append(str);
    }

    public void undo()
    {
        str.replace(0, str.length(), lastStr.toString());
    }
}
