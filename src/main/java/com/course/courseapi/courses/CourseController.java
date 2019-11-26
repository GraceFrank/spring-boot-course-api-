package com.course.courseapi.courses;

import com.course.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable int id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable Integer id){
        return courseService.getCourseById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable int topicId){
            course.setTopic(new Topic(topicId, "", "", 0));
        courseService.addCourse(course);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateTopicById(@RequestBody Course course, @PathVariable int topicId){
        course.setTopic(new Topic(topicId, "", "", 0));
        courseService.updateCourseById(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteTopicById(@PathVariable int id){
        courseService.deleteCourseById(id);
        }
    }

