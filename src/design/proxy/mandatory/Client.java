package design.proxy.mandatory;

import design.proxy.IGamePlayer;

/**
 * Created by wangyun on 17/3/17.
 */
public class Client {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer("allen");
        IGamePlayer proxy = player.getProxy();

        proxy.login();
        proxy.killBoss();
        proxy.update();
    }
}
