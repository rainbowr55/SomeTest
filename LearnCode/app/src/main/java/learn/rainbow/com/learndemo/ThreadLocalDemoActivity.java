package learn.rainbow.com.learndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ThreadLocalDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_local_demo);
        showResult();
    }

    private void showResult() {
        PersonAccountThread threadOne = new PersonAccountThread();
        threadOne.setYear(1);
        PersonAccountThread threadTwo = new PersonAccountThread();
        threadTwo.setYear(2);
        PersonAccountThread threadThree = new PersonAccountThread();
        threadThree.setYear(3);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }

}
