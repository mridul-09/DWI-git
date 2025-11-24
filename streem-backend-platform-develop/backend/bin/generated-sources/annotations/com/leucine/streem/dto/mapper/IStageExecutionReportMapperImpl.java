package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.StageExecutionReportDto;
import com.leucine.streem.model.StageExecutionReport;
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
public class IStageExecutionReportMapperImpl implements IStageExecutionReportMapper {

    @Override
    public StageExecutionReportDto toDto(StageExecutionReport e) {
        if ( e == null ) {
            return null;
        }

        StageExecutionReportDto stageExecutionReportDto = new StageExecutionReportDto();

        if ( e.getCompletedTasks() != null ) {
            stageExecutionReportDto.setCompletedTasks( e.getCompletedTasks() );
        }
        if ( e.getStageId() != null ) {
            stageExecutionReportDto.setStageId( String.valueOf( e.getStageId() ) );
        }
        stageExecutionReportDto.setStageName( e.getStageName() );
        if ( e.getTasksInProgress() != null ) {
            stageExecutionReportDto.setTasksInProgress( e.getTasksInProgress() );
        }
        if ( e.getTotalTasks() != null ) {
            stageExecutionReportDto.setTotalTasks( e.getTotalTasks() );
        }

        return stageExecutionReportDto;
    }

    @Override
    public StageExecutionReport toEntity(StageExecutionReportDto d) {
        if ( d == null ) {
            return null;
        }

        StageExecutionReport stageExecutionReport = new StageExecutionReport();

        stageExecutionReport.setCompletedTasks( d.getCompletedTasks() );
        if ( d.getStageId() != null ) {
            stageExecutionReport.setStageId( Long.parseLong( d.getStageId() ) );
        }
        stageExecutionReport.setStageName( d.getStageName() );
        stageExecutionReport.setTasksInProgress( d.isTasksInProgress() );
        stageExecutionReport.setTotalTasks( d.getTotalTasks() );

        return stageExecutionReport;
    }

    @Override
    public List<StageExecutionReportDto> toDto(List<StageExecutionReport> list) {
        if ( list == null ) {
            return null;
        }

        List<StageExecutionReportDto> list1 = new ArrayList<StageExecutionReportDto>( list.size() );
        for ( StageExecutionReport stageExecutionReport : list ) {
            list1.add( toDto( stageExecutionReport ) );
        }

        return list1;
    }

    @Override
    public List<StageExecutionReport> toEntity(List<StageExecutionReportDto> list) {
        if ( list == null ) {
            return null;
        }

        List<StageExecutionReport> list1 = new ArrayList<StageExecutionReport>( list.size() );
        for ( StageExecutionReportDto stageExecutionReportDto : list ) {
            list1.add( toEntity( stageExecutionReportDto ) );
        }

        return list1;
    }

    @Override
    public List<StageExecutionReportDto> toDto(Set<StageExecutionReport> set) {
        if ( set == null ) {
            return null;
        }

        List<StageExecutionReportDto> list = new ArrayList<StageExecutionReportDto>( set.size() );
        for ( StageExecutionReport stageExecutionReport : set ) {
            list.add( toDto( stageExecutionReport ) );
        }

        return list;
    }

    @Override
    public List<StageExecutionReport> toEntity(Set<StageExecutionReportDto> set) {
        if ( set == null ) {
            return null;
        }

        List<StageExecutionReport> list = new ArrayList<StageExecutionReport>( set.size() );
        for ( StageExecutionReportDto stageExecutionReportDto : set ) {
            list.add( toEntity( stageExecutionReportDto ) );
        }

        return list;
    }
}
