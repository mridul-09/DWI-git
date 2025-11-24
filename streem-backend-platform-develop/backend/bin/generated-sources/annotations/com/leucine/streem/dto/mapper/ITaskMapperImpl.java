package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.AutomationDto;
import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.dto.ParameterDto;
import com.leucine.streem.dto.TaskDto;
import com.leucine.streem.dto.TaskPauseReasonOrComment;
import com.leucine.streem.dto.TaskReportDto;
import com.leucine.streem.dto.TaskSchedulesRequest;
import com.leucine.streem.dto.request.SetTaskRecurrentRequest;
import com.leucine.streem.model.Parameter;
import com.leucine.streem.model.ParameterValue;
import com.leucine.streem.model.ParameterVerification;
import com.leucine.streem.model.Task;
import com.leucine.streem.model.TaskAutomationMapping;
import com.leucine.streem.model.TaskExecution;
import com.leucine.streem.model.TaskMediaMapping;
import com.leucine.streem.model.TaskRecurrence;
import com.leucine.streem.model.TaskSchedules;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.TempParameterVerification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ITaskMapperImpl extends ITaskMapper {

    @Autowired
    private IParameterMapper iParameterMapper;
    @Autowired
    private ITaskMediaMapper iTaskMediaMapper;
    @Autowired
    private ITaskAutomationMapper iTaskAutomationMapper;

    @Override
    public Task toEntity(TaskDto d) {
        if ( d == null ) {
            return null;
        }

        Task task = new Task();

        if ( d.getId() != null ) {
            task.setId( Long.parseLong( d.getId() ) );
        }
        task.setAutomations( automationDtoListToTaskAutomationMappingSet( d.getAutomations() ) );
        task.setEnableRecurrence( d.isEnableRecurrence() );
        task.setEnableScheduling( d.isEnableScheduling() );
        task.setHasBulkVerification( d.isHasBulkVerification() );
        task.setHasExecutorLock( d.isHasExecutorLock() );
        task.setHasInterlocks( d.isHasInterlocks() );
        task.setHasStop( d.isHasStop() );
        task.setMandatory( d.isMandatory() );
        task.setMaxPeriod( d.getMaxPeriod() );
        task.setMedias( mediaDtoListToTaskMediaMappingSet( d.getMedias() ) );
        task.setMinPeriod( d.getMinPeriod() );
        task.setName( d.getName() );
        task.setOrderTree( d.getOrderTree() );
        task.setParameters( parameterDtoListToParameterSet( d.getParameters() ) );
        task.setSoloTask( d.isSoloTask() );
        task.setTaskRecurrence( setTaskRecurrentRequestToTaskRecurrence( d.getTaskRecurrence() ) );
        task.setTaskSchedules( taskSchedulesRequestToTaskSchedules( d.getTaskSchedules() ) );
        task.setTimed( d.isTimed() );
        task.setTimerOperator( d.getTimerOperator() );

        return task;
    }

    @Override
    public List<TaskDto> toDto(List<Task> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskDto> list1 = new ArrayList<TaskDto>( list.size() );
        for ( Task task : list ) {
            list1.add( toDto( task ) );
        }

        return list1;
    }

    @Override
    public List<Task> toEntity(List<TaskDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Task> list1 = new ArrayList<Task>( list.size() );
        for ( TaskDto taskDto : list ) {
            list1.add( toEntity( taskDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskDto> toDto(Set<Task> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskDto> list = new ArrayList<TaskDto>( set.size() );
        for ( Task task : set ) {
            list.add( toDto( task ) );
        }

        return list;
    }

    @Override
    public List<Task> toEntity(Set<TaskDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Task> list = new ArrayList<Task>( set.size() );
        for ( TaskDto taskDto : set ) {
            list.add( toEntity( taskDto ) );
        }

        return list;
    }

    @Override
    public TaskDto toDto(Task task, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setParameters( iParameterMapper.toDto( task.getParameters(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        taskDto.setAutomations( iTaskAutomationMapper.toDto( task.getAutomations() ) );
        taskDto.setEnableRecurrence( task.isEnableRecurrence() );
        taskDto.setEnableScheduling( task.isEnableScheduling() );
        taskDto.setHasBulkVerification( task.isHasBulkVerification() );
        taskDto.setHasExecutorLock( task.isHasExecutorLock() );
        taskDto.setHasInterlocks( task.isHasInterlocks() );
        taskDto.setHasStop( task.isHasStop() );
        if ( task.getId() != null ) {
            taskDto.setId( String.valueOf( task.getId() ) );
        }
        taskDto.setMandatory( task.isMandatory() );
        taskDto.setMaxPeriod( task.getMaxPeriod() );
        taskDto.setMedias( iTaskMediaMapper.toDto( task.getMedias() ) );
        taskDto.setMinPeriod( task.getMinPeriod() );
        taskDto.setName( task.getName() );
        if ( task.getOrderTree() != null ) {
            taskDto.setOrderTree( task.getOrderTree() );
        }
        taskDto.setSoloTask( task.isSoloTask() );
        taskDto.setTaskRecurrence( taskRecurrenceToSetTaskRecurrentRequest( task.getTaskRecurrence(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        taskDto.setTaskSchedules( taskSchedulesToTaskSchedulesRequest( task.getTaskSchedules(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        taskDto.setTimed( task.isTimed() );
        taskDto.setTimerOperator( task.getTimerOperator() );

        taskDto.setHasPrerequisites( task.getPrerequisiteTasks().size() > 0 );
        taskDto.setHasDependents( task.getDependentTasks().size() > 0 );
        taskDto.setPrerequisiteTaskIds( getPrerequisiteTaskIds(task) );

        setTaskExecutions( task, taskDto, parameterValueMap, taskExecutionMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf );
        setInterlockDto( task, taskDto );
        setExecutorLock( task, taskDto );

        return taskDto;
    }

    @Override
    public List<TaskDto> toDto(Set<Task> tasks, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( tasks == null ) {
            return null;
        }

        List<TaskDto> list = new ArrayList<TaskDto>( tasks.size() );
        for ( Task task : tasks ) {
            list.add( toDto( task, parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        }

        return list;
    }

    @Override
    public TaskDto toDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setParameters( iParameterMapper.toDto( task.getParameters() ) );
        taskDto.setAutomations( iTaskAutomationMapper.toDto( task.getAutomations() ) );
        taskDto.setEnableRecurrence( task.isEnableRecurrence() );
        taskDto.setEnableScheduling( task.isEnableScheduling() );
        taskDto.setHasBulkVerification( task.isHasBulkVerification() );
        taskDto.setHasExecutorLock( task.isHasExecutorLock() );
        taskDto.setHasInterlocks( task.isHasInterlocks() );
        taskDto.setHasStop( task.isHasStop() );
        if ( task.getId() != null ) {
            taskDto.setId( String.valueOf( task.getId() ) );
        }
        taskDto.setMandatory( task.isMandatory() );
        taskDto.setMaxPeriod( task.getMaxPeriod() );
        taskDto.setMedias( iTaskMediaMapper.toDto( task.getMedias() ) );
        taskDto.setMinPeriod( task.getMinPeriod() );
        taskDto.setName( task.getName() );
        if ( task.getOrderTree() != null ) {
            taskDto.setOrderTree( task.getOrderTree() );
        }
        taskDto.setSoloTask( task.isSoloTask() );
        taskDto.setTaskRecurrence( taskRecurrenceToSetTaskRecurrentRequest1( task.getTaskRecurrence() ) );
        taskDto.setTaskSchedules( taskSchedulesToTaskSchedulesRequest1( task.getTaskSchedules() ) );
        taskDto.setTimed( task.isTimed() );
        taskDto.setTimerOperator( task.getTimerOperator() );

        taskDto.setHasPrerequisites( task.getPrerequisiteTasks().size() > 0 );
        taskDto.setHasDependents( task.getDependentTasks().size() > 0 );
        taskDto.setPrerequisiteTaskIds( getPrerequisiteTaskIds(task) );

        setInterlockDto( task, taskDto );
        setExecutorLock( task, taskDto );

        return taskDto;
    }

    @Override
    public TaskReportDto toTaskReportDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskReportDto taskReportDto = new TaskReportDto();

        if ( task.getId() != null ) {
            taskReportDto.setId( String.valueOf( task.getId() ) );
        }
        taskReportDto.setName( task.getName() );
        if ( task.getOrderTree() != null ) {
            taskReportDto.setOrderTree( task.getOrderTree() );
        }

        return taskReportDto;
    }

    protected Set<TaskAutomationMapping> automationDtoListToTaskAutomationMappingSet(List<AutomationDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<TaskAutomationMapping> set = new HashSet<TaskAutomationMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( AutomationDto automationDto : list ) {
            set.add( iTaskAutomationMapper.toEntity( automationDto ) );
        }

        return set;
    }

    protected Set<TaskMediaMapping> mediaDtoListToTaskMediaMappingSet(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<TaskMediaMapping> set = new HashSet<TaskMediaMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( MediaDto mediaDto : list ) {
            set.add( iTaskMediaMapper.toEntity( mediaDto ) );
        }

        return set;
    }

    protected Set<Parameter> parameterDtoListToParameterSet(List<ParameterDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Parameter> set = new HashSet<Parameter>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ParameterDto parameterDto : list ) {
            set.add( iParameterMapper.toEntity( parameterDto ) );
        }

        return set;
    }

    protected TaskRecurrence setTaskRecurrentRequestToTaskRecurrence(SetTaskRecurrentRequest setTaskRecurrentRequest) {
        if ( setTaskRecurrentRequest == null ) {
            return null;
        }

        TaskRecurrence taskRecurrence = new TaskRecurrence();

        taskRecurrence.setDueDateDuration( setTaskRecurrentRequest.getDueDateDuration() );
        taskRecurrence.setDueDateInterval( setTaskRecurrentRequest.getDueDateInterval() );
        taskRecurrence.setNegativeDueDateToleranceDuration( setTaskRecurrentRequest.getNegativeDueDateToleranceDuration() );
        taskRecurrence.setNegativeDueDateToleranceInterval( setTaskRecurrentRequest.getNegativeDueDateToleranceInterval() );
        taskRecurrence.setNegativeStartDateToleranceDuration( setTaskRecurrentRequest.getNegativeStartDateToleranceDuration() );
        taskRecurrence.setNegativeStartDateToleranceInterval( setTaskRecurrentRequest.getNegativeStartDateToleranceInterval() );
        taskRecurrence.setPositiveDueDateToleranceDuration( setTaskRecurrentRequest.getPositiveDueDateToleranceDuration() );
        taskRecurrence.setPositiveDueDateToleranceInterval( setTaskRecurrentRequest.getPositiveDueDateToleranceInterval() );
        taskRecurrence.setPositiveStartDateToleranceDuration( setTaskRecurrentRequest.getPositiveStartDateToleranceDuration() );
        taskRecurrence.setPositiveStartDateToleranceInterval( setTaskRecurrentRequest.getPositiveStartDateToleranceInterval() );
        taskRecurrence.setStartDateDuration( setTaskRecurrentRequest.getStartDateDuration() );
        taskRecurrence.setStartDateInterval( setTaskRecurrentRequest.getStartDateInterval() );

        return taskRecurrence;
    }

    protected TaskSchedules taskSchedulesRequestToTaskSchedules(TaskSchedulesRequest taskSchedulesRequest) {
        if ( taskSchedulesRequest == null ) {
            return null;
        }

        TaskSchedules taskSchedules = new TaskSchedules();

        taskSchedules.setCondition( taskSchedulesRequest.getCondition() );
        taskSchedules.setDueDateDuration( taskSchedulesRequest.getDueDateDuration() );
        taskSchedules.setDueDateInterval( taskSchedulesRequest.getDueDateInterval() );
        if ( taskSchedulesRequest.getReferencedTaskId() != null ) {
            taskSchedules.setReferencedTaskId( Long.parseLong( taskSchedulesRequest.getReferencedTaskId() ) );
        }
        taskSchedules.setStartDateDuration( taskSchedulesRequest.getStartDateDuration() );
        taskSchedules.setStartDateInterval( taskSchedulesRequest.getStartDateInterval() );
        taskSchedules.setType( taskSchedulesRequest.getType() );

        return taskSchedules;
    }

    protected SetTaskRecurrentRequest taskRecurrenceToSetTaskRecurrentRequest(TaskRecurrence taskRecurrence, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( taskRecurrence == null ) {
            return null;
        }

        SetTaskRecurrentRequest setTaskRecurrentRequest = new SetTaskRecurrentRequest();

        setTaskRecurrentRequest.setDueDateDuration( taskRecurrence.getDueDateDuration() );
        setTaskRecurrentRequest.setDueDateInterval( taskRecurrence.getDueDateInterval() );
        setTaskRecurrentRequest.setNegativeDueDateToleranceDuration( taskRecurrence.getNegativeDueDateToleranceDuration() );
        setTaskRecurrentRequest.setNegativeDueDateToleranceInterval( taskRecurrence.getNegativeDueDateToleranceInterval() );
        setTaskRecurrentRequest.setNegativeStartDateToleranceDuration( taskRecurrence.getNegativeStartDateToleranceDuration() );
        setTaskRecurrentRequest.setNegativeStartDateToleranceInterval( taskRecurrence.getNegativeStartDateToleranceInterval() );
        setTaskRecurrentRequest.setPositiveDueDateToleranceDuration( taskRecurrence.getPositiveDueDateToleranceDuration() );
        setTaskRecurrentRequest.setPositiveDueDateToleranceInterval( taskRecurrence.getPositiveDueDateToleranceInterval() );
        setTaskRecurrentRequest.setPositiveStartDateToleranceDuration( taskRecurrence.getPositiveStartDateToleranceDuration() );
        setTaskRecurrentRequest.setPositiveStartDateToleranceInterval( taskRecurrence.getPositiveStartDateToleranceInterval() );
        setTaskRecurrentRequest.setStartDateDuration( taskRecurrence.getStartDateDuration() );
        setTaskRecurrentRequest.setStartDateInterval( taskRecurrence.getStartDateInterval() );

        return setTaskRecurrentRequest;
    }

    protected TaskSchedulesRequest taskSchedulesToTaskSchedulesRequest(TaskSchedules taskSchedules, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( taskSchedules == null ) {
            return null;
        }

        TaskSchedulesRequest taskSchedulesRequest = new TaskSchedulesRequest();

        taskSchedulesRequest.setCondition( taskSchedules.getCondition() );
        taskSchedulesRequest.setDueDateDuration( taskSchedules.getDueDateDuration() );
        taskSchedulesRequest.setDueDateInterval( taskSchedules.getDueDateInterval() );
        if ( taskSchedules.getReferencedTaskId() != null ) {
            taskSchedulesRequest.setReferencedTaskId( String.valueOf( taskSchedules.getReferencedTaskId() ) );
        }
        taskSchedulesRequest.setStartDateDuration( taskSchedules.getStartDateDuration() );
        taskSchedulesRequest.setStartDateInterval( taskSchedules.getStartDateInterval() );
        taskSchedulesRequest.setType( taskSchedules.getType() );

        return taskSchedulesRequest;
    }

    protected SetTaskRecurrentRequest taskRecurrenceToSetTaskRecurrentRequest1(TaskRecurrence taskRecurrence) {
        if ( taskRecurrence == null ) {
            return null;
        }

        SetTaskRecurrentRequest setTaskRecurrentRequest = new SetTaskRecurrentRequest();

        setTaskRecurrentRequest.setDueDateDuration( taskRecurrence.getDueDateDuration() );
        setTaskRecurrentRequest.setDueDateInterval( taskRecurrence.getDueDateInterval() );
        setTaskRecurrentRequest.setNegativeDueDateToleranceDuration( taskRecurrence.getNegativeDueDateToleranceDuration() );
        setTaskRecurrentRequest.setNegativeDueDateToleranceInterval( taskRecurrence.getNegativeDueDateToleranceInterval() );
        setTaskRecurrentRequest.setNegativeStartDateToleranceDuration( taskRecurrence.getNegativeStartDateToleranceDuration() );
        setTaskRecurrentRequest.setNegativeStartDateToleranceInterval( taskRecurrence.getNegativeStartDateToleranceInterval() );
        setTaskRecurrentRequest.setPositiveDueDateToleranceDuration( taskRecurrence.getPositiveDueDateToleranceDuration() );
        setTaskRecurrentRequest.setPositiveDueDateToleranceInterval( taskRecurrence.getPositiveDueDateToleranceInterval() );
        setTaskRecurrentRequest.setPositiveStartDateToleranceDuration( taskRecurrence.getPositiveStartDateToleranceDuration() );
        setTaskRecurrentRequest.setPositiveStartDateToleranceInterval( taskRecurrence.getPositiveStartDateToleranceInterval() );
        setTaskRecurrentRequest.setStartDateDuration( taskRecurrence.getStartDateDuration() );
        setTaskRecurrentRequest.setStartDateInterval( taskRecurrence.getStartDateInterval() );

        return setTaskRecurrentRequest;
    }

    protected TaskSchedulesRequest taskSchedulesToTaskSchedulesRequest1(TaskSchedules taskSchedules) {
        if ( taskSchedules == null ) {
            return null;
        }

        TaskSchedulesRequest taskSchedulesRequest = new TaskSchedulesRequest();

        taskSchedulesRequest.setCondition( taskSchedules.getCondition() );
        taskSchedulesRequest.setDueDateDuration( taskSchedules.getDueDateDuration() );
        taskSchedulesRequest.setDueDateInterval( taskSchedules.getDueDateInterval() );
        if ( taskSchedules.getReferencedTaskId() != null ) {
            taskSchedulesRequest.setReferencedTaskId( String.valueOf( taskSchedules.getReferencedTaskId() ) );
        }
        taskSchedulesRequest.setStartDateDuration( taskSchedules.getStartDateDuration() );
        taskSchedulesRequest.setStartDateInterval( taskSchedules.getStartDateInterval() );
        taskSchedulesRequest.setType( taskSchedules.getType() );

        return taskSchedulesRequest;
    }
}
