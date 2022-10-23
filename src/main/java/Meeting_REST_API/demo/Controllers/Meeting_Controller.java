package Meeting_REST_API.demo.Controllers;

import Meeting_REST_API.demo.Entity.Meeting_Details;
import Meeting_REST_API.demo.Entity.Meeting_Entity;
import Meeting_REST_API.demo.Services.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("meetings")
public class Meeting_Controller {

    Map<String, Meeting_Entity> meetings;

    @Autowired
    MeetingService meetingService;

    @GetMapping(path = {"/{meetingId}", "/{responsiblePerson}", "/descriptionMeeting"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getMeeting(@PathVariable String meetingId, String responsiblePerson, String descriptionMeeting, String typeMeeting){

        Meeting_Entity returnValue = meetingService.getMeeting(meetingId, responsiblePerson, descriptionMeeting, typeMeeting);

        return new ResponseEntity<Meeting_Entity>(returnValue, HttpStatus.FOUND);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMeetings(@Valid @RequestBody Meeting_Details meetingDetails) {

        Meeting_Entity returnValue = meetingService.createMeeting(meetingDetails);
        String typeMeeting = meetingDetails.getTypeMeeting();
        if (!typeMeeting.contains("Live") && !typeMeeting.contains("InPerson")) {
           return new ResponseEntity<Meeting_Entity>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<Meeting_Entity>(returnValue, HttpStatus.ACCEPTED);
        }
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteMeeting(@PathVariable String id){

        Meeting_Entity returnValue = meetingService.deleteMeeting(id);
        return new ResponseEntity<Meeting_Entity>(returnValue, HttpStatus.GONE);

    }
}
