package com.xyzcorp.instructor;

import java.util.Objects;

public interface CaesarShift {
    static String encode(String string, int shift) {
        Objects.requireNonNull(string, "String must not be null");
        if (string.isEmpty()) return string;
        return String.valueOf((char) (string.charAt(0) + shift));
    }
}
