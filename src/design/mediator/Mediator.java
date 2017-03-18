package design.mediator;

/**
 * Created by wangyun on 17/3/17.
 */
public abstract class Mediator {

    private ColleaguaA colleaguaA;
    private ColleaguaB colleaguaB;

    public ColleaguaA getColleaguaA() {
        return colleaguaA;
    }

    public void setColleaguaA(ColleaguaA colleaguaA) {
        this.colleaguaA = colleaguaA;
    }

    public ColleaguaB getColleaguaB() {
        return colleaguaB;
    }

    public void setColleaguaB(ColleaguaB colleaguaB) {
        this.colleaguaB = colleaguaB;
    }

    public abstract void doSomethingA();

    public abstract void doSomethingB();

}
