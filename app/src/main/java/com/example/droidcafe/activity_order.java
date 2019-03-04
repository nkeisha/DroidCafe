package com.example.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class activity_order extends AppCompatActivity {
    private static String TAG_ACTIVITY =
            activity_order.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.sameday:

                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.same_day_messenger_service));

            case R.id.pickup:

                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.pick_up));
                break;

            case R.id.nextday:

                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.pick_up));
                break;

            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_chosen));
                break;


        }
    }
}

