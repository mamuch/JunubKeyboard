package com.dhiel.mamuc.nuerkeyboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button facebook;
    Button youtube;
    Button instagram;
    Button tutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        facebook = (Button) findViewById(R.id.btnFacebook);
        youtube = (Button) findViewById(R.id.btnYouTube);
        instagram = (Button) findViewById(R.id.btninstagram);
        tutorial = (Button) findViewById(R.id.btntutrorial);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri facebook = Uri.parse("https://www.facebook.com/enduranceproduction/?ref=page_internal");

                Intent intent = new Intent(Intent.ACTION_VIEW, facebook);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri youtube = Uri.parse("https://www.youtube.com/user/moochjohn");

                Intent intent = new Intent(Intent.ACTION_VIEW, youtube);
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri instagram = Uri.parse("https://www.instagram.com/johnlethal");

                Intent intent = new Intent(Intent.ACTION_VIEW, instagram);
                startActivity(intent);
            }
        });

        tutorial.setOnClickListener(new View.OnClickListener() {

            Uri DhielSoft = Uri.parse("https://dhielss.wordpress.com/dhiel-soft");

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, DhielSoft);
                startActivity(intent);
            }
        });
    }

}
