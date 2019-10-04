package money;

import java.text.DecimalFormat;

import java.util.ArrayList;


public class Main

{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<AbstractMoney>piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(11));

        System.out.println(piggyBank.toString());
        piggyBank.forEach((v) -> System.out.println(v.getContent()));

        var amount = new Object() {
            double Total=0;
        };
        piggyBank.forEach((v) -> amount.Total= amount.Total+ v.getTotal());
        System.out.println("The piggy bank holds " + fp.format(amount.Total));
        

    }
}
