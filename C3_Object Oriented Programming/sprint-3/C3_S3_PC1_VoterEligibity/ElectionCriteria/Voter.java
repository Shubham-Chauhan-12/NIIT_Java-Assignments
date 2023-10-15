package ElectionCriteria;

public class Voter {
    private String name;
    private int age;

    static final int ELIGIBLE_AGE = 18;

    public Voter() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAgeCriteria() {

        if (getAge() >= ELIGIBLE_AGE) {

            System.out.println(getName()+" you are  Eligible to Vote in Election");

        }
        else if ( getAge() <= ELIGIBLE_AGE && getAge() >= 0)
        {
            System.out.println(getName()+" you are not Eligible to Vote in Election(Age req >=18)");
        }
        else
        {
            if (getAge() < 0)
            {
                System.out.println(getName() + " You Entered Wrong Age details(Invalid Input)");
            }
        }
    }

}
