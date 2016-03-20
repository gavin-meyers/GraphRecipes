package com.github.gavinmeyers.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gameyers on 20/03/16.
 */
public class Vertex {

    private String name;

    private List<Edge> outEdgeList;

    public Vertex() {
        this.outEdgeList = new ArrayList<Edge>();
    }

    public Vertex(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void addEdge() {

    }

    public void addEdge(Edge edge) {
        if (this.outEdgeList != null && edge != null) {
            this.outEdgeList.add(edge);
        }
    }

    public String getEdge(String s) {
        String edgeName = "";
        for(Edge e: outEdgeList){
            if(e.getName().equals(s))
                edgeName = e.getName();
                break;
        }
        return edgeName;
    }

    public boolean hasEdges() {
        boolean hasEdges = false;
        if(this.outEdgeList != null && this.outEdgeList.size() > 0)
            hasEdges = true;
        return hasEdges;
    }

    public int outDegree() {
        return 0;
    }

    public int inDegree() {
        return 0;
    }

    public int totalDegree() {
        return this.inDegree() + this.outDegree();
    }

    public void outEdges() {
    }
}

