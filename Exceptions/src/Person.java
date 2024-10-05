import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.StringConcatException;

public class Person
{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    public void introduce() throws IOException
    {
        FileWriter file = new FileWriter("results.txt");
        PrintWriter output = new PrintWriter(file);
        output.println(this);
        output.close();
    }

    public void showConcatenatedName() throws StringConcatException
    {
        String concatenated = name + surname;
        if(concatenated == "")
        {
            throw new StringConcatException("Concatenation failed");
        }
        System.out.println(concatenated);
    }
}