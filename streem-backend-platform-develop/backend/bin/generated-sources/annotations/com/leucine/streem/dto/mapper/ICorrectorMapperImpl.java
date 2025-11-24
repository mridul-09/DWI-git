package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.CorrectorDto;
import com.leucine.streem.dto.OrganisationDto;
import com.leucine.streem.dto.UserDto;
import com.leucine.streem.dto.UserGroupDto;
import com.leucine.streem.model.Corrector;
import com.leucine.streem.model.Organisation;
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
public class ICorrectorMapperImpl implements ICorrectorMapper {

    @Override
    public CorrectorDto toDto(Corrector e) {
        if ( e == null ) {
            return null;
        }

        CorrectorDto correctorDto = new CorrectorDto();

        correctorDto.setActionPerformed( e.isActionPerformed() );
        correctorDto.setModifiedAt( e.getModifiedAt() );
        correctorDto.setUser( userToUserDto( e.getUser() ) );
        correctorDto.setUserGroup( userGroupToUserGroupDto( e.getUserGroup() ) );

        return correctorDto;
    }

    @Override
    public Corrector toEntity(CorrectorDto d) {
        if ( d == null ) {
            return null;
        }

        Corrector corrector = new Corrector();

        corrector.setModifiedAt( d.getModifiedAt() );
        corrector.setActionPerformed( d.isActionPerformed() );
        corrector.setUser( userDtoToUser( d.getUser() ) );
        corrector.setUserGroup( userGroupDtoToUserGroup( d.getUserGroup() ) );

        return corrector;
    }

    @Override
    public List<CorrectorDto> toDto(List<Corrector> list) {
        if ( list == null ) {
            return null;
        }

        List<CorrectorDto> list1 = new ArrayList<CorrectorDto>( list.size() );
        for ( Corrector corrector : list ) {
            list1.add( toDto( corrector ) );
        }

        return list1;
    }

    @Override
    public List<Corrector> toEntity(List<CorrectorDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Corrector> list1 = new ArrayList<Corrector>( list.size() );
        for ( CorrectorDto correctorDto : list ) {
            list1.add( toEntity( correctorDto ) );
        }

        return list1;
    }

    @Override
    public List<CorrectorDto> toDto(Set<Corrector> set) {
        if ( set == null ) {
            return null;
        }

        List<CorrectorDto> list = new ArrayList<CorrectorDto>( set.size() );
        for ( Corrector corrector : set ) {
            list.add( toDto( corrector ) );
        }

        return list;
    }

    @Override
    public List<Corrector> toEntity(Set<CorrectorDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Corrector> list = new ArrayList<Corrector>( set.size() );
        for ( CorrectorDto correctorDto : set ) {
            list.add( toEntity( correctorDto ) );
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
