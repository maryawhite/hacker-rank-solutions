package com.mchindwhite;

import java.io.IOException;

import static org.junit.Assert.*;

public class PrimeNumberProblemTest {

    @org.junit.Test
    public void checkForPrime() throws IOException {
        PrimeNumberProblem myprob = new PrimeNumberProblem();
        assertEquals("prime", myprob.checkForPrime("13"));
        assertEquals("prime", myprob.checkForPrime("3"));
        assertEquals("not prime", myprob.checkForPrime("4"));



    }
}