package enjoy.design.builder;

/**
 * @auther luzhenjie
 * @description
 * @datetime 2019/6/16
 */
public class Director {

    private ProductBuilder builder;
    public Director(ProductBuilder builder) {
       this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.build();
    }
}
