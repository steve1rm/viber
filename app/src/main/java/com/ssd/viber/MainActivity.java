package com.ssd.viber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Boolean mChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageView ivContacts = (ImageView)findViewById(R.id.ivContacts);
        ivContacts.setTag(mChecked);

        final ImageView ivMute = (ImageView)findViewById(R.id.ivMute);
        final ImageView ivPause = (ImageView)findViewById(R.id.ivPause);
        final ImageView ivSpeaker = (ImageView)findViewById(R.id.ivSpeaker);
        final ImageView ivSwitchGsm = (ImageView)findViewById(R.id.ivSwitch);

        final TextView tvContacts = (TextView)findViewById(R.id.tvContacts);
        final View tblContact = findViewById(R.id.tbContacts);
        ivContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mChecked) {
                    ivContacts.setImageDrawable(getResources().getDrawable(R.drawable.ic_people_black_48dp));
                    tvContacts.setTextColor(getResources().getColor(android.R.color.black));
                    tblContact.setBackgroundColor(getResources().getColor(R.color.colorChecked));
                    mChecked = false;
                }
                else {
                    ivContacts.setImageDrawable(getResources().getDrawable(R.drawable.ic_people_white_48dp));
                    tvContacts.setTextColor(getResources().getColor(android.R.color.white));
                    tblContact.setBackgroundColor(getResources().getColor(R.color.colorDialer));
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
