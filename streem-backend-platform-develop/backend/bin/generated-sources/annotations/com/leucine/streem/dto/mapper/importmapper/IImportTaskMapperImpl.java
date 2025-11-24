package com.leucine.streem.dto.mapper.importmapper;

import com.leucine.streem.constant.Type.Parameter;
import com.leucine.streem.dto.AutomationDto;
import com.leucine.streem.dto.ParameterDto;
import com.leucine.streem.dto.TaskDto;
import com.leucine.streem.dto.request.AutomationRequest;
import com.leucine.streem.dto.request.ImportParameterRequest;
import com.leucine.streem.dto.request.ImportTaskRequest;
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
public class IImportTaskMapperImpl implements IImportTaskMapper {

    @Autowired
    private IImportMediaMapper iImportMediaMapper;

    @Override
    public TaskDto toEntity(ImportTaskRequest d) {
        if ( d == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setHasBulkVerification( d.isHasBulkVerification() );
        taskDto.setHasStop( d.isHasStop() );
        taskDto.setId( d.getId() );
        taskDto.setInterlocks( d.getInterlocks() );
        taskDto.setMandatory( d.isMandatory() );
        taskDto.setMaxPeriod( d.getMaxPeriod() );
        taskDto.setMinPeriod( d.getMinPeriod() );
        taskDto.setName( d.getName() );
        if ( d.getOrderTree() != null ) {
            taskDto.setOrderTree( d.getOrderTree() );
        }
        List<Long> list = d.getPrerequisiteTaskIds();
        if ( list != null ) {
            taskDto.setPrerequisiteTaskIds( new ArrayList<Long>( list ) );
        }
        taskDto.setSoloTask( d.isSoloTask() );
        taskDto.setTaskExecutorLock( d.getTaskExecutorLock() );
        taskDto.setTaskRecurrence( d.getTaskRecurrence() );
        taskDto.setTaskSchedules( d.getTaskSchedules() );
        taskDto.setTimed( d.isTimed() );
        taskDto.setTimerOperator( d.getTimerOperator() );

        return taskDto;
    }

    @Override
    public List<ImportTaskRequest> toDto(List<TaskDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportTaskRequest> list1 = new ArrayList<ImportTaskRequest>( list.size() );
        for ( TaskDto taskDto : list ) {
            list1.add( toDto( taskDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskDto> toEntity(List<ImportTaskRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskDto> list1 = new ArrayList<TaskDto>( list.size() );
        for ( ImportTaskRequest importTaskRequest : list ) {
            list1.add( toEntity( importTaskRequest ) );
        }

        return list1;
    }

    @Override
    public List<ImportTaskRequest> toDto(Set<TaskDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ImportTaskRequest> list = new ArrayList<ImportTaskRequest>( set.size() );
        for ( TaskDto taskDto : set ) {
            list.add( toDto( taskDto ) );
        }

        return list;
    }

    @Override
    public List<TaskDto> toEntity(Set<ImportTaskRequest> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskDto> list = new ArrayList<TaskDto>( set.size() );
        for ( ImportTaskRequest importTaskRequest : set ) {
            list.add( toEntity( importTaskRequest ) );
        }

        return list;
    }

    @Override
    public ImportTaskRequest toDto(TaskDto e) {
        if ( e == null ) {
            return null;
        }

        ImportTaskRequest importTaskRequest = new ImportTaskRequest();

        importTaskRequest.setParameterRequests( parameterDtoListToImportParameterRequestList( e.getParameters() ) );
        importTaskRequest.setAutomationRequests( automationDtoListToAutomationRequestList( e.getAutomations() ) );
        importTaskRequest.setMediaRequests( iImportMediaMapper.toDto( e.getMedias() ) );
        importTaskRequest.setTaskExecutorLock( e.getTaskExecutorLock() );
        importTaskRequest.setName( e.getName() );
        importTaskRequest.setOrderTree( e.getOrderTree() );
        importTaskRequest.setHasBulkVerification( e.isHasBulkVerification() );
        importTaskRequest.setHasStop( e.isHasStop() );
        importTaskRequest.setId( e.getId() );
        importTaskRequest.setInterlocks( e.getInterlocks() );
        importTaskRequest.setMandatory( e.isMandatory() );
        importTaskRequest.setMaxPeriod( e.getMaxPeriod() );
        importTaskRequest.setMinPeriod( e.getMinPeriod() );
        List<Long> list3 = e.getPrerequisiteTaskIds();
        if ( list3 != null ) {
            importTaskRequest.setPrerequisiteTaskIds( new ArrayList<Long>( list3 ) );
        }
        importTaskRequest.setSoloTask( e.isSoloTask() );
        importTaskRequest.setTaskRecurrence( e.getTaskRecurrence() );
        importTaskRequest.setTaskSchedules( e.getTaskSchedules() );
        importTaskRequest.setTimed( e.isTimed() );
        importTaskRequest.setTimerOperator( e.getTimerOperator() );

        return importTaskRequest;
    }

    protected ImportParameterRequest parameterDtoToImportParameterRequest(ParameterDto parameterDto) {
        if ( parameterDto == null ) {
            return null;
        }

        ImportParameterRequest importParameterRequest = new ImportParameterRequest();

        importParameterRequest.setAutoInitialize( parameterDto.getAutoInitialize() );
        importParameterRequest.setAutoInitialized( parameterDto.isAutoInitialized() );
        importParameterRequest.setData( parameterDto.getData() );
        importParameterRequest.setDescription( parameterDto.getDescription() );
        importParameterRequest.setExceptionApprovalType( parameterDto.getExceptionApprovalType() );
        importParameterRequest.setHidden( parameterDto.isHidden() );
        importParameterRequest.setId( parameterDto.getId() );
        importParameterRequest.setLabel( parameterDto.getLabel() );
        importParameterRequest.setMandatory( parameterDto.isMandatory() );
        importParameterRequest.setMetadata( parameterDto.getMetadata() );
        importParameterRequest.setOrderTree( parameterDto.getOrderTree() );
        importParameterRequest.setRules( parameterDto.getRules() );
        if ( parameterDto.getType() != null ) {
            importParameterRequest.setType( Enum.valueOf( Parameter.class, parameterDto.getType() ) );
        }
        importParameterRequest.setValidations( parameterDto.getValidations() );
        importParameterRequest.setVerificationType( parameterDto.getVerificationType() );

        return importParameterRequest;
    }

    protected List<ImportParameterRequest> parameterDtoListToImportParameterRequestList(List<ParameterDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportParameterRequest> list1 = new ArrayList<ImportParameterRequest>( list.size() );
        for ( ParameterDto parameterDto : list ) {
            list1.add( parameterDtoToImportParameterRequest( parameterDto ) );
        }

        return list1;
    }

    protected AutomationRequest automationDtoToAutomationRequest(AutomationDto automationDto) {
        if ( automationDto == null ) {
            return null;
        }

        AutomationRequest automationRequest = new AutomationRequest();

        automationRequest.setActionDetails( automationDto.getActionDetails() );
        automationRequest.setActionType( automationDto.getActionType() );
        automationRequest.setDisplayName( automationDto.getDisplayName() );
        automationRequest.setId( automationDto.getId() );
        automationRequest.setOrderTree( automationDto.getOrderTree() );
        automationRequest.setTargetEntityType( automationDto.getTargetEntityType() );
        automationRequest.setTriggerDetails( automationDto.getTriggerDetails() );
        automationRequest.setTriggerType( automationDto.getTriggerType() );
        automationRequest.setType( automationDto.getType() );

        return automationRequest;
    }

    protected List<AutomationRequest> automationDtoListToAutomationRequestList(List<AutomationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<AutomationRequest> list1 = new ArrayList<AutomationRequest>( list.size() );
        for ( AutomationDto automationDto : list ) {
            list1.add( automationDtoToAutomationRequest( automationDto ) );
        }

        return list1;
    }
}
