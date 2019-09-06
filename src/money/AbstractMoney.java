package money;



public  abstract class AbstractMoney
{
    protected double value;
    protected int number;
    protected String name;
    protected double total;


    public AbstractMoney(int number)
    {

        this.number = number;
        this.value = value;
        this.name = name;
        this.total = total;


    }
    public AbstractMoney()
    {
        this.name = name;
        this.number = number;
        this.value = value;
        this.total = total;


    }

    public abstract String getContent();

    public int getNumber()
    {
        return number;
    }

    public double getValue()
    {
        return value;
    }

    public double getTotal()
    {
        return total;
    }

    public String getName()
    {
        return name;
    }



}
