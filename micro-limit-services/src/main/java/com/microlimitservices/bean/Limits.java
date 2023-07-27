package com.microlimitservices.bean;

import lombok.Data;

@Data
public class Limits {
    private int min;
    private int max;

    public Limits(int i, int j) {
        this.min=i;
        this.max=j;
    }
}
