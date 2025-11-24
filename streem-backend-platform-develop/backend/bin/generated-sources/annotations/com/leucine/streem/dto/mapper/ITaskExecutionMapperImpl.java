package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.PartialAuditDto;
import com.leucine.streem.dto.TaskExecutionAssigneeDto;
import com.leucine.streem.dto.TaskExecutionDto;
import com.leucine.streem.dto.TaskPauseReasonOrComment;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.TaskExecution;
import com.leucine.streem.model.TaskExecutionUserMapping;
import com.leucine.streem.model.User;
import com.leucine.streem.model.helper.PrincipalUser;
import java.util.ArrayList;
import java.util.HashSet;
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
public class ITaskExecutionMapperImpl implements ITaskExecutionMapper {

    @Autowired
    private ITaskExecutionAssigneeMapper iTaskExecutionAssigneeMapper;

    @Override
    public TaskExecution toEntity(TaskExecutionDto d) {
        if ( d == null ) {
            return null;
        }

        TaskExecution taskExecution = new TaskExecution();

        if ( d.getId() != null ) {
            taskExecution.setId( Long.parseLong( d.getId() ) );
        }
        taskExecution.setAssignees( taskExecutionAssigneeDtoListToTaskExecutionUserMappingSet( d.getAssignees() ) );
        taskExecution.setContinueRecurrence( d.isContinueRecurrence() );
        taskExecution.setCorrectedAt( d.getCorrectedAt() );
        taskExecution.setCorrectedBy( userAuditDtoToUser( d.getCorrectedBy() ) );
        taskExecution.setCorrectionEnabled( d.isCorrectionEnabled() );
        taskExecution.setCorrectionReason( d.getCorrectionReason() );
        taskExecution.setDuration( d.getDuration() );
        taskExecution.setEndedAt( d.getEndedAt() );
        taskExecution.setEndedBy( userAuditDtoToUser( d.getEndedBy() ) );
        taskExecution.setOrderTree( d.getOrderTree() );
        taskExecution.setReason( d.getReason() );
        taskExecution.setRecurringExpectedDueAt( d.getRecurringExpectedDueAt() );
        taskExecution.setRecurringExpectedStartedAt( d.getRecurringExpectedStartedAt() );
        taskExecution.setRecurringOverdueCompletionReason( d.getRecurringOverdueCompletionReason() );
        taskExecution.setRecurringPrematureStartReason( d.getRecurringPrematureStartReason() );
        taskExecution.setScheduleOverdueCompletionReason( d.getScheduleOverdueCompletionReason() );
        taskExecution.setSchedulePrematureStartReason( d.getSchedulePrematureStartReason() );
        taskExecution.setSchedulingExpectedDueAt( d.getSchedulingExpectedDueAt() );
        taskExecution.setSchedulingExpectedStartedAt( d.getSchedulingExpectedStartedAt() );
        taskExecution.setStartedAt( d.getStartedAt() );
        taskExecution.setStartedBy( userAuditDtoToUser( d.getStartedBy() ) );
        taskExecution.setState( d.getState() );
        taskExecution.setType( d.getType() );

        return taskExecution;
    }

    @Override
    public List<TaskExecutionDto> toDto(List<TaskExecution> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskExecutionDto> list1 = new ArrayList<TaskExecutionDto>( list.size() );
        for ( TaskExecution taskExecution : list ) {
            list1.add( toDto( taskExecution ) );
        }

        return list1;
    }

    @Override
    public List<TaskExecution> toEntity(List<TaskExecutionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskExecution> list1 = new ArrayList<TaskExecution>( list.size() );
        for ( TaskExecutionDto taskExecutionDto : list ) {
            list1.add( toEntity( taskExecutionDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskExecutionDto> toDto(Set<TaskExecution> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskExecutionDto> list = new ArrayList<TaskExecutionDto>( set.size() );
        for ( TaskExecution taskExecution : set ) {
            list.add( toDto( taskExecution ) );
        }

        return list;
    }

    @Override
    public List<TaskExecution> toEntity(Set<TaskExecutionDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskExecution> list = new ArrayList<TaskExecution>( set.size() );
        for ( TaskExecutionDto taskExecutionDto : set ) {
            list.add( toEntity( taskExecutionDto ) );
        }

        return list;
    }

    @Override
    public TaskExecutionDto toDto(TaskExecution taskExecution) {
        if ( taskExecution == null ) {
            return null;
        }

        TaskExecutionDto taskExecutionDto = new TaskExecutionDto();

        taskExecutionDto.setAudit( taskExecutionToPartialAuditDto( taskExecution ) );
        taskExecutionDto.setAssignees( iTaskExecutionAssigneeMapper.toDto( taskExecution.getAssignees() ) );
        taskExecutionDto.setContinueRecurrence( taskExecution.isContinueRecurrence() );
        taskExecutionDto.setCorrectedAt( taskExecution.getCorrectedAt() );
        taskExecutionDto.setCorrectedBy( userToUserAuditDto( taskExecution.getCorrectedBy() ) );
        taskExecutionDto.setCorrectionEnabled( taskExecution.isCorrectionEnabled() );
        taskExecutionDto.setCorrectionReason( taskExecution.getCorrectionReason() );
        taskExecutionDto.setDuration( taskExecution.getDuration() );
        taskExecutionDto.setEndedAt( taskExecution.getEndedAt() );
        taskExecutionDto.setEndedBy( userToUserAuditDto( taskExecution.getEndedBy() ) );
        if ( taskExecution.getId() != null ) {
            taskExecutionDto.setId( String.valueOf( taskExecution.getId() ) );
        }
        taskExecutionDto.setOrderTree( taskExecution.getOrderTree() );
        taskExecutionDto.setReason( taskExecution.getReason() );
        taskExecutionDto.setRecurringExpectedDueAt( taskExecution.getRecurringExpectedDueAt() );
        taskExecutionDto.setRecurringExpectedStartedAt( taskExecution.getRecurringExpectedStartedAt() );
        taskExecutionDto.setRecurringOverdueCompletionReason( taskExecution.getRecurringOverdueCompletionReason() );
        taskExecutionDto.setRecurringPrematureStartReason( taskExecution.getRecurringPrematureStartReason() );
        taskExecutionDto.setScheduleOverdueCompletionReason( taskExecution.getScheduleOverdueCompletionReason() );
        taskExecutionDto.setSchedulePrematureStartReason( taskExecution.getSchedulePrematureStartReason() );
        taskExecutionDto.setSchedulingExpectedDueAt( taskExecution.getSchedulingExpectedDueAt() );
        taskExecutionDto.setSchedulingExpectedStartedAt( taskExecution.getSchedulingExpectedStartedAt() );
        taskExecutionDto.setStartedAt( taskExecution.getStartedAt() );
        taskExecutionDto.setStartedBy( userToUserAuditDto( taskExecution.getStartedBy() ) );
        taskExecutionDto.setState( taskExecution.getState() );
        taskExecutionDto.setType( taskExecution.getType() );

        return taskExecutionDto;
    }

    @Override
    public TaskExecutionDto toDto(TaskExecution taskExecution, PrincipalUser principalUser) {
        if ( taskExecution == null ) {
            return null;
        }

        TaskExecutionDto taskExecutionDto = new TaskExecutionDto();

        taskExecutionDto.setAssignees( iTaskExecutionAssigneeMapper.toDto( taskExecution.getAssignees() ) );
        taskExecutionDto.setContinueRecurrence( taskExecution.isContinueRecurrence() );
        taskExecutionDto.setCorrectedAt( taskExecution.getCorrectedAt() );
        taskExecutionDto.setCorrectedBy( userToUserAuditDto1( taskExecution.getCorrectedBy(), principalUser ) );
        taskExecutionDto.setCorrectionEnabled( taskExecution.isCorrectionEnabled() );
        taskExecutionDto.setCorrectionReason( taskExecution.getCorrectionReason() );
        taskExecutionDto.setDuration( taskExecution.getDuration() );
        taskExecutionDto.setEndedAt( taskExecution.getEndedAt() );
        taskExecutionDto.setEndedBy( userToUserAuditDto1( taskExecution.getEndedBy(), principalUser ) );
        if ( taskExecution.getId() != null ) {
            taskExecutionDto.setId( String.valueOf( taskExecution.getId() ) );
        }
        taskExecutionDto.setOrderTree( taskExecution.getOrderTree() );
        taskExecutionDto.setReason( taskExecution.getReason() );
        taskExecutionDto.setRecurringExpectedDueAt( taskExecution.getRecurringExpectedDueAt() );
        taskExecutionDto.setRecurringExpectedStartedAt( taskExecution.getRecurringExpectedStartedAt() );
        taskExecutionDto.setRecurringOverdueCompletionReason( taskExecution.getRecurringOverdueCompletionReason() );
        taskExecutionDto.setRecurringPrematureStartReason( taskExecution.getRecurringPrematureStartReason() );
        taskExecutionDto.setScheduleOverdueCompletionReason( taskExecution.getScheduleOverdueCompletionReason() );
        taskExecutionDto.setSchedulePrematureStartReason( taskExecution.getSchedulePrematureStartReason() );
        taskExecutionDto.setSchedulingExpectedDueAt( taskExecution.getSchedulingExpectedDueAt() );
        taskExecutionDto.setSchedulingExpectedStartedAt( taskExecution.getSchedulingExpectedStartedAt() );
        taskExecutionDto.setStartedAt( taskExecution.getStartedAt() );
        taskExecutionDto.setStartedBy( userToUserAuditDto1( taskExecution.getStartedBy(), principalUser ) );
        taskExecutionDto.setState( taskExecution.getState() );
        taskExecutionDto.setType( taskExecution.getType() );

        setAudit( taskExecution, taskExecutionDto, principalUser );

        return taskExecutionDto;
    }

    @Override
    public TaskExecutionDto toDto(TaskExecution taskExecution, List<TaskPauseReasonOrComment> pauseReasons) {
        if ( taskExecution == null && pauseReasons == null ) {
            return null;
        }

        TaskExecutionDto taskExecutionDto = new TaskExecutionDto();

        if ( taskExecution != null ) {
            taskExecutionDto.setAssignees( iTaskExecutionAssigneeMapper.toDto( taskExecution.getAssignees() ) );
            taskExecutionDto.setContinueRecurrence( taskExecution.isContinueRecurrence() );
            taskExecutionDto.setCorrectedAt( taskExecution.getCorrectedAt() );
            taskExecutionDto.setCorrectedBy( userToUserAuditDto( taskExecution.getCorrectedBy() ) );
            taskExecutionDto.setCorrectionEnabled( taskExecution.isCorrectionEnabled() );
            taskExecutionDto.setCorrectionReason( taskExecution.getCorrectionReason() );
            taskExecutionDto.setDuration( taskExecution.getDuration() );
            taskExecutionDto.setEndedAt( taskExecution.getEndedAt() );
            taskExecutionDto.setEndedBy( userToUserAuditDto( taskExecution.getEndedBy() ) );
            if ( taskExecution.getId() != null ) {
                taskExecutionDto.setId( String.valueOf( taskExecution.getId() ) );
            }
            taskExecutionDto.setOrderTree( taskExecution.getOrderTree() );
            taskExecutionDto.setReason( taskExecution.getReason() );
            taskExecutionDto.setRecurringExpectedDueAt( taskExecution.getRecurringExpectedDueAt() );
            taskExecutionDto.setRecurringExpectedStartedAt( taskExecution.getRecurringExpectedStartedAt() );
            taskExecutionDto.setRecurringOverdueCompletionReason( taskExecution.getRecurringOverdueCompletionReason() );
            taskExecutionDto.setRecurringPrematureStartReason( taskExecution.getRecurringPrematureStartReason() );
            taskExecutionDto.setScheduleOverdueCompletionReason( taskExecution.getScheduleOverdueCompletionReason() );
            taskExecutionDto.setSchedulePrematureStartReason( taskExecution.getSchedulePrematureStartReason() );
            taskExecutionDto.setSchedulingExpectedDueAt( taskExecution.getSchedulingExpectedDueAt() );
            taskExecutionDto.setSchedulingExpectedStartedAt( taskExecution.getSchedulingExpectedStartedAt() );
            taskExecutionDto.setStartedAt( taskExecution.getStartedAt() );
            taskExecutionDto.setStartedBy( userToUserAuditDto( taskExecution.getStartedBy() ) );
            taskExecutionDto.setState( taskExecution.getState() );
            taskExecutionDto.setType( taskExecution.getType() );
        }
        if ( pauseReasons != null ) {
            List<TaskPauseReasonOrComment> list1 = pauseReasons;
            if ( list1 != null ) {
                taskExecutionDto.setPauseReasons( new ArrayList<TaskPauseReasonOrComment>( list1 ) );
            }
        }

        return taskExecutionDto;
    }

    protected Set<TaskExecutionUserMapping> taskExecutionAssigneeDtoListToTaskExecutionUserMappingSet(List<TaskExecutionAssigneeDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<TaskExecutionUserMapping> set = new HashSet<TaskExecutionUserMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( TaskExecutionAssigneeDto taskExecutionAssigneeDto : list ) {
            set.add( iTaskExecutionAssigneeMapper.toEntity( taskExecutionAssigneeDto ) );
        }

        return set;
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

    protected PartialAuditDto taskExecutionToPartialAuditDto(TaskExecution taskExecution) {
        if ( taskExecution == null ) {
            return null;
        }

        PartialAuditDto partialAuditDto = new PartialAuditDto();

        partialAuditDto.setModifiedAt( taskExecution.getModifiedAt() );
        partialAuditDto.setModifiedBy( userToUserAuditDto( taskExecution.getModifiedBy() ) );

        return partialAuditDto;
    }

    protected UserAuditDto userToUserAuditDto1(User user, PrincipalUser principalUser) {
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
}
