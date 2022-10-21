package Meeting_REST_API.demo.Services;

import Meeting_REST_API.demo.Entity.Meeting_Details;
import Meeting_REST_API.demo.Entity.Meeting_Entity;

public interface MeetingService {

    Meeting_Entity createMeeting (Meeting_Details meetingDetails);

    Meeting_Entity getMeeting (String meetingId, String responsiblePerson, String descriptionMeeting);
}
