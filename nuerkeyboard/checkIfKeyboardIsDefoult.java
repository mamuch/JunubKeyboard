package com.dhiel.mamuc.nuerkeyboard;

/**
 * Created by Mamuch_&_Nyibol on 6/15/2017.
 */
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.inputmethod.InputMethodManager;

public abstract class checkIfKeyboardIsDefoult extends FragmentActivity {
    protected abstract void onInputMethodPicked();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mState = NONE;
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(mState == PICKING) {
            mState = CHOSEN;
        }
        else if(mState == CHOSEN) {
            onInputMethodPicked();
        }
    }

    private static final int NONE = 0;
    private static final int PICKING = 1;
    private static final int CHOSEN = 2;
    private int mState;
    protected final void pickInput() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showInputMethodPicker();
        mState = PICKING;
    }
}