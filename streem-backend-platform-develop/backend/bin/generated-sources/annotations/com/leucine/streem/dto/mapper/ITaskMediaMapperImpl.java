package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.model.TaskMediaMapping;
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
public class ITaskMediaMapperImpl extends ITaskMediaMapper {

    @Override
    public TaskMediaMapping toEntity(MediaDto d) {
        if ( d == null ) {
            return null;
        }

        TaskMediaMapping taskMediaMapping = new TaskMediaMapping();

        return taskMediaMapping;
    }

    @Override
    public List<MediaDto> toDto(List<TaskMediaMapping> list) {
        if ( list == null ) {
            return null;
        }

        List<MediaDto> list1 = new ArrayList<MediaDto>( list.size() );
        for ( TaskMediaMapping taskMediaMapping : list ) {
            list1.add( toDto( taskMediaMapping ) );
        }

        return list1;
    }

    @Override
    public List<TaskMediaMapping> toEntity(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskMediaMapping> list1 = new ArrayList<TaskMediaMapping>( list.size() );
        for ( MediaDto mediaDto : list ) {
            list1.add( toEntity( mediaDto ) );
        }

        return list1;
    }

    @Override
    public List<MediaDto> toDto(Set<TaskMediaMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( TaskMediaMapping taskMediaMapping : set ) {
            list.add( toDto( taskMediaMapping ) );
        }

        return list;
    }

    @Override
    public List<TaskMediaMapping> toEntity(Set<MediaDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskMediaMapping> list = new ArrayList<TaskMediaMapping>( set.size() );
        for ( MediaDto mediaDto : set ) {
            list.add( toEntity( mediaDto ) );
        }

        return list;
    }
}
