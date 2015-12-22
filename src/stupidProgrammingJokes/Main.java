package stupidProgrammingJokes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Friend ivo = new Friend("Ivo", 22, "m", 100);
        Friend rado = new Friend("Rado", 25, "m", 100);
        Friend anto = new Friend("Anto", 21, "m", 100);
        Friend vlado = new Friend("Vlado", 20, "m", 100);
        Friend phil = new Friend("Phil", 27, "m", 100);
        Friend magi = new Friend("Magi", 25, "f", 100);
        Friend kamen = new Friend("Kamen", 21, "m", 100);
        Friend pavli = new Friend("Pavli", 23, "m", 100);

        List<Friend> HackBulgariaFriends = new ArrayList<>();
        HackBulgariaFriends.add(ivo);
        HackBulgariaFriends.add(rado);
        HackBulgariaFriends.add(anto);
        HackBulgariaFriends.add(vlado);
        HackBulgariaFriends.add(phil);
        HackBulgariaFriends.add(magi);
        HackBulgariaFriends.add(kamen);
        HackBulgariaFriends.add(pavli);
        
        NewYearsEve TwentySixteen = new NewYearsEve(HackBulgariaFriends);
        TwentySixteen.HaveGoodTime(HackBulgariaFriends);
        System.out.println(anto.name + " had " + anto.numberOfDrinks + " drinks at this party.");
        TwentySixteen.memories(phil);
        rado.isSober();
        
    }

}
