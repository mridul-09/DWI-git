package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.OrganisationDto;
import com.leucine.streem.dto.ReviewerDto;
import com.leucine.streem.dto.UserDto;
import com.leucine.streem.dto.UserGroupDto;
import com.leucine.streem.model.Organisation;
import com.leucine.streem.model.Reviewer;
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
public class IReviewerMapperImpl implements IReviewerMapper {

    @Override
    public ReviewerDto toDto(Reviewer e) {
        if ( e == null ) {
            return null;
        }

        ReviewerDto reviewerDto = new ReviewerDto();

        reviewerDto.setActionPerformed( e.isActionPerformed() );
        reviewerDto.setModifiedAt( e.getModifiedAt() );
        reviewerDto.setUser( userToUserDto( e.getUser() ) );
        reviewerDto.setUserGroup( userGroupToUserGroupDto( e.getUserGroup() ) );

        return reviewerDto;
    }

    @Override
    public Reviewer toEntity(ReviewerDto d) {
        if ( d == null ) {
            return null;
        }

        Reviewer reviewer = new Reviewer();

        reviewer.setModifiedAt( d.getModifiedAt() );
        reviewer.setActionPerformed( d.isActionPerformed() );
        reviewer.setUser( userDtoToUser( d.getUser() ) );
        reviewer.setUserGroup( userGroupDtoToUserGroup( d.getUserGroup() ) );

        return reviewer;
    }

    @Override
    public List<ReviewerDto> toDto(List<Reviewer> list) {
        if ( list == null ) {
            return null;
        }

        List<ReviewerDto> list1 = new ArrayList<ReviewerDto>( list.size() );
        for ( Reviewer reviewer : list ) {
            list1.add( toDto( reviewer ) );
        }

        return list1;
    }

    @Override
    public List<Reviewer> toEntity(List<ReviewerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Reviewer> list1 = new ArrayList<Reviewer>( list.size() );
        for ( ReviewerDto reviewerDto : list ) {
            list1.add( toEntity( reviewerDto ) );
        }

        return list1;
    }

    @Override
    public List<ReviewerDto> toDto(Set<Reviewer> set) {
        if ( set == null ) {
            return null;
        }

        List<ReviewerDto> list = new ArrayList<ReviewerDto>( set.size() );
        for ( Reviewer reviewer : set ) {
            list.add( toDto( reviewer ) );
        }

        return list;
    }

    @Override
    public List<Reviewer> toEntity(Set<ReviewerDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Reviewer> list = new ArrayList<Reviewer>( set.size() );
        for ( ReviewerDto reviewerDto : set ) {
            list.add( toEntity( reviewerDto ) );
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
