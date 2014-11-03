package com.adamanteusstudios.physicsfacts;

import java.util.Random;

/**
 * Created by admin on 10/9/14.
 */
public class toastBook {

    //member variable
    String[] mtoasts = {
            "Bodies in motion remain in motion. Bodies at rest remain in bed until their mother tells them to get up.",
            "A neutron walks into a bar and asks how much for a drink. The bartender replies for you no charge",
            "Does a radioactive cat have 18 half-lives?",
            "This is too much action in reaction to political scandals. Write your congressman and ask to to repeal Newton's third law.",
            "Remember it's not the length of the vector that counts. It's how you apply the force.",
            "May the mass times acceleration be with you!",
            "Home is where your displacement is zero. ",
            "A hamburger has lower energy than a steak because it's in the ground state. ",
            "Bad lights get sentenced to prism.",
            "Don't trust atoms. They make everything up.",
            "Photons have mass. I didn't even know they were Catholic",
            "Not only is the universe stranger than we thing. It's stranger than we can think",
            "Those not shocked when the first come across quantum theory could not possible have understood it. ",
            "Energy is liberated matter. Matter is energy waiting to happen.",
            "What is the matter? Everything is matter.",
            "Science gathers knowledge faster than society gathers wisdom. ",
            "Never memorize something you can lookup. ",
            "Somewhere, something incredible is waiting to be known.",
            "Make everything as simple as possible, but not simpler.",
            "The science you don't know looks like magic."
    };


    //member method
    public String getToast(){



        String toast = "";

        //Randomly select a toast
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(19);

        toast = mtoasts[randomNumber];

        return toast;
    }
}
