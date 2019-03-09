package ck_factory.methodf_actory;

import ck_factory.ProductLineA;
import ck_factory.ProductLineA_B;

public class ProductBFactory implements Method_factory {
    @Override
    public ProductLineA create() {
      return new ProductLineA_B();
    };
}
