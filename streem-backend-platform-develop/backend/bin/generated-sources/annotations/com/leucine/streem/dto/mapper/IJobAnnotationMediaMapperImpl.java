package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.model.JobAnnotationMediaMapping;
import com.leucine.streem.model.Media;
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
public class IJobAnnotationMediaMapperImpl extends IJobAnnotationMediaMapper {

    @Override
    public JobAnnotationMediaMapping toEntity(MediaDto d) {
        if ( d == null ) {
            return null;
        }

        JobAnnotationMediaMapping jobAnnotationMediaMapping = new JobAnnotationMediaMapping();

        return jobAnnotationMediaMapping;
    }

    @Override
    public List<MediaDto> toDto(List<JobAnnotationMediaMapping> list) {
        if ( list == null ) {
            return null;
        }

        List<MediaDto> list1 = new ArrayList<MediaDto>( list.size() );
        for ( JobAnnotationMediaMapping jobAnnotationMediaMapping : list ) {
            list1.add( toDto( jobAnnotationMediaMapping ) );
        }

        return list1;
    }

    @Override
    public List<JobAnnotationMediaMapping> toEntity(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        List<JobAnnotationMediaMapping> list1 = new ArrayList<JobAnnotationMediaMapping>( list.size() );
        for ( MediaDto mediaDto : list ) {
            list1.add( toEntity( mediaDto ) );
        }

        return list1;
    }

    @Override
    public List<MediaDto> toDto(Set<JobAnnotationMediaMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( JobAnnotationMediaMapping jobAnnotationMediaMapping : set ) {
            list.add( toDto( jobAnnotationMediaMapping ) );
        }

        return list;
    }

    @Override
    public List<JobAnnotationMediaMapping> toEntity(Set<MediaDto> set) {
        if ( set == null ) {
            return null;
        }

        List<JobAnnotationMediaMapping> list = new ArrayList<JobAnnotationMediaMapping>( set.size() );
        for ( MediaDto mediaDto : set ) {
            list.add( toEntity( mediaDto ) );
        }

        return list;
    }

    @Override
    public MediaDto toDto(JobAnnotationMediaMapping entity) {
        if ( entity == null ) {
            return null;
        }

        MediaDto mediaDto = new MediaDto();

        Long id = entityMediaId( entity );
        if ( id != null ) {
            mediaDto.setId( String.valueOf( id ) );
        }
        mediaDto.setName( entityMediaName( entity ) );
        mediaDto.setFilename( entityMediaFilename( entity ) );
        mediaDto.setOriginalFilename( entityMediaOriginalFilename( entity ) );
        mediaDto.setDescription( entityMediaDescription( entity ) );
        mediaDto.setType( entityMediaType( entity ) );

        mediaDto.setLink( mediaConfig.getCdn() + java.io.File.separator + entity.getMedia().getRelativePath() + java.io.File.separator + entity.getMedia().getFilename() );

        return mediaDto;
    }

    private Long entityMediaId(JobAnnotationMediaMapping jobAnnotationMediaMapping) {
        if ( jobAnnotationMediaMapping == null ) {
            return null;
        }
        Media media = jobAnnotationMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        Long id = media.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityMediaName(JobAnnotationMediaMapping jobAnnotationMediaMapping) {
        if ( jobAnnotationMediaMapping == null ) {
            return null;
        }
        Media media = jobAnnotationMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String name = media.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String entityMediaFilename(JobAnnotationMediaMapping jobAnnotationMediaMapping) {
        if ( jobAnnotationMediaMapping == null ) {
            return null;
        }
        Media media = jobAnnotationMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String filename = media.getFilename();
        if ( filename == null ) {
            return null;
        }
        return filename;
    }

    private String entityMediaOriginalFilename(JobAnnotationMediaMapping jobAnnotationMediaMapping) {
        if ( jobAnnotationMediaMapping == null ) {
            return null;
        }
        Media media = jobAnnotationMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String originalFilename = media.getOriginalFilename();
        if ( originalFilename == null ) {
            return null;
        }
        return originalFilename;
    }

    private String entityMediaDescription(JobAnnotationMediaMapping jobAnnotationMediaMapping) {
        if ( jobAnnotationMediaMapping == null ) {
            return null;
        }
        Media media = jobAnnotationMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String description = media.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }

    private String entityMediaType(JobAnnotationMediaMapping jobAnnotationMediaMapping) {
        if ( jobAnnotationMediaMapping == null ) {
            return null;
        }
        Media media = jobAnnotationMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String type = media.getType();
        if ( type == null ) {
            return null;
        }
        return type;
    }
}
