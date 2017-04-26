package learn.rainbow.com.learndemo;

import android.os.Bundle;
import android.util.Log;

public class SingleTaskActivity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        Log.e("test", "SingleTaskActivity TaskId=" + this.getTaskId());
        initView(R.id.stand_tv, R.id.single_top_tv, R.id.single_task_tv, R.id.single_instance_tv);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("test", "onPause");
    }
}
