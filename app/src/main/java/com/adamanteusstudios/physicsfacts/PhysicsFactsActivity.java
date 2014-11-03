/*This app was created by Frank Lamar of Adamanteus Studios
* I am a mobile developer based out of Atlanta, GA.
* I hop you enjoy
*
* */
package com.adamanteusstudios.physicsfacts;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class PhysicsFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private toastBook mtoastBook = new toastBook();
    private salutation msalutation = new salutation();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_facts);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //declare view variables and assigns views from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final TextView salutationLabel = (TextView) findViewById(R.id.salutationTextView);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final Button showFactButton = (Button) findViewById(R.id.button);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //update salutation and fact when the button is clicked
                String salutation = msalutation.getSalutation();
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();





                //update the label with our dynamic fact salutation and background color
                salutationLabel.setText(salutation);
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);


            }


        };

        showFactButton.setOnClickListener(listener);

        //message for user that displays when the app is created.
        String message = mtoastBook.getToast();
        Toast openingToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        openingToast.show();
    }



}
