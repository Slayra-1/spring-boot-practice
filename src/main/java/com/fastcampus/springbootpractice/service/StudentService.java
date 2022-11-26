package com.fastcampus.springbootpractice.service;

import com.fastcampus.springbootpractice.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Slayra
 * @date 2022-04-01
 **/
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void printStudent(String name) {
        Student student = studentRepository.getStudent(name);
        System.out.println("찾는 학생 : " + student);
    }

    @PostConstruct
    public void init() {
        System.out.println("start Service init");
        studentRepository.enroll("jack", 15, Student.Grade.B);
        studentRepository.enroll("man", 15, Student.Grade.A);
        studentRepository.enroll("kay", 15, Student.Grade.C);
    }

}
