package design.proxy.normal;

import design.proxy.IGamePlayer;

/**
 * Created by wangyun on 17/3/17.
 */
public class GamePlayer implements IGamePlayer{

    private String name;

    public GamePlayer(String _name) {
        if (_name == null) {
            throw new NullPointerException();
        }
        this.name = _name;
    }

    @Override
    public void login() {
        System.out.println(this.name + " login");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " killBoss");
    }

    @Override
    public void update() {
        System.out.println(this.name + " update");
    }
}
