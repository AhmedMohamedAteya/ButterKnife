package com.example.ButterKnife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.hi)
    TextView textView;

    @BindString(R.string.Hi)
    String hi;

    @BindColor(R.color.Black)
    int black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textView.setText(hi);
    }

    @OnClick(R.id.hi)
    public void onViewClicked()
    {
        Toast.makeText(this, hi, Toast.LENGTH_SHORT).show();
        textView.setTextColor(black);
    }
}
