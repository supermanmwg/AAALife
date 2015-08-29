package com.example.supermanmwg.aaalife;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.sax.TextElementListener;
import android.widget.TextView;

/**
 * Created by supermanmwg on 15-8-28.
 */
public class ReceiveActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.receive_layout);
        TextView mTextView = (TextView) findViewById(R.id.receive_text);
        mTextView.setText(getIntent().getStringExtra("receive"));
    }
}
