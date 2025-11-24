package com.leucine.streem.dto.mapper.importmapper;

import com.leucine.streem.dto.StageDto;
import com.leucine.streem.dto.request.ImportStageRequest;
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
public class IImportStageMapperImpl implements IImportStageMapper {

    @Autowired
    private IImportTaskMapper iImportTaskMapper;

    @Override
    public StageDto toEntity(ImportStageRequest d) {
        if ( d == null ) {
            return null;
        }

        StageDto stageDto = new StageDto();

        stageDto.setId( d.getId() );
        stageDto.setName( d.getName() );
        if ( d.getOrderTree() != null ) {
            stageDto.setOrderTree( d.getOrderTree() );
        }

        return stageDto;
    }

    @Override
    public List<ImportStageRequest> toDto(List<StageDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportStageRequest> list1 = new ArrayList<ImportStageRequest>( list.size() );
        for ( StageDto stageDto : list ) {
            list1.add( toDto( stageDto ) );
        }

        return list1;
    }

    @Override
    public List<StageDto> toEntity(List<ImportStageRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<StageDto> list1 = new ArrayList<StageDto>( list.size() );
        for ( ImportStageRequest importStageRequest : list ) {
            list1.add( toEntity( importStageRequest ) );
        }

        return list1;
    }

    @Override
    public List<ImportStageRequest> toDto(Set<StageDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ImportStageRequest> list = new ArrayList<ImportStageRequest>( set.size() );
        for ( StageDto stageDto : set ) {
            list.add( toDto( stageDto ) );
        }

        return list;
    }

    @Override
    public List<StageDto> toEntity(Set<ImportStageRequest> set) {
        if ( set == null ) {
            return null;
        }

        List<StageDto> list = new ArrayList<StageDto>( set.size() );
        for ( ImportStageRequest importStageRequest : set ) {
            list.add( toEntity( importStageRequest ) );
        }

        return list;
    }

    @Override
    public ImportStageRequest toDto(StageDto e) {
        if ( e == null ) {
            return null;
        }

        ImportStageRequest importStageRequest = new ImportStageRequest();

        importStageRequest.setTaskRequests( iImportTaskMapper.toDto( e.getTasks() ) );
        importStageRequest.setName( e.getName() );
        importStageRequest.setOrderTree( e.getOrderTree() );
        importStageRequest.setId( e.getId() );

        return importStageRequest;
    }
}
