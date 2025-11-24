package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.ChecklistAuditDto;
import com.leucine.streem.model.ChecklistAudit;
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
public class IChecklistAuditMapperImpl implements IChecklistAuditMapper {

    @Override
    public ChecklistAuditDto toDto(ChecklistAudit e) {
        if ( e == null ) {
            return null;
        }

        ChecklistAuditDto checklistAuditDto = new ChecklistAuditDto();

        checklistAuditDto.setAction( e.getAction() );
        if ( e.getChecklistId() != null ) {
            checklistAuditDto.setChecklistId( String.valueOf( e.getChecklistId() ) );
        }
        checklistAuditDto.setDetails( e.getDetails() );
        if ( e.getId() != null ) {
            checklistAuditDto.setId( String.valueOf( e.getId() ) );
        }
        checklistAuditDto.setTriggeredAt( e.getTriggeredAt() );
        checklistAuditDto.setTriggeredBy( e.getTriggeredBy() );

        return checklistAuditDto;
    }

    @Override
    public ChecklistAudit toEntity(ChecklistAuditDto d) {
        if ( d == null ) {
            return null;
        }

        ChecklistAudit checklistAudit = new ChecklistAudit();

        if ( d.getId() != null ) {
            checklistAudit.setId( Long.parseLong( d.getId() ) );
        }
        checklistAudit.setAction( d.getAction() );
        if ( d.getChecklistId() != null ) {
            checklistAudit.setChecklistId( Long.parseLong( d.getChecklistId() ) );
        }
        checklistAudit.setDetails( d.getDetails() );
        checklistAudit.setTriggeredAt( d.getTriggeredAt() );
        checklistAudit.setTriggeredBy( d.getTriggeredBy() );

        return checklistAudit;
    }

    @Override
    public List<ChecklistAuditDto> toDto(List<ChecklistAudit> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistAuditDto> list1 = new ArrayList<ChecklistAuditDto>( list.size() );
        for ( ChecklistAudit checklistAudit : list ) {
            list1.add( toDto( checklistAudit ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistAudit> toEntity(List<ChecklistAuditDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistAudit> list1 = new ArrayList<ChecklistAudit>( list.size() );
        for ( ChecklistAuditDto checklistAuditDto : list ) {
            list1.add( toEntity( checklistAuditDto ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistAuditDto> toDto(Set<ChecklistAudit> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistAuditDto> list = new ArrayList<ChecklistAuditDto>( set.size() );
        for ( ChecklistAudit checklistAudit : set ) {
            list.add( toDto( checklistAudit ) );
        }

        return list;
    }

    @Override
    public List<ChecklistAudit> toEntity(Set<ChecklistAuditDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistAudit> list = new ArrayList<ChecklistAudit>( set.size() );
        for ( ChecklistAuditDto checklistAuditDto : set ) {
            list.add( toEntity( checklistAuditDto ) );
        }

        return list;
    }
}
