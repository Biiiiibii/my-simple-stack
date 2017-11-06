package deqo.tsah;

import java.util.EmptyStackException;

/**
 * Created by sht1316a on 19/10/2017.
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;

}
