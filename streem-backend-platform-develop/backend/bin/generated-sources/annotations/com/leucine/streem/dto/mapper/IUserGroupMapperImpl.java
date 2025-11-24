package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.UserGroupDto;
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
public class IUserGroupMapperImpl implements IUserGroupMapper {

    @Override
    public UserGroupDto toDto(UserGroup e) {
        if ( e == null ) {
            return null;
        }

        UserGroupDto userGroupDto = new UserGroupDto();

        userGroupDto.setActive( e.isActive() );
        userGroupDto.setDescription( e.getDescription() );
        userGroupDto.setFacilityId( e.getFacilityId() );
        if ( e.getId() != null ) {
            userGroupDto.setId( String.valueOf( e.getId() ) );
        }
        userGroupDto.setName( e.getName() );

        return userGroupDto;
    }

    @Override
    public UserGroup toEntity(UserGroupDto d) {
        if ( d == null ) {
            return null;
        }

        UserGroup userGroup = new UserGroup();

        if ( d.getId() != null ) {
            userGroup.setId( Long.parseLong( d.getId() ) );
        }
        userGroup.setActive( d.isActive() );
        userGroup.setDescription( d.getDescription() );
        userGroup.setFacilityId( d.getFacilityId() );
        userGroup.setName( d.getName() );

        return userGroup;
    }

    @Override
    public List<UserGroupDto> toDto(List<UserGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<UserGroupDto> list1 = new ArrayList<UserGroupDto>( list.size() );
        for ( UserGroup userGroup : list ) {
            list1.add( toDto( userGroup ) );
        }

        return list1;
    }

    @Override
    public List<UserGroup> toEntity(List<UserGroupDto> list) {
        if ( list == null ) {
            return null;
        }

        List<UserGroup> list1 = new ArrayList<UserGroup>( list.size() );
        for ( UserGroupDto userGroupDto : list ) {
            list1.add( toEntity( userGroupDto ) );
        }

        return list1;
    }

    @Override
    public List<UserGroupDto> toDto(Set<UserGroup> set) {
        if ( set == null ) {
            return null;
        }

        List<UserGroupDto> list = new ArrayList<UserGroupDto>( set.size() );
        for ( UserGroup userGroup : set ) {
            list.add( toDto( userGroup ) );
        }

        return list;
    }

    @Override
    public List<UserGroup> toEntity(Set<UserGroupDto> set) {
        if ( set == null ) {
            return null;
        }

        List<UserGroup> list = new ArrayList<UserGroup>( set.size() );
        for ( UserGroupDto userGroupDto : set ) {
            list.add( toEntity( userGroupDto ) );
        }

        return list;
    }
}
