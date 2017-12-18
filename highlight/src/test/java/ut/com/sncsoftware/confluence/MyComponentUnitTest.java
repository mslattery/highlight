package ut.com.sncsoftware.confluence;

import org.junit.Test;
import com.sncsoftware.confluence.api.MyPluginComponent;
import com.sncsoftware.confluence.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}