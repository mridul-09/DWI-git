package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.TaskExecutorLockDto;
import com.leucine.streem.model.TaskExecutorLock;
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
public class ITaskExecutorLockMapperImpl implements ITaskExecutorLockMapper {

    @Override
    public TaskExecutorLockDto toDto(TaskExecutorLock e) {
        if ( e == null ) {
            return null;
        }

        TaskExecutorLockDto taskExecutorLockDto = new TaskExecutorLockDto();

        taskExecutorLockDto.setLockType( e.getLockType() );
        taskExecutorLockDto.setReferencedTaskId( e.getReferencedTaskId() );
        taskExecutorLockDto.setTaskId( e.getTaskId() );

        return taskExecutorLockDto;
    }

    @Override
    public TaskExecutorLock toEntity(TaskExecutorLockDto d) {
        if ( d == null ) {
            return null;
        }

        TaskExecutorLock taskExecutorLock = new TaskExecutorLock();

        taskExecutorLock.setLockType( d.getLockType() );
        taskExecutorLock.setReferencedTaskId( d.getReferencedTaskId() );
        taskExecutorLock.setTaskId( d.getTaskId() );

        return taskExecutorLock;
    }

    @Override
    public List<TaskExecutorLockDto> toDto(List<TaskExecutorLock> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskExecutorLockDto> list1 = new ArrayList<TaskExecutorLockDto>( list.size() );
        for ( TaskExecutorLock taskExecutorLock : list ) {
            list1.add( toDto( taskExecutorLock ) );
        }

        return list1;
    }

    @Override
    public List<TaskExecutorLock> toEntity(List<TaskExecutorLockDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskExecutorLock> list1 = new ArrayList<TaskExecutorLock>( list.size() );
        for ( TaskExecutorLockDto taskExecutorLockDto : list ) {
            list1.add( toEntity( taskExecutorLockDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskExecutorLockDto> toDto(Set<TaskExecutorLock> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskExecutorLockDto> list = new ArrayList<TaskExecutorLockDto>( set.size() );
        for ( TaskExecutorLock taskExecutorLock : set ) {
            list.add( toDto( taskExecutorLock ) );
        }

        return list;
    }

    @Override
    public List<TaskExecutorLock> toEntity(Set<TaskExecutorLockDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskExecutorLock> list = new ArrayList<TaskExecutorLock>( set.size() );
        for ( TaskExecutorLockDto taskExecutorLockDto : set ) {
            list.add( toEntity( taskExecutorLockDto ) );
        }

        return list;
    }
}
