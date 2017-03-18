package design.factory.abstarct;

/**
 * Created by wangyun on 17/3/17.
 */
public class Nvwa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();
        Human whiteMale = maleHumanFactory.createWhiteHuman();
        whiteMale.getColor();
        whiteMale.getSex();
        Human blackMale = maleHumanFactory.createBlackHuman();
        blackMale.getColor();
        blackMale.getSex();
        Human yellowMale = maleHumanFactory.createYellowHuman();
        yellowMale.getColor();
        yellowMale.getSex();

        Human whiteFemale = femaleHumanFactory.createWhiteHuman();
        whiteFemale.getColor();
        whiteFemale.getSex();
        Human blackFemale = femaleHumanFactory.createBlackHuman();
        blackFemale.getColor();
        blackFemale.getSex();
        Human yellowFemale = femaleHumanFactory.createYellowHuman();
        yellowFemale.getColor();
        yellowFemale.getSex();
    }
}
