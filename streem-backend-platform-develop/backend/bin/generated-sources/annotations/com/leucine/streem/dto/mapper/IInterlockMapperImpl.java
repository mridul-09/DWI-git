package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.request.InterlockDto;
import com.leucine.streem.model.Interlock;
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
public class IInterlockMapperImpl implements IInterlockMapper {

    @Override
    public InterlockDto toDto(Interlock e) {
        if ( e == null ) {
            return null;
        }

        InterlockDto interlockDto = new InterlockDto();

        if ( e.getId() != null ) {
            interlockDto.setId( String.valueOf( e.getId() ) );
        }
        interlockDto.setValidations( e.getValidations() );

        return interlockDto;
    }

    @Override
    public Interlock toEntity(InterlockDto d) {
        if ( d == null ) {
            return null;
        }

        Interlock interlock = new Interlock();

        if ( d.getId() != null ) {
            interlock.setId( Long.parseLong( d.getId() ) );
        }
        interlock.setValidations( d.getValidations() );

        return interlock;
    }

    @Override
    public List<InterlockDto> toDto(List<Interlock> list) {
        if ( list == null ) {
            return null;
        }

        List<InterlockDto> list1 = new ArrayList<InterlockDto>( list.size() );
        for ( Interlock interlock : list ) {
            list1.add( toDto( interlock ) );
        }

        return list1;
    }

    @Override
    public List<Interlock> toEntity(List<InterlockDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Interlock> list1 = new ArrayList<Interlock>( list.size() );
        for ( InterlockDto interlockDto : list ) {
            list1.add( toEntity( interlockDto ) );
        }

        return list1;
    }

    @Override
    public List<InterlockDto> toDto(Set<Interlock> set) {
        if ( set == null ) {
            return null;
        }

        List<InterlockDto> list = new ArrayList<InterlockDto>( set.size() );
        for ( Interlock interlock : set ) {
            list.add( toDto( interlock ) );
        }

        return list;
    }

    @Override
    public List<Interlock> toEntity(Set<InterlockDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Interlock> list = new ArrayList<Interlock>( set.size() );
        for ( InterlockDto interlockDto : set ) {
            list.add( toEntity( interlockDto ) );
        }

        return list;
    }
}
