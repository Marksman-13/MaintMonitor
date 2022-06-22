package at.marcus.maintmonitor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MaintMonitorController {

    public String message="noError";


    @GetMapping("/maintMode/")
    public ResponseEntity<String> displayMessage() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/maintMessage/{message}")
    public String writeMessage(@PathVariable("message") String message) {
        this.message=message;
        return (message.equals("0")) ? "You good g" : "Error occured. Message: "+message;
    }

}
