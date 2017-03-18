package design.factory.abstarct;

/**
 * Created by wangyun on 17/3/17.
 */
public class FemaleFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new YellowFemale();
    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteFemale();
    }

    @Override
    public Human createBlackHuman() {
        return new BlackFemale();
    }
}
