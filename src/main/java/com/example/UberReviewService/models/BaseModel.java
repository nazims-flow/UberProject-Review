package com.example.UberReviewService.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @Id  // this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

        @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate  // this annotation tells spring that only handle this for the object creation
    protected Date createdAt;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // this annotation tells spring that only handle this for the object update
    protected Date updatedAt;
}
