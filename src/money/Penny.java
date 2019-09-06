package money;

public class Penny extends AbstractMoney
{

    private double value;
    private String name;



    public Penny(int number)
    {
        super(number);
        this.value = .01;
        this.name = "Penny";
        this.total = value*number;

    }
    public Penny()
    {
        this.number = 1;
        this.value = .01;
        this.name = "Penny";
        this.total = value*number;
    }

    @Override
    public String getContent()
    {
        if(number==1) {
            return number + " " + name;
        }
        return number + " " + "Pennies";
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

