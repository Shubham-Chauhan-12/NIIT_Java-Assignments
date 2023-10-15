package ElectionCriteria;

import java.util.Scanner;

public class VoterImpl {
    public static void main(String[] args)
    {
        Voter voter=new Voter();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Voter's Name");
        String name=scanner.nextLine();
        voter.setName(name);

        System.out.println("Enter Voter's Age");
        int age=scanner.nextInt();
        voter.setAge(age);

        voter.getAgeCriteria();

    }
}
