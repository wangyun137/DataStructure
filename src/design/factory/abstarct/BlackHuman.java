package design.factory.abstarct;

/**
 * Created by wangyun on 17/3/17.
 */
public abstract class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.print("Black Human");
    }
}
