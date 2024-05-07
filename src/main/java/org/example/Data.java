package org.example;

import java.io.Serializable;

public class Data implements Serializable {
    int value;

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
