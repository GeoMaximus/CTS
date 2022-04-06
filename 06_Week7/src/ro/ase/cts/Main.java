package ro.ase.cts;

import ro.ase.cts.factory.IWeapon;
import ro.ase.cts.factory.MagicWeapon;
import ro.ase.cts.factory.WeaponFactory;
import ro.ase.cts.prototype.BookShop;

public class Main {

    public static void main(String[] args) {
        //PROTOTYPE
        BookShop carturesti = BookShop.loadDataFromDB("carturesti");
        System.out.println(carturesti);

        try {
            BookShop diverta = (BookShop) carturesti.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //FACTORY
        //three type: SIMPLE, ABSTRACT, METHOD factory
        IWeapon weapon; //= new MagicWeapon(); //we want to hide what we are creating
        try {
            weapon = WeaponFactory.createWeapon(200);
            weapon.power();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
