package com.course.courseapi.courses;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    public List<Course> findByTopicId(int topicId);

}
