import java.util.*;
public class Main {
    public static void main(String[] args) {

        Queue b = new Queue(5);
        Borrowers thebow1 = new Borrowers(1, "Hamlet", "Amos");
        Borrowers thebow = new Borrowers(2, "Hamlet", "Tejiri");
        Borrowers thebow2 = new Borrowers(3, "Hamlet", "Evelyn");
        Borrowers books = new Borrowers(1,"Teacher","Hamlet");
        Library<Borrowers> lib = new Library<>(1, "Hamlet", "Amos",new Date());
        Object val;
        School newss = new School(lib, thebow);
        val = lib.addbooks(thebow1);
        val = lib.addbooks(thebow);
        b.insert(thebow1);

        thebow1.libMembers(2, "Tejiri");
        thebow1.libMembers(1, "Amos");
        thebow1.libMembers(2, "Tejiri");
        thebow2.libMembers(3, "Evelyn");
        thebow.libMembers(2, "Tejiri");


//        String[][] val1 = thebow.libMembers(1, "Teacher");
        lib.lendingBook("Hamlet", "Tejiri", 2, thebow);
        lib.lendingBook("Hamlet", "Amos", 1, thebow1);
        lib.lendingBook("Hamlet", "Tejiri", 2, thebow);
        lib.lendingBook("Hamlet", "Evelyn", 3, thebow2);
        lib.lendingBook("Hamlet", "Amos", 1, thebow1);
//        lib.lend("Amos", 1, "Hamlet", thebow1);
//        lib.lendingBook("Hamlet", "12:00pm",thebow);
//        lib.lendingBook("Teacher",1,"olivertwist","12:00pm",thebow1);
//        lib.lendingBook("Teacher",1,"olivertwist","12:00pm",thebow);
//        System.out.println(thebow.getLibraryMembers()[0][0]);
//        for (String[] i : val1) {
//            for (String j : i) {
//                System.out.println(j);
//            }
//        }
//        System.out.println(thebow1.getName());
//        lib.listBookdt();
////        System.out.println(lib.getShelf());?
//        System.out.println(lib.getBorroers().toString());
//        lib.listBookdt1();
        lib.lends("Amos", 1,"Hamlet");
        lib.lends("Amos", 1,"Hamlet");
        lib.lend("Amos", 1,"Hamlet");
        lib.listBookdt();

    }
}
