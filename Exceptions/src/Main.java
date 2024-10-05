import java.io.IOException;
import java.lang.invoke.StringConcatException;

public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bartek", "Kołakowski", 30);
        try
        {
            p1.introduce();
        }
        catch(IOException e)
        {
            System.out.println("Failed opening");
        }
        try
        {
            p1.showConcatenatedName();
        }
        catch(StringConcatException e)
        {
            e.printStackTrace();
        }
    }
}