package com.backend.hyunfit.domain.rtn.controller;

import com.backend.hyunfit.domain.rtn.dto.RoutineDTO;
import com.backend.hyunfit.domain.rtn.service.RoutineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/routines")
public class RoutineControllerImpl implements RoutineController {
    private final RoutineService routineService;

    @Override
    @GetMapping("")
    public ResponseEntity<List<RoutineDTO>> selectAllRoutineFilteredSearch(RoutineDTO routineDTO) {
        List<RoutineDTO> routines = routineService.selectAllRoutineFilteredSearch(routineDTO);
        return ResponseEntity.ok(routines);
    }

    @Override
    @PostMapping("")
    public ResponseEntity<RoutineDTO> createOneRoutine(@RequestBody RoutineDTO routineDTO) {
        routineService.insertOneRoutine(routineDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(routineDTO);
    }
    @Override
    @GetMapping("/{rtnSeq}")
    public ResponseEntity<RoutineDTO> getOneRoutineByRtnSeqWithExercise(@PathVariable long rtnSeq) {
        RoutineDTO routine = routineService.getOneRoutineByRtnSeqWithExercise(rtnSeq);
        return ResponseEntity.ok(routine);
    }
    @Override
    @DeleteMapping("/{rtnSeq}")
    public ResponseEntity<RoutineDTO> deleteOneRoutineByRtnSeq(@PathVariable long rtnSeq) {

        routineService.deleteOneRoutineByRtnSeq(rtnSeq);
        return ResponseEntity.noContent().build();

    }


}
