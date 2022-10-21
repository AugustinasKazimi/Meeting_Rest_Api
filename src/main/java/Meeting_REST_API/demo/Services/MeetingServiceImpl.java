package Meeting_REST_API.demo.Services;

import Meeting_REST_API.demo.Entity.Meeting_Details;
import Meeting_REST_API.demo.Entity.Meeting_Entity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class MeetingServiceImpl implements MeetingService{

    Map<String, Meeting_Entity> meetings;

    @Override
    public Meeting_Entity createMeeting(Meeting_Details meetingDetails) {
        Meeting_Entity returnValue = new Meeting_Entity();
        returnValue.setMeetingName(meetingDetails.getMeetingName());
        returnValue.setCategoryMeeting(meetingDetails.getCategoryMeeting());
        returnValue.setDescriptionMeeting(meetingDetails.getDescriptionMeeting());
        returnValue.setTypeMeeting(meetingDetails.getTypeMeeting());
        returnValue.setResponsiblePerson(meetingDetails.getResponsiblePerson());
        returnValue.setStartDate(meetingDetails.getStartDate());
        returnValue.setEndDate(meetingDetails.getEndDate());

        String meetingId = UUID.randomUUID().toString();
        returnValue.setMeetingId(meetingId);

        String responsiblePerson = meetingDetails.getResponsiblePerson();
        returnValue.setResponsiblePerson(responsiblePerson);

        String descriptionMeeting = meetingDetails.getDescriptionMeeting();
        returnValue.setDescriptionMeeting(descriptionMeeting);

        if(meetings == null) meetings = new HashMap<>();
        meetings.put(meetingId, returnValue);
        meetings.put(responsiblePerson, returnValue);
        meetings.put(descriptionMeeting, returnValue);

        return returnValue;
    }

    @Override
    public Meeting_Entity getMeeting(String meetingId, String responsiblePerson, String descriptionMeeting) {
        if(meetings.containsKey(meetingId)){
            return meetings.get(meetingId);
        }
        if(meetings.containsKey(responsiblePerson)){
            return meetings.get(responsiblePerson);
        }
        if(meetings.containsKey(descriptionMeeting)){
            return meetings.get(descriptionMeeting);
        }
        else{
            return new ResponseEntity<Meeting_Entity>(HttpStatus.NO_CONTENT).getBody();
        }
    }
}
