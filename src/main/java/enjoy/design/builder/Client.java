package enjoy.design.builder;

/**
 * @auther luzhenjie
 * @description
 * @datetime 2019/6/16
 */
public class Client {

    public static void main(String[] args) {

        ProductBuilder builder = new ConcreteBuilder();

        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
        System.out.println("Hello");
        System.out.println("创建dev1");
    }
}
