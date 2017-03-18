package design.composite;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by wangyun on 17/3/18.
 */
public class Branch extends Component{
    private List<Component> components = new ArrayList<Component>();

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public List<Component> getChildren() {
        return components;
    }
}
