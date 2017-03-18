package design.template;

/**
 * Created by wangyun on 17/3/17.
 */
public class ClassB extends AbstractClass{

    @Override
    protected void doSomething() {
        System.out.println("ClassB doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("ClassB doAnything");
    }
}
