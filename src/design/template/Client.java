package design.template;

/**
 * Created by wangyun on 17/3/17.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass classA = new ClassA();
        AbstractClass classB = new ClassB();

        classA.templateMethod();
        classB.templateMethod();
    }
}
