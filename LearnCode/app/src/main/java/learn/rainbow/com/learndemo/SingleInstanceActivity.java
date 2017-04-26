package learn.rainbow.com.learndemo;

import android.os.Bundle;
import android.util.Log;

public class SingleInstanceActivity extends BaseAppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instatce);
        initView(R.id.stand_tv, R.id.single_top_tv, R.id.single_task_tv, R.id.single_instance_tv);
        Log.e("test", "SingleInstanceActivity TaskId=" + this.getTaskId());
    }

    @Override
    protected void onDestroy() {
        Log.e("test", "SingleInstanceActivity onDestroy");
        super.onDestroy();
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
