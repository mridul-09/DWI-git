package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.ActionDto;
import com.leucine.streem.dto.request.ImportActionRequest;
import com.leucine.streem.model.Action;
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
public class IActionMapperImpl implements IActionMapper {

    @Override
    public ActionDto toDto(Action e) {
        if ( e == null ) {
            return null;
        }

        ActionDto actionDto = new ActionDto();

        actionDto.setDescription( e.getDescription() );
        actionDto.setFailureMessage( e.getFailureMessage() );
        if ( e.getId() != null ) {
            actionDto.setId( String.valueOf( e.getId() ) );
        }
        actionDto.setName( e.getName() );
        actionDto.setSuccessMessage( e.getSuccessMessage() );
        if ( e.getTriggerEntityId() != null ) {
            actionDto.setTriggerEntityId( String.valueOf( e.getTriggerEntityId() ) );
        }
        actionDto.setTriggerType( e.getTriggerType() );

        return actionDto;
    }

    @Override
    public Action toEntity(ActionDto d) {
        if ( d == null ) {
            return null;
        }

        Action action = new Action();

        if ( d.getId() != null ) {
            action.setId( Long.parseLong( d.getId() ) );
        }
        action.setDescription( d.getDescription() );
        action.setFailureMessage( d.getFailureMessage() );
        action.setName( d.getName() );
        action.setSuccessMessage( d.getSuccessMessage() );
        if ( d.getTriggerEntityId() != null ) {
            action.setTriggerEntityId( Long.parseLong( d.getTriggerEntityId() ) );
        }
        action.setTriggerType( d.getTriggerType() );

        return action;
    }

    @Override
    public List<ActionDto> toDto(List<Action> list) {
        if ( list == null ) {
            return null;
        }

        List<ActionDto> list1 = new ArrayList<ActionDto>( list.size() );
        for ( Action action : list ) {
            list1.add( toDto( action ) );
        }

        return list1;
    }

    @Override
    public List<Action> toEntity(List<ActionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Action> list1 = new ArrayList<Action>( list.size() );
        for ( ActionDto actionDto : list ) {
            list1.add( toEntity( actionDto ) );
        }

        return list1;
    }

    @Override
    public List<ActionDto> toDto(Set<Action> set) {
        if ( set == null ) {
            return null;
        }

        List<ActionDto> list = new ArrayList<ActionDto>( set.size() );
        for ( Action action : set ) {
            list.add( toDto( action ) );
        }

        return list;
    }

    @Override
    public List<Action> toEntity(Set<ActionDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Action> list = new ArrayList<Action>( set.size() );
        for ( ActionDto actionDto : set ) {
            list.add( toEntity( actionDto ) );
        }

        return list;
    }

    @Override
    public ImportActionRequest toImport(Action entity) {
        if ( entity == null ) {
            return null;
        }

        ImportActionRequest importActionRequest = new ImportActionRequest();

        importActionRequest.setChecklistId( entity.getChecklistId() );
        importActionRequest.setDescription( entity.getDescription() );
        importActionRequest.setFailureMessage( entity.getFailureMessage() );
        importActionRequest.setName( entity.getName() );
        importActionRequest.setSuccessMessage( entity.getSuccessMessage() );
        importActionRequest.setTriggerEntityId( entity.getTriggerEntityId() );
        importActionRequest.setTriggerType( entity.getTriggerType() );
        if ( entity.getId() != null ) {
            importActionRequest.setId( String.valueOf( entity.getId() ) );
        }

        return importActionRequest;
    }

    @Override
    public List<ImportActionRequest> toImport(List<Action> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportActionRequest> list1 = new ArrayList<ImportActionRequest>( list.size() );
        for ( Action action : list ) {
            list1.add( toImport( action ) );
        }

        return list1;
    }

    @Override
    public List<ActionDto> toExport(List<Action> actions) {
        if ( actions == null ) {
            return null;
        }

        List<ActionDto> list = new ArrayList<ActionDto>( actions.size() );
        for ( Action action : actions ) {
            list.add( toDto( action ) );
        }

        return list;
    }
}
