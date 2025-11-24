package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.State.ParameterExecution;
import com.leucine.streem.constant.State.ParameterVerification;
import com.leucine.streem.constant.Type.VerificationType;
import com.leucine.streem.dto.ParameterVerificationDto;
import com.leucine.streem.dto.ParameterVerificationListViewDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.dto.projection.ParameterVerificationListViewProjection;
import com.leucine.streem.model.ParameterValue;
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
public class IParameterVerificationMapperImpl extends IParameterVerificationMapper {

    @Override
    public com.leucine.streem.model.ParameterVerification toEntity(ParameterVerificationDto d) {
        if ( d == null ) {
            return null;
        }

        com.leucine.streem.model.ParameterVerification parameterVerification = new com.leucine.streem.model.ParameterVerification();

        if ( d.getId() != null ) {
            parameterVerification.setId( Long.parseLong( d.getId() ) );
        }
        if ( d.getCreatedAt() != null ) {
            parameterVerification.setCreatedAt( Long.parseLong( d.getCreatedAt() ) );
        }
        parameterVerification.setCreatedBy( userAuditDtoToUser( d.getCreatedBy() ) );
        if ( d.getModifiedAt() != null ) {
            parameterVerification.setModifiedAt( Long.parseLong( d.getModifiedAt() ) );
        }
        parameterVerification.setModifiedBy( userAuditDtoToUser( d.getModifiedBy() ) );
        parameterVerification.setBulk( d.isBulk() );
        parameterVerification.setComments( d.getComments() );
        if ( d.getVerificationStatus() != null ) {
            parameterVerification.setVerificationStatus( Enum.valueOf( ParameterVerification.class, d.getVerificationStatus() ) );
        }
        if ( d.getVerificationType() != null ) {
            parameterVerification.setVerificationType( Enum.valueOf( VerificationType.class, d.getVerificationType() ) );
        }

        return parameterVerification;
    }

    @Override
    public List<ParameterVerificationDto> toDto(List<com.leucine.streem.model.ParameterVerification> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterVerificationDto> list1 = new ArrayList<ParameterVerificationDto>( list.size() );
        for ( com.leucine.streem.model.ParameterVerification parameterVerification : list ) {
            list1.add( toDto( parameterVerification ) );
        }

        return list1;
    }

    @Override
    public List<com.leucine.streem.model.ParameterVerification> toEntity(List<ParameterVerificationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<com.leucine.streem.model.ParameterVerification> list1 = new ArrayList<com.leucine.streem.model.ParameterVerification>( list.size() );
        for ( ParameterVerificationDto parameterVerificationDto : list ) {
            list1.add( toEntity( parameterVerificationDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterVerificationDto> toDto(Set<com.leucine.streem.model.ParameterVerification> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterVerificationDto> list = new ArrayList<ParameterVerificationDto>( set.size() );
        for ( com.leucine.streem.model.ParameterVerification parameterVerification : set ) {
            list.add( toDto( parameterVerification ) );
        }

        return list;
    }

    @Override
    public List<com.leucine.streem.model.ParameterVerification> toEntity(Set<ParameterVerificationDto> set) {
        if ( set == null ) {
            return null;
        }

        List<com.leucine.streem.model.ParameterVerification> list = new ArrayList<com.leucine.streem.model.ParameterVerification>( set.size() );
        for ( ParameterVerificationDto parameterVerificationDto : set ) {
            list.add( toEntity( parameterVerificationDto ) );
        }

        return list;
    }

    @Override
    public ParameterVerificationDto toDto(com.leucine.streem.model.ParameterVerification parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }

        ParameterVerificationDto parameterVerificationDto = new ParameterVerificationDto();

        parameterVerificationDto.setRequestedTo( userToUserAuditDto( parameterVerification.getUser() ) );
        parameterVerificationDto.setEvaluationState( parameterVerificationParameterValueState( parameterVerification ) );
        Long id = parameterVerificationParameterValueId( parameterVerification );
        if ( id != null ) {
            parameterVerificationDto.setParameterExecutionId( String.valueOf( id ) );
        }
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

    @Override
    public ParameterVerificationListViewDto toParameterListViewDto(ParameterVerificationListViewProjection parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }

        ParameterVerificationListViewDto parameterVerificationListViewDto = new ParameterVerificationListViewDto();

        parameterVerificationListViewDto.setModifiedBy( parameterVerificationListViewProjectionToUserAuditDto( parameterVerification ) );
        parameterVerificationListViewDto.setCreatedBy( parameterVerificationListViewProjectionToUserAuditDto1( parameterVerification ) );
        parameterVerificationListViewDto.setRequestedTo( parameterVerificationListViewProjectionToUserAuditDto2( parameterVerification ) );
        parameterVerificationListViewDto.setCode( parameterVerification.getCode() );
        parameterVerificationListViewDto.setComments( parameterVerification.getComments() );
        if ( parameterVerification.getCreatedAt() != null ) {
            parameterVerificationListViewDto.setCreatedAt( String.valueOf( parameterVerification.getCreatedAt() ) );
        }
        if ( parameterVerification.getId() != null ) {
            parameterVerificationListViewDto.setId( String.valueOf( parameterVerification.getId() ) );
        }
        parameterVerificationListViewDto.setJobId( parameterVerification.getJobId() );
        if ( parameterVerification.getModifiedAt() != null ) {
            parameterVerificationListViewDto.setModifiedAt( String.valueOf( parameterVerification.getModifiedAt() ) );
        }
        parameterVerificationListViewDto.setParameterName( parameterVerification.getParameterName() );
        if ( parameterVerification.getParameterValueId() != null ) {
            parameterVerificationListViewDto.setParameterValueId( String.valueOf( parameterVerification.getParameterValueId() ) );
        }
        parameterVerificationListViewDto.setProcessName( parameterVerification.getProcessName() );
        if ( parameterVerification.getStageId() != null ) {
            parameterVerificationListViewDto.setStageId( String.valueOf( parameterVerification.getStageId() ) );
        }
        parameterVerificationListViewDto.setTaskExecutionId( parameterVerification.getTaskExecutionId() );
        if ( parameterVerification.getTaskId() != null ) {
            parameterVerificationListViewDto.setTaskId( String.valueOf( parameterVerification.getTaskId() ) );
        }
        parameterVerificationListViewDto.setTaskName( parameterVerification.getTaskName() );
        parameterVerificationListViewDto.setVerificationStatus( parameterVerification.getVerificationStatus() );
        parameterVerificationListViewDto.setVerificationType( parameterVerification.getVerificationType() );

        return parameterVerificationListViewDto;
    }

    @Override
    public List<ParameterVerificationListViewDto> toParameterListViewDto(Iterable<ParameterVerificationListViewProjection> parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }

        List<ParameterVerificationListViewDto> list = new ArrayList<ParameterVerificationListViewDto>();
        for ( ParameterVerificationListViewProjection parameterVerificationListViewProjection : parameterVerification ) {
            list.add( toParameterListViewDto( parameterVerificationListViewProjection ) );
        }

        return list;
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

    private ParameterExecution parameterVerificationParameterValueState(com.leucine.streem.model.ParameterVerification parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }
        ParameterValue parameterValue = parameterVerification.getParameterValue();
        if ( parameterValue == null ) {
            return null;
        }
        ParameterExecution state = parameterValue.getState();
        if ( state == null ) {
            return null;
        }
        return state;
    }

    private Long parameterVerificationParameterValueId(com.leucine.streem.model.ParameterVerification parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }
        ParameterValue parameterValue = parameterVerification.getParameterValue();
        if ( parameterValue == null ) {
            return null;
        }
        Long id = parameterValue.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UserAuditDto parameterVerificationListViewProjectionToUserAuditDto(ParameterVerificationListViewProjection parameterVerificationListViewProjection) {
        if ( parameterVerificationListViewProjection == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        if ( parameterVerificationListViewProjection.getModifiedById() != null ) {
            userAuditDto.id( String.valueOf( parameterVerificationListViewProjection.getModifiedById() ) );
        }
        userAuditDto.employeeId( parameterVerificationListViewProjection.getModifiedByEmployeeId() );
        userAuditDto.firstName( parameterVerificationListViewProjection.getModifiedByFirstName() );
        userAuditDto.lastName( parameterVerificationListViewProjection.getModifiedByLastName() );

        return userAuditDto.build();
    }

    protected UserAuditDto parameterVerificationListViewProjectionToUserAuditDto1(ParameterVerificationListViewProjection parameterVerificationListViewProjection) {
        if ( parameterVerificationListViewProjection == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        if ( parameterVerificationListViewProjection.getCreatedById() != null ) {
            userAuditDto.id( String.valueOf( parameterVerificationListViewProjection.getCreatedById() ) );
        }
        userAuditDto.employeeId( parameterVerificationListViewProjection.getCreatedByEmployeeId() );
        userAuditDto.firstName( parameterVerificationListViewProjection.getCreatedByFirstName() );
        userAuditDto.lastName( parameterVerificationListViewProjection.getCreatedByLastName() );

        return userAuditDto.build();
    }

    protected UserAuditDto parameterVerificationListViewProjectionToUserAuditDto2(ParameterVerificationListViewProjection parameterVerificationListViewProjection) {
        if ( parameterVerificationListViewProjection == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        if ( parameterVerificationListViewProjection.getRequestedToId() != null ) {
            userAuditDto.id( String.valueOf( parameterVerificationListViewProjection.getRequestedToId() ) );
        }
        userAuditDto.employeeId( parameterVerificationListViewProjection.getRequestedToEmployeeId() );
        userAuditDto.firstName( parameterVerificationListViewProjection.getRequestedToFirstName() );
        userAuditDto.lastName( parameterVerificationListViewProjection.getRequestedToLastName() );

        return userAuditDto.build();
    }
}
