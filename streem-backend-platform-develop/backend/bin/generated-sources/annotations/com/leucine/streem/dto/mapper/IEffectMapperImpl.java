package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.Effect;
import com.leucine.streem.dto.EffectDto;
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
public class IEffectMapperImpl implements IEffectMapper {

    @Override
    public EffectDto toDto(Effect e) {
        if ( e == null ) {
            return null;
        }

        EffectDto effectDto = new EffectDto();

        if ( e.getActionsId() != null ) {
            effectDto.setActionsId( String.valueOf( e.getActionsId() ) );
        }
        effectDto.setApiEndpoint( e.getApiEndpoint() );
        effectDto.setApiHeaders( e.getApiHeaders() );
        effectDto.setApiMethod( e.getApiMethod() );
        effectDto.setApiPayload( e.getApiPayload() );
        effectDto.setArchived( e.isArchived() );
        effectDto.setDescription( e.getDescription() );
        effectDto.setEffectType( e.getEffectType() );
        if ( e.getId() != null ) {
            effectDto.setId( String.valueOf( e.getId() ) );
        }
        effectDto.setJavascriptEnabled( e.isJavascriptEnabled() );
        effectDto.setName( e.getName() );
        effectDto.setOrderTree( e.getOrderTree() );
        effectDto.setQuery( e.getQuery() );

        return effectDto;
    }

    @Override
    public Effect toEntity(EffectDto d) {
        if ( d == null ) {
            return null;
        }

        Effect effect = new Effect();

        if ( d.getId() != null ) {
            effect.setId( Long.parseLong( d.getId() ) );
        }
        if ( d.getActionsId() != null ) {
            effect.setActionsId( Long.parseLong( d.getActionsId() ) );
        }
        effect.setApiEndpoint( d.getApiEndpoint() );
        effect.setApiHeaders( d.getApiHeaders() );
        effect.setApiMethod( d.getApiMethod() );
        effect.setApiPayload( d.getApiPayload() );
        effect.setArchived( d.isArchived() );
        effect.setDescription( d.getDescription() );
        effect.setEffectType( d.getEffectType() );
        effect.setJavascriptEnabled( d.isJavascriptEnabled() );
        effect.setName( d.getName() );
        effect.setOrderTree( d.getOrderTree() );
        effect.setQuery( d.getQuery() );

        return effect;
    }

    @Override
    public List<EffectDto> toDto(List<Effect> list) {
        if ( list == null ) {
            return null;
        }

        List<EffectDto> list1 = new ArrayList<EffectDto>( list.size() );
        for ( Effect effect : list ) {
            list1.add( toDto( effect ) );
        }

        return list1;
    }

    @Override
    public List<Effect> toEntity(List<EffectDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Effect> list1 = new ArrayList<Effect>( list.size() );
        for ( EffectDto effectDto : list ) {
            list1.add( toEntity( effectDto ) );
        }

        return list1;
    }

    @Override
    public List<EffectDto> toDto(Set<Effect> set) {
        if ( set == null ) {
            return null;
        }

        List<EffectDto> list = new ArrayList<EffectDto>( set.size() );
        for ( Effect effect : set ) {
            list.add( toDto( effect ) );
        }

        return list;
    }

    @Override
    public List<Effect> toEntity(Set<EffectDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Effect> list = new ArrayList<Effect>( set.size() );
        for ( EffectDto effectDto : set ) {
            list.add( toEntity( effectDto ) );
        }

        return list;
    }

    @Override
    public ImportEffectRequest toImport(Effect entity) {
        if ( entity == null ) {
            return null;
        }

        ImportEffectRequest importEffectRequest = new ImportEffectRequest();

        importEffectRequest.setApiEndpoint( entity.getApiEndpoint() );
        importEffectRequest.setApiHeaders( entity.getApiHeaders() );
        importEffectRequest.setApiMethod( entity.getApiMethod() );
        importEffectRequest.setApiPayload( entity.getApiPayload() );
        importEffectRequest.setArchived( entity.isArchived() );
        importEffectRequest.setDescription( entity.getDescription() );
        importEffectRequest.setEffectType( entity.getEffectType() );
        importEffectRequest.setJavascriptEnabled( entity.isJavascriptEnabled() );
        importEffectRequest.setName( entity.getName() );
        importEffectRequest.setOrderTree( entity.getOrderTree() );
        importEffectRequest.setQuery( entity.getQuery() );
        if ( entity.getId() != null ) {
            importEffectRequest.setId( String.valueOf( entity.getId() ) );
        }

        return importEffectRequest;
    }

    @Override
    public List<ImportEffectRequest> toImport(List<Effect> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ImportEffectRequest> list = new ArrayList<ImportEffectRequest>( entities.size() );
        for ( Effect effect : entities ) {
            list.add( toImport( effect ) );
        }

        return list;
    }

    @Override
    public List<EffectDto> toExport(List<Effect> effects) {
        if ( effects == null ) {
            return null;
        }

        List<EffectDto> list = new ArrayList<EffectDto>( effects.size() );
        for ( Effect effect : effects ) {
            list.add( toDto( effect ) );
        }

        return list;
    }
}
