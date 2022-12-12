package com.example.humanresources.controller;

import com.example.humanresources.dto.requestDTO.CreateAdvanceRequestDto;
import com.example.humanresources.dto.responseDTO.AdvanceResponseDto;

import com.example.humanresources.services.AdvanceService;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@NoArgsConstructor
@RestController
@RequestMapping("/api/advance")
public class AdvanceController {

    public AdvanceController(AdvanceService advanceService) {
        this.advanceService = advanceService;
    }

    private AdvanceService advanceService;


    @PostMapping("/create")
    public ResponseEntity<AdvanceResponseDto> createAdvance(@Valid @RequestBody CreateAdvanceRequestDto createAdvanceRequestDto) throws Exception {
        return ResponseEntity.ok(advanceService.createAdvance(createAdvanceRequestDto));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public  void deleteUser(@PathVariable Long id){
        advanceService.deleteAdvanceId(id);
    }


}
