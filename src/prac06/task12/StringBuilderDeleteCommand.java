package prac06.task12;

public class StringBuilderDeleteCommand implements Command
{
    // класс команды удаления символов
    StringBuilder str;
    StringBuilder lastStr;

    public StringBuilderDeleteCommand(StringBuilder str) {
        this.str = str;
    }

    public void execute(String str, int...args)
    {
        lastStr = new StringBuilder(this.str);
        this.str.delete(args[0], args[1]);
    }

    public void undo()
    {
        str.replace(0, str.length(), lastStr.toString());
    }
}
