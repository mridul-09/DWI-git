package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.TaskSchedulesDto;
import com.leucine.streem.model.TaskSchedules;
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
public class ITaskSchedulesMapperImpl implements ITaskSchedulesMapper {

    @Override
    public TaskSchedulesDto toDto(TaskSchedules e) {
        if ( e == null ) {
            return null;
        }

        TaskSchedulesDto taskSchedulesDto = new TaskSchedulesDto();

        taskSchedulesDto.setCondition( e.getCondition() );
        taskSchedulesDto.setDueDateDuration( e.getDueDateDuration() );
        taskSchedulesDto.setDueDateInterval( e.getDueDateInterval() );
        if ( e.getReferencedTaskId() != null ) {
            taskSchedulesDto.setReferencedTaskId( String.valueOf( e.getReferencedTaskId() ) );
        }
        taskSchedulesDto.setStartDateDuration( e.getStartDateDuration() );
        taskSchedulesDto.setStartDateInterval( e.getStartDateInterval() );
        taskSchedulesDto.setType( e.getType() );

        return taskSchedulesDto;
    }

    @Override
    public TaskSchedules toEntity(TaskSchedulesDto d) {
        if ( d == null ) {
            return null;
        }

        TaskSchedules taskSchedules = new TaskSchedules();

        taskSchedules.setCondition( d.getCondition() );
        taskSchedules.setDueDateDuration( d.getDueDateDuration() );
        taskSchedules.setDueDateInterval( d.getDueDateInterval() );
        if ( d.getReferencedTaskId() != null ) {
            taskSchedules.setReferencedTaskId( Long.parseLong( d.getReferencedTaskId() ) );
        }
        taskSchedules.setStartDateDuration( d.getStartDateDuration() );
        taskSchedules.setStartDateInterval( d.getStartDateInterval() );
        taskSchedules.setType( d.getType() );

        return taskSchedules;
    }

    @Override
    public List<TaskSchedulesDto> toDto(List<TaskSchedules> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskSchedulesDto> list1 = new ArrayList<TaskSchedulesDto>( list.size() );
        for ( TaskSchedules taskSchedules : list ) {
            list1.add( toDto( taskSchedules ) );
        }

        return list1;
    }

    @Override
    public List<TaskSchedules> toEntity(List<TaskSchedulesDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskSchedules> list1 = new ArrayList<TaskSchedules>( list.size() );
        for ( TaskSchedulesDto taskSchedulesDto : list ) {
            list1.add( toEntity( taskSchedulesDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskSchedulesDto> toDto(Set<TaskSchedules> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskSchedulesDto> list = new ArrayList<TaskSchedulesDto>( set.size() );
        for ( TaskSchedules taskSchedules : set ) {
            list.add( toDto( taskSchedules ) );
        }

        return list;
    }

    @Override
    public List<TaskSchedules> toEntity(Set<TaskSchedulesDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskSchedules> list = new ArrayList<TaskSchedules>( set.size() );
        for ( TaskSchedulesDto taskSchedulesDto : set ) {
            list.add( toEntity( taskSchedulesDto ) );
        }

        return list;
    }
}
