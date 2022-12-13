package com.example.humanresources.controller;



import com.example.humanresources.dto.requestDTO.CreateLeaveRequestDto;

import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.services.LeaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leave")
public class LeaveController {
    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    private final LeaveService leaveService;

    @PostMapping("/create")
    public ResponseEntity<LeaveResponseDto> createLeave(@RequestBody CreateLeaveRequestDto createLeaveRequestDto) throws Exception {
        return ResponseEntity.ok(leaveService.createLeave(createLeaveRequestDto));
    }
    @PutMapping("/update")
    public ResponseEntity<LeaveResponseDto> updateLeave( @RequestBody UpdateLeaveRequestDto updateLeaveRequestDto) throws Exception{
        return ResponseEntity.ok(leaveService.updateLeave(updateLeaveRequestDto));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteLeave(@PathVariable Long id) {
        leaveService.deleteLeaveById(id);
    }





}
