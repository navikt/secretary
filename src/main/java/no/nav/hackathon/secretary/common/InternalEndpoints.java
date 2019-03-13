package no.nav.hackathon.secretary.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("internal/"))
public class InternalEndpoints {

    @ResponseBody
    @RequestMapping(value = "isReady", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> isReady() {
        return new ResponseEntity<>("Ready to rock!", HttpStatus.OK);
    }

}
