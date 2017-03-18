package design.decorator;

/**
 * Created by wangyun on 17/3/18.
 */
public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
