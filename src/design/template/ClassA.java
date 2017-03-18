package design.template;

/**
 * Created by wangyun on 17/3/17.
 */
public class ClassA extends AbstractClass{

    @Override
    protected void doSomething() {
        System.out.println("ClassA doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("ClassB doAnything");
    }
}
