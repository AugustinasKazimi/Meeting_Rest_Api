package Meeting_REST_API.demo.Entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Meeting_Details {

    @NotEmpty
    private String meetingName;
    @NotEmpty
    private String responsiblePerson;
    @NotEmpty
    private String descriptionMeeting;
    @NotEmpty
    private String categoryMeeting;
    @NotEmpty
    private String typeMeeting;
    @NotEmpty
    private double startDate;
    @NotEmpty
    private double endDate;

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
