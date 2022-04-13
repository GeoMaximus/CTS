package ase.cts.adapter;

public class AdapterB2A extends DiscountA implements IDiscountB{

    @Override
    public double computeDiscountB(Customer c) {
        return this.computeDiscountA();
    }
}
