package com.example.humanresources.controller;

import com.example.humanresources.dto.requestDTO.CreateAdvanceRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateAdvanceRequestDto;

import com.example.humanresources.dto.responseDTO.AdvanceResponseDto;
import com.example.humanresources.services.AdvanceService;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/advance")
public class AdvanceController {

    public AdvanceController(AdvanceService advanceService) {
        this.advanceService = advanceService;
    }

    private  final AdvanceService advanceService;


    @PostMapping("/create")
    public ResponseEntity<AdvanceResponseDto> createAdvance( @RequestBody CreateAdvanceRequestDto createAdvanceRequestDto) throws Exception {
        return ResponseEntity.ok(advanceService.createAdvance(createAdvanceRequestDto));
    }

    @PutMapping("/update")
    public ResponseEntity<AdvanceResponseDto> updateAdvance(@RequestBody UpdateAdvanceRequestDto updateAdvanceRequestDto) throws Exception{
        return ResponseEntity.ok(advanceService.updateAdvance(updateAdvanceRequestDto));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public  void deleteUser(@PathVariable Long id){
        advanceService.deleteAdvanceById(id);
    }


}
