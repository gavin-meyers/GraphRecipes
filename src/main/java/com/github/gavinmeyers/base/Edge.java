package com.github.gavinmeyers.base;

import java.awt.font.FontRenderContext;

/**
 * Created by gameyers on 20/03/16.
 */
public class Edge {

    private String name;

    public Edge() {
    }

    public Edge(String s) {
        this();
        this.name = s;
    }

    public String getName() {
        return this.name;
    }
}
