package prac06.task12;
public class StringBuilderReplaceCommand implements Command
{
    // класс команды замены символов
    StringBuilder str;
    StringBuilder lastStr;

    public StringBuilderReplaceCommand(StringBuilder str) {
        this.str = str;
    }

    public void execute(String str, int...pos)
    {
        lastStr = new StringBuilder(this.str);
        this.str.replace(pos[0], pos[1], str);
    }

    public void undo()
    {
        str.replace(0, str.length(), lastStr.toString());
    }
}