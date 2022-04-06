package ro.ase.cts.factory;

public class WeaponFactory {
    public static IWeapon createWeapon(float price) throws Exception {
        if(price < 200) {
            return new CheapWeapon();
        }
        if(price  >= 200 && price <= 500) {
            return new NormalWeapon();
        }
        if(price > 500) {
            return  new MagicWeapon();
        }
        else {
            throw new Exception("Something bad happened");
        }
    }
}
