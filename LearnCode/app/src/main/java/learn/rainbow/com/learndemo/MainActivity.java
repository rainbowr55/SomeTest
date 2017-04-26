package learn.rainbow.com.learndemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import learn.rainbow.com.learndemo.view.ViewTouchLearnActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mThreadLocalDemo;
    private TextView mViewTouchDemo;
    private TextView mSchemeDemo;
    private TextView mSingleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initLister();
    }

    private void initLister() {
        mViewTouchDemo.setOnClickListener(this);
        mThreadLocalDemo.setOnClickListener(this);
        mSchemeDemo.setOnClickListener(this);
        mSingleInstance.setOnClickListener(this);
    }

    private void initView() {
        mViewTouchDemo = (TextView) findViewById(R.id.view_touch_tv);
        mThreadLocalDemo = (TextView) findViewById(R.id.thread_local_tv);
        mSchemeDemo = (TextView) findViewById(R.id.view_scheme_tv);
        mSingleInstance = (TextView) findViewById(R.id.view_activity_mode_tv);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.view_touch_tv) {
            startActivity(ViewTouchLearnActivity.class);
        } else if (id == R.id.thread_local_tv) {
            startActivity(ThreadLocalDemoActivity.class);
        } else if (id == R.id.view_scheme_tv) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("gomeplusapp://m.gomeplus.com/index.html"));
            if (intent != null)
                startActivity(intent);
//            startActivity(SchemeTestActivity.class);
        } else if (id == R.id.view_activity_mode_tv) {
            startActivity(StandActivity.class);
        }
    }

    private void startActivity(Class c) {
        Intent intent = new Intent();
        intent.setClass(this, c);
        startActivity(intent);
    }


}
