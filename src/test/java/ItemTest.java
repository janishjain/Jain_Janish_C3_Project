import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @BeforeEach
    public void init(){
        Item item1 = new Item("ItemA",200);
        Item item2 = new Item("ItemB",300);
        Item item3 = new Item("ItemC",400);
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
    }
}