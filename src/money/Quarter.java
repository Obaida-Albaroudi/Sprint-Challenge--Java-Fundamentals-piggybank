package money;

public class Quarter extends AbstractMoney
{

    private double value;
    private String name;

    public Quarter(int number)
    {
        super(number);
        this.value = .25;
        this.name = "Quarter";
        this.total = value*number;

    }
    public Quarter()
    {
        this.number = 1;
        this.value = .25;
        this.name = "Quarter";
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

