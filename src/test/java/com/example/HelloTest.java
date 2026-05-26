package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    void defaultGreeting() {
        assertEquals("Hello, World!", Hello.greet());
    }

    @Test
    void namedGreeting() {
        assertEquals("Hello, Alice!", Hello.greet("Alice"));
    }

    @Test
    void emptyString() {
        assertEquals("Hello, !", Hello.greet(""));
    }
}
