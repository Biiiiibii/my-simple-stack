package deqo.tsah;

import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by sht1316a on 27/10/2017.
 */
public class MySimpleStackTest {
    protected  SimpleStack simpleStack;
    protected  Item item1, item2;


    @Before // "Fixture": executé avant chaque test
    public void setUp() throws Exception {
        simpleStack = new MySimpleStack();
        item1 = new Item(new String("aaaz"));
        item2 = new Item(new String("bbby"));

    }

    @Test
    public void testIsEmpty() throws Exception {
        // Given the fixture

        assertThat(simpleStack.isEmpty(),is(true));

        simpleStack.push(item1);

        assertThat(simpleStack.isEmpty(),is(false));

        simpleStack.pop();

        assertThat(simpleStack.isEmpty(),is(true));



    }

    @Test
    public void testGetSize() throws Exception {
        // Given the fixture

        assertThat(simpleStack.getSize(),is(0));
        simpleStack.push(item1);
        assertThat(simpleStack.getSize(),is(1));
        simpleStack.push((item2));
        assertThat(simpleStack.getSize(),is(2));
        simpleStack.pop();
        assertThat(simpleStack.getSize(),is(1));

    }

    @Test
    public void testPush() throws Exception {
        //Given
        simpleStack.push(item1);
        simpleStack.push(item2);
        //When
        final Item item02 = simpleStack.peek();
        //Then
        assertThat(item02, sameInstance(item2));
        //When
        simpleStack.pop();
        final Item item01 = simpleStack.peek();
        //Then
        assertThat(item01,sameInstance(item1));

    }

    @Test
    public void testPeek() throws Exception {
        // Given
        simpleStack.push(item1);
        simpleStack.push(item2);
        // When
        final Item item = simpleStack.peek();
        // then
        assertThat(item, sameInstance(item2));
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekException() {
        // Given the fixture
        Item nothing = simpleStack.peek();
    }


    @Test
    public void testPop() throws Exception {
        // Given
        simpleStack.push(item1);
        simpleStack.push(item2);
        // When
        final Item actual2 = simpleStack.pop();
        // then
        assertThat(actual2, sameInstance(item2));
        // When
        final Item actual1 = simpleStack.pop();
        // then
        assertThat(actual1, sameInstance(item1));
        // and
        assertThat(simpleStack.isEmpty(), is(true));
    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() {
        // Given the fixture
        Item nothing = simpleStack.pop();
    }

}