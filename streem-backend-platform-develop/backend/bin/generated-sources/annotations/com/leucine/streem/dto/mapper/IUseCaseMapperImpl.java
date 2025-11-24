package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.UseCaseDto;
import com.leucine.streem.model.UseCase;
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
public class IUseCaseMapperImpl implements IUseCaseMapper {

    @Override
    public UseCaseDto toDto(UseCase e) {
        if ( e == null ) {
            return null;
        }

        UseCaseDto useCaseDto = new UseCaseDto();

        useCaseDto.setDescription( e.getDescription() );
        if ( e.getId() != null ) {
            useCaseDto.setId( String.valueOf( e.getId() ) );
        }
        useCaseDto.setLabel( e.getLabel() );
        useCaseDto.setMetadata( e.getMetadata() );
        useCaseDto.setName( e.getName() );
        useCaseDto.setOrderTree( e.getOrderTree() );

        return useCaseDto;
    }

    @Override
    public UseCase toEntity(UseCaseDto d) {
        if ( d == null ) {
            return null;
        }

        UseCase useCase = new UseCase();

        if ( d.getId() != null ) {
            useCase.setId( Long.parseLong( d.getId() ) );
        }
        useCase.setDescription( d.getDescription() );
        useCase.setLabel( d.getLabel() );
        useCase.setMetadata( d.getMetadata() );
        useCase.setName( d.getName() );
        useCase.setOrderTree( d.getOrderTree() );

        return useCase;
    }

    @Override
    public List<UseCaseDto> toDto(List<UseCase> list) {
        if ( list == null ) {
            return null;
        }

        List<UseCaseDto> list1 = new ArrayList<UseCaseDto>( list.size() );
        for ( UseCase useCase : list ) {
            list1.add( toDto( useCase ) );
        }

        return list1;
    }

    @Override
    public List<UseCase> toEntity(List<UseCaseDto> list) {
        if ( list == null ) {
            return null;
        }

        List<UseCase> list1 = new ArrayList<UseCase>( list.size() );
        for ( UseCaseDto useCaseDto : list ) {
            list1.add( toEntity( useCaseDto ) );
        }

        return list1;
    }

    @Override
    public List<UseCaseDto> toDto(Set<UseCase> set) {
        if ( set == null ) {
            return null;
        }

        List<UseCaseDto> list = new ArrayList<UseCaseDto>( set.size() );
        for ( UseCase useCase : set ) {
            list.add( toDto( useCase ) );
        }

        return list;
    }

    @Override
    public List<UseCase> toEntity(Set<UseCaseDto> set) {
        if ( set == null ) {
            return null;
        }

        List<UseCase> list = new ArrayList<UseCase>( set.size() );
        for ( UseCaseDto useCaseDto : set ) {
            list.add( toEntity( useCaseDto ) );
        }

        return list;
    }
}
