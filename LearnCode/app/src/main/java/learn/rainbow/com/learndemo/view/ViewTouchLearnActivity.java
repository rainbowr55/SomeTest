package learn.rainbow.com.learndemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import learn.rainbow.com.learndemo.R;

public class ViewTouchLearnActivity extends AppCompatActivity {

    private TouchTextView mTouchTextView;
    private TouchImageView mTouchImageView;
    private String TAG = "TouchTextView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_touch_learn);
        initView();
    }

    private void initView() {
        mTouchTextView = (TouchTextView) findViewById(R.id.learn_touch_tv);
        mTouchTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();

                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "onTouch ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "onTouch ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "onTouch ACTION_UP");
                        break;
                    default:
                        break;
                }

                return false;
            }
        });
        mTouchImageView = (TouchImageView)findViewById(R.id.learn_touch_iv);
        mTouchImageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();

                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "onTouch ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "onTouch ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "onTouch ACTION_UP");
                        break;
                    default:
                        break;
                }

                /**
                 * 我们都知道如果给一个控件注册了touch事件，
                 * 每次点击它的时候都会触发一系列的ACTION_DOWN，ACTION_MOVE，ACTION_UP等事件。
                 * 这里需要注意，如果你在执行ACTION_DOWN的时候返回了false，
                 * 后面一系列其它的action就不会再得到执行了。
                 * 简单的说，就是当dispatchTouchEvent在进行事件分发的时候，
                 * 只有前一个action返回true，才会触发后一个action
                 *
                 * 简言之：ontouch()方法中,返回false,会进入到ontouchevent()方法中,
                 * 如果当前控件是可点击的,则会恒返回true,
                 * 所以后面的ACTIONMOVE与ACTIONUP可以得到执行;如果为不可点击控件,则返回false,结束事件分发。
                 */
                return false;
            }
        });
    }
}
