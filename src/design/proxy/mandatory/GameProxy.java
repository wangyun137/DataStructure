package design.proxy.mandatory;

import design.proxy.IGamePlayer;

/**
 * Created by wangyun on 17/3/17.
 */
public class GameProxy implements IGamePlayer{

    private IGamePlayer player;

    public GameProxy(IGamePlayer player) {
        if (player == null) {
            throw new NullPointerException();
        }

        this.player = player;
    }

    @Override
    public void login() {
        this.player.login();
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void update() {
        this.player.update();
    }
}
