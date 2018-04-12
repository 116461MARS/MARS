package com.mars.scottmcclure.mars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.firebase.ui.auth.data.remote.ProfileMerger;

public class DashboardActivity extends AppCompatActivity {

    //Buttons
    private Button mRecallRoster;
    private Button mCreateRecall;
    private Button mRecallStatus;
    private Button mUpdateProfile;
    private Button mEmergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mUpdateProfile = findViewById(R.id.updateProfileBtn);
        mUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent updateProfile = new Intent(DashboardActivity.this,
                        UpdateProfileActivity.class);
                startActivity(updateProfile);
            }
        });

        mRecallRoster = findViewById(R.id.recallRosterBtn);
        mRecallRoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recallRoster = new Intent(DashboardActivity.this,
                        recallRosterActivity.class);
                startActivity(recallRoster);
            }
        });

        mCreateRecall = findViewById(R.id.createRecallBtn);
        mCreateRecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createRecall = new Intent(DashboardActivity.this,
                        CreateRecallActivity.class);
                startActivity(createRecall);
            }
        });

        mRecallStatus = findViewById(R.id.recallStatusBtn);
        mRecallStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recallStatus = new Intent(DashboardActivity.this,
                        RecallStatusActivity.class);
                startActivity(recallStatus);
            }
        });

        mEmergency = findViewById(R.id.emergencyBtn);
        mEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emergency = new Intent(DashboardActivity.this,
                        EmergencyActivity.class);
                startActivity(emergency);
            }
        });
    }
}
