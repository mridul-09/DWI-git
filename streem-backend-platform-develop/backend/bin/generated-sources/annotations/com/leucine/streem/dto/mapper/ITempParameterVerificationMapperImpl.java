package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.State.ParameterExecution;
import com.leucine.streem.constant.State.ParameterVerification;
import com.leucine.streem.constant.Type.VerificationType;
import com.leucine.streem.dto.ParameterVerificationDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.TempParameterVerification;
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
public class ITempParameterVerificationMapperImpl extends ITempParameterVerificationMapper {

    @Override
    public TempParameterVerification toEntity(ParameterVerificationDto d) {
        if ( d == null ) {
            return null;
        }

        TempParameterVerification tempParameterVerification = new TempParameterVerification();

        if ( d.getId() != null ) {
            tempParameterVerification.setId( Long.parseLong( d.getId() ) );
        }
        if ( d.getCreatedAt() != null ) {
            tempParameterVerification.setCreatedAt( Long.parseLong( d.getCreatedAt() ) );
        }
        tempParameterVerification.setCreatedBy( userAuditDtoToUser( d.getCreatedBy() ) );
        if ( d.getModifiedAt() != null ) {
            tempParameterVerification.setModifiedAt( Long.parseLong( d.getModifiedAt() ) );
        }
        tempParameterVerification.setModifiedBy( userAuditDtoToUser( d.getModifiedBy() ) );
        tempParameterVerification.setBulk( d.isBulk() );
        tempParameterVerification.setComments( d.getComments() );
        if ( d.getVerificationStatus() != null ) {
            tempParameterVerification.setVerificationStatus( Enum.valueOf( ParameterVerification.class, d.getVerificationStatus() ) );
        }
        if ( d.getVerificationType() != null ) {
            tempParameterVerification.setVerificationType( Enum.valueOf( VerificationType.class, d.getVerificationType() ) );
        }

        return tempParameterVerification;
    }

    @Override
    public List<ParameterVerificationDto> toDto(List<TempParameterVerification> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterVerificationDto> list1 = new ArrayList<ParameterVerificationDto>( list.size() );
        for ( TempParameterVerification tempParameterVerification : list ) {
            list1.add( toDto( tempParameterVerification ) );
        }

        return list1;
    }

    @Override
    public List<TempParameterVerification> toEntity(List<ParameterVerificationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TempParameterVerification> list1 = new ArrayList<TempParameterVerification>( list.size() );
        for ( ParameterVerificationDto parameterVerificationDto : list ) {
            list1.add( toEntity( parameterVerificationDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterVerificationDto> toDto(Set<TempParameterVerification> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterVerificationDto> list = new ArrayList<ParameterVerificationDto>( set.size() );
        for ( TempParameterVerification tempParameterVerification : set ) {
            list.add( toDto( tempParameterVerification ) );
        }

        return list;
    }

    @Override
    public List<TempParameterVerification> toEntity(Set<ParameterVerificationDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TempParameterVerification> list = new ArrayList<TempParameterVerification>( set.size() );
        for ( ParameterVerificationDto parameterVerificationDto : set ) {
            list.add( toEntity( parameterVerificationDto ) );
        }

        return list;
    }

    @Override
    public ParameterVerificationDto toDto(TempParameterVerification tempParameterVerification) {
        if ( tempParameterVerification == null ) {
            return null;
        }

        ParameterVerificationDto parameterVerificationDto = new ParameterVerificationDto();

        parameterVerificationDto.setRequestedTo( userToUserAuditDto( tempParameterVerification.getUser() ) );
        parameterVerificationDto.setEvaluationState( tempParameterVerificationTempParameterValueState( tempParameterVerification ) );
        parameterVerificationDto.setBulk( tempParameterVerification.isBulk() );
        parameterVerificationDto.setComments( tempParameterVerification.getComments() );
        if ( tempParameterVerification.getCreatedAt() != null ) {
            parameterVerificationDto.setCreatedAt( String.valueOf( tempParameterVerification.getCreatedAt() ) );
        }
        parameterVerificationDto.setCreatedBy( userToUserAuditDto( tempParameterVerification.getCreatedBy() ) );
        if ( tempParameterVerification.getId() != null ) {
            parameterVerificationDto.setId( String.valueOf( tempParameterVerification.getId() ) );
        }
        if ( tempParameterVerification.getModifiedAt() != null ) {
            parameterVerificationDto.setModifiedAt( String.valueOf( tempParameterVerification.getModifiedAt() ) );
        }
        parameterVerificationDto.setModifiedBy( userToUserAuditDto( tempParameterVerification.getModifiedBy() ) );
        if ( tempParameterVerification.getVerificationStatus() != null ) {
            parameterVerificationDto.setVerificationStatus( tempParameterVerification.getVerificationStatus().name() );
        }
        if ( tempParameterVerification.getVerificationType() != null ) {
            parameterVerificationDto.setVerificationType( tempParameterVerification.getVerificationType().name() );
        }

        return parameterVerificationDto;
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

    private ParameterExecution tempParameterVerificationTempParameterValueState(TempParameterVerification tempParameterVerification) {
        if ( tempParameterVerification == null ) {
            return null;
        }
        TempParameterValue tempParameterValue = tempParameterVerification.getTempParameterValue();
        if ( tempParameterValue == null ) {
            return null;
        }
        ParameterExecution state = tempParameterValue.getState();
        if ( state == null ) {
            return null;
        }
        return state;
    }
}
