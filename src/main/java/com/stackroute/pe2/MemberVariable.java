package main.java.com.stackroute.pe2;

public class MemberVariable {
    //creating instances for member
    Member member = new Member();

    public String printValues(String name, int age, double salary) {
        member.name = name;
        member.age = age;
        member.salary = salary;
        return "Members name:" + member.name + "\n" + "Members age:" + member.age + "\n" + "members salary:" + member.salary;
    }
}
