package com.memorynotfound.cdi.test;

import com.memorynotfound.cdi.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;

@RunWith(WeldJUnit4Runner.class)
public class LogTest {

    @Inject
    private CourseService courseService;

    @Test
    public void testCDI() {
        courseService.registerCourse("learning jave ee");
    }

}
