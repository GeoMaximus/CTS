package ro.ase.cts.factory;

public class NormalWeapon implements IWeapon{
    @Override
    public void power() {
        System.out.println("This is a normal weapon");
    }
}
