package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.TaskRecurrenceDto;
import com.leucine.streem.model.TaskRecurrence;
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
public class ITaskRecurrenceMapperImpl implements ITaskRecurrenceMapper {

    @Override
    public TaskRecurrenceDto toDto(TaskRecurrence e) {
        if ( e == null ) {
            return null;
        }

        TaskRecurrenceDto taskRecurrenceDto = new TaskRecurrenceDto();

        taskRecurrenceDto.setDueDateDuration( e.getDueDateDuration() );
        taskRecurrenceDto.setDueDateInterval( e.getDueDateInterval() );
        taskRecurrenceDto.setNegativeDueDateToleranceDuration( e.getNegativeDueDateToleranceDuration() );
        taskRecurrenceDto.setNegativeDueDateToleranceInterval( e.getNegativeDueDateToleranceInterval() );
        taskRecurrenceDto.setNegativeStartDateToleranceDuration( e.getNegativeStartDateToleranceDuration() );
        taskRecurrenceDto.setNegativeStartDateToleranceInterval( e.getNegativeStartDateToleranceInterval() );
        taskRecurrenceDto.setPositiveDueDateToleranceDuration( e.getPositiveDueDateToleranceDuration() );
        taskRecurrenceDto.setPositiveDueDateToleranceInterval( e.getPositiveDueDateToleranceInterval() );
        taskRecurrenceDto.setPositiveStartDateToleranceDuration( e.getPositiveStartDateToleranceDuration() );
        taskRecurrenceDto.setPositiveStartDateToleranceInterval( e.getPositiveStartDateToleranceInterval() );
        taskRecurrenceDto.setStartDateDuration( e.getStartDateDuration() );
        taskRecurrenceDto.setStartDateInterval( e.getStartDateInterval() );

        return taskRecurrenceDto;
    }

    @Override
    public TaskRecurrence toEntity(TaskRecurrenceDto d) {
        if ( d == null ) {
            return null;
        }

        TaskRecurrence taskRecurrence = new TaskRecurrence();

        taskRecurrence.setDueDateDuration( d.getDueDateDuration() );
        taskRecurrence.setDueDateInterval( d.getDueDateInterval() );
        taskRecurrence.setNegativeDueDateToleranceDuration( d.getNegativeDueDateToleranceDuration() );
        taskRecurrence.setNegativeDueDateToleranceInterval( d.getNegativeDueDateToleranceInterval() );
        taskRecurrence.setNegativeStartDateToleranceDuration( d.getNegativeStartDateToleranceDuration() );
        taskRecurrence.setNegativeStartDateToleranceInterval( d.getNegativeStartDateToleranceInterval() );
        taskRecurrence.setPositiveDueDateToleranceDuration( d.getPositiveDueDateToleranceDuration() );
        taskRecurrence.setPositiveDueDateToleranceInterval( d.getPositiveDueDateToleranceInterval() );
        taskRecurrence.setPositiveStartDateToleranceDuration( d.getPositiveStartDateToleranceDuration() );
        taskRecurrence.setPositiveStartDateToleranceInterval( d.getPositiveStartDateToleranceInterval() );
        taskRecurrence.setStartDateDuration( d.getStartDateDuration() );
        taskRecurrence.setStartDateInterval( d.getStartDateInterval() );

        return taskRecurrence;
    }

    @Override
    public List<TaskRecurrenceDto> toDto(List<TaskRecurrence> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskRecurrenceDto> list1 = new ArrayList<TaskRecurrenceDto>( list.size() );
        for ( TaskRecurrence taskRecurrence : list ) {
            list1.add( toDto( taskRecurrence ) );
        }

        return list1;
    }

    @Override
    public List<TaskRecurrence> toEntity(List<TaskRecurrenceDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskRecurrence> list1 = new ArrayList<TaskRecurrence>( list.size() );
        for ( TaskRecurrenceDto taskRecurrenceDto : list ) {
            list1.add( toEntity( taskRecurrenceDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskRecurrenceDto> toDto(Set<TaskRecurrence> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskRecurrenceDto> list = new ArrayList<TaskRecurrenceDto>( set.size() );
        for ( TaskRecurrence taskRecurrence : set ) {
            list.add( toDto( taskRecurrence ) );
        }

        return list;
    }

    @Override
    public List<TaskRecurrence> toEntity(Set<TaskRecurrenceDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskRecurrence> list = new ArrayList<TaskRecurrence>( set.size() );
        for ( TaskRecurrenceDto taskRecurrenceDto : set ) {
            list.add( toEntity( taskRecurrenceDto ) );
        }

        return list;
    }
}
