package design.proxy.mandatory;

import design.proxy.IGamePlayer;

/**
 * Created by wangyun on 17/3/17.
 */
public class GamePlayer implements IGamePlayer{

    private String name;
    private IGamePlayer proxy;

    public GamePlayer(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
    }

    public IGamePlayer getProxy() {
        this.proxy = new GameProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        return this.proxy == null;
    }

    @Override
    public void login() {
        if (isProxy()) {
            System.out.println(this.name + " login");
        } else {
            System.out.println("please use the proxy");
        }
    }

    @Override
    public void update() {
        if (isProxy()) {
            System.out.println(this.name + " update");
        } else {
            System.out.println("please use the proxy");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println(this.name + " killBoss");
        } else {
            System.out.println("please use the proxy");
        }
    }
}
