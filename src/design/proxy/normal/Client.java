package design.proxy.normal;

import design.proxy.IGamePlayer;

/**
 * Created by wangyun on 17/3/17.
 */
public class Client {
    public static void main(String[] args) {

        IGamePlayer proxy = new GameProxy("allen");
        proxy.login();
        proxy.killBoss();
        proxy.update();
    }
}
