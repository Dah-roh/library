public class School {
    private Library<Borrowers> thelibrary;
    private Borrowers theBorrowers;

    public School(Library<Borrowers> thelibrary, Borrowers theBorrowers) {
        this.thelibrary = thelibrary;
        this.theBorrowers = theBorrowers;
    }

    public School() {

    }

    public Library<Borrowers> getThelibrary() {
        return thelibrary;
    }

    public void setThelibrary(Library<Borrowers> thelibrary) {
        this.thelibrary = thelibrary;
    }

    public Borrowers getTheBorrowers() {
        return theBorrowers;
    }

    public void setTheBorrowers(Borrowers theBorrowers) {
        this.theBorrowers = theBorrowers;
    }
}
