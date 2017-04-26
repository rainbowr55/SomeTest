package learn.rainbow.com.learndemo;

import learn.rainbow.com.learndemo.bean.Person;

/**
 * Created by rainbow on 2016/10/19.
 */
public class AccountAdder {

    private static ThreadLocal<Person> accountThreadLocal = new ThreadLocal<Person>() {
        @Override
        protected Person initialValue() {
            Person person = new Person();
            person.setName("mainName");
            person.setAccountBalance(0);
            person.setAge(20);
            return person;
        }
    };

    public static Person getPerson() {
        return accountThreadLocal.get();
    }

    public static void addCount(String name,int year) {
        Person person = accountThreadLocal.get();
        person.setName(name);
        person.setAccountBalance(person.getAccountBalance() + 10000);
        person.setAge(person.getAge() + year);
    }
}
