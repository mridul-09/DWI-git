package com.leucine.streem.dto.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.leucine.streem.constant.Type.AutomationActionType;
import com.leucine.streem.constant.Type.AutomationTriggerType;
import com.leucine.streem.constant.Type.AutomationType;
import com.leucine.streem.constant.Type.TargetEntityType;
import com.leucine.streem.dto.AutomationDto;
import com.leucine.streem.model.Automation;
import com.leucine.streem.model.TaskAutomationMapping;
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
public class ITaskAutomationMapperImpl extends ITaskAutomationMapper {

    @Override
    public TaskAutomationMapping toEntity(AutomationDto d) {
        if ( d == null ) {
            return null;
        }

        TaskAutomationMapping taskAutomationMapping = new TaskAutomationMapping();

        taskAutomationMapping.setDisplayName( d.getDisplayName() );
        taskAutomationMapping.setOrderTree( d.getOrderTree() );

        return taskAutomationMapping;
    }

    @Override
    public List<AutomationDto> toDto(List<TaskAutomationMapping> list) {
        if ( list == null ) {
            return null;
        }

        List<AutomationDto> list1 = new ArrayList<AutomationDto>( list.size() );
        for ( TaskAutomationMapping taskAutomationMapping : list ) {
            list1.add( toDto( taskAutomationMapping ) );
        }

        return list1;
    }

    @Override
    public List<TaskAutomationMapping> toEntity(List<AutomationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskAutomationMapping> list1 = new ArrayList<TaskAutomationMapping>( list.size() );
        for ( AutomationDto automationDto : list ) {
            list1.add( toEntity( automationDto ) );
        }

        return list1;
    }

    @Override
    public List<AutomationDto> toDto(Set<TaskAutomationMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<AutomationDto> list = new ArrayList<AutomationDto>( set.size() );
        for ( TaskAutomationMapping taskAutomationMapping : set ) {
            list.add( toDto( taskAutomationMapping ) );
        }

        return list;
    }

    @Override
    public List<TaskAutomationMapping> toEntity(Set<AutomationDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskAutomationMapping> list = new ArrayList<TaskAutomationMapping>( set.size() );
        for ( AutomationDto automationDto : set ) {
            list.add( toEntity( automationDto ) );
        }

        return list;
    }

    @Override
    public AutomationDto toDto(TaskAutomationMapping entity) {
        if ( entity == null ) {
            return null;
        }

        AutomationDto automationDto = new AutomationDto();

        Long id = entityAutomationId( entity );
        if ( id != null ) {
            automationDto.setId( String.valueOf( id ) );
        }
        automationDto.setType( entityAutomationType( entity ) );
        automationDto.setActionType( entityAutomationActionType( entity ) );
        automationDto.setActionDetails( entityAutomationActionDetails( entity ) );
        automationDto.setTriggerType( entityAutomationTriggerType( entity ) );
        automationDto.setTriggerDetails( entityAutomationTriggerDetails( entity ) );
        automationDto.setTargetEntityType( entityAutomationTargetEntityType( entity ) );
        automationDto.setOrderTree( entity.getOrderTree() );
        automationDto.setDisplayName( entity.getDisplayName() );

        return automationDto;
    }

    private Long entityAutomationId(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        Long id = automation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private AutomationType entityAutomationType(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        AutomationType type = automation.getType();
        if ( type == null ) {
            return null;
        }
        return type;
    }

    private AutomationActionType entityAutomationActionType(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        AutomationActionType actionType = automation.getActionType();
        if ( actionType == null ) {
            return null;
        }
        return actionType;
    }

    private JsonNode entityAutomationActionDetails(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        JsonNode actionDetails = automation.getActionDetails();
        if ( actionDetails == null ) {
            return null;
        }
        return actionDetails;
    }

    private AutomationTriggerType entityAutomationTriggerType(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        AutomationTriggerType triggerType = automation.getTriggerType();
        if ( triggerType == null ) {
            return null;
        }
        return triggerType;
    }

    private JsonNode entityAutomationTriggerDetails(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        JsonNode triggerDetails = automation.getTriggerDetails();
        if ( triggerDetails == null ) {
            return null;
        }
        return triggerDetails;
    }

    private TargetEntityType entityAutomationTargetEntityType(TaskAutomationMapping taskAutomationMapping) {
        if ( taskAutomationMapping == null ) {
            return null;
        }
        Automation automation = taskAutomationMapping.getAutomation();
        if ( automation == null ) {
            return null;
        }
        TargetEntityType targetEntityType = automation.getTargetEntityType();
        if ( targetEntityType == null ) {
            return null;
        }
        return targetEntityType;
    }
}
