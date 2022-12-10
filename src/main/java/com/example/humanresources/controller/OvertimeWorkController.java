package com.example.humanresources.controller;



import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateOvertimeWorkRequestDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;
import com.example.humanresources.services.OvertimeWorkService;
import jakarta.validation.Valid;
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
    public ResponseEntity<OvertimeWorkResponseDto> createOvertimeWork(@Valid @RequestBody CreateOvertimeWorkRequestDto createOvertimeWorkRequestDto) throws Exception {
        return ResponseEntity.ok(overtimeWorkService.createOvertimeWork(createOvertimeWorkRequestDto));
    }

    @PutMapping("/update")
    public ResponseEntity<OvertimeWorkResponseDto> updateOvertimeWork(@Valid @RequestBody UpdateOvertimeWorkRequestDto updateOvertimeWorkRequestDto) throws Exception{
        return ResponseEntity.ok(overtimeWorkService.updateOvertimeWork(updateOvertimeWorkRequestDto));
    }

}
