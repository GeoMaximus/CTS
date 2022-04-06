package ro.ase.cts.factory;

public class CheapWeapon implements IWeapon{
    @Override
    public void power() {
        System.out.println("This weapon has 0.1 power");
    }
}
