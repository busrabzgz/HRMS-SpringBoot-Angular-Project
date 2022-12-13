package com.example.humanresources.controller;



import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateOvertimeWorkRequestDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;
import com.example.humanresources.services.OvertimeWorkService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/overtime")
public class OvertimeWorkController {
    public OvertimeWorkController(OvertimeWorkService overtimeWorkService) {
        this.overtimeWorkService = overtimeWorkService;
    }

    private OvertimeWorkService overtimeWorkService;

    @PostMapping("/create")
    public ResponseEntity<OvertimeWorkResponseDto> createOvertimeWork(@RequestBody CreateOvertimeWorkRequestDto createOvertimeWorkRequestDto) throws Exception {
        return ResponseEntity.ok(overtimeWorkService.createOvertimeWork(createOvertimeWorkRequestDto));
    }

    @PutMapping("/update")
    public ResponseEntity<OvertimeWorkResponseDto> updateOvertimeWork( @RequestBody UpdateOvertimeWorkRequestDto updateOvertimeWorkRequestDto) throws Exception{
        return ResponseEntity.ok(overtimeWorkService.updateOvertimeWork(updateOvertimeWorkRequestDto));
    }

}
