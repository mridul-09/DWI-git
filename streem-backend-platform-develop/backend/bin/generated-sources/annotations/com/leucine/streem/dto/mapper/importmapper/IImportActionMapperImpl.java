package com.leucine.streem.dto.mapper.importmapper;

import com.leucine.streem.dto.ActionDto;
import com.leucine.streem.dto.EffectDto;
import com.leucine.streem.dto.request.ImportActionRequest;
import com.leucine.streem.dto.request.ImportEffectRequest;
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
public class IImportActionMapperImpl implements IImportActionMapper {

    @Override
    public ActionDto toEntity(ImportActionRequest d) {
        if ( d == null ) {
            return null;
        }

        ActionDto actionDto = new ActionDto();

        actionDto.setDescription( d.getDescription() );
        actionDto.setFailureMessage( d.getFailureMessage() );
        actionDto.setId( d.getId() );
        actionDto.setName( d.getName() );
        actionDto.setSuccessMessage( d.getSuccessMessage() );
        if ( d.getTriggerEntityId() != null ) {
            actionDto.setTriggerEntityId( String.valueOf( d.getTriggerEntityId() ) );
        }
        actionDto.setTriggerType( d.getTriggerType() );

        return actionDto;
    }

    @Override
    public List<ImportActionRequest> toDto(List<ActionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportActionRequest> list1 = new ArrayList<ImportActionRequest>( list.size() );
        for ( ActionDto actionDto : list ) {
            list1.add( toDto( actionDto ) );
        }

        return list1;
    }

    @Override
    public List<ActionDto> toEntity(List<ImportActionRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<ActionDto> list1 = new ArrayList<ActionDto>( list.size() );
        for ( ImportActionRequest importActionRequest : list ) {
            list1.add( toEntity( importActionRequest ) );
        }

        return list1;
    }

    @Override
    public List<ImportActionRequest> toDto(Set<ActionDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ImportActionRequest> list = new ArrayList<ImportActionRequest>( set.size() );
        for ( ActionDto actionDto : set ) {
            list.add( toDto( actionDto ) );
        }

        return list;
    }

    @Override
    public List<ActionDto> toEntity(Set<ImportActionRequest> set) {
        if ( set == null ) {
            return null;
        }

        List<ActionDto> list = new ArrayList<ActionDto>( set.size() );
        for ( ImportActionRequest importActionRequest : set ) {
            list.add( toEntity( importActionRequest ) );
        }

        return list;
    }

    @Override
    public ImportActionRequest toDto(ActionDto e) {
        if ( e == null ) {
            return null;
        }

        ImportActionRequest importActionRequest = new ImportActionRequest();

        importActionRequest.setEffectRequests( effectDtoListToImportEffectRequestList( e.getEffects() ) );
        importActionRequest.setDescription( e.getDescription() );
        importActionRequest.setFailureMessage( e.getFailureMessage() );
        importActionRequest.setName( e.getName() );
        importActionRequest.setSuccessMessage( e.getSuccessMessage() );
        if ( e.getTriggerEntityId() != null ) {
            importActionRequest.setTriggerEntityId( Long.parseLong( e.getTriggerEntityId() ) );
        }
        importActionRequest.setTriggerType( e.getTriggerType() );
        importActionRequest.setId( e.getId() );

        return importActionRequest;
    }

    protected ImportEffectRequest effectDtoToImportEffectRequest(EffectDto effectDto) {
        if ( effectDto == null ) {
            return null;
        }

        ImportEffectRequest importEffectRequest = new ImportEffectRequest();

        importEffectRequest.setApiEndpoint( effectDto.getApiEndpoint() );
        importEffectRequest.setApiHeaders( effectDto.getApiHeaders() );
        importEffectRequest.setApiMethod( effectDto.getApiMethod() );
        importEffectRequest.setApiPayload( effectDto.getApiPayload() );
        importEffectRequest.setArchived( effectDto.isArchived() );
        importEffectRequest.setDescription( effectDto.getDescription() );
        importEffectRequest.setEffectType( effectDto.getEffectType() );
        importEffectRequest.setJavascriptEnabled( effectDto.isJavascriptEnabled() );
        importEffectRequest.setName( effectDto.getName() );
        importEffectRequest.setOrderTree( effectDto.getOrderTree() );
        importEffectRequest.setQuery( effectDto.getQuery() );
        importEffectRequest.setId( effectDto.getId() );

        return importEffectRequest;
    }

    protected List<ImportEffectRequest> effectDtoListToImportEffectRequestList(List<EffectDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportEffectRequest> list1 = new ArrayList<ImportEffectRequest>( list.size() );
        for ( EffectDto effectDto : list ) {
            list1.add( effectDtoToImportEffectRequest( effectDto ) );
        }

        return list1;
    }
}
