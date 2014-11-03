package com.adamanteusstudios.physicsfacts;

import java.util.Random;

/**
 * Created by Frank Lamar on 10/9/14.
 * This class provides a list of salutations to the user that will appear at random
 * above each fun fact.
 */
public class salutation {
    //array of salutations
    public String[] msalutations = {
            "Did you know?",
            "Wow...",
            "Can you believe...",
            "This is amazing!",
            "Guess what?",
            "I bet you didn't know...",
            "How about...",
            "This is incredible...",
            "Who knew?",
            "Check this out!"
    };

    //method to select a salutation at random
    public String getSalutation() {



        //button clicked update salutationLabel with new random salutation
        String salutation = "";

        //Randomly select a salutation
        Random randomGenerator = new Random(); //construct a new random fact generator
        int randomFact = randomGenerator.nextInt(9);
        salutation = msalutations[randomFact];

        //gives salutation back to PhysicsFactsActivity
        return salutation;
    }

}
