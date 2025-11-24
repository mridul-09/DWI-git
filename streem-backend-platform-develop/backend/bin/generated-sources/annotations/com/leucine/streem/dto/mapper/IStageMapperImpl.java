package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.StageDto;
import com.leucine.streem.dto.StageReportDto;
import com.leucine.streem.dto.TaskDto;
import com.leucine.streem.dto.TaskPauseReasonOrComment;
import com.leucine.streem.model.ParameterValue;
import com.leucine.streem.model.ParameterVerification;
import com.leucine.streem.model.Stage;
import com.leucine.streem.model.Task;
import com.leucine.streem.model.TaskExecution;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.TempParameterVerification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IStageMapperImpl implements IStageMapper {

    @Autowired
    private ITaskMapper iTaskMapper;

    @Override
    public StageDto toDto(Stage e) {
        if ( e == null ) {
            return null;
        }

        StageDto stageDto = new StageDto();

        if ( e.getId() != null ) {
            stageDto.setId( String.valueOf( e.getId() ) );
        }
        stageDto.setName( e.getName() );
        if ( e.getOrderTree() != null ) {
            stageDto.setOrderTree( e.getOrderTree() );
        }
        stageDto.setTasks( iTaskMapper.toDto( e.getTasks() ) );

        return stageDto;
    }

    @Override
    public Stage toEntity(StageDto d) {
        if ( d == null ) {
            return null;
        }

        Stage stage = new Stage();

        if ( d.getId() != null ) {
            stage.setId( Long.parseLong( d.getId() ) );
        }
        stage.setName( d.getName() );
        stage.setOrderTree( d.getOrderTree() );
        stage.setTasks( taskDtoListToTaskSet( d.getTasks() ) );

        return stage;
    }

    @Override
    public List<StageDto> toDto(List<Stage> list) {
        if ( list == null ) {
            return null;
        }

        List<StageDto> list1 = new ArrayList<StageDto>( list.size() );
        for ( Stage stage : list ) {
            list1.add( toDto( stage ) );
        }

        return list1;
    }

    @Override
    public List<Stage> toEntity(List<StageDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Stage> list1 = new ArrayList<Stage>( list.size() );
        for ( StageDto stageDto : list ) {
            list1.add( toEntity( stageDto ) );
        }

        return list1;
    }

    @Override
    public List<StageDto> toDto(Set<Stage> set) {
        if ( set == null ) {
            return null;
        }

        List<StageDto> list = new ArrayList<StageDto>( set.size() );
        for ( Stage stage : set ) {
            list.add( toDto( stage ) );
        }

        return list;
    }

    @Override
    public List<Stage> toEntity(Set<StageDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Stage> list = new ArrayList<Stage>( set.size() );
        for ( StageDto stageDto : set ) {
            list.add( toEntity( stageDto ) );
        }

        return list;
    }

    @Override
    public StageDto toDto(Stage stage, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( stage == null ) {
            return null;
        }

        StageDto stageDto = new StageDto();

        stageDto.setTasks( iTaskMapper.toDto( stage.getTasks(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        if ( stage.getId() != null ) {
            stageDto.setId( String.valueOf( stage.getId() ) );
        }
        stageDto.setName( stage.getName() );
        if ( stage.getOrderTree() != null ) {
            stageDto.setOrderTree( stage.getOrderTree() );
        }

        return stageDto;
    }

    @Override
    public List<StageDto> toDto(Set<Stage> stage, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( stage == null ) {
            return null;
        }

        List<StageDto> list = new ArrayList<StageDto>( stage.size() );
        for ( Stage stage1 : stage ) {
            list.add( toDto( stage1, parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        }

        return list;
    }

    @Override
    public StageReportDto toStageReportDto(Stage stage) {
        if ( stage == null ) {
            return null;
        }

        StageReportDto stageReportDto = new StageReportDto();

        if ( stage.getId() != null ) {
            stageReportDto.setId( String.valueOf( stage.getId() ) );
        }
        stageReportDto.setName( stage.getName() );
        if ( stage.getOrderTree() != null ) {
            stageReportDto.setOrderTree( stage.getOrderTree() );
        }

        return stageReportDto;
    }

    protected Set<Task> taskDtoListToTaskSet(List<TaskDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Task> set = new HashSet<Task>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( TaskDto taskDto : list ) {
            set.add( iTaskMapper.toEntity( taskDto ) );
        }

        return set;
    }
}
