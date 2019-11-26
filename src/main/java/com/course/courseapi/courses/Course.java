package com.course.courseapi.courses;

import com.course.courseapi.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private int id;
    private String name;
    private String location;
    private int Stars;

    @ManyToOne
    private Topic topic;
    public Course() {
    }



    public Course(int id, String name, String location, int stars, int topicId) {
        this.name = name;
        this.location = location;
        Stars = stars;
        this.id = id;
        this.topic = new Topic(topicId, "", "", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStars() {
        return Stars;
    }

    public void setStars(int stars) {
        Stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
