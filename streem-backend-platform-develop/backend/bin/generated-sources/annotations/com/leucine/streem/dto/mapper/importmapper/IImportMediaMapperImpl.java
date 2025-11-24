package com.leucine.streem.dto.mapper.importmapper;

import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.dto.request.ImportMediaRequest;
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
public class IImportMediaMapperImpl implements IImportMediaMapper {

    @Override
    public MediaDto toEntity(ImportMediaRequest d) {
        if ( d == null ) {
            return null;
        }

        MediaDto mediaDto = new MediaDto();

        mediaDto.setDescription( d.getDescription() );
        mediaDto.setLink( d.getLink() );
        mediaDto.setName( d.getName() );

        return mediaDto;
    }

    @Override
    public List<ImportMediaRequest> toDto(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportMediaRequest> list1 = new ArrayList<ImportMediaRequest>( list.size() );
        for ( MediaDto mediaDto : list ) {
            list1.add( toDto( mediaDto ) );
        }

        return list1;
    }

    @Override
    public List<MediaDto> toEntity(List<ImportMediaRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<MediaDto> list1 = new ArrayList<MediaDto>( list.size() );
        for ( ImportMediaRequest importMediaRequest : list ) {
            list1.add( toEntity( importMediaRequest ) );
        }

        return list1;
    }

    @Override
    public List<ImportMediaRequest> toDto(Set<MediaDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ImportMediaRequest> list = new ArrayList<ImportMediaRequest>( set.size() );
        for ( MediaDto mediaDto : set ) {
            list.add( toDto( mediaDto ) );
        }

        return list;
    }

    @Override
    public List<MediaDto> toEntity(Set<ImportMediaRequest> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( ImportMediaRequest importMediaRequest : set ) {
            list.add( toEntity( importMediaRequest ) );
        }

        return list;
    }

    @Override
    public ImportMediaRequest toDto(MediaDto e) {
        if ( e == null ) {
            return null;
        }

        ImportMediaRequest importMediaRequest = new ImportMediaRequest();

        if ( e.getId() != null ) {
            importMediaRequest.setMediaId( Long.parseLong( e.getId() ) );
        }
        importMediaRequest.setFileName( e.getFilename() );
        importMediaRequest.setDescription( e.getDescription() );
        importMediaRequest.setName( e.getName() );
        importMediaRequest.setLink( e.getLink() );

        return importMediaRequest;
    }
}
