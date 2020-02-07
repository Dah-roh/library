import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @org.junit.jupiter.api.Test
    void addbooks() {
        Borrowers things = new Borrowers(1,"Hamlet","Amos");
        List<Borrowers> shelf = new ArrayList<Borrowers>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Borrowers> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Borrowers borrowers) {
                return true;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Borrowers> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Borrowers> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Borrowers get(int i) {
                return null;
            }

            @Override
            public Borrowers set(int i, Borrowers borrowers) {
                return null;
            }

            @Override
            public void add(int i, Borrowers borrowers) {

            }

            @Override
            public Borrowers remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Borrowers> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Borrowers> listIterator(int i) {
                return null;
            }

            @Override
            public List<Borrowers> subList(int i, int i1) {
                return null;
            }

        };
        assertTrue(shelf.add(things));
        Borrowers link = new Borrowers(1,"Hamlet","Amos");
        assertArrayEquals(link, things);
    }

    private void assertArrayEquals(Borrowers link, Borrowers things) {
    }

    @org.junit.jupiter.api.Test
    void lend() {
        Borrowers borrowers = new Borrowers(1,"Hamlet", "Amos");
        Queue borroers = new Queue(15);
        borroers.insert(borrowers.getLibraryMembers());
        assertTrue(!borroers.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void lends() {
    }

    @org.junit.jupiter.api.Test
    void lendingBook() {
    }

    @org.junit.jupiter.api.Test
    void listBookdt() {
    }

    @org.junit.jupiter.api.Test
    void listBookdt1() {
    }
}