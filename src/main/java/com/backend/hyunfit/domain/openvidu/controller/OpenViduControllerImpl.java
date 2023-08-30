package com.backend.hyunfit.domain.openvidu.controller;

import com.backend.hyunfit.domain.openvidu.dto.OpenViduDTO;
import com.backend.hyunfit.domain.openvidu.service.OpenViduService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.openvidu.java.client.OpenViduHttpException;
import io.openvidu.java.client.OpenViduJavaClientException;

@CrossOrigin(origins = "http://localhost:5173", methods = RequestMethod.POST)
@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/openvidu")
public class OpenViduControllerImpl implements OpenViduContoller{
    private final OpenViduService ovService;

    @PostMapping("sessions")
    public ResponseEntity<OpenViduDTO> intializeSession(@RequestBody String ptSeq)
            throws OpenViduJavaClientException, OpenViduHttpException {
        OpenViduDTO ovDTO = new OpenViduDTO(ptSeq,null,null);
        ovDTO = ovService.createSession(ovDTO);
        return new ResponseEntity<>(ovDTO, HttpStatus.OK);
    }

    @PostMapping("sessions/{sessionId}/connections")
    public ResponseEntity<OpenViduDTO> createConnection(@PathVariable("sessionId") String ptSeq)
            throws OpenViduJavaClientException, OpenViduHttpException {
        OpenViduDTO ovDTO = new OpenViduDTO(ptSeq,null,null);
        ovDTO = ovService.createToken(ovDTO);
        if (ovDTO.getToken() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(ovDTO, HttpStatus.OK);
        }
    }
}
