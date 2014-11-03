package com.adamanteusstudios.physicsfacts;

import java.util.Random;

/**
 * Created by Frank Lamar on 10/9/14.
 * This class provides facts that will be displayed at random when the button is clicked
 */
public class FactBook {

    //member variables
    public String[] mfacts = {
            "The study of physics was originally called natural philosophy.",
            "Physics is the study of matter and energy and the interactions between the two.",
            "Because of gravity, a 150 lb person would only weight 24.9 lbs on the moon; the same as a box of paper.",
            "Electric eels produce around 500 volts of electricity. That’s enough energy to stop a human heart. ",
            "The first Nobel Prize in physics was awarded to Wilhelm Conrad Rontgen in 1901 for his discovery of x-rays.",
            "The speed of sound is 767 miles per hour. That means it would take just 3 hours for a sound wave to travel from New York City to Los Angeles.",
            "The speed of light is over 800,000 times faster than the speed of sound. That’s why you see lightning strikes before you hear thunder.",
            "The speed of light is 670,616,629 miles per hour, but it doesn’t always travel that fast. ",
            "It takes light from the sun 8 minutes and 20 seconds to reach earth. ",
            "Uranus is the only planet in our solar system that rolls on its side like a barrel.",
            "Venus is the only planet in our solar system that spins counter clockwise.",
            "The Earth’s surface is spinning at about 1,000 miles per hour, but most people never feel it.",
            "The Earth is flying around the sun at about 67,062 miles per hour, but most people never feel it. ",
            "There is no evidence that Benjamin Franklin ever conducted his famous kite experiment, other than a second hand account that was written 15 years after the experiment supposedly took place. ",
            "Light behaves like both a particle and a wave. ",
            "Scientists have been able to “freeze” light in place for an entire minute. ",
            "Traveling at 70 miles per hour, a police car can out-run it’s own siren. ",
            "Energy from food is measured in joules or calories. ",
            "The potential energy of electricity is measured in volts.",
            "Lightning bolts travel at around 130,000 miles per hour. ",
            "Sir Isaac Newton’s first law of motion states that an object in motion will stay in motion until acted upon by another force. This is known as inertia.",
            "Darkness is simply the absence of light. Therefore, it is impossible to calculate the speed of dark. ",
            "Light waves travel slower through liquids, than through gases. ",
            "Sound waves travel slower through liquids, than through gases.",
            "The sky on Earth appears blue because blue light is filtered from the sun’s light and scattered in all directions by tiny droplets of water in the Earth’s atmosphere. ",
            "Light travels in a straight line unless it is reflected, bent, or scattered by some object. ",
            "Blue light has the shortest wave length of all light in the visible spectrum.",
            "Red light has the longest wave length of all light in the visible spectrum.",
            "Percy Spencer discovered microwaves by accident when they melted a candy bar in in his pocket.",
            "The light that humans can see with the naked eye is called the visible spectrum. Other animals can see beyond our visible spectrum of light. ",
            "Black holes are not actually black. They glow across the infrared, visible and ultraviolet spectrums.",
            "The faster an object travels the more that object weighs.",
            "All of the planets, solar systems, and galaxies we have observed in space only account for about 2% of the mass of the universe.",
            "Some physicists believe there is more than one universe. This is called the multi-verse theory.",
            "Quantum physics deals with physical phenomena at the nanoscopic scale.",
            "Atoms are made up of mostly empty space. If totally compressed, all of humanity would occupy the space of a sugar cube.",
            "Weight decreases as you move away from the Earth at a rate equal to the distance you have traveled squared.",
            "The moon is closer to the Earth’s surface than the center of the Earth.",
            "Mass and inertia are essentially the same thing.",
            "In 1609, Johannes Kepler discovered that planets move in elliptical orbits.",
            "Greek philosopher Aristotle was one of the first to discuss why objects fall to Earth.",
            "In 1905, Albert Einstein proved that mass and energy are equivalent.",
            "Robert Hooke’s law shows that elastic materials stretch in proportion to the force applied to them.",
            "The ideal gas law proves that the temperature, volume, and pressure of a gas are all linked.",
            "Entropy was defined by German physicist Rudolf Clausius in 1850.",
            "-273.15 degrees Celsius or Absolute zero is the temperature at which all thermal motion ceases.",
            "The Kelvin temperature scale is named after Irish physicist and engineer William Thomson 1st Baron Kelvin.",
            "Chaos theory was developed by American meteorologist Edward Lorenz.",
            "Chaos theory states that small changes can have major ramifications later on. It is also known as the butterfly effect.",
            "How planes fly and how blood travels through veins are both defined by Bernoulli’s equation.",
            "In 1672, Sir Isaac Newton passed white light through a glass prism and showed that a rainbow of hues was embedded within white light.",
            "Huygens’ principle predicts the ripple behavior of waves by treating every point on the wave as a new ripple source.",
            "Light travels at different speeds through gases and liquids. That is why a straw appears bent when you look at it through a drinking glass.",
            "Refracting light through grape juice allows winemakers to determine how much alcohol it will contain after it becomes wine.",
            "Bernoulli’s equation allowed Scipione Riva-Rocci to create a noninvasive way to measure blood pressure.",
            "In 1956, X-ray crystallography was used to observe the double helix structure of DNA.",
            "Sound waves emanating from a source approaching you get mashed together and sound higher pitched.",
            "Sound waves emanating from a source distancing its self from you get stretched and sound lower pitched.",
            "The Doppler effect can be used to measure the speed of a vehicle based on how the pitch of the engine rises or falls.",
            "The Doppler effect applies to both light and sound waves.",
            "The first Doppler redshift in stars was observed by Hippolyte Fizeau in 1848.",
            "Electricity can either be static as a fixed distribution or flow as a current.",
            "Lightning is a generated form of static electricity.",
            "Metals conduct electricity because they allow electrons to flow easily within them.",
            "Insulators work because they make it difficult for electrons to flow within them.",
            "Lightning strikes the Earth’s surface 100 times every second. That is over 8 million times per day.",
            "The voltage of an electric current is equal to product of the current and the resistance.",
            "British physicist Michael Faraday discovered electromagnetic induction in 1830. This led to the creation of the electric motor.",
            "Both electric and magnetic fields are manifestations of the phenomenon known as the electromagnetic wave.",
            "The color a heated object glows is determined by how hot the object is. Red is the coolest and white is the hottest.",
            "The photoelectric effect occurs when uv light shines on copper and produces electricity.",
            "Massive objects cause a distortion in space-time which is felt as gravity. The is the theory of general relativity.",
            "Dark matter is invisible to the human eye. It can only be detected by its gravitational influence on it’s surroundings.",
            "Physicists estimate that dark matter makes up roughly 85% of all matter in the universe.",
            "Dark matter in non-interactive with light, but can interact with ordinary matter.",
            "Most humans can feel acceleration and deceleration, but cannot sense constant velocity.",
            "Velocity can be found by taking the slope of a distance versus time graph.",
            "Both electrons and protons have equal amounts of charge.",
            "Outside of a magnet, the magnetic field points North to South and inside a magnet, the magnetic field points South to North.",
            "Your left hand is more likely to gather negative charge while your right hand is more likely to gather positive charge.",
            "Blue lasers have more energy, shorter frequency and higher frequency than red lasers.",
            "The electromagnetic spectrum from lowest energy to highest energy is: Radio waves, Infrared, Visible Light, Ultraviolet, X-rays, Gamma Rays.",
            "Temperature is actually a measure of the average kinetic energy of molecules.",
            "A ball rolled off of a horizontal table will take the same amount of time to hit the ground as a ball dropped from the same height.",
            "All resistors in parallel have equal voltage regardless of their resistance.",
            "All resistors in series have equal current regardless of their resistance.",
            "Erwin Scrodinger did not actually kill any cats (as far as anyone knows). Scrodinger’s cat was a thought experiment.",
            "Werner Heisenberg was a physicist not a chemist.",
            "British Physicist James Chadwick discovered the neutron in 1932.",
            "The fictional starship fuel “antimatter” has actually been created in the lab by physicists at CERN.",
            "Anti-protons are protons that carry a negative charge instead of a positive charge.",
            "Nuclear fission is the splitting of an atom. Nuclear fusion is the combining of two atoms into one.",
            "String Theory treats particles as vibrating loops of a string instead of solid blobs.",
            "The James Webb space telescope is designed to be powerful enough to observe lightwaves from the Big Bang.",
            "Edwin was the first to discern that all galaxies are moving away from each other and that the further away a galaxy is the faster it is moving.",
            "Tune your TV to any channel that it doesn’t receive a signal and about 1% of the static you see comes from the Big Bang.",
            "Physics attempts to describe how everything was created in a random quantum fluctuation out of nothing.",
            "The universe is made up of mostly dark matter and dark energy. Physicists really don’t know what either of them is.",
            "In order to make an apple pie from scratch you must first create the universe. ~ Carl Sagan.",
            "The best thing about science is that its true whether you believe it or not. ~ Neal Degrasse Tyson.",
            "Energy cannot be either created nor destroyed, it simply changes from one state to another. "
    };

    //method selects fact at random and returns it to PhysicsFactsActivityß
    public String getFact(){

        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //construct a new random fact generator
        int randomFact = randomGenerator.nextInt(100);
        fact = mfacts[randomFact];

        return fact;
    }
}
