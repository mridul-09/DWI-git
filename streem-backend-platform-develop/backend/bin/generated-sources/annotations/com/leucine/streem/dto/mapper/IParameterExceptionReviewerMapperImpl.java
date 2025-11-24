package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.OrganisationDto;
import com.leucine.streem.dto.ParameterExceptionReviewerDto;
import com.leucine.streem.dto.UserDto;
import com.leucine.streem.dto.UserGroupDto;
import com.leucine.streem.model.Organisation;
import com.leucine.streem.model.ParameterExceptionReviewer;
import com.leucine.streem.model.User;
import com.leucine.streem.model.UserGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IParameterExceptionReviewerMapperImpl implements IParameterExceptionReviewerMapper {

    @Override
    public ParameterExceptionReviewerDto toDto(ParameterExceptionReviewer e) {
        if ( e == null ) {
            return null;
        }

        ParameterExceptionReviewerDto parameterExceptionReviewerDto = new ParameterExceptionReviewerDto();

        parameterExceptionReviewerDto.setActionPerformed( e.isActionPerformed() );
        parameterExceptionReviewerDto.setModifiedAt( e.getModifiedAt() );
        parameterExceptionReviewerDto.setUser( userToUserDto( e.getUser() ) );
        parameterExceptionReviewerDto.setUserGroup( userGroupToUserGroupDto( e.getUserGroup() ) );

        return parameterExceptionReviewerDto;
    }

    @Override
    public ParameterExceptionReviewer toEntity(ParameterExceptionReviewerDto d) {
        if ( d == null ) {
            return null;
        }

        ParameterExceptionReviewer parameterExceptionReviewer = new ParameterExceptionReviewer();

        parameterExceptionReviewer.setModifiedAt( d.getModifiedAt() );
        parameterExceptionReviewer.setActionPerformed( d.isActionPerformed() );
        parameterExceptionReviewer.setUser( userDtoToUser( d.getUser() ) );
        parameterExceptionReviewer.setUserGroup( userGroupDtoToUserGroup( d.getUserGroup() ) );

        return parameterExceptionReviewer;
    }

    @Override
    public List<ParameterExceptionReviewerDto> toDto(List<ParameterExceptionReviewer> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterExceptionReviewerDto> list1 = new ArrayList<ParameterExceptionReviewerDto>( list.size() );
        for ( ParameterExceptionReviewer parameterExceptionReviewer : list ) {
            list1.add( toDto( parameterExceptionReviewer ) );
        }

        return list1;
    }

    @Override
    public List<ParameterExceptionReviewer> toEntity(List<ParameterExceptionReviewerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterExceptionReviewer> list1 = new ArrayList<ParameterExceptionReviewer>( list.size() );
        for ( ParameterExceptionReviewerDto parameterExceptionReviewerDto : list ) {
            list1.add( toEntity( parameterExceptionReviewerDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterExceptionReviewerDto> toDto(Set<ParameterExceptionReviewer> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterExceptionReviewerDto> list = new ArrayList<ParameterExceptionReviewerDto>( set.size() );
        for ( ParameterExceptionReviewer parameterExceptionReviewer : set ) {
            list.add( toDto( parameterExceptionReviewer ) );
        }

        return list;
    }

    @Override
    public List<ParameterExceptionReviewer> toEntity(Set<ParameterExceptionReviewerDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterExceptionReviewer> list = new ArrayList<ParameterExceptionReviewer>( set.size() );
        for ( ParameterExceptionReviewerDto parameterExceptionReviewerDto : set ) {
            list.add( toEntity( parameterExceptionReviewerDto ) );
        }

        return list;
    }

    protected OrganisationDto organisationToOrganisationDto(Organisation organisation) {
        if ( organisation == null ) {
            return null;
        }

        OrganisationDto organisationDto = new OrganisationDto();

        if ( organisation.getId() != null ) {
            organisationDto.setId( String.valueOf( organisation.getId() ) );
        }
        organisationDto.setName( organisation.getName() );

        return organisationDto;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setArchived( user.isArchived() );
        userDto.setEmail( user.getEmail() );
        userDto.setEmployeeId( user.getEmployeeId() );
        userDto.setFirstName( user.getFirstName() );
        if ( user.getId() != null ) {
            userDto.setId( String.valueOf( user.getId() ) );
        }
        userDto.setLastName( user.getLastName() );
        userDto.setOrganisation( organisationToOrganisationDto( user.getOrganisation() ) );
        userDto.setUsername( user.getUsername() );

        return userDto;
    }

    protected UserGroupDto userGroupToUserGroupDto(UserGroup userGroup) {
        if ( userGroup == null ) {
            return null;
        }

        UserGroupDto userGroupDto = new UserGroupDto();

        userGroupDto.setActive( userGroup.isActive() );
        userGroupDto.setDescription( userGroup.getDescription() );
        userGroupDto.setFacilityId( userGroup.getFacilityId() );
        if ( userGroup.getId() != null ) {
            userGroupDto.setId( String.valueOf( userGroup.getId() ) );
        }
        userGroupDto.setName( userGroup.getName() );

        return userGroupDto;
    }

    protected Organisation organisationDtoToOrganisation(OrganisationDto organisationDto) {
        if ( organisationDto == null ) {
            return null;
        }

        Organisation organisation = new Organisation();

        if ( organisationDto.getId() != null ) {
            organisation.setId( Long.parseLong( organisationDto.getId() ) );
        }
        organisation.setName( organisationDto.getName() );

        return organisation;
    }

    protected User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        if ( userDto.getId() != null ) {
            user.setId( Long.parseLong( userDto.getId() ) );
        }
        user.setArchived( userDto.isArchived() );
        user.setEmail( userDto.getEmail() );
        user.setEmployeeId( userDto.getEmployeeId() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        user.setOrganisation( organisationDtoToOrganisation( userDto.getOrganisation() ) );
        user.setUsername( userDto.getUsername() );

        return user;
    }

    protected UserGroup userGroupDtoToUserGroup(UserGroupDto userGroupDto) {
        if ( userGroupDto == null ) {
            return null;
        }

        UserGroup userGroup = new UserGroup();

        if ( userGroupDto.getId() != null ) {
            userGroup.setId( Long.parseLong( userGroupDto.getId() ) );
        }
        userGroup.setActive( userGroupDto.isActive() );
        userGroup.setDescription( userGroupDto.getDescription() );
        userGroup.setFacilityId( userGroupDto.getFacilityId() );
        userGroup.setName( userGroupDto.getName() );

        return userGroup;
    }
}
