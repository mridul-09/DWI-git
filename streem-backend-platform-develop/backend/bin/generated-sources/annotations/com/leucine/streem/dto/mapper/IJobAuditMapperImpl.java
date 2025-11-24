package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.JobAuditDto;
import com.leucine.streem.model.JobAudit;
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
public class IJobAuditMapperImpl implements IJobAuditMapper {

    @Override
    public JobAuditDto toDto(JobAudit e) {
        if ( e == null ) {
            return null;
        }

        JobAuditDto jobAuditDto = new JobAuditDto();

        jobAuditDto.setAction( e.getAction() );
        jobAuditDto.setDetails( e.getDetails() );
        if ( e.getId() != null ) {
            jobAuditDto.setId( String.valueOf( e.getId() ) );
        }
        if ( e.getJobId() != null ) {
            jobAuditDto.setJobId( String.valueOf( e.getJobId() ) );
        }
        jobAuditDto.setParameters( e.getParameters() );
        if ( e.getStageId() != null ) {
            jobAuditDto.setStageId( String.valueOf( e.getStageId() ) );
        }
        if ( e.getTaskId() != null ) {
            jobAuditDto.setTaskId( String.valueOf( e.getTaskId() ) );
        }
        jobAuditDto.setTriggeredAt( e.getTriggeredAt() );
        jobAuditDto.setTriggeredBy( e.getTriggeredBy() );

        return jobAuditDto;
    }

    @Override
    public JobAudit toEntity(JobAuditDto d) {
        if ( d == null ) {
            return null;
        }

        JobAudit jobAudit = new JobAudit();

        if ( d.getId() != null ) {
            jobAudit.setId( Long.parseLong( d.getId() ) );
        }
        jobAudit.setAction( d.getAction() );
        jobAudit.setDetails( d.getDetails() );
        if ( d.getJobId() != null ) {
            jobAudit.setJobId( Long.parseLong( d.getJobId() ) );
        }
        jobAudit.setParameters( d.getParameters() );
        if ( d.getStageId() != null ) {
            jobAudit.setStageId( Long.parseLong( d.getStageId() ) );
        }
        if ( d.getTaskId() != null ) {
            jobAudit.setTaskId( Long.parseLong( d.getTaskId() ) );
        }
        jobAudit.setTriggeredAt( d.getTriggeredAt() );
        jobAudit.setTriggeredBy( d.getTriggeredBy() );

        return jobAudit;
    }

    @Override
    public List<JobAuditDto> toDto(List<JobAudit> list) {
        if ( list == null ) {
            return null;
        }

        List<JobAuditDto> list1 = new ArrayList<JobAuditDto>( list.size() );
        for ( JobAudit jobAudit : list ) {
            list1.add( toDto( jobAudit ) );
        }

        return list1;
    }

    @Override
    public List<JobAudit> toEntity(List<JobAuditDto> list) {
        if ( list == null ) {
            return null;
        }

        List<JobAudit> list1 = new ArrayList<JobAudit>( list.size() );
        for ( JobAuditDto jobAuditDto : list ) {
            list1.add( toEntity( jobAuditDto ) );
        }

        return list1;
    }

    @Override
    public List<JobAuditDto> toDto(Set<JobAudit> set) {
        if ( set == null ) {
            return null;
        }

        List<JobAuditDto> list = new ArrayList<JobAuditDto>( set.size() );
        for ( JobAudit jobAudit : set ) {
            list.add( toDto( jobAudit ) );
        }

        return list;
    }

    @Override
    public List<JobAudit> toEntity(Set<JobAuditDto> set) {
        if ( set == null ) {
            return null;
        }

        List<JobAudit> list = new ArrayList<JobAudit>( set.size() );
        for ( JobAuditDto jobAuditDto : set ) {
            list.add( toEntity( jobAuditDto ) );
        }

        return list;
    }
}
