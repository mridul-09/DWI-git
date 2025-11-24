package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.dto.request.MediaRequest;
import com.leucine.streem.dto.response.MediaUploadResponse;
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
public class IMediaMapperImpl extends IMediaMapper {

    @Override
    public Media toEntity(MediaDto d) {
        if ( d == null ) {
            return null;
        }

        Media media = new Media();

        if ( d.getId() != null ) {
            media.setId( Long.parseLong( d.getId() ) );
        }
        media.setArchived( d.isArchived() );
        if ( d.getDescription() != null ) {
            media.setDescription( d.getDescription() );
        }
        if ( d.getFilename() != null ) {
            media.setFilename( d.getFilename() );
        }
        if ( d.getName() != null ) {
            media.setName( d.getName() );
        }
        if ( d.getOriginalFilename() != null ) {
            media.setOriginalFilename( d.getOriginalFilename() );
        }
        if ( d.getType() != null ) {
            media.setType( d.getType() );
        }

        return media;
    }

    @Override
    public List<MediaDto> toDto(List<Media> list) {
        if ( list == null ) {
            return null;
        }

        List<MediaDto> list1 = new ArrayList<MediaDto>( list.size() );
        for ( Media media : list ) {
            list1.add( toDto( media ) );
        }

        return list1;
    }

    @Override
    public List<Media> toEntity(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Media> list1 = new ArrayList<Media>( list.size() );
        for ( MediaDto mediaDto : list ) {
            list1.add( toEntity( mediaDto ) );
        }

        return list1;
    }

    @Override
    public List<MediaDto> toDto(Set<Media> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( Media media : set ) {
            list.add( toDto( media ) );
        }

        return list;
    }

    @Override
    public List<Media> toEntity(Set<MediaDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Media> list = new ArrayList<Media>( set.size() );
        for ( MediaDto mediaDto : set ) {
            list.add( toEntity( mediaDto ) );
        }

        return list;
    }

    @Override
    public MediaDto toDto(Media entity) {
        if ( entity == null ) {
            return null;
        }

        MediaDto mediaDto = new MediaDto();

        mediaDto.setArchived( entity.isArchived() );
        if ( entity.getDescription() != null ) {
            mediaDto.setDescription( entity.getDescription() );
        }
        if ( entity.getFilename() != null ) {
            mediaDto.setFilename( entity.getFilename() );
        }
        if ( entity.getId() != null ) {
            mediaDto.setId( String.valueOf( entity.getId() ) );
        }
        if ( entity.getName() != null ) {
            mediaDto.setName( entity.getName() );
        }
        if ( entity.getOriginalFilename() != null ) {
            mediaDto.setOriginalFilename( entity.getOriginalFilename() );
        }
        if ( entity.getType() != null ) {
            mediaDto.setType( entity.getType() );
        }

        mediaDto.setLink( mediaConfig.getCdn() + java.io.File.separator + entity.getRelativePath() + java.io.File.separator + entity.getFilename() );

        return mediaDto;
    }

    @Override
    public MediaUploadResponse toMediaUploadResponsse(Media entity) {
        if ( entity == null ) {
            return null;
        }

        MediaUploadResponse mediaUploadResponse = new MediaUploadResponse();

        if ( entity.getId() != null ) {
            mediaUploadResponse.setMediaId( String.valueOf( entity.getId() ) );
        }
        mediaUploadResponse.setArchived( entity.isArchived() );
        if ( entity.getDescription() != null ) {
            mediaUploadResponse.setDescription( entity.getDescription() );
        }
        if ( entity.getFilename() != null ) {
            mediaUploadResponse.setFilename( entity.getFilename() );
        }
        if ( entity.getName() != null ) {
            mediaUploadResponse.setName( entity.getName() );
        }
        if ( entity.getOriginalFilename() != null ) {
            mediaUploadResponse.setOriginalFilename( entity.getOriginalFilename() );
        }
        if ( entity.getType() != null ) {
            mediaUploadResponse.setType( entity.getType() );
        }

        mediaUploadResponse.setLink( mediaConfig.getCdn() + java.io.File.separator + entity.getRelativePath() + java.io.File.separator + entity.getFilename() );

        return mediaUploadResponse;
    }

    @Override
    public List<MediaUploadResponse> toMediaUploadResponsse(List<Media> entity) {
        if ( entity == null ) {
            return null;
        }

        List<MediaUploadResponse> list = new ArrayList<MediaUploadResponse>( entity.size() );
        for ( Media media : entity ) {
            list.add( toMediaUploadResponsse( media ) );
        }

        return list;
    }

    @Override
    public Media mediaRequestToEntity(MediaRequest mediaRequest) {
        if ( mediaRequest == null ) {
            return null;
        }

        Media media = new Media();

        if ( mediaRequest.getDescription() != null ) {
            media.setDescription( mediaRequest.getDescription() );
        }
        if ( mediaRequest.getName() != null ) {
            media.setName( mediaRequest.getName() );
        }

        return media;
    }

    @Override
    public void update(MediaRequest mediaRequest, Media media) {
        if ( mediaRequest == null ) {
            return;
        }

        if ( mediaRequest.getDescription() != null ) {
            media.setDescription( mediaRequest.getDescription() );
        }
        else {
            media.setDescription( null );
        }
        if ( mediaRequest.getName() != null ) {
            media.setName( mediaRequest.getName() );
        }
        else {
            media.setName( null );
        }
    }
}
