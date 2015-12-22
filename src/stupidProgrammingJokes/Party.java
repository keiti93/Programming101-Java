package stupidProgrammingJokes;

public class Party {

    int booze;
    int snacks;
    boolean goodMusic;

    public Party() {
        this.booze = 50;
        this.snacks = 50;
        this.goodMusic = true;
    }

    public void rebooze() {
        booze += 25;
    }

    public void resnack() {
        snacks += 25;
    }
}
