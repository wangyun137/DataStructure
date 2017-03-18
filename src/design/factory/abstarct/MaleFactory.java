package design.factory.abstarct;

/**
 * Created by wangyun on 17/3/17.
 */
public class MaleFactory implements HumanFactory{

    @Override
    public Human createBlackHuman() {
        return new BlackMan();
    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteMan();
    }

    @Override
    public Human createYellowHuman() {
        return new YellowMan();
    }
}
