package design.decorator;

/**
 * Created by wangyun on 17/3/18.
 */
public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate");
    }
}
