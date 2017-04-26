package learn.rainbow.com.learndemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by liangcaihong on 2017/3/22.
 */

public class BaseAppCompatActivity extends AppCompatActivity implements View.OnClickListener {

    protected int standTextViewId;
    protected int singleTopTextViewId;
    protected int singleTaskTextViewId;
    protected int singleInstanceTextViewId;

    protected int singleTaskStartActivityforResultId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected void initView(int standTextViewId, int singleTopTextViewId, int singleTaskTextViewId, int singleInstanceTextViewId) {
        this.standTextViewId = standTextViewId;
        this.singleTopTextViewId = singleTopTextViewId;
        this.singleTaskTextViewId = singleTaskTextViewId;
        this.singleInstanceTextViewId = singleInstanceTextViewId;

        setTextView(standTextViewId, "Start Stand Activity");
        setTextView(singleTopTextViewId, "Start SingleTop Activity");
        setTextView(singleTaskTextViewId, "Start SingleTask Activity");
        setTextView(singleInstanceTextViewId, "Start SingleInstance Activity");

    }

    protected void setTextView(int viewId, String text) {
        TextView textView = (TextView) findViewById(viewId);
        if (textView != null) {
            textView.setText(text);
            textView.setOnClickListener(this);
        }
    }

    public void setSingleTaskStartActivityforResultId(int singleTaskStartActivityforResultId) {
        this.singleTaskStartActivityforResultId = singleTaskStartActivityforResultId;
        setTextView(singleTaskStartActivityforResultId,"StartforResult SingleTask Activity");
    }

    protected void startActivity(Class c) {
        Intent intent = new Intent();
        intent.setClass(this, c);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == standTextViewId) {
            startActivity(StandActivity.class);
        } else if (id == singleTopTextViewId) {
            startActivity(SingleTopActivity.class);
        } else if (id == singleTaskTextViewId) {
            startActivity(SingleTaskActivity.class);
        } else if (id == singleInstanceTextViewId) {
            startActivity(SingleInstanceActivity.class);
        }else if(id== singleTaskStartActivityforResultId){
            Intent intent = new Intent();
            intent.setClass(this,SingleTaskActivity.class);
            startActivityForResult(intent,1008);
        }
    }
}
