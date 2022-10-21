package Meeting_REST_API.demo.Controllers;

import Meeting_REST_API.demo.Entity.Meeting_Details;
import Meeting_REST_API.demo.Entity.Meeting_Entity;
import Meeting_REST_API.demo.Services.MeetingService;
import Meeting_REST_API.demo.Services.MeetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("meetings")
public class Meeting_Controller {

    Map<String, Meeting_Entity> meetings;

    @Autowired
    MeetingService meetingService;

    @GetMapping(path = {"/{meetingId}", "/{responsiblePerson}", "/descriptionMeeting"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Meeting_Entity getMeeting(@PathVariable String meetingId, String responsiblePerson, String descriptionMeeting){

        Meeting_Entity returnValue = meetingService.getMeeting(meetingId, responsiblePerson, descriptionMeeting);
        return returnValue;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Meeting_Entity createMeetings(@Valid @RequestBody Meeting_Details meetingDetails){

        Meeting_Entity returnValue = meetingService.createMeeting(meetingDetails);
        return returnValue;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteMeeting(@PathVariable String id){

        meetings.remove(id);
        return ResponseEntity.noContent().build();
    }

}
