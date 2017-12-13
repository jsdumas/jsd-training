package io.jsd.training.java.designpattern.chapitres.chap7.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void singleInstance() {
        assertNotNull(Singleton.getInstance());
        assertTrue(Singleton.getInstance() instanceof Singleton);
        assertEquals(Singleton.getInstance(), Singleton
                .getInstance());
    }

}
