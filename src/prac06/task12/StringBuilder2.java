package prac06.task12;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

public class StringBuilder2
{
    StringBuilder str;
    ArrayList<Command> commands;

    public StringBuilder2(String str)
    {
        this.str = new StringBuilder(str);
        commands = new ArrayList<Command>(0);
    }

    public void insert(String str, int... args)
    {
        StringBuilderInsertCommand insertCommand = new StringBuilderInsertCommand(this.str);
        insertCommand.execute(str, args);
        commands.add(insertCommand);
    }

    public void delete(int... args)
    {
        StringBuilderDeleteCommand deleteCommand = new StringBuilderDeleteCommand(this.str);
        deleteCommand.execute("NULL", args);
        commands.add(deleteCommand);
    }

    public void reverse()
    {
        StringBuilderReverseCommand reverseCommand = new StringBuilderReverseCommand(this.str);
        reverseCommand.execute("NULL", 0);
        commands.add(reverseCommand);
    }

    public void replace(String str, int...args)
    {
        StringBuilderReplaceCommand replaceCommand = new StringBuilderReplaceCommand(this.str);
        replaceCommand.execute(str, args);
        commands.add(replaceCommand);
    }

    public void append(String str)
    {
        StringBuilderAppendCommand appendCommand = new StringBuilderAppendCommand(this.str);
        appendCommand.execute(str);
        commands.add(appendCommand);
    }

    public char charAt(int pos)
    {
        return str.charAt(pos);
    }

    public void undo()
    {
        if (commands.isEmpty())
        {
            System.out.println("Нет команд для отмены");
            return;
        }
        commands.get(commands.size()-1).undo();
        commands.remove(commands.size()-1);
    }

    public String toString()
    {
        return str.toString();
    }

    public boolean equals(StringBuilder2 str)
    {
        return this.str.equals(str);
    }
}
