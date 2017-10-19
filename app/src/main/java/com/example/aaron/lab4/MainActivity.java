package com.example.aaron.lab4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity
{
    private TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tvId);

        NumberPicker np = (NumberPicker) findViewById(R.id.npId);

        np.setOnValueChangedListener(new OnValueChangeListener()
        {
            public void onValueChange(NumberPicker picker, int oldVal,
                                      int newVal)
            {
                tv.setText(String.valueOf(newVal));
            }
        });

        np.setMaxValue(100);
        np.setMinValue(0);
    }
}