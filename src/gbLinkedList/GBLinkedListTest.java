package gbLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GBLinkedListTest {

    @Test
    void getTest() {
        GBLinkedList<String> list = new GBLinkedList<>();
        list.addToFront("one");
        list.addToFront("two");
        Assertions.assertEquals(2, list.size());
    }

    @Test
    void getNegativeTest() {
        GBLinkedList<String> list = new GBLinkedList<>();
        list.addToFront("two");
        Assertions.assertNotEquals("one", list.get(0));
    }
}
