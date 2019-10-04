package money;

public class Dollar extends AbstractMoney
{

    private double value;
    private String name;

    public Dollar(int number)
    {
        super(number);
        this.value = 1.00;
        this.name = "$";
        this.total = value*number;

    }
    public Dollar()
    {
        this.number = 1;
        this.value = 1.00;
        this.name = "$";
        this.total = value*number;
    }


    @Override
    public String getContent()
    {
        return name + number ;
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

