package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.AutomationDto;
import com.leucine.streem.dto.request.AutomationRequest;
import com.leucine.streem.model.Automation;
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
public class IAutomationMapperImpl implements IAutomationMapper {

    @Override
    public AutomationDto toDto(Automation e) {
        if ( e == null ) {
            return null;
        }

        AutomationDto automationDto = new AutomationDto();

        automationDto.setActionDetails( e.getActionDetails() );
        automationDto.setActionType( e.getActionType() );
        if ( e.getId() != null ) {
            automationDto.setId( String.valueOf( e.getId() ) );
        }
        automationDto.setTargetEntityType( e.getTargetEntityType() );
        automationDto.setTriggerDetails( e.getTriggerDetails() );
        automationDto.setTriggerType( e.getTriggerType() );
        automationDto.setType( e.getType() );

        return automationDto;
    }

    @Override
    public Automation toEntity(AutomationDto d) {
        if ( d == null ) {
            return null;
        }

        Automation automation = new Automation();

        if ( d.getId() != null ) {
            automation.setId( Long.parseLong( d.getId() ) );
        }
        automation.setActionDetails( d.getActionDetails() );
        automation.setActionType( d.getActionType() );
        automation.setTargetEntityType( d.getTargetEntityType() );
        automation.setTriggerDetails( d.getTriggerDetails() );
        automation.setTriggerType( d.getTriggerType() );
        automation.setType( d.getType() );

        return automation;
    }

    @Override
    public List<AutomationDto> toDto(List<Automation> list) {
        if ( list == null ) {
            return null;
        }

        List<AutomationDto> list1 = new ArrayList<AutomationDto>( list.size() );
        for ( Automation automation : list ) {
            list1.add( toDto( automation ) );
        }

        return list1;
    }

    @Override
    public List<Automation> toEntity(List<AutomationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Automation> list1 = new ArrayList<Automation>( list.size() );
        for ( AutomationDto automationDto : list ) {
            list1.add( toEntity( automationDto ) );
        }

        return list1;
    }

    @Override
    public List<AutomationDto> toDto(Set<Automation> set) {
        if ( set == null ) {
            return null;
        }

        List<AutomationDto> list = new ArrayList<AutomationDto>( set.size() );
        for ( Automation automation : set ) {
            list.add( toDto( automation ) );
        }

        return list;
    }

    @Override
    public List<Automation> toEntity(Set<AutomationDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Automation> list = new ArrayList<Automation>( set.size() );
        for ( AutomationDto automationDto : set ) {
            list.add( toEntity( automationDto ) );
        }

        return list;
    }

    @Override
    public Automation clone(Automation automation) {
        if ( automation == null ) {
            return null;
        }

        Automation automation1 = new Automation();

        automation1.setActionType( automation.getActionType() );
        automation1.setArchived( automation.isArchived() );
        automation1.setTargetEntityType( automation.getTargetEntityType() );
        automation1.setTriggerDetails( automation.getTriggerDetails() );
        automation1.setTriggerType( automation.getTriggerType() );
        automation1.setType( automation.getType() );

        return automation1;
    }

    @Override
    public Automation toEntity(AutomationRequest AutomationRequest) {
        if ( AutomationRequest == null ) {
            return null;
        }

        Automation automation = new Automation();

        if ( AutomationRequest.getId() != null ) {
            automation.setId( Long.parseLong( AutomationRequest.getId() ) );
        }
        automation.setActionDetails( AutomationRequest.getActionDetails() );
        automation.setActionType( AutomationRequest.getActionType() );
        automation.setTargetEntityType( AutomationRequest.getTargetEntityType() );
        automation.setTriggerDetails( AutomationRequest.getTriggerDetails() );
        automation.setTriggerType( AutomationRequest.getTriggerType() );
        automation.setType( AutomationRequest.getType() );

        return automation;
    }

    @Override
    public void update(AutomationRequest automationRequest, Automation automation) {
        if ( automationRequest == null ) {
            return;
        }

        if ( automationRequest.getId() != null ) {
            automation.setId( Long.parseLong( automationRequest.getId() ) );
        }
        else {
            automation.setId( null );
        }
        automation.setActionDetails( automationRequest.getActionDetails() );
        automation.setActionType( automationRequest.getActionType() );
        automation.setTargetEntityType( automationRequest.getTargetEntityType() );
        automation.setTriggerDetails( automationRequest.getTriggerDetails() );
        automation.setTriggerType( automationRequest.getTriggerType() );
        automation.setType( automationRequest.getType() );
    }
}
