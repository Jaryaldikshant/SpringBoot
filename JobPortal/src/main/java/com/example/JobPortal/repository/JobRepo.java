package com.example.JobPortal.repository;

import com.example.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Senior Java Developer",
                    "We are looking for a Senior Java Developer to join our dynamic team. You will be responsible for developing high-quality applications using Java technologies, Spring Boot, and microservices architecture.",
                    5, Arrays.asList("Java", "Spring Boot", "Microservices", "MySQL", "REST API")),

            new JobPost(2, "Full Stack Developer",
                    "Join our innovative team as a Full Stack Developer. You'll work on both frontend and backend development using modern technologies and frameworks.",
                    3, Arrays.asList("React", "Node.js", "JavaScript", "MongoDB", "Express.js")),


            new JobPost(3, "iOS Developer",
                    "Join our mobile team to develop cutting-edge iOS applications. Experience with Swift and iOS SDK required.",
                    3, Arrays.asList("Swift", "iOS SDK", "Xcode", "Core Data", "UIKit")),


            new JobPost(4, "Data Scientist",
                    "Join our data team to analyze complex datasets and build machine learning models to drive business insights.",
                    4, Arrays.asList("Python", "Machine Learning", "Pandas", "TensorFlow", "SQL")),

            new JobPost(5, "AI Engineer",
                    "Looking for an AI Engineer to develop and deploy artificial intelligence solutions using deep learning and neural networks.",
                    5, Arrays.asList("Python", "PyTorch", "Deep Learning", "NLP", "Computer Vision")),

            new JobPost(6, "DevOps Engineer",
                    "We need a DevOps Engineer to manage our cloud infrastructure and implement CI/CD pipelines for seamless deployment.",
                    4, Arrays.asList("AWS", "Docker", "Kubernetes", "Jenkins", "Terraform")),

            new JobPost(7, "Cloud Architect",
                    "Join us as a Cloud Architect to design and implement scalable cloud solutions using AWS and Azure platforms.",
                    7, Arrays.asList("AWS", "Azure", "Microservices", "Serverless", "Cloud Security")),

            new JobPost(8, "QA Engineer",
                    "We're looking for a detail-oriented QA Engineer to ensure the quality of our software products through comprehensive testing.",
                    3, Arrays.asList("Selenium", "TestNG", "API Testing", "Automation", "Agile")),


            new JobPost(9, "UI/UX Designer",
                    "We need a creative UI/UX Designer to create intuitive and visually appealing user interfaces for our web and mobile applications.",
                    3, Arrays.asList("Figma", "Adobe XD", "Sketch", "Prototyping", "User Research")),


            new JobPost(10, "Security Engineer",
                    "Join our security team to protect our systems and data from cyber threats. Experience with security frameworks required.",
                    4, Arrays.asList("Cybersecurity", "Penetration Testing", "SIEM", "Firewall", "Incident Response")),


            new JobPost(11, "Blockchain Developer",
                    "Join our blockchain team to develop decentralized applications and smart contracts using Ethereum and Solidity.",
                    3, Arrays.asList("Blockchain", "Solidity", "Ethereum", "Web3", "Smart Contracts"))

    ));

    public List<JobPost> getAllJobs(){
        return  jobs;
    }


    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
