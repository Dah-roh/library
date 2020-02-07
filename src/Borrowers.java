import java.util.*;
public class Borrowers {
    private int level;
    private String bookName;
    private String name;
    private List<List<String>> libraryMembers = new ArrayList<>();

    public Borrowers() {
    }

    public Borrowers(int level, String bookName, String name) {
        this.level = level;
        this.bookName = bookName;
        this.name = name;
    }
    public Borrowers(int level, String name) {
        this.level = level;
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name+" "+this.getLevel()+" :"+this.bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<String>> getLibraryMembers() {
        return libraryMembers;
    }

    public void setLibraryMembers(List<List<String>> libraryMembers) {
        this.libraryMembers = libraryMembers;
    }

    public List<List<String>> libMembers(int level, String name){
        String deets;
        List members = new ArrayList();
        if(level == 1) {
            deets = "Teacher "+name;
            members.add(deets);
            libraryMembers.add(members);
        }
        else if(level == 2) {
            deets= "Senior Student " +name;
            members.add(deets);
            libraryMembers.add(members);
        }
        else if(level == 3){
            deets = "Junior Student "+name;
            members.add(deets);
            libraryMembers.add(members);
        }
        return libraryMembers;
    }

    //private String classRoom;  make an interface for it
}
