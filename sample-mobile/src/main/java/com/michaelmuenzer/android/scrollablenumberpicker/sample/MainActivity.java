package com.michaelmuenzer.android.scrollablenumberpicker.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPicker;
import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPickerListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ScrollableNumberPicker verticalNumberPicker = (ScrollableNumberPicker) findViewById(R.id.number_picker_vertical);
        verticalNumberPicker.setListener(new ScrollableNumberPickerListener() {
            @Override
            public void onNumberPicked(int value) {
                if(value == verticalNumberPicker.getMaxValue()) {
                    Toast.makeText(MainActivity.this, getString(R.string.msg_toast_max_value), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
