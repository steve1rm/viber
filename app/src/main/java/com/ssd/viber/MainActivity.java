package com.ssd.viber;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Boolean mChecked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

/*
        final ImageView ivMute = (ImageView)findViewById(R.id.ivMute);
        ivMute.setTag(mChecked);
*/

        final ImageView ivMute = (ImageView)findViewById(R.id.ivMute);
        final ImageView ivPause = (ImageView)findViewById(R.id.ivPause);
        final ImageView ivSpeaker = (ImageView)findViewById(R.id.ivSpeaker);
        final ImageView ivSwitchGsm = (ImageView)findViewById(R.id.ivSwitch);

        final TextView tvMute = (TextView)findViewById(R.id.tvMute);
        final View tblContact = findViewById(R.id.tbMute);
        ivMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mChecked) {
                    ivMute.setImageDrawable(getResources().getDrawable(R.drawable.ic_mic_off_black_48dp));
                    tvMute.setTextColor(getResources().getColor(android.R.color.black));
                    tblContact.setBackgroundColor(getResources().getColor(R.color.colorChecked));
                    mChecked = false;
                }
                else {
                    ivMute.setImageDrawable(getResources().getDrawable(R.drawable.ic_mic_off_white_48dp));
                    tvMute.setTextColor(getResources().getColor(android.R.color.white));
                    if(Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
                        tblContact.setBackground(getResources().getDrawable(R.drawable.outer_border));
                    }
                    mChecked = true;
                }
            }
        });

        ivMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ivPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ivSpeaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ivSwitchGsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
