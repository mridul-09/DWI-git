package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.TrainedUsersDto;
import com.leucine.streem.model.TrainedUser;
import com.leucine.streem.model.TrainedUser.TrainedUserBuilder;
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
public class ITrainedUserMapperImpl extends ITrainedUserMapper {

    @Override
    public TrainedUsersDto toDto(TrainedUser e) {
        if ( e == null ) {
            return null;
        }

        TrainedUsersDto trainedUsersDto = new TrainedUsersDto();

        if ( e.getUserGroupId() != null ) {
            trainedUsersDto.setUserGroupId( String.valueOf( e.getUserGroupId() ) );
        }
        if ( e.getUserId() != null ) {
            trainedUsersDto.setUserId( String.valueOf( e.getUserId() ) );
        }

        return trainedUsersDto;
    }

    @Override
    public TrainedUser toEntity(TrainedUsersDto d) {
        if ( d == null ) {
            return null;
        }

        TrainedUserBuilder trainedUser = TrainedUser.builder();

        if ( d.getUserGroupId() != null ) {
            trainedUser.userGroupId( Long.parseLong( d.getUserGroupId() ) );
        }
        if ( d.getUserId() != null ) {
            trainedUser.userId( Long.parseLong( d.getUserId() ) );
        }

        return trainedUser.build();
    }

    @Override
    public List<TrainedUsersDto> toDto(List<TrainedUser> list) {
        if ( list == null ) {
            return null;
        }

        List<TrainedUsersDto> list1 = new ArrayList<TrainedUsersDto>( list.size() );
        for ( TrainedUser trainedUser : list ) {
            list1.add( toDto( trainedUser ) );
        }

        return list1;
    }

    @Override
    public List<TrainedUser> toEntity(List<TrainedUsersDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TrainedUser> list1 = new ArrayList<TrainedUser>( list.size() );
        for ( TrainedUsersDto trainedUsersDto : list ) {
            list1.add( toEntity( trainedUsersDto ) );
        }

        return list1;
    }

    @Override
    public List<TrainedUsersDto> toDto(Set<TrainedUser> set) {
        if ( set == null ) {
            return null;
        }

        List<TrainedUsersDto> list = new ArrayList<TrainedUsersDto>( set.size() );
        for ( TrainedUser trainedUser : set ) {
            list.add( toDto( trainedUser ) );
        }

        return list;
    }

    @Override
    public List<TrainedUser> toEntity(Set<TrainedUsersDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TrainedUser> list = new ArrayList<TrainedUser>( set.size() );
        for ( TrainedUsersDto trainedUsersDto : set ) {
            list.add( toEntity( trainedUsersDto ) );
        }

        return list;
    }
}
