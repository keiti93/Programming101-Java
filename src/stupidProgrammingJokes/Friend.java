package stupidProgrammingJokes;

public class Friend extends Person {

    public int levelOfAwesomeness;
    
    public Friend(String name, int age, String gender, int level) {
        super(name, age, gender);
        this.levelOfAwesomeness = level;
    }

}
