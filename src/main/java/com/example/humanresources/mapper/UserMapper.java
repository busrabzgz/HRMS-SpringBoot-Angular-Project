package com.example.humanresources.mapper;


import com.example.humanresources.dto.requestDTO.CreateUserRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateUserRequestDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUserFromCreateUserRequestDto(CreateUserRequestDto userRequestDto);

    @InheritInverseConfiguration
    @Mapping(source = "userId",target = "id")
    User toUserFromUpdateUserRequestDto(UpdateUserRequestDto userRequestDto);

    UserResponseDto toUserResponseDtoFromUser(User user);






}
