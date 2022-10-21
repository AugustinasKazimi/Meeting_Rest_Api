package Meeting_REST_API.demo.Entity;


import org.springframework.data.annotation.Id;

public class Meeting_Entity {

    private String meetingName;
    private String responsiblePerson;
    private String descriptionMeeting;
    private String categoryMeeting;
    private String typeMeeting;
    private double startDate;
    private double endDate;
    private String meetingId;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getDescriptionMeeting() {
        return descriptionMeeting;
    }

    public void setDescriptionMeeting(String descriptionMeeting) {
        this.descriptionMeeting = descriptionMeeting;
    }

    public String getCategoryMeeting() {
        return categoryMeeting;
    }

    public void setCategoryMeeting(String categoryMeeting) {
        this.categoryMeeting = categoryMeeting;
    }

    public String getTypeMeeting() {
        return typeMeeting;
    }

    public void setTypeMeeting(String typeMeeting) {
        this.typeMeeting = typeMeeting;
    }

    public double getStartDate() {
        return startDate;
    }

    public void setStartDate(double startDate) {
        this.startDate = startDate;
    }

    public double getEndDate() {
        return endDate;
    }

    public void setEndDate(double endDate) {
        this.endDate = endDate;
    }




}
