package design.proxy.dynamic;

import design.proxy.IGamePlayer;
import design.proxy.normal.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wangyun on 17/3/17.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("allen");
        InvocationHandler handler = new GamePlayerIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login();
        proxy.update();
        proxy.killBoss();
    }
}
