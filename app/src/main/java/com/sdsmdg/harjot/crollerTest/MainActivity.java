package com.sdsmdg.harjot.crollerTest;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView txt;
    private Croller croller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
       txt = findViewById(R.id.textView);
        croller = findViewById(R.id.croller);




//        croller.setIndicatorWidth(10);
       croller.setBackCircleColor(Color.parseColor("#EDEDED"));
//        croller.setMainCircleColor(Color.WHITE);
          croller.setMax(24);
          croller.setIsContinuous(true);
        croller.setStartOffset(35);
//        croller.setLabelColor(Color.BLACK);
//        croller.setProgressPrimaryColor(Color.parseColor("#0B3C49"));
//        croller.setIndicatorColor(Color.parseColor("#0B3C49"));
//        croller.setProgressSecondaryColor(Color.parseColor("#EEEEEE"));
//        croller.setProgressRadius(380);
        croller.setBackCircleRadius(300);
          croller.setEnabled(true);

croller.setOnProgressChangedListener(new Croller.onProgressChangedListener() {
    @Override
    public void onProgressChanged(int progress) {
        String str = Integer.toString(progress);
        txt.setText(str);
    }
});
        croller.setOnCrollerChangeListener(new OnCrollerChangeListener() {

            @Override
            public void onProgressChanged(Croller croller, int progress) {

            }

            @Override
            public void onStartTrackingTouch(Croller croller) {


                Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(Croller croller) {
                Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
