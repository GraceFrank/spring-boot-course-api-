package com.course.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topicList =  new ArrayList<>(Arrays.asList(
            new Topic(1, "Eko", "VI", 5),
            new Topic(2, "Sheraton", "Lekki", 5),
            new Topic(3, "Admiralty", "Ajah", 1)
    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopicById(int id){
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopicById(int id, Topic topic) {
       topicRepository.save(topic);
    }

    public void deleteTopicById(int id) {
        topicRepository.deleteById(id);
    }
}

