package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.model.Media;
import com.leucine.streem.model.ParameterValueMediaMapping;
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
public class IParameterValueMediaMapperImpl extends IParameterValueMediaMapper {

    @Override
    public ParameterValueMediaMapping toEntity(MediaDto d) {
        if ( d == null ) {
            return null;
        }

        ParameterValueMediaMapping parameterValueMediaMapping = new ParameterValueMediaMapping();

        parameterValueMediaMapping.setArchived( d.isArchived() );

        return parameterValueMediaMapping;
    }

    @Override
    public List<MediaDto> toDto(List<ParameterValueMediaMapping> list) {
        if ( list == null ) {
            return null;
        }

        List<MediaDto> list1 = new ArrayList<MediaDto>( list.size() );
        for ( ParameterValueMediaMapping parameterValueMediaMapping : list ) {
            list1.add( toDto( parameterValueMediaMapping ) );
        }

        return list1;
    }

    @Override
    public List<ParameterValueMediaMapping> toEntity(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterValueMediaMapping> list1 = new ArrayList<ParameterValueMediaMapping>( list.size() );
        for ( MediaDto mediaDto : list ) {
            list1.add( toEntity( mediaDto ) );
        }

        return list1;
    }

    @Override
    public List<MediaDto> toDto(Set<ParameterValueMediaMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( ParameterValueMediaMapping parameterValueMediaMapping : set ) {
            list.add( toDto( parameterValueMediaMapping ) );
        }

        return list;
    }

    @Override
    public List<ParameterValueMediaMapping> toEntity(Set<MediaDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterValueMediaMapping> list = new ArrayList<ParameterValueMediaMapping>( set.size() );
        for ( MediaDto mediaDto : set ) {
            list.add( toEntity( mediaDto ) );
        }

        return list;
    }

    @Override
    public MediaDto toDto(ParameterValueMediaMapping entity) {
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
        mediaDto.setArchived( entity.isArchived() );

        mediaDto.setLink( mediaConfig.getCdn() + java.io.File.separator + entity.getMedia().getRelativePath() + java.io.File.separator + entity.getMedia().getFilename() );

        return mediaDto;
    }

    private Long entityMediaId(ParameterValueMediaMapping parameterValueMediaMapping) {
        if ( parameterValueMediaMapping == null ) {
            return null;
        }
        Media media = parameterValueMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        Long id = media.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityMediaName(ParameterValueMediaMapping parameterValueMediaMapping) {
        if ( parameterValueMediaMapping == null ) {
            return null;
        }
        Media media = parameterValueMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String name = media.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String entityMediaFilename(ParameterValueMediaMapping parameterValueMediaMapping) {
        if ( parameterValueMediaMapping == null ) {
            return null;
        }
        Media media = parameterValueMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String filename = media.getFilename();
        if ( filename == null ) {
            return null;
        }
        return filename;
    }

    private String entityMediaOriginalFilename(ParameterValueMediaMapping parameterValueMediaMapping) {
        if ( parameterValueMediaMapping == null ) {
            return null;
        }
        Media media = parameterValueMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String originalFilename = media.getOriginalFilename();
        if ( originalFilename == null ) {
            return null;
        }
        return originalFilename;
    }

    private String entityMediaDescription(ParameterValueMediaMapping parameterValueMediaMapping) {
        if ( parameterValueMediaMapping == null ) {
            return null;
        }
        Media media = parameterValueMediaMapping.getMedia();
        if ( media == null ) {
            return null;
        }
        String description = media.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }

    private String entityMediaType(ParameterValueMediaMapping parameterValueMediaMapping) {
        if ( parameterValueMediaMapping == null ) {
            return null;
        }
        Media media = parameterValueMediaMapping.getMedia();
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
