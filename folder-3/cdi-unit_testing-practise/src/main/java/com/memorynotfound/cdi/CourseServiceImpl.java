package com.memorynotfound.cdi;

import org.slf4j.Logger;
import javax.inject.Inject;

public class CourseServiceImpl implements CourseService {

    @Inject @Log
    private Logger LOG;

    @Override
    public void registerCourse(String course) {
        LOG.info("adding course: " + course);
    }

}
