package deqo.tsah;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by sht1316a on 27/10/2017.
 */
public class ItemTest {
    private Item item;
    private Object object1, object2;

    @Before
    public void setUp(){
        object1 = new String("test String");
        object2 = new Integer(7);

    }



    @Test
    public void testGetObject() throws Exception {
        item = new Item(object1);
        assertThat(item.getObject(),sameInstance(object1));

    }

    @Test
    public void testSetObject() throws Exception {
        item = new Item(object1);
        item.setObject(object2);
        assertThat(item.getObject(),sameInstance(object2));
    }

}