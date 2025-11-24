package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.JobAnnotationDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.Job;
import com.leucine.streem.model.JobAnnotation;
import com.leucine.streem.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IJobAnnotationMapperImpl extends IJobAnnotationMapper {

    @Autowired
    private IJobAnnotationMediaMapper iJobAnnotationMediaMapper;

    @Override
    public JobAnnotation toEntity(JobAnnotationDto d) {
        if ( d == null ) {
            return null;
        }

        JobAnnotation jobAnnotation = new JobAnnotation();

        if ( d.getId() != null ) {
            jobAnnotation.setId( Long.parseLong( d.getId() ) );
        }
        jobAnnotation.setCreatedAt( d.getCreatedAt() );
        jobAnnotation.setCreatedBy( userAuditDtoToUser( d.getCreatedBy() ) );
        jobAnnotation.setModifiedAt( d.getModifiedAt() );
        jobAnnotation.setModifiedBy( userAuditDtoToUser( d.getModifiedBy() ) );
        jobAnnotation.setCode( d.getCode() );
        jobAnnotation.setMedias( iJobAnnotationMediaMapper.toEntity( d.getMedias() ) );
        jobAnnotation.setRemarks( d.getRemarks() );

        return jobAnnotation;
    }

    @Override
    public List<JobAnnotationDto> toDto(List<JobAnnotation> list) {
        if ( list == null ) {
            return null;
        }

        List<JobAnnotationDto> list1 = new ArrayList<JobAnnotationDto>( list.size() );
        for ( JobAnnotation jobAnnotation : list ) {
            list1.add( toDto( jobAnnotation ) );
        }

        return list1;
    }

    @Override
    public List<JobAnnotation> toEntity(List<JobAnnotationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<JobAnnotation> list1 = new ArrayList<JobAnnotation>( list.size() );
        for ( JobAnnotationDto jobAnnotationDto : list ) {
            list1.add( toEntity( jobAnnotationDto ) );
        }

        return list1;
    }

    @Override
    public List<JobAnnotationDto> toDto(Set<JobAnnotation> set) {
        if ( set == null ) {
            return null;
        }

        List<JobAnnotationDto> list = new ArrayList<JobAnnotationDto>( set.size() );
        for ( JobAnnotation jobAnnotation : set ) {
            list.add( toDto( jobAnnotation ) );
        }

        return list;
    }

    @Override
    public List<JobAnnotation> toEntity(Set<JobAnnotationDto> set) {
        if ( set == null ) {
            return null;
        }

        List<JobAnnotation> list = new ArrayList<JobAnnotation>( set.size() );
        for ( JobAnnotationDto jobAnnotationDto : set ) {
            list.add( toEntity( jobAnnotationDto ) );
        }

        return list;
    }

    @Override
    public JobAnnotationDto toDto(JobAnnotation jobAnnotation) {
        if ( jobAnnotation == null ) {
            return null;
        }

        JobAnnotationDto jobAnnotationDto = new JobAnnotationDto();

        jobAnnotationDto.setCreatedBy( userToUserAuditDto( jobAnnotation.getCreatedBy() ) );
        jobAnnotationDto.setModifiedBy( userToUserAuditDto( jobAnnotation.getModifiedBy() ) );
        jobAnnotationDto.setJobId( jobAnnotationJobId( jobAnnotation ) );
        jobAnnotationDto.setCode( jobAnnotation.getCode() );
        jobAnnotationDto.setCreatedAt( jobAnnotation.getCreatedAt() );
        if ( jobAnnotation.getId() != null ) {
            jobAnnotationDto.setId( String.valueOf( jobAnnotation.getId() ) );
        }
        jobAnnotationDto.setMedias( iJobAnnotationMediaMapper.toDto( jobAnnotation.getMedias() ) );
        jobAnnotationDto.setModifiedAt( jobAnnotation.getModifiedAt() );
        jobAnnotationDto.setRemarks( jobAnnotation.getRemarks() );

        return jobAnnotationDto;
    }

    protected User userAuditDtoToUser(UserAuditDto userAuditDto) {
        if ( userAuditDto == null ) {
            return null;
        }

        User user = new User();

        if ( userAuditDto.getId() != null ) {
            user.setId( Long.parseLong( userAuditDto.getId() ) );
        }
        user.setEmployeeId( userAuditDto.getEmployeeId() );
        user.setFirstName( userAuditDto.getFirstName() );
        user.setLastName( userAuditDto.getLastName() );

        return user;
    }

    protected UserAuditDto userToUserAuditDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        if ( user.getId() != null ) {
            userAuditDto.id( String.valueOf( user.getId() ) );
        }
        userAuditDto.employeeId( user.getEmployeeId() );
        userAuditDto.firstName( user.getFirstName() );
        userAuditDto.lastName( user.getLastName() );

        return userAuditDto.build();
    }

    private Long jobAnnotationJobId(JobAnnotation jobAnnotation) {
        if ( jobAnnotation == null ) {
            return null;
        }
        Job job = jobAnnotation.getJob();
        if ( job == null ) {
            return null;
        }
        Long id = job.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
