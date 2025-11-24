package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.State.ParameterException;
import com.leucine.streem.dto.ParameterExceptionDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.User;
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
public class IParameterExceptionMapperImpl extends IParameterExceptionMapper {

    @Override
    public ParameterExceptionDto toDto(com.leucine.streem.model.ParameterException e) {
        if ( e == null ) {
            return null;
        }

        ParameterExceptionDto parameterExceptionDto = new ParameterExceptionDto();

        parameterExceptionDto.setChoices( e.getChoices() );
        parameterExceptionDto.setCode( e.getCode() );
        parameterExceptionDto.setCreatedAt( e.getCreatedAt() );
        parameterExceptionDto.setCreatedBy( userToUserAuditDto( e.getCreatedBy() ) );
        if ( e.getId() != null ) {
            parameterExceptionDto.setId( String.valueOf( e.getId() ) );
        }
        parameterExceptionDto.setInitiatorsReason( e.getInitiatorsReason() );
        parameterExceptionDto.setReason( e.getReason() );
        parameterExceptionDto.setReviewersReason( e.getReviewersReason() );
        parameterExceptionDto.setRuleId( e.getRuleId() );
        if ( e.getStatus() != null ) {
            parameterExceptionDto.setStatus( e.getStatus().name() );
        }
        parameterExceptionDto.setValue( e.getValue() );

        return parameterExceptionDto;
    }

    @Override
    public com.leucine.streem.model.ParameterException toEntity(ParameterExceptionDto d) {
        if ( d == null ) {
            return null;
        }

        com.leucine.streem.model.ParameterException parameterException = new com.leucine.streem.model.ParameterException();

        if ( d.getId() != null ) {
            parameterException.setId( Long.parseLong( d.getId() ) );
        }
        parameterException.setCreatedAt( d.getCreatedAt() );
        parameterException.setCreatedBy( userAuditDtoToUser( d.getCreatedBy() ) );
        parameterException.setChoices( d.getChoices() );
        parameterException.setCode( d.getCode() );
        parameterException.setInitiatorsReason( d.getInitiatorsReason() );
        parameterException.setReason( d.getReason() );
        parameterException.setReviewersReason( d.getReviewersReason() );
        parameterException.setRuleId( d.getRuleId() );
        if ( d.getStatus() != null ) {
            parameterException.setStatus( Enum.valueOf( ParameterException.class, d.getStatus() ) );
        }
        parameterException.setValue( d.getValue() );

        return parameterException;
    }

    @Override
    public List<ParameterExceptionDto> toDto(List<com.leucine.streem.model.ParameterException> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterExceptionDto> list1 = new ArrayList<ParameterExceptionDto>( list.size() );
        for ( com.leucine.streem.model.ParameterException parameterException : list ) {
            list1.add( toDto( parameterException ) );
        }

        return list1;
    }

    @Override
    public List<com.leucine.streem.model.ParameterException> toEntity(List<ParameterExceptionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<com.leucine.streem.model.ParameterException> list1 = new ArrayList<com.leucine.streem.model.ParameterException>( list.size() );
        for ( ParameterExceptionDto parameterExceptionDto : list ) {
            list1.add( toEntity( parameterExceptionDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterExceptionDto> toDto(Set<com.leucine.streem.model.ParameterException> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterExceptionDto> list = new ArrayList<ParameterExceptionDto>( set.size() );
        for ( com.leucine.streem.model.ParameterException parameterException : set ) {
            list.add( toDto( parameterException ) );
        }

        return list;
    }

    @Override
    public List<com.leucine.streem.model.ParameterException> toEntity(Set<ParameterExceptionDto> set) {
        if ( set == null ) {
            return null;
        }

        List<com.leucine.streem.model.ParameterException> list = new ArrayList<com.leucine.streem.model.ParameterException>( set.size() );
        for ( ParameterExceptionDto parameterExceptionDto : set ) {
            list.add( toEntity( parameterExceptionDto ) );
        }

        return list;
    }

    protected UserAuditDto userToUserAuditDto(User user) {
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

    protected User userAuditDtoToUser(UserAuditDto userAuditDto) {
        if ( userAuditDto == null ) {
            return null;
        }

        User user = new User();

        if ( userAuditDto.getId() != null ) {
            user.setId( Long.parseLong( userAuditDto.getId() ) );
        }
        user.setEmployeeId( userAuditDto.getEmployeeId() );
        user.setFirstName( userAuditDto.getFirstName() );
        user.setLastName( userAuditDto.getLastName() );

        return user;
    }
}
