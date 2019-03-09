package ck_factory.abstract_factory;

import ck_factory.*;

public class FactoryLineA implements AbstractFactory {
    @Override
    public ProductLineA createLineA() {
        return new ProductLineA_A();
    }

    @Override
    public ProductLineB createLineB() {
        return new ProductLineB_A();
    }
}
