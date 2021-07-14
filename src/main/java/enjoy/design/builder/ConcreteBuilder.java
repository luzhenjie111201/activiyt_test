package enjoy.design.builder;

/**
 * @auther luzhenjie
 * @description 具体建造者
 * @datetime 2019/6/16
 */
public class ConcreteBuilder extends ProductBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }

    @Override
    public Product build() {
        return super.build();
    }
}
