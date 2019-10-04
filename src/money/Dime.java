package money;

public class Dime extends AbstractMoney
{

    private double value;
    private String name;

    public Dime(int number)
    {
        super(number);
        this.value = .10;
        this.name = "Dime";
        this.total = value*number;

    }
    public Dime()
    {
        this.number = 1;
        this.value = .10;
        this.name = "Dime";
        this.total = value*number;
    }

    @Override
    public String getContent()
    {
        if(number==1) {
            return number + " " + name;
        }
        return number + " " + name +"s";
    }

    @Override
    public String toString()
    {
        // '\'' + ",id = " + id
        return "\nMoney{" +
                "name = '" + name + '\'' +
                ", number = " + number  +
                ", value = " + value  +
                '}';
    }
}

