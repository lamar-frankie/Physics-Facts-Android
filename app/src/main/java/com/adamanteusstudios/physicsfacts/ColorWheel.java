package com.adamanteusstudios.physicsfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Frank Lamar on 10/12/14.
 * This class provides background colors to the PhysicsFactsActivity
 */
public class ColorWheel {
    //member variables
    public String[] mColorWheel = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //method that selects a color from mColorWheel array at random
    public int getColor() {



        //button clicked update background color with new random color
        String color = "";

        //Randomly select a color
        Random randomGenerator = new Random(); //construct a new random fact generator
        int randomFact = randomGenerator.nextInt(6);
        color = mColorWheel[randomFact];
        int colorAsInt = Color.parseColor(color);

        //returns int value of color to PhysicsFactsActivity
        return colorAsInt;
    }
}
