package queue;

/**
 * Created by wangyun on 16-11-15.
 */
public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(String msg) {
        super(msg);
    }
}
