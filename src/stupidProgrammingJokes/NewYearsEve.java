package stupidProgrammingJokes;

import java.util.List;

public class NewYearsEve extends Party implements PartyHard, DontStaySober, RememberIfYouCould {
    boolean isNewYearsEve;
    List<Friend> friends;

    public NewYearsEve(List<Friend> friends) {
        super();
        isNewYearsEve = true;
        this.friends = friends;
    }

    public void HaveGoodTime(List<Friend> friends) {
        int rounds = 0;
        while (notAsleep()) {
            haveAGoodTime();
            rounds++;

            switch (rounds) {
            case 1:
                System.out.println("Everyone is eating, drinking, dancing and having fun!");
                break;
            case 5:
                System.out.println("More booooooze pleaseee!");
                break;
            case 10:
                System.out.println("Woohoo, this party is crazyyy!");
                break;
            }
        }
        for (Friend friend : friends) {
            remember(friend);
        }
        System.out.println("...And now everyone is asleep and the party is over :( Boring people..\n");
    }

    public boolean notAsleep() {
        for (Friend friend : friends) {
            if (friend.isAsleep == false) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasFun(Person sb) {
        if (sb.numberOfDrinks < 15) {
            return true;
        }
        return false;
    }

    @Override
    public void remember(Person sb) {
        if (hasFun(sb)) {
            sb.willRemember = true;
        } else {
            sb.willRemember = false;
        }
    }

    @Override
    public void memories(Person sb) {
        if (sb.willRemember) {
            System.out.println(sb.name + " will have good memories of this party!");
        } else {
            System.out.println(sb.name + " won't remember this party.. Got too drunk x.x");
        }
    }

    @Override
    public boolean isThereAlcohol() {
        return (booze > 0);
    }

    @Override
    public void drink() {
        if (!isThereAlcohol()) {
            rebooze();
        }

        int sleeping = 0;
        for (Friend friend : friends) {
            if (!friend.isAsleep) {
                friend.numberOfDrinks += 1;
            } else {
                sleeping++;
            }
        }
        booze = booze - friends.size() + sleeping;
    }

    @Override
    public void eat() {
        if (snacks <= 0) {
            resnack();
        }

        int sleeping = 0;
        for (Friend friend : friends) {
            if (!friend.isAsleep) {
                friend.energy += 5;
            } else {
                sleeping++;
            }
        }
        snacks = snacks - friends.size() + sleeping;
    }

    @Override
    public void dance() {
        for (Friend friend : friends) {
            if (!friend.isAsleep) {
                friend.energy -= 10;
                if (friend.energy <= 0) {
                    friend.isAsleep = true;
                }
            }
        }
    }

    @Override
    public void haveAGoodTime() {
        eat();
        drink();
        dance();
    }
}
