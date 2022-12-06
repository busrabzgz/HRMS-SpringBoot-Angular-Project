package com.example.humanresources.mapper;


import com.example.humanresources.dto.requestDTO.UserBusinessInfoRequestDto;
import com.example.humanresources.dto.requestDTO.UserContactInfoRequestDto;
import com.example.humanresources.dto.requestDTO.UserPersonalInfoRequestDto;
import com.example.humanresources.dto.requestDTO.UserRequestDto;
import com.example.humanresources.dto.responseDTO.UserBusinessInfoResponseDto;
import com.example.humanresources.dto.responseDTO.UserContactInfoResponseDto;
import com.example.humanresources.dto.responseDTO.UserPersonalInfoResponseDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "UserMapperImpl" , componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", source = "id")
    User toUserFromUserRequestDto(UserRequestDto userRequestDto);

    @Mapping(target = "id", source = "id")
    UserResponseDto toUserResponseDtoFromUser(User user);

// UserPersonelInfoMapper
    @Mapping(target = "id", source = "id")
    User toUserFromUserPersonalInfoRequestDto(UserPersonalInfoRequestDto userPersonalInfoRequestDto);

    @Mapping(target = "id",source = "id")
    UserPersonalInfoResponseDto toUserPersonalResponseDtoFromUser(User user);

    //UserContactInfoMapper
    @Mapping(target = "id", source = "id")
    User toUserFromUserPContactInfoRequestDto(UserContactInfoRequestDto userContactInfoRequestDto);

    @Mapping(target = "id",source = "id")
    UserContactInfoResponseDto toUserContactResponseDtoFromUser(User user);

    // UserBusinessInfoMapper

    @Mapping(target = "id", source = "id")
    User toUserFromUserPBusinessInfoRequestDto(UserBusinessInfoRequestDto userBusinessInfoRequestDto);

    @Mapping(target = "id",source = "id")
    UserBusinessInfoResponseDto toUserBusinessResponseDtoFromUser(User user);






}
