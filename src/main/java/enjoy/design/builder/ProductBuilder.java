package enjoy.design.builder;

/**
 * @auther luzhenjie
 * @description 抽象产品建造者
 * @datetime 2019/6/16
 */
public abstract class ProductBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product build() {
        return new Product();
    }
}
