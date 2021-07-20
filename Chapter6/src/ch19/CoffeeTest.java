package ch19;

import java.rmi.dgc.Lease;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee ethiopiaCoffee  = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println();
        Coffee ethiopiaLattee = new Latte(ethiopiaCoffee);
        ethiopiaLattee.brewing();

        System.out.println();

        Coffee mochaEthiopia = new Mocha(new Latte(new EthiopiaAmericano()));
        mochaEthiopia.brewing();

        System.out.println();

        Coffee keyaCoffee = new WhippingCream(new Mocha(new Latte(new KeyaAmericano())));
        keyaCoffee.brewing();

    }
}
