package com.example.humanresources.controller;

import com.example.humanresources.dto.requestDTO.CreateUserRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateUserRequestDto;
import com.example.humanresources.dto.responseDTO.*;
import com.example.humanresources.services.UserService;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;


// TODO: Requiedconstravtion ile allconstraction ile farkina bak
//TODO: user yerine client den dto almam ve donmem lazim
@RestController
@RequestMapping("/api/users")

public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserResponseDto> createUser( @RequestBody CreateUserRequestDto createUserRequestDto) throws Exception {
        return ResponseEntity.ok(userService.createUser(createUserRequestDto));
    }

    @PutMapping("/update")
    public ResponseEntity<UserResponseDto> updateUser( @RequestBody UpdateUserRequestDto updateUserRequestDto) throws Exception{
        return ResponseEntity.ok(userService.updateUser(updateUserRequestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUserResponseDtoById(id));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public  void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserResponseDto>> getAllUsers(Pageable pageable){
        return  ResponseEntity.ok(userService.getAllUsers(pageable));
    }

    @GetMapping("/expense")
    public ResponseEntity<List<ExpenseResponseDto>> getUserExpense(Long id){
        return  ResponseEntity.ok(userService.getUserExpense(id));
    }

    @GetMapping("/leave")
    public ResponseEntity<List<LeaveResponseDto>> getUserLeave(Long id){
        return ResponseEntity.ok(userService.getUserLeave(id));
    }

    @GetMapping("/advance")
    public ResponseEntity<List<AdvanceResponseDto>> getUserAdvance(Long id){
        return ResponseEntity.ok(userService.getUserAdvance(id));
    }

    @GetMapping("/overtimeWork")
    public ResponseEntity<List<OvertimeWorkResponseDto>> getUserOvertimeWork(Long id){
        return ResponseEntity.ok(userService.getUserOvertimeWork(id));
    }












}
