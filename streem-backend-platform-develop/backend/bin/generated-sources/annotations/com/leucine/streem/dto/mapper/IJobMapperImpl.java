package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.Type.Parameter;
import com.leucine.streem.dto.AutomationDto;
import com.leucine.streem.dto.ChecklistJobDto;
import com.leucine.streem.dto.EngagedUserView;
import com.leucine.streem.dto.JobAutoSuggestDto;
import com.leucine.streem.dto.JobDto;
import com.leucine.streem.dto.JobInfoDto;
import com.leucine.streem.dto.JobInformationDto;
import com.leucine.streem.dto.JobPartialDto;
import com.leucine.streem.dto.JobPrintDto;
import com.leucine.streem.dto.JobReportDto;
import com.leucine.streem.dto.JobStateDto;
import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.dto.OrganisationDto;
import com.leucine.streem.dto.ParameterDto;
import com.leucine.streem.dto.SchedulerPartialDto;
import com.leucine.streem.dto.StageDto;
import com.leucine.streem.dto.TaskDto;
import com.leucine.streem.dto.TaskPauseReasonOrComment;
import com.leucine.streem.dto.TaskPendingOnMeView;
import com.leucine.streem.dto.TaskSchedulesRequest;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.dto.UserDto;
import com.leucine.streem.dto.request.SetTaskRecurrentRequest;
import com.leucine.streem.model.Checklist;
import com.leucine.streem.model.Job;
import com.leucine.streem.model.Organisation;
import com.leucine.streem.model.ParameterValue;
import com.leucine.streem.model.ParameterVerification;
import com.leucine.streem.model.Scheduler;
import com.leucine.streem.model.Stage;
import com.leucine.streem.model.Task;
import com.leucine.streem.model.TaskAutomationMapping;
import com.leucine.streem.model.TaskExecution;
import com.leucine.streem.model.TaskMediaMapping;
import com.leucine.streem.model.TaskRecurrence;
import com.leucine.streem.model.TaskSchedules;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.TempParameterVerification;
import com.leucine.streem.model.User;
import com.leucine.streem.model.helper.PrincipalUser;
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
public class IJobMapperImpl implements IJobMapper {

    @Autowired
    private IChecklistMapper iChecklistMapper;

    @Override
    public Job toEntity(JobDto d) {
        if ( d == null ) {
            return null;
        }

        Job job = new Job();

        if ( d.getId() != null ) {
            job.setId( Long.parseLong( d.getId() ) );
        }
        job.setChecklist( checklistJobDtoToChecklist( d.getChecklist() ) );
        job.setCode( d.getCode() );
        job.setEndedAt( d.getEndedAt() );
        job.setExpectedEndDate( d.getExpectedEndDate() );
        job.setExpectedStartDate( d.getExpectedStartDate() );
        job.setParameterValues( parameterDtoListToParameterValueSet( d.getParameterValues() ) );
        job.setSchedulerId( d.getSchedulerId() );
        job.setStartedAt( d.getStartedAt() );
        job.setState( d.getState() );

        return job;
    }

    @Override
    public List<JobDto> toDto(List<Job> list) {
        if ( list == null ) {
            return null;
        }

        List<JobDto> list1 = new ArrayList<JobDto>( list.size() );
        for ( Job job : list ) {
            list1.add( toDto( job ) );
        }

        return list1;
    }

    @Override
    public List<Job> toEntity(List<JobDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Job> list1 = new ArrayList<Job>( list.size() );
        for ( JobDto jobDto : list ) {
            list1.add( toEntity( jobDto ) );
        }

        return list1;
    }

    @Override
    public List<JobDto> toDto(Set<Job> set) {
        if ( set == null ) {
            return null;
        }

        List<JobDto> list = new ArrayList<JobDto>( set.size() );
        for ( Job job : set ) {
            list.add( toDto( job ) );
        }

        return list;
    }

    @Override
    public List<Job> toEntity(Set<JobDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Job> list = new ArrayList<Job>( set.size() );
        for ( JobDto jobDto : set ) {
            list.add( toEntity( jobDto ) );
        }

        return list;
    }

    @Override
    public JobDto toDto(Job job) {
        if ( job == null ) {
            return null;
        }

        JobDto jobDto = new JobDto();

        jobDto.setChecklist( checklistToChecklistJobDto( job.getChecklist() ) );
        jobDto.setCode( job.getCode() );
        jobDto.setEndedAt( job.getEndedAt() );
        jobDto.setExpectedEndDate( job.getExpectedEndDate() );
        jobDto.setExpectedStartDate( job.getExpectedStartDate() );
        if ( job.getId() != null ) {
            jobDto.setId( String.valueOf( job.getId() ) );
        }
        jobDto.setParameterValues( parameterValueSetToParameterDtoList( job.getParameterValues() ) );
        jobDto.setSchedulerId( job.getSchedulerId() );
        jobDto.setStartedAt( job.getStartedAt() );
        jobDto.setState( job.getState() );

        return jobDto;
    }

    @Override
    public JobDto toDto(Job job, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( job == null ) {
            return null;
        }

        JobDto jobDto = new JobDto();

        jobDto.setChecklist( iChecklistMapper.toChecklistJobDto( job.getChecklist(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobDto.setCode( job.getCode() );
        jobDto.setEndedAt( job.getEndedAt() );
        jobDto.setExpectedEndDate( job.getExpectedEndDate() );
        jobDto.setExpectedStartDate( job.getExpectedStartDate() );
        if ( job.getId() != null ) {
            jobDto.setId( String.valueOf( job.getId() ) );
        }
        jobDto.setParameterValues( parameterValueSetToParameterDtoList1( job.getParameterValues(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobDto.setSchedulerId( job.getSchedulerId() );
        jobDto.setStartedAt( job.getStartedAt() );
        jobDto.setState( job.getState() );

        return jobDto;
    }

    @Override
    public JobInfoDto toJobInfoDto(Job job, PrincipalUser principalUser) {
        if ( job == null ) {
            return null;
        }

        JobInfoDto jobInfoDto = new JobInfoDto();

        jobInfoDto.setCode( job.getCode() );
        if ( job.getId() != null ) {
            jobInfoDto.setId( String.valueOf( job.getId() ) );
        }
        jobInfoDto.setState( job.getState() );

        setAudit( job, jobInfoDto, principalUser );

        return jobInfoDto;
    }

    @Override
    public JobInformationDto toJobInformationDto(Job job, Map<String, List<TaskPendingOnMeView>> pendingOnMeTasks, List<EngagedUserView> engagedUsers, List<Long> parameterIds) {
        if ( job == null ) {
            return null;
        }

        JobInformationDto jobInformationDto = new JobInformationDto();

        jobInformationDto.setParameterValues( IJobMapper.toParameterValuesDto( job.getParameterValues(), parameterIds ) );
        jobInformationDto.setChecklist( iChecklistMapper.toPartialDto( job.getChecklist() ) );
        jobInformationDto.setCode( job.getCode() );
        jobInformationDto.setCreatedAt( job.getCreatedAt() );
        jobInformationDto.setCreatedBy( userToUserDto( job.getCreatedBy(), pendingOnMeTasks, engagedUsers, parameterIds ) );
        jobInformationDto.setEndedAt( job.getEndedAt() );
        jobInformationDto.setEndedBy( userToUserDto( job.getEndedBy(), pendingOnMeTasks, engagedUsers, parameterIds ) );
        if ( job.getId() != null ) {
            jobInformationDto.setId( String.valueOf( job.getId() ) );
        }
        jobInformationDto.setStartedAt( job.getStartedAt() );
        jobInformationDto.setStartedBy( userToUserDto( job.getStartedBy(), pendingOnMeTasks, engagedUsers, parameterIds ) );
        jobInformationDto.setState( job.getState() );

        setPendingOnMeTasks( job, jobInformationDto, pendingOnMeTasks );
        setEngagedUsers( job, jobInformationDto, engagedUsers );

        return jobInformationDto;
    }

    @Override
    public JobStateDto toJobStateDto(Job job) {
        if ( job == null ) {
            return null;
        }

        JobStateDto jobStateDto = new JobStateDto();

        jobStateDto.setCode( job.getCode() );
        if ( job.getId() != null ) {
            jobStateDto.setId( String.valueOf( job.getId() ) );
        }
        jobStateDto.setState( job.getState() );

        return jobStateDto;
    }

    @Override
    public JobPartialDto jobToJobPartialDto(Job job, Map<String, List<TaskPendingOnMeView>> taskPendingOnMeMap, List<Long> parameterIds) {
        if ( job == null ) {
            return null;
        }

        JobPartialDto jobPartialDto = new JobPartialDto();

        jobPartialDto.setRelations( IJobMapper.toRelationsDto( job.getRelationValues() ) );
        jobPartialDto.setParameterValues( IJobMapper.toParameterValuesDto( job.getParameterValues(), parameterIds ) );
        jobPartialDto.setChecklist( iChecklistMapper.toChecklistBasicDto( job.getChecklist() ) );
        jobPartialDto.setCode( job.getCode() );
        jobPartialDto.setEndedAt( job.getEndedAt() );
        jobPartialDto.setExpectedEndDate( job.getExpectedEndDate() );
        jobPartialDto.setExpectedStartDate( job.getExpectedStartDate() );
        if ( job.getId() != null ) {
            jobPartialDto.setId( String.valueOf( job.getId() ) );
        }
        jobPartialDto.setScheduler( schedulerToSchedulerPartialDto( job.getScheduler(), taskPendingOnMeMap, parameterIds ) );
        if ( job.getSchedulerId() != null ) {
            jobPartialDto.setSchedulerId( String.valueOf( job.getSchedulerId() ) );
        }
        jobPartialDto.setStartedAt( job.getStartedAt() );
        jobPartialDto.setState( job.getState() );

        setPendingOnMeTasks( job, jobPartialDto, taskPendingOnMeMap );

        return jobPartialDto;
    }

    @Override
    public List<JobPartialDto> jobToJobPartialDto(List<Job> jobs, Map<String, List<TaskPendingOnMeView>> taskPendingOnMeMap, List<Long> parameterIds) {
        if ( jobs == null ) {
            return null;
        }

        List<JobPartialDto> list = new ArrayList<JobPartialDto>( jobs.size() );
        for ( Job job : jobs ) {
            list.add( jobToJobPartialDto( job, taskPendingOnMeMap, parameterIds ) );
        }

        return list;
    }

    @Override
    public JobAutoSuggestDto jobToJobAutoSuggestDto(Job job) {
        if ( job == null ) {
            return null;
        }

        JobAutoSuggestDto jobAutoSuggestDto = new JobAutoSuggestDto();

        jobAutoSuggestDto.setName( jobChecklistName( job ) );
        jobAutoSuggestDto.setCode( job.getCode() );
        if ( job.getId() != null ) {
            jobAutoSuggestDto.setId( String.valueOf( job.getId() ) );
        }

        return jobAutoSuggestDto;
    }

    @Override
    public List<JobAutoSuggestDto> jobToJobAutoSuggestDto(List<Job> jobs) {
        if ( jobs == null ) {
            return null;
        }

        List<JobAutoSuggestDto> list = new ArrayList<JobAutoSuggestDto>( jobs.size() );
        for ( Job job : jobs ) {
            list.add( jobToJobAutoSuggestDto( job ) );
        }

        return list;
    }

    @Override
    public JobReportDto toJobReportDto(Job job) {
        if ( job == null ) {
            return null;
        }

        JobReportDto jobReportDto = new JobReportDto();

        jobReportDto.setRelations( IJobMapper.toRelationsDto( job.getRelationValues() ) );
        jobReportDto.setChecklist( iChecklistMapper.toChecklistInfoJobReportDto( job.getChecklist() ) );
        jobReportDto.setCode( job.getCode() );
        jobReportDto.setCreatedAt( job.getCreatedAt() );
        jobReportDto.setCreatedBy( userToUserAuditDto( job.getCreatedBy() ) );
        jobReportDto.setEndedAt( job.getEndedAt() );
        jobReportDto.setEndedBy( userToUserAuditDto( job.getEndedBy() ) );
        if ( job.getId() != null ) {
            jobReportDto.setId( String.valueOf( job.getId() ) );
        }
        jobReportDto.setParameterValues( parameterValueSetToParameterDtoList( job.getParameterValues() ) );
        jobReportDto.setStartedAt( job.getStartedAt() );
        jobReportDto.setStartedBy( userToUserAuditDto( job.getStartedBy() ) );
        jobReportDto.setState( job.getState() );

        return jobReportDto;
    }

    @Override
    public JobPrintDto toJobPrintDto(Job job, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( job == null ) {
            return null;
        }

        JobPrintDto jobPrintDto = new JobPrintDto();

        jobPrintDto.setRelations( IJobMapper.toRelationsDto( job.getRelationValues() ) );
        jobPrintDto.setChecklist( iChecklistMapper.toChecklistJobDto( job.getChecklist(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobPrintDto.setCode( job.getCode() );
        jobPrintDto.setCreatedAt( job.getCreatedAt() );
        jobPrintDto.setCreatedBy( userToUserAuditDto1( job.getCreatedBy(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobPrintDto.setEndedAt( job.getEndedAt() );
        jobPrintDto.setEndedBy( userToUserAuditDto1( job.getEndedBy(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobPrintDto.setExpectedEndDate( job.getExpectedEndDate() );
        jobPrintDto.setExpectedStartDate( job.getExpectedStartDate() );
        if ( job.getId() != null ) {
            jobPrintDto.setId( String.valueOf( job.getId() ) );
        }
        jobPrintDto.setParameterValues( parameterValueSetToParameterDtoList1( job.getParameterValues(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobPrintDto.setScheduler( schedulerToSchedulerPartialDto1( job.getScheduler(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobPrintDto.setStartedAt( job.getStartedAt() );
        jobPrintDto.setStartedBy( userToUserAuditDto1( job.getStartedBy(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        jobPrintDto.setState( job.getState() );

        return jobPrintDto;
    }

    protected TaskAutomationMapping automationDtoToTaskAutomationMapping(AutomationDto automationDto) {
        if ( automationDto == null ) {
            return null;
        }

        TaskAutomationMapping taskAutomationMapping = new TaskAutomationMapping();

        taskAutomationMapping.setDisplayName( automationDto.getDisplayName() );
        taskAutomationMapping.setOrderTree( automationDto.getOrderTree() );

        return taskAutomationMapping;
    }

    protected Set<TaskAutomationMapping> automationDtoListToTaskAutomationMappingSet(List<AutomationDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<TaskAutomationMapping> set = new HashSet<TaskAutomationMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( AutomationDto automationDto : list ) {
            set.add( automationDtoToTaskAutomationMapping( automationDto ) );
        }

        return set;
    }

    protected TaskMediaMapping mediaDtoToTaskMediaMapping(MediaDto mediaDto) {
        if ( mediaDto == null ) {
            return null;
        }

        TaskMediaMapping taskMediaMapping = new TaskMediaMapping();

        return taskMediaMapping;
    }

    protected Set<TaskMediaMapping> mediaDtoListToTaskMediaMappingSet(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<TaskMediaMapping> set = new HashSet<TaskMediaMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( MediaDto mediaDto : list ) {
            set.add( mediaDtoToTaskMediaMapping( mediaDto ) );
        }

        return set;
    }

    protected com.leucine.streem.model.Parameter parameterDtoToParameter(ParameterDto parameterDto) {
        if ( parameterDto == null ) {
            return null;
        }

        com.leucine.streem.model.Parameter parameter = new com.leucine.streem.model.Parameter();

        if ( parameterDto.getId() != null ) {
            parameter.setId( Long.parseLong( parameterDto.getId() ) );
        }
        parameter.setAutoInitialize( parameterDto.getAutoInitialize() );
        parameter.setAutoInitialized( parameterDto.isAutoInitialized() );
        parameter.setData( parameterDto.getData() );
        parameter.setDescription( parameterDto.getDescription() );
        parameter.setHidden( parameterDto.isHidden() );
        parameter.setLabel( parameterDto.getLabel() );
        parameter.setMandatory( parameterDto.isMandatory() );
        parameter.setMetadata( parameterDto.getMetadata() );
        parameter.setOrderTree( parameterDto.getOrderTree() );
        parameter.setRules( parameterDto.getRules() );
        parameter.setTargetEntityType( parameterDto.getTargetEntityType() );
        if ( parameterDto.getType() != null ) {
            parameter.setType( Enum.valueOf( Parameter.class, parameterDto.getType() ) );
        }
        parameter.setValidations( parameterDto.getValidations() );
        parameter.setVerificationType( parameterDto.getVerificationType() );

        return parameter;
    }

    protected Set<com.leucine.streem.model.Parameter> parameterDtoListToParameterSet(List<ParameterDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<com.leucine.streem.model.Parameter> set = new HashSet<com.leucine.streem.model.Parameter>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ParameterDto parameterDto : list ) {
            set.add( parameterDtoToParameter( parameterDto ) );
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

    protected Task taskDtoToTask(TaskDto taskDto) {
        if ( taskDto == null ) {
            return null;
        }

        Task task = new Task();

        if ( taskDto.getId() != null ) {
            task.setId( Long.parseLong( taskDto.getId() ) );
        }
        task.setAutomations( automationDtoListToTaskAutomationMappingSet( taskDto.getAutomations() ) );
        task.setEnableRecurrence( taskDto.isEnableRecurrence() );
        task.setEnableScheduling( taskDto.isEnableScheduling() );
        task.setHasBulkVerification( taskDto.isHasBulkVerification() );
        task.setHasExecutorLock( taskDto.isHasExecutorLock() );
        task.setHasInterlocks( taskDto.isHasInterlocks() );
        task.setHasStop( taskDto.isHasStop() );
        task.setMandatory( taskDto.isMandatory() );
        task.setMaxPeriod( taskDto.getMaxPeriod() );
        task.setMedias( mediaDtoListToTaskMediaMappingSet( taskDto.getMedias() ) );
        task.setMinPeriod( taskDto.getMinPeriod() );
        task.setName( taskDto.getName() );
        task.setOrderTree( taskDto.getOrderTree() );
        task.setParameters( parameterDtoListToParameterSet( taskDto.getParameters() ) );
        task.setSoloTask( taskDto.isSoloTask() );
        task.setTaskRecurrence( setTaskRecurrentRequestToTaskRecurrence( taskDto.getTaskRecurrence() ) );
        task.setTaskSchedules( taskSchedulesRequestToTaskSchedules( taskDto.getTaskSchedules() ) );
        task.setTimed( taskDto.isTimed() );
        task.setTimerOperator( taskDto.getTimerOperator() );

        return task;
    }

    protected Set<Task> taskDtoListToTaskSet(List<TaskDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Task> set = new HashSet<Task>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( TaskDto taskDto : list ) {
            set.add( taskDtoToTask( taskDto ) );
        }

        return set;
    }

    protected Stage stageDtoToStage(StageDto stageDto) {
        if ( stageDto == null ) {
            return null;
        }

        Stage stage = new Stage();

        if ( stageDto.getId() != null ) {
            stage.setId( Long.parseLong( stageDto.getId() ) );
        }
        stage.setName( stageDto.getName() );
        stage.setOrderTree( stageDto.getOrderTree() );
        stage.setTasks( taskDtoListToTaskSet( stageDto.getTasks() ) );

        return stage;
    }

    protected Set<Stage> stageDtoListToStageSet(List<StageDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Stage> set = new HashSet<Stage>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( StageDto stageDto : list ) {
            set.add( stageDtoToStage( stageDto ) );
        }

        return set;
    }

    protected Checklist checklistJobDtoToChecklist(ChecklistJobDto checklistJobDto) {
        if ( checklistJobDto == null ) {
            return null;
        }

        Checklist checklist = new Checklist();

        if ( checklistJobDto.getId() != null ) {
            checklist.setId( Long.parseLong( checklistJobDto.getId() ) );
        }
        checklist.setArchived( checklistJobDto.isArchived() );
        checklist.setCode( checklistJobDto.getCode() );
        checklist.setColorCode( checklistJobDto.getColorCode() );
        checklist.setGlobal( checklistJobDto.isGlobal() );
        checklist.setName( checklistJobDto.getName() );
        checklist.setStages( stageDtoListToStageSet( checklistJobDto.getStages() ) );

        return checklist;
    }

    protected ParameterValue parameterDtoToParameterValue(ParameterDto parameterDto) {
        if ( parameterDto == null ) {
            return null;
        }

        ParameterValue parameterValue = new ParameterValue();

        if ( parameterDto.getId() != null ) {
            parameterValue.setId( Long.parseLong( parameterDto.getId() ) );
        }
        parameterValue.setHidden( parameterDto.isHidden() );

        return parameterValue;
    }

    protected Set<ParameterValue> parameterDtoListToParameterValueSet(List<ParameterDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<ParameterValue> set = new HashSet<ParameterValue>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ParameterDto parameterDto : list ) {
            set.add( parameterDtoToParameterValue( parameterDto ) );
        }

        return set;
    }

    protected AutomationDto taskAutomationMappingToAutomationDto(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }

        AutomationDto automationDto = new AutomationDto();

        automationDto.setDisplayName( taskAutomationMapping.getDisplayName() );
        automationDto.setOrderTree( taskAutomationMapping.getOrderTree() );

        return automationDto;
    }

    protected List<AutomationDto> taskAutomationMappingSetToAutomationDtoList(Set<TaskAutomationMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<AutomationDto> list = new ArrayList<AutomationDto>( set.size() );
        for ( TaskAutomationMapping taskAutomationMapping : set ) {
            list.add( taskAutomationMappingToAutomationDto( taskAutomationMapping ) );
        }

        return list;
    }

    protected MediaDto taskMediaMappingToMediaDto(TaskMediaMapping taskMediaMapping) {
        if ( taskMediaMapping == null ) {
            return null;
        }

        MediaDto mediaDto = new MediaDto();

        return mediaDto;
    }

    protected List<MediaDto> taskMediaMappingSetToMediaDtoList(Set<TaskMediaMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( TaskMediaMapping taskMediaMapping : set ) {
            list.add( taskMediaMappingToMediaDto( taskMediaMapping ) );
        }

        return list;
    }

    protected ParameterDto parameterToParameterDto(com.leucine.streem.model.Parameter parameter) {
        if ( parameter == null ) {
            return null;
        }

        ParameterDto parameterDto = new ParameterDto();

        parameterDto.setAutoInitialize( parameter.getAutoInitialize() );
        parameterDto.setAutoInitialized( parameter.isAutoInitialized() );
        parameterDto.setData( parameter.getData() );
        parameterDto.setDescription( parameter.getDescription() );
        parameterDto.setHidden( parameter.isHidden() );
        if ( parameter.getId() != null ) {
            parameterDto.setId( String.valueOf( parameter.getId() ) );
        }
        parameterDto.setLabel( parameter.getLabel() );
        parameterDto.setMandatory( parameter.isMandatory() );
        parameterDto.setMetadata( parameter.getMetadata() );
        if ( parameter.getOrderTree() != null ) {
            parameterDto.setOrderTree( parameter.getOrderTree() );
        }
        parameterDto.setRules( parameter.getRules() );
        parameterDto.setTargetEntityType( parameter.getTargetEntityType() );
        if ( parameter.getType() != null ) {
            parameterDto.setType( parameter.getType().name() );
        }
        parameterDto.setValidations( parameter.getValidations() );
        parameterDto.setVerificationType( parameter.getVerificationType() );

        return parameterDto;
    }

    protected List<ParameterDto> parameterSetToParameterDtoList(Set<com.leucine.streem.model.Parameter> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterDto> list = new ArrayList<ParameterDto>( set.size() );
        for ( com.leucine.streem.model.Parameter parameter : set ) {
            list.add( parameterToParameterDto( parameter ) );
        }

        return list;
    }

    protected SetTaskRecurrentRequest taskRecurrenceToSetTaskRecurrentRequest(TaskRecurrence taskRecurrence) {
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

    protected TaskSchedulesRequest taskSchedulesToTaskSchedulesRequest(TaskSchedules taskSchedules) {
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

    protected TaskDto taskToTaskDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setAutomations( taskAutomationMappingSetToAutomationDtoList( task.getAutomations() ) );
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
        taskDto.setMedias( taskMediaMappingSetToMediaDtoList( task.getMedias() ) );
        taskDto.setMinPeriod( task.getMinPeriod() );
        taskDto.setName( task.getName() );
        if ( task.getOrderTree() != null ) {
            taskDto.setOrderTree( task.getOrderTree() );
        }
        taskDto.setParameters( parameterSetToParameterDtoList( task.getParameters() ) );
        taskDto.setSoloTask( task.isSoloTask() );
        taskDto.setTaskRecurrence( taskRecurrenceToSetTaskRecurrentRequest( task.getTaskRecurrence() ) );
        taskDto.setTaskSchedules( taskSchedulesToTaskSchedulesRequest( task.getTaskSchedules() ) );
        taskDto.setTimed( task.isTimed() );
        taskDto.setTimerOperator( task.getTimerOperator() );

        return taskDto;
    }

    protected List<TaskDto> taskSetToTaskDtoList(Set<Task> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskDto> list = new ArrayList<TaskDto>( set.size() );
        for ( Task task : set ) {
            list.add( taskToTaskDto( task ) );
        }

        return list;
    }

    protected StageDto stageToStageDto(Stage stage) {
        if ( stage == null ) {
            return null;
        }

        StageDto stageDto = new StageDto();

        if ( stage.getId() != null ) {
            stageDto.setId( String.valueOf( stage.getId() ) );
        }
        stageDto.setName( stage.getName() );
        if ( stage.getOrderTree() != null ) {
            stageDto.setOrderTree( stage.getOrderTree() );
        }
        stageDto.setTasks( taskSetToTaskDtoList( stage.getTasks() ) );

        return stageDto;
    }

    protected List<StageDto> stageSetToStageDtoList(Set<Stage> set) {
        if ( set == null ) {
            return null;
        }

        List<StageDto> list = new ArrayList<StageDto>( set.size() );
        for ( Stage stage : set ) {
            list.add( stageToStageDto( stage ) );
        }

        return list;
    }

    protected ChecklistJobDto checklistToChecklistJobDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistJobDto checklistJobDto = new ChecklistJobDto();

        checklistJobDto.setArchived( checklist.isArchived() );
        checklistJobDto.setCode( checklist.getCode() );
        checklistJobDto.setColorCode( checklist.getColorCode() );
        checklistJobDto.setGlobal( checklist.isGlobal() );
        if ( checklist.getId() != null ) {
            checklistJobDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistJobDto.setName( checklist.getName() );
        checklistJobDto.setStages( stageSetToStageDtoList( checklist.getStages() ) );

        return checklistJobDto;
    }

    protected ParameterDto parameterValueToParameterDto(ParameterValue parameterValue) {
        if ( parameterValue == null ) {
            return null;
        }

        ParameterDto parameterDto = new ParameterDto();

        parameterDto.setHidden( parameterValue.isHidden() );
        if ( parameterValue.getId() != null ) {
            parameterDto.setId( String.valueOf( parameterValue.getId() ) );
        }

        return parameterDto;
    }

    protected List<ParameterDto> parameterValueSetToParameterDtoList(Set<ParameterValue> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterDto> list = new ArrayList<ParameterDto>( set.size() );
        for ( ParameterValue parameterValue : set ) {
            list.add( parameterValueToParameterDto( parameterValue ) );
        }

        return list;
    }

    protected ParameterDto parameterValueToParameterDto1(ParameterValue parameterValue, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( parameterValue == null ) {
            return null;
        }

        ParameterDto parameterDto = new ParameterDto();

        parameterDto.setHidden( parameterValue.isHidden() );
        if ( parameterValue.getId() != null ) {
            parameterDto.setId( String.valueOf( parameterValue.getId() ) );
        }

        return parameterDto;
    }

    protected List<ParameterDto> parameterValueSetToParameterDtoList1(Set<ParameterValue> set, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( set == null ) {
            return null;
        }

        List<ParameterDto> list = new ArrayList<ParameterDto>( set.size() );
        for ( ParameterValue parameterValue : set ) {
            list.add( parameterValueToParameterDto1( parameterValue, parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        }

        return list;
    }

    protected OrganisationDto organisationToOrganisationDto(Organisation organisation, Map<String, List<TaskPendingOnMeView>> pendingOnMeTasks, List<EngagedUserView> engagedUsers, List<Long> parameterIds) {
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

    protected UserDto userToUserDto(User user, Map<String, List<TaskPendingOnMeView>> pendingOnMeTasks, List<EngagedUserView> engagedUsers, List<Long> parameterIds) {
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
        userDto.setOrganisation( organisationToOrganisationDto( user.getOrganisation(), pendingOnMeTasks, engagedUsers, parameterIds ) );
        userDto.setUsername( user.getUsername() );

        return userDto;
    }

    protected SchedulerPartialDto schedulerToSchedulerPartialDto(Scheduler scheduler, Map<String, List<TaskPendingOnMeView>> taskPendingOnMeMap, List<Long> parameterIds) {
        if ( scheduler == null ) {
            return null;
        }

        SchedulerPartialDto schedulerPartialDto = new SchedulerPartialDto();

        schedulerPartialDto.setArchived( scheduler.isArchived() );
        if ( scheduler.getChecklistId() != null ) {
            schedulerPartialDto.setChecklistId( String.valueOf( scheduler.getChecklistId() ) );
        }
        schedulerPartialDto.setChecklistName( scheduler.getChecklistName() );
        schedulerPartialDto.setCode( scheduler.getCode() );
        schedulerPartialDto.setCustomRecurrence( scheduler.isCustomRecurrence() );
        schedulerPartialDto.setDeprecatedAt( scheduler.getDeprecatedAt() );
        if ( scheduler.getId() != null ) {
            schedulerPartialDto.setId( String.valueOf( scheduler.getId() ) );
        }
        schedulerPartialDto.setName( scheduler.getName() );
        schedulerPartialDto.setRecurrenceRule( scheduler.getRecurrenceRule() );

        return schedulerPartialDto;
    }

    private String jobChecklistName(Job job) {
        if ( job == null ) {
            return null;
        }
        Checklist checklist = job.getChecklist();
        if ( checklist == null ) {
            return null;
        }
        String name = checklist.getName();
        if ( name == null ) {
            return null;
        }
        return name;
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

    protected UserAuditDto userToUserAuditDto1(User user, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
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

    protected SchedulerPartialDto schedulerToSchedulerPartialDto1(Scheduler scheduler, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( scheduler == null ) {
            return null;
        }

        SchedulerPartialDto schedulerPartialDto = new SchedulerPartialDto();

        schedulerPartialDto.setArchived( scheduler.isArchived() );
        if ( scheduler.getChecklistId() != null ) {
            schedulerPartialDto.setChecklistId( String.valueOf( scheduler.getChecklistId() ) );
        }
        schedulerPartialDto.setChecklistName( scheduler.getChecklistName() );
        schedulerPartialDto.setCode( scheduler.getCode() );
        schedulerPartialDto.setCustomRecurrence( scheduler.isCustomRecurrence() );
        schedulerPartialDto.setDeprecatedAt( scheduler.getDeprecatedAt() );
        if ( scheduler.getId() != null ) {
            schedulerPartialDto.setId( String.valueOf( scheduler.getId() ) );
        }
        schedulerPartialDto.setName( scheduler.getName() );
        schedulerPartialDto.setRecurrenceRule( scheduler.getRecurrenceRule() );

        return schedulerPartialDto;
    }
}
