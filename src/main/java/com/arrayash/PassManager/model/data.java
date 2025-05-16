package com.arrayash.PassManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Component
public class data {

    @Id
    private int passId;
    private String attendeeName;
    private String attendeeEmail;
    private String meetingName;
    private LocalDate passIssuedDate;
    private String passStatus;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public data(){} 

    public data(int passId, String attendeeName, String attendeeEmail, String meetingName, LocalDate passIssuedDate, String passStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.passId = passId;
        this.attendeeName = attendeeName;
        this.attendeeEmail = attendeeEmail;
        this.meetingName = meetingName;
        this.passIssuedDate = passIssuedDate;
        this.passStatus = passStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getPassId() {
        return passId;
    }

    public void setPassId(int passId) {
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
