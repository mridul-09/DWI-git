package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.AssigneeSignOffDto;
import com.leucine.streem.dto.FacilityDto;
import com.leucine.streem.dto.OrganisationDto;
import com.leucine.streem.dto.RoleDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.dto.UserDto;
import com.leucine.streem.model.Organisation;
import com.leucine.streem.model.User;
import com.leucine.streem.model.helper.PrincipalUser;
import com.leucine.streem.model.helper.PrincipalUser.PrincipalUserBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IUserMapperImpl implements IUserMapper {

    @Override
    public UserDto toDto(User e) {
        if ( e == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setArchived( e.isArchived() );
        userDto.setEmail( e.getEmail() );
        userDto.setEmployeeId( e.getEmployeeId() );
        userDto.setFirstName( e.getFirstName() );
        if ( e.getId() != null ) {
            userDto.setId( String.valueOf( e.getId() ) );
        }
        userDto.setLastName( e.getLastName() );
        userDto.setOrganisation( organisationToOrganisationDto( e.getOrganisation() ) );
        userDto.setUsername( e.getUsername() );

        return userDto;
    }

    @Override
    public User toEntity(UserDto d) {
        if ( d == null ) {
            return null;
        }

        User user = new User();

        if ( d.getId() != null ) {
            user.setId( Long.parseLong( d.getId() ) );
        }
        user.setArchived( d.isArchived() );
        user.setEmail( d.getEmail() );
        user.setEmployeeId( d.getEmployeeId() );
        user.setFirstName( d.getFirstName() );
        user.setLastName( d.getLastName() );
        user.setOrganisation( organisationDtoToOrganisation( d.getOrganisation() ) );
        user.setUsername( d.getUsername() );

        return user;
    }

    @Override
    public List<UserDto> toDto(List<User> list) {
        if ( list == null ) {
            return null;
        }

        List<UserDto> list1 = new ArrayList<UserDto>( list.size() );
        for ( User user : list ) {
            list1.add( toDto( user ) );
        }

        return list1;
    }

    @Override
    public List<User> toEntity(List<UserDto> list) {
        if ( list == null ) {
            return null;
        }

        List<User> list1 = new ArrayList<User>( list.size() );
        for ( UserDto userDto : list ) {
            list1.add( toEntity( userDto ) );
        }

        return list1;
    }

    @Override
    public List<UserDto> toDto(Set<User> set) {
        if ( set == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( set.size() );
        for ( User user : set ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntity(Set<UserDto> set) {
        if ( set == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( set.size() );
        for ( UserDto userDto : set ) {
            list.add( toEntity( userDto ) );
        }

        return list;
    }

    @Override
    public UserAuditDto toUserAuditDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        userAuditDto.employeeId( user.getEmployeeId() );
        userAuditDto.firstName( user.getFirstName() );
        if ( user.getId() != null ) {
            userAuditDto.id( String.valueOf( user.getId() ) );
        }
        userAuditDto.lastName( user.getLastName() );

        return userAuditDto.build();
    }

    @Override
    public UserAuditDto toUserAuditDto(PrincipalUser principalUser) {
        if ( principalUser == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        userAuditDto.employeeId( principalUser.getEmployeeId() );
        userAuditDto.firstName( principalUser.getFirstName() );
        if ( principalUser.getId() != null ) {
            userAuditDto.id( String.valueOf( principalUser.getId() ) );
        }
        userAuditDto.lastName( principalUser.getLastName() );

        return userAuditDto.build();
    }

    @Override
    public UserDto toDto(PrincipalUser principalUser) {
        if ( principalUser == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setArchived( principalUser.isArchived() );
        userDto.setEmail( principalUser.getEmail() );
        userDto.setEmployeeId( principalUser.getEmployeeId() );
        List<FacilityDto> list = principalUser.getFacilities();
        if ( list != null ) {
            userDto.setFacilities( new ArrayList<FacilityDto>( list ) );
        }
        userDto.setFirstName( principalUser.getFirstName() );
        if ( principalUser.getId() != null ) {
            userDto.setId( String.valueOf( principalUser.getId() ) );
        }
        userDto.setLastName( principalUser.getLastName() );
        userDto.setOrganisation( principalUser.getOrganisation() );
        List<RoleDto> list1 = principalUser.getRoles();
        if ( list1 != null ) {
            userDto.setRoles( new ArrayList<RoleDto>( list1 ) );
        }
        userDto.setState( principalUser.getState() );
        userDto.setToken( principalUser.getToken() );
        userDto.setUsername( principalUser.getUsername() );

        return userDto;
    }

    @Override
    public AssigneeSignOffDto toAssigneeSignOffDto(User user) {
        if ( user == null ) {
            return null;
        }

        AssigneeSignOffDto assigneeSignOffDto = new AssigneeSignOffDto();

        assigneeSignOffDto.setEmail( user.getEmail() );
        assigneeSignOffDto.setEmployeeId( user.getEmployeeId() );
        assigneeSignOffDto.setFirstName( user.getFirstName() );
        if ( user.getId() != null ) {
            assigneeSignOffDto.setId( String.valueOf( user.getId() ) );
        }
        assigneeSignOffDto.setLastName( user.getLastName() );

        return assigneeSignOffDto;
    }

    @Override
    public PrincipalUser toPrincipalUser(User user) {
        if ( user == null ) {
            return null;
        }

        PrincipalUserBuilder principalUser = PrincipalUser.builder();

        principalUser.archived( user.isArchived() );
        principalUser.email( user.getEmail() );
        principalUser.employeeId( user.getEmployeeId() );
        principalUser.firstName( user.getFirstName() );
        principalUser.id( user.getId() );
        principalUser.idAsString( user.getIdAsString() );
        principalUser.lastName( user.getLastName() );
        principalUser.organisationId( user.getOrganisationId() );
        principalUser.username( user.getUsername() );

        return principalUser.build();
    }

    @Override
    public PrincipalUser clone(PrincipalUser principalUser) {
        if ( principalUser == null ) {
            return null;
        }

        PrincipalUserBuilder principalUser1 = PrincipalUser.builder();

        principalUser1.archived( principalUser.isArchived() );
        principalUser1.currentFacilityId( principalUser.getCurrentFacilityId() );
        principalUser1.email( principalUser.getEmail() );
        principalUser1.employeeId( principalUser.getEmployeeId() );
        List<FacilityDto> list = principalUser.getFacilities();
        if ( list != null ) {
            principalUser1.facilities( new ArrayList<FacilityDto>( list ) );
        }
        principalUser1.firstName( principalUser.getFirstName() );
        principalUser1.id( principalUser.getId() );
        principalUser1.idAsString( principalUser.getIdAsString() );
        principalUser1.lastName( principalUser.getLastName() );
        principalUser1.organisation( principalUser.getOrganisation() );
        principalUser1.organisationId( principalUser.getOrganisationId() );
        Set<String> set = principalUser.getRoleNames();
        if ( set != null ) {
            principalUser1.roleNames( new HashSet<String>( set ) );
        }
        List<RoleDto> list1 = principalUser.getRoles();
        if ( list1 != null ) {
            principalUser1.roles( new ArrayList<RoleDto>( list1 ) );
        }
        principalUser1.serviceId( principalUser.getServiceId() );
        principalUser1.state( principalUser.getState() );
        principalUser1.token( principalUser.getToken() );
        principalUser1.userType( principalUser.getUserType() );
        principalUser1.username( principalUser.getUsername() );

        return principalUser1.build();
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
}
