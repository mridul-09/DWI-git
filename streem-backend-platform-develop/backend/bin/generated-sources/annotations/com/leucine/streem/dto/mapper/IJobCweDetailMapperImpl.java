package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.JobCweReason;
import com.leucine.streem.dto.JobCweDto;
import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.model.JobCweDetail;
import com.leucine.streem.model.JobCweDetailMediaMapping;
import java.util.ArrayList;
import java.util.HashSet;
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
public class IJobCweDetailMapperImpl implements IJobCweDetailMapper {

    @Autowired
    private IJobCweDetailMediaMapper iJobCweDetailMediaMapper;

    @Override
    public JobCweDto toDto(JobCweDetail e) {
        if ( e == null ) {
            return null;
        }

        JobCweDto jobCweDto = new JobCweDto();

        jobCweDto.setComment( e.getComment() );
        jobCweDto.setMedias( iJobCweDetailMediaMapper.toDto( e.getMedias() ) );
        if ( e.getReason() != null ) {
            jobCweDto.setReason( e.getReason().name() );
        }

        return jobCweDto;
    }

    @Override
    public JobCweDetail toEntity(JobCweDto d) {
        if ( d == null ) {
            return null;
        }

        JobCweDetail jobCweDetail = new JobCweDetail();

        jobCweDetail.setComment( d.getComment() );
        jobCweDetail.setMedias( mediaDtoListToJobCweDetailMediaMappingSet( d.getMedias() ) );
        if ( d.getReason() != null ) {
            jobCweDetail.setReason( Enum.valueOf( JobCweReason.class, d.getReason() ) );
        }

        return jobCweDetail;
    }

    @Override
    public List<JobCweDto> toDto(List<JobCweDetail> list) {
        if ( list == null ) {
            return null;
        }

        List<JobCweDto> list1 = new ArrayList<JobCweDto>( list.size() );
        for ( JobCweDetail jobCweDetail : list ) {
            list1.add( toDto( jobCweDetail ) );
        }

        return list1;
    }

    @Override
    public List<JobCweDetail> toEntity(List<JobCweDto> list) {
        if ( list == null ) {
            return null;
        }

        List<JobCweDetail> list1 = new ArrayList<JobCweDetail>( list.size() );
        for ( JobCweDto jobCweDto : list ) {
            list1.add( toEntity( jobCweDto ) );
        }

        return list1;
    }

    @Override
    public List<JobCweDto> toDto(Set<JobCweDetail> set) {
        if ( set == null ) {
            return null;
        }

        List<JobCweDto> list = new ArrayList<JobCweDto>( set.size() );
        for ( JobCweDetail jobCweDetail : set ) {
            list.add( toDto( jobCweDetail ) );
        }

        return list;
    }

    @Override
    public List<JobCweDetail> toEntity(Set<JobCweDto> set) {
        if ( set == null ) {
            return null;
        }

        List<JobCweDetail> list = new ArrayList<JobCweDetail>( set.size() );
        for ( JobCweDto jobCweDto : set ) {
            list.add( toEntity( jobCweDto ) );
        }

        return list;
    }

    protected Set<JobCweDetailMediaMapping> mediaDtoListToJobCweDetailMediaMappingSet(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<JobCweDetailMediaMapping> set = new HashSet<JobCweDetailMediaMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( MediaDto mediaDto : list ) {
            set.add( iJobCweDetailMediaMapper.toEntity( mediaDto ) );
        }

        return set;
    }
}
