package ck_factory.simple_factory;

import ck_factory.ProductLineA;

public class SimpleFactory {
    public static ProductLineA create(Class c){
      ProductLineA productLineA =null;
        try {
            productLineA = (ProductLineA) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productLineA;
    };

}
