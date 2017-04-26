package learn.rainbow.com.learndemo;

import android.util.Log;

import learn.rainbow.com.learndemo.bean.Person;

/**
 * Created by rainbow on 2016/10/19.
 */
public class PersonAccountThread extends Thread {
    public static final String TAG = "PersonAccountThread";

    private int year = 1;

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            AccountAdder.addCount(this.getName(), this.year);
            Person person = AccountAdder.getPerson();
            Log.e(TAG, "thread [" + this.getName() + "]" + "- " + person.toString());
        }
    }
}
