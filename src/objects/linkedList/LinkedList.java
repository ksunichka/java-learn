package objects.linkedList;

import java.util.Iterator;

/**
 * Created by ksenia on 20.03.2017.
 */
public class LinkedList implements Stack, List{
    Item head;
    Item last;

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }

    @Override
    public Object poll() {
        return remove(0);
    }

    @Override
    public void push(Object value) {
        Item next = head;
        head = new Item(value);
        head.next = next;
    }

    @Override
    public void add(Object value) {
        Item item = new Item(value);
        if (head == null) {
            head = item;
            last = item;
        } else {
            last.next = item;
            last = item;
        }
    }

    @Override
    public Object get(int index) {
        if (head != null) {
            int i = 0;
            Item item = head;

            while (item != null) {
                if (i == index) {
                    return item.value;
                }
                item = item.next;
                i++;
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public Object remove(int index) {
        if (head != null) {
            if (index == 0) {
                Item h = head;
                head = head.next;
                return h.value;
            }
            int i = 0;
            Item item = head;
            Item prev = head;
            while (item != null) {
                if (i == index) {
                    prev.next = item.next;
                    return item.value;
                }
                prev = item;
                item = item.next;
                i++;
            }
            return null;
        } else {
            return null;
        }
    }

}
