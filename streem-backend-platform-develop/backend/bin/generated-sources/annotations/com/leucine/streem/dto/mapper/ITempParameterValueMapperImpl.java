package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.State.ParameterVerification;
import com.leucine.streem.constant.Type.VerificationType;
import com.leucine.streem.dto.ParameterVerificationDto;
import com.leucine.streem.dto.PartialAuditDto;
import com.leucine.streem.dto.TempParameterValueDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ITempParameterValueMapperImpl implements ITempParameterValueMapper {

    @Autowired
    private ITempParameterValueMediaMapper iTempParameterValueMediaMapper;

    @Override
    public TempParameterValue toEntity(TempParameterValueDto d) {
        if ( d == null ) {
            return null;
        }

        TempParameterValue tempParameterValue = new TempParameterValue();

        tempParameterValue.setChoices( d.getChoices() );
        tempParameterValue.setHidden( d.isHidden() );
        tempParameterValue.setParameterVerifications( parameterVerificationDtoListToParameterVerificationList( d.getParameterVerifications() ) );
        tempParameterValue.setReason( d.getReason() );
        tempParameterValue.setState( d.getState() );
        if ( d.getTaskExecutionId() != null ) {
            tempParameterValue.setTaskExecutionId( Long.parseLong( d.getTaskExecutionId() ) );
        }
        tempParameterValue.setValue( d.getValue() );
        tempParameterValue.setMedias( iTempParameterValueMediaMapper.toEntity( d.getMedias() ) );

        return tempParameterValue;
    }

    @Override
    public List<TempParameterValueDto> toDto(List<TempParameterValue> list) {
        if ( list == null ) {
            return null;
        }

        List<TempParameterValueDto> list1 = new ArrayList<TempParameterValueDto>( list.size() );
        for ( TempParameterValue tempParameterValue : list ) {
            list1.add( toDto( tempParameterValue ) );
        }

        return list1;
    }

    @Override
    public List<TempParameterValue> toEntity(List<TempParameterValueDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TempParameterValue> list1 = new ArrayList<TempParameterValue>( list.size() );
        for ( TempParameterValueDto tempParameterValueDto : list ) {
            list1.add( toEntity( tempParameterValueDto ) );
        }

        return list1;
    }

    @Override
    public List<TempParameterValueDto> toDto(Set<TempParameterValue> set) {
        if ( set == null ) {
            return null;
        }

        List<TempParameterValueDto> list = new ArrayList<TempParameterValueDto>( set.size() );
        for ( TempParameterValue tempParameterValue : set ) {
            list.add( toDto( tempParameterValue ) );
        }

        return list;
    }

    @Override
    public List<TempParameterValue> toEntity(Set<TempParameterValueDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TempParameterValue> list = new ArrayList<TempParameterValue>( set.size() );
        for ( TempParameterValueDto tempParameterValueDto : set ) {
            list.add( toEntity( tempParameterValueDto ) );
        }

        return list;
    }

    @Override
    public TempParameterValueDto toDto(TempParameterValue parameterValue) {
        if ( parameterValue == null ) {
            return null;
        }

        TempParameterValueDto tempParameterValueDto = new TempParameterValueDto();

        tempParameterValueDto.setAudit( tempParameterValueToPartialAuditDto( parameterValue ) );
        tempParameterValueDto.setChoices( parameterValue.getChoices() );
        tempParameterValueDto.setHidden( parameterValue.isHidden() );
        tempParameterValueDto.setMedias( iTempParameterValueMediaMapper.toDto( parameterValue.getMedias() ) );
        tempParameterValueDto.setReason( parameterValue.getReason() );
        tempParameterValueDto.setState( parameterValue.getState() );
        if ( parameterValue.getTaskExecutionId() != null ) {
            tempParameterValueDto.setTaskExecutionId( String.valueOf( parameterValue.getTaskExecutionId() ) );
        }
        tempParameterValueDto.setValue( parameterValue.getValue() );
        tempParameterValueDto.setParameterVerifications( parameterVerificationListToParameterVerificationDtoList( parameterValue.getParameterVerifications() ) );

        return tempParameterValueDto;
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

    protected com.leucine.streem.model.ParameterVerification parameterVerificationDtoToParameterVerification(ParameterVerificationDto parameterVerificationDto) {
        if ( parameterVerificationDto == null ) {
            return null;
        }

        com.leucine.streem.model.ParameterVerification parameterVerification = new com.leucine.streem.model.ParameterVerification();

        if ( parameterVerificationDto.getId() != null ) {
            parameterVerification.setId( Long.parseLong( parameterVerificationDto.getId() ) );
        }
        if ( parameterVerificationDto.getCreatedAt() != null ) {
            parameterVerification.setCreatedAt( Long.parseLong( parameterVerificationDto.getCreatedAt() ) );
        }
        parameterVerification.setCreatedBy( userAuditDtoToUser( parameterVerificationDto.getCreatedBy() ) );
        if ( parameterVerificationDto.getModifiedAt() != null ) {
            parameterVerification.setModifiedAt( Long.parseLong( parameterVerificationDto.getModifiedAt() ) );
        }
        parameterVerification.setModifiedBy( userAuditDtoToUser( parameterVerificationDto.getModifiedBy() ) );
        parameterVerification.setBulk( parameterVerificationDto.isBulk() );
        parameterVerification.setComments( parameterVerificationDto.getComments() );
        if ( parameterVerificationDto.getVerificationStatus() != null ) {
            parameterVerification.setVerificationStatus( Enum.valueOf( ParameterVerification.class, parameterVerificationDto.getVerificationStatus() ) );
        }
        if ( parameterVerificationDto.getVerificationType() != null ) {
            parameterVerification.setVerificationType( Enum.valueOf( VerificationType.class, parameterVerificationDto.getVerificationType() ) );
        }

        return parameterVerification;
    }

    protected List<com.leucine.streem.model.ParameterVerification> parameterVerificationDtoListToParameterVerificationList(List<ParameterVerificationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<com.leucine.streem.model.ParameterVerification> list1 = new ArrayList<com.leucine.streem.model.ParameterVerification>( list.size() );
        for ( ParameterVerificationDto parameterVerificationDto : list ) {
            list1.add( parameterVerificationDtoToParameterVerification( parameterVerificationDto ) );
        }

        return list1;
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

    protected PartialAuditDto tempParameterValueToPartialAuditDto(TempParameterValue tempParameterValue) {
        if ( tempParameterValue == null ) {
            return null;
        }

        PartialAuditDto partialAuditDto = new PartialAuditDto();

        partialAuditDto.setModifiedAt( tempParameterValue.getModifiedAt() );
        partialAuditDto.setModifiedBy( userToUserAuditDto( tempParameterValue.getModifiedBy() ) );

        return partialAuditDto;
    }

    protected ParameterVerificationDto parameterVerificationToParameterVerificationDto(com.leucine.streem.model.ParameterVerification parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }

        ParameterVerificationDto parameterVerificationDto = new ParameterVerificationDto();

        parameterVerificationDto.setBulk( parameterVerification.isBulk() );
        parameterVerificationDto.setComments( parameterVerification.getComments() );
        if ( parameterVerification.getCreatedAt() != null ) {
            parameterVerificationDto.setCreatedAt( String.valueOf( parameterVerification.getCreatedAt() ) );
        }
        parameterVerificationDto.setCreatedBy( userToUserAuditDto( parameterVerification.getCreatedBy() ) );
        if ( parameterVerification.getId() != null ) {
            parameterVerificationDto.setId( String.valueOf( parameterVerification.getId() ) );
        }
        if ( parameterVerification.getModifiedAt() != null ) {
            parameterVerificationDto.setModifiedAt( String.valueOf( parameterVerification.getModifiedAt() ) );
        }
        parameterVerificationDto.setModifiedBy( userToUserAuditDto( parameterVerification.getModifiedBy() ) );
        if ( parameterVerification.getVerificationStatus() != null ) {
            parameterVerificationDto.setVerificationStatus( parameterVerification.getVerificationStatus().name() );
        }
        if ( parameterVerification.getVerificationType() != null ) {
            parameterVerificationDto.setVerificationType( parameterVerification.getVerificationType().name() );
        }

        return parameterVerificationDto;
    }

    protected List<ParameterVerificationDto> parameterVerificationListToParameterVerificationDtoList(List<com.leucine.streem.model.ParameterVerification> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterVerificationDto> list1 = new ArrayList<ParameterVerificationDto>( list.size() );
        for ( com.leucine.streem.model.ParameterVerification parameterVerification : list ) {
            list1.add( parameterVerificationToParameterVerificationDto( parameterVerification ) );
        }

        return list1;
    }
}
