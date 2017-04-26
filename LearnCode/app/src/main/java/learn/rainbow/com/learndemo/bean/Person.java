package learn.rainbow.com.learndemo.bean;

/**
 * Created by rainbow on 2016/10/19.
 */
public class Person {
    private String name;
    private int age;
    private int accountBalance;

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

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
