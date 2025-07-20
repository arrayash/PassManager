package com.arrayash.PassManager.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passId;
    private String attendeeName;
    private String attendeeEmail;
    private String meetingName;
    private LocalDate passIssuedDate;
    private String passStatus;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalDateTime createdAt;


    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalDateTime updatedAt;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setPassIssuedDate(LocalDate passIssuedDate) {
        this.passIssuedDate = passIssuedDate;
    }

    @Version
    private Integer version;

    public data(){}

    public data(Long passId, String attendeeName, String attendeeEmail, String meetingName, LocalDate passIssuedDate, String passStatus, LocalDateTime createdAt, LocalDateTime updatedAt,Integer version) {
        this.passId = passId;
        this.attendeeName = attendeeName;
        this.attendeeEmail = attendeeEmail;
        this.meetingName = meetingName;
        this.passIssuedDate = passIssuedDate;
        this.passStatus = passStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version=version;
    }


    public Long getPassId() {
        return passId;
    }

    public void setPassId(Long passId) {
        this.passId = passId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    public void setAttendeeEmail(String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public LocalDate getPassIssuedDate() {

        return passIssuedDate;
    }

    public void setPassIssuedDate() {


    }

    public String getPassStatus() {
        return passStatus;
    }

    public void setPassStatus(String passStatus) {
        this.passStatus = passStatus;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {


    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
