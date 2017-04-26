package learn.rainbow.com.learndemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SingleTopActivity extends BaseAppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        Log.e("test", "SingleTopActivity TaskId=" + this.getTaskId());
        initView(R.id.stand_tv, R.id.single_top_tv, R.id.single_task_tv, R.id.single_instance_tv);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", "onStop");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        Log.e("test", "SingleTopActivity onNewIntent");
        super.onNewIntent(intent);
    }


}
