package com.github.gavinmeyers.base;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by gameyers on 20/03/16.
 */
public class VertexTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testVertexCreation() throws Exception {
        Vertex vertex = new Vertex();
        Assert.assertNotNull("Alas! Vertex creation is not successful...", vertex);
    }

    @Test
    public void testNameAVertex() throws Exception {
        Vertex vertexA = new Vertex("A");

        Assert.assertEquals("Vertex Naming not successful", "A", vertexA.getName());
    }

    @Ignore
    public void testEdgesEmanatingFromVertex() throws Exception {
        Vertex vertexA = new Vertex("A");
        vertexA.hasEdges();
        vertexA.outDegree();
        vertexA.inDegree();
        vertexA.totalDegree();
        vertexA.outEdges();
    }

    @Test
    public void testIfVertexHasEdges() throws Exception {
        Vertex vertexA = new Vertex("A");
        Assert.assertFalse(vertexA.hasEdges());
        vertexA.addEdge(new Edge());
        Assert.assertTrue(vertexA.hasEdges());
    }

    @Test
    public void testAddEdgeToVertex() throws Exception {
        Vertex vertexA = new Vertex("A");
        vertexA.addEdge(new Edge("A RelationShip"));
        Assert.assertEquals("Not the right edge","A RelationShip",vertexA.getEdge("A RelationShip"));
    }
}
