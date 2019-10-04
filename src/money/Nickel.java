package money;

public class Nickel extends AbstractMoney
{

    private double value;
    private String name;

    public Nickel(int number)
    {
        super(number);
        this.value = .05;
        this.name = "Nickel";
        this.total = value*number;

    }
    public Nickel()
    {
        this.number = 1;
        this.value = .05;
        this.name = "Nickel";
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

