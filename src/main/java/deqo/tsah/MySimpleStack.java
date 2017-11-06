package deqo.tsah;

import java.util.*;

/**
 * Created by sht1316a on 19/10/2017.
 */
public class MySimpleStack implements SimpleStack {

    /*
    Ce commentaire correspond à l'exigence 3
     */
    private List<Item> listItems = new ArrayList();

    public boolean isEmpty(){
        return listItems.isEmpty();
    }

    public int getSize(){
        return listItems.size();
    }

    public void push(Item item){
        listItems.add(item);
    }

    public Item peek() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return listItems.get(getSize()-1);
        }
    }

    public Item pop() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return listItems.remove(getSize()-1);
        }
    }

}
