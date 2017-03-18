package design.factory.abstarct;

/**
 * Created by wangyun on 17/3/17.
 */
public interface HumanFactory {
    Human createWhiteHuman();

    Human createBlackHuman();

    Human createYellowHuman();
}
