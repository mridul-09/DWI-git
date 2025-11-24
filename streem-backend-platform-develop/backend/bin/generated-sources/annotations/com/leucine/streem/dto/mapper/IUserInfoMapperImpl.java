package com.leucine.streem.dto.mapper;

import com.leucine.streem.collections.changelogs.UserInfo;
import com.leucine.streem.model.User;
import com.leucine.streem.model.helper.PrincipalUser;
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
public class IUserInfoMapperImpl implements IUserInfoMapper {

    @Override
    public UserInfo toDto(User e) {
        if ( e == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setEmployeeId( e.getEmployeeId() );
        userInfo.setFirstName( e.getFirstName() );
        if ( e.getId() != null ) {
            userInfo.setId( String.valueOf( e.getId() ) );
        }
        userInfo.setLastName( e.getLastName() );

        return userInfo;
    }

    @Override
    public User toEntity(UserInfo d) {
        if ( d == null ) {
            return null;
        }

        User user = new User();

        if ( d.getId() != null ) {
            user.setId( Long.parseLong( d.getId() ) );
        }
        user.setEmployeeId( d.getEmployeeId() );
        user.setFirstName( d.getFirstName() );
        user.setLastName( d.getLastName() );

        return user;
    }

    @Override
    public List<UserInfo> toDto(List<User> list) {
        if ( list == null ) {
            return null;
        }

        List<UserInfo> list1 = new ArrayList<UserInfo>( list.size() );
        for ( User user : list ) {
            list1.add( toDto( user ) );
        }

        return list1;
    }

    @Override
    public List<User> toEntity(List<UserInfo> list) {
        if ( list == null ) {
            return null;
        }

        List<User> list1 = new ArrayList<User>( list.size() );
        for ( UserInfo userInfo : list ) {
            list1.add( toEntity( userInfo ) );
        }

        return list1;
    }

    @Override
    public List<UserInfo> toDto(Set<User> set) {
        if ( set == null ) {
            return null;
        }

        List<UserInfo> list = new ArrayList<UserInfo>( set.size() );
        for ( User user : set ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntity(Set<UserInfo> set) {
        if ( set == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( set.size() );
        for ( UserInfo userInfo : set ) {
            list.add( toEntity( userInfo ) );
        }

        return list;
    }

    @Override
    public UserInfo toUserInfo(PrincipalUser principalUser) {
        if ( principalUser == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setEmployeeId( principalUser.getEmployeeId() );
        userInfo.setFirstName( principalUser.getFirstName() );
        if ( principalUser.getId() != null ) {
            userInfo.setId( String.valueOf( principalUser.getId() ) );
        }
        userInfo.setLastName( principalUser.getLastName() );

        return userInfo;
    }
}
