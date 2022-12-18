package prac06.task12;

public class StringBuilderInsertCommand implements Command
{
    // класс команды вставки подстровки в строку
    StringBuilder str;
    StringBuilder lastStr;

    public StringBuilderInsertCommand(StringBuilder str)
    {
        this.str = str;
    }

    public void execute(String str, int...args)
    {
        lastStr = new StringBuilder(this.str);
        this.str.insert(args[0], str);
    }

    public void undo()
    {
        str.replace(0, str.length(), lastStr.toString());
    }
}
