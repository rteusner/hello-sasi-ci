package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    void defaultGreeting() {
        assertEquals("Hallo, Welt!", Hello.greet());
    }

    @Test
    void namedGreeting() {
        assertEquals("Hallo, Alice!", Hello.greet("Alice"));
    }

    @Test
    void emptyString() {
        assertEquals("Hallo, !", Hello.greet(""));
    }
}
