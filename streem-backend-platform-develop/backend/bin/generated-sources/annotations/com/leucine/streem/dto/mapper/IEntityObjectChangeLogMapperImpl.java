package com.leucine.streem.dto.mapper;

import com.leucine.streem.collections.changelogs.ChangeLogDataDto;
import com.leucine.streem.collections.changelogs.ChangeLogDataDto.ChangeLogDataDtoBuilder;
import com.leucine.streem.collections.changelogs.EntityObjectChangeLog;
import com.leucine.streem.collections.changelogs.EntityObjectChangeLog.EntityObjectChangeLogBuilder;
import com.leucine.streem.collections.changelogs.EntityObjectUsageStatus;
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
public class IEntityObjectChangeLogMapperImpl implements IEntityObjectChangeLogMapper {

    @Override
    public ChangeLogDataDto toDto(EntityObjectChangeLog e) {
        if ( e == null ) {
            return null;
        }

        ChangeLogDataDtoBuilder changeLogDataDto = ChangeLogDataDto.builder();

        changeLogDataDto.collection( e.getCollection() );
        changeLogDataDto.externalId( e.getExternalId() );
        changeLogDataDto.objectId( e.getObjectId() );
        changeLogDataDto.objectTypeId( e.getObjectTypeId() );
        changeLogDataDto.reason( e.getReason() );

        return changeLogDataDto.build();
    }

    @Override
    public EntityObjectChangeLog toEntity(ChangeLogDataDto d) {
        if ( d == null ) {
            return null;
        }

        EntityObjectChangeLogBuilder entityObjectChangeLog = EntityObjectChangeLog.builder();

        entityObjectChangeLog.collection( d.getCollection() );
        entityObjectChangeLog.externalId( d.getExternalId() );
        entityObjectChangeLog.objectId( d.getObjectId() );
        entityObjectChangeLog.objectTypeId( d.getObjectTypeId() );
        entityObjectChangeLog.reason( d.getReason() );

        return entityObjectChangeLog.build();
    }

    @Override
    public List<ChangeLogDataDto> toDto(List<EntityObjectChangeLog> list) {
        if ( list == null ) {
            return null;
        }

        List<ChangeLogDataDto> list1 = new ArrayList<ChangeLogDataDto>( list.size() );
        for ( EntityObjectChangeLog entityObjectChangeLog : list ) {
            list1.add( toDto( entityObjectChangeLog ) );
        }

        return list1;
    }

    @Override
    public List<EntityObjectChangeLog> toEntity(List<ChangeLogDataDto> list) {
        if ( list == null ) {
            return null;
        }

        List<EntityObjectChangeLog> list1 = new ArrayList<EntityObjectChangeLog>( list.size() );
        for ( ChangeLogDataDto changeLogDataDto : list ) {
            list1.add( toEntity( changeLogDataDto ) );
        }

        return list1;
    }

    @Override
    public List<ChangeLogDataDto> toDto(Set<EntityObjectChangeLog> set) {
        if ( set == null ) {
            return null;
        }

        List<ChangeLogDataDto> list = new ArrayList<ChangeLogDataDto>( set.size() );
        for ( EntityObjectChangeLog entityObjectChangeLog : set ) {
            list.add( toDto( entityObjectChangeLog ) );
        }

        return list;
    }

    @Override
    public List<EntityObjectChangeLog> toEntity(Set<ChangeLogDataDto> set) {
        if ( set == null ) {
            return null;
        }

        List<EntityObjectChangeLog> list = new ArrayList<EntityObjectChangeLog>( set.size() );
        for ( ChangeLogDataDto changeLogDataDto : set ) {
            list.add( toEntity( changeLogDataDto ) );
        }

        return list;
    }

    @Override
    public EntityObjectChangeLog toEntityObjectChangeLog(ChangeLogDataDto changeLogDataDto, String entityId, Long currentFacilityId) {
        if ( changeLogDataDto == null && entityId == null && currentFacilityId == null ) {
            return null;
        }

        EntityObjectChangeLogBuilder entityObjectChangeLog = EntityObjectChangeLog.builder();

        if ( changeLogDataDto != null ) {
            entityObjectChangeLog.usageStatus( changeLogDataDtoToEntityObjectUsageStatus( changeLogDataDto ) );
            entityObjectChangeLog.collection( changeLogDataDto.getCollection() );
            entityObjectChangeLog.externalId( changeLogDataDto.getExternalId() );
            entityObjectChangeLog.objectId( changeLogDataDto.getObjectId() );
            entityObjectChangeLog.objectTypeId( changeLogDataDto.getObjectTypeId() );
            entityObjectChangeLog.reason( changeLogDataDto.getReason() );
        }
        if ( entityId != null ) {
            entityObjectChangeLog.entityId( entityId );
        }
        if ( currentFacilityId != null ) {
            entityObjectChangeLog.facilityId( String.valueOf( currentFacilityId ) );
        }

        return entityObjectChangeLog.build();
    }

    protected EntityObjectUsageStatus changeLogDataDtoToEntityObjectUsageStatus(ChangeLogDataDto changeLogDataDto) {
        if ( changeLogDataDto == null ) {
            return null;
        }

        EntityObjectUsageStatus entityObjectUsageStatus = new EntityObjectUsageStatus();

        entityObjectUsageStatus.setOldStatus( changeLogDataDto.getOldUsageStatus() );
        entityObjectUsageStatus.setNewStatus( changeLogDataDto.getNewUsageStatus() );

        return entityObjectUsageStatus;
    }
}
