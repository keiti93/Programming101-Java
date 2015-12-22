package stupidProgrammingJokes;

public class Person {

    public String name;
    public int age;
    public String gender;
    public int numberOfDrinks;
    public int energy;
    public boolean isAsleep;
    public boolean willRemember;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        numberOfDrinks = 0;
        energy = 100 - age;
        isAsleep = false;
    }

    public void isSober() {
        try {
            if (this.numberOfDrinks < 5) {
                System.out.println(this.name + "is still sober! Bring more booze!");
            }
            if (this.numberOfDrinks >= 5 && this.numberOfDrinks < 15) {
                System.out.println(this.name + "is having fuuuuuun!");
            } else {

                throw new DrunkException("StopDrinkingYouAreDrunkException");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
