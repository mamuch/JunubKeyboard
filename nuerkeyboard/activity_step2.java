package com.dhiel.mamuc.nuerkeyboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import java.util.List;

public class activity_step2 extends AppCompatActivity {

    Button BTNselect;
    Button BTNfinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        BTNselect = (Button) findViewById(R.id.btn_select);
        BTNfinish = (Button) findViewById(R.id.btn_finish);

        BTNselect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
                intent.putExtra(Settings.EXTRA_INPUT_METHOD_ID, getCurrentImeInfo().getId());
                intent.putExtra(Intent.EXTRA_TITLE, "Select Junub Keyboard");
                startActivity(intent);
            }

            public InputMethodInfo getCurrentImeInfo(){
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                List<InputMethodInfo> mInputMethodProperties = imm.getEnabledInputMethodList();

                final int n = mInputMethodProperties.size();
                for (int i = 0; i < n; i++) {
                    InputMethodInfo imeInfo = mInputMethodProperties.get(i);
                    if (imeInfo.getId().equals(Settings.Secure.getString(getContentResolver(), Settings.Secure.DEFAULT_INPUT_METHOD))) {
                        return imeInfo;
                    }
                }
                return null;
            }
        });

        BTNfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(activity_step2.this, home.class);
                startActivity(intent);
            }
        });

    }
}
