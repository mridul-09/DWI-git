package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.FacilityDto;
import com.leucine.streem.model.Facility;
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
public class IFacilityMapperImpl implements IFacilityMapper {

    @Override
    public FacilityDto toDto(Facility e) {
        if ( e == null ) {
            return null;
        }

        FacilityDto facilityDto = new FacilityDto();

        facilityDto.setDateFormat( e.getDateFormat() );
        facilityDto.setDateTimeFormat( e.getDateTimeFormat() );
        if ( e.getId() != null ) {
            facilityDto.setId( String.valueOf( e.getId() ) );
        }
        facilityDto.setName( e.getName() );
        facilityDto.setTimeFormat( e.getTimeFormat() );
        facilityDto.setTimeZone( e.getTimeZone() );

        return facilityDto;
    }

    @Override
    public Facility toEntity(FacilityDto d) {
        if ( d == null ) {
            return null;
        }

        Facility facility = new Facility();

        if ( d.getId() != null ) {
            facility.setId( Long.parseLong( d.getId() ) );
        }
        facility.setDateFormat( d.getDateFormat() );
        facility.setDateTimeFormat( d.getDateTimeFormat() );
        facility.setName( d.getName() );
        facility.setTimeFormat( d.getTimeFormat() );
        facility.setTimeZone( d.getTimeZone() );

        return facility;
    }

    @Override
    public List<FacilityDto> toDto(List<Facility> list) {
        if ( list == null ) {
            return null;
        }

        List<FacilityDto> list1 = new ArrayList<FacilityDto>( list.size() );
        for ( Facility facility : list ) {
            list1.add( toDto( facility ) );
        }

        return list1;
    }

    @Override
    public List<Facility> toEntity(List<FacilityDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Facility> list1 = new ArrayList<Facility>( list.size() );
        for ( FacilityDto facilityDto : list ) {
            list1.add( toEntity( facilityDto ) );
        }

        return list1;
    }

    @Override
    public List<FacilityDto> toDto(Set<Facility> set) {
        if ( set == null ) {
            return null;
        }

        List<FacilityDto> list = new ArrayList<FacilityDto>( set.size() );
        for ( Facility facility : set ) {
            list.add( toDto( facility ) );
        }

        return list;
    }

    @Override
    public List<Facility> toEntity(Set<FacilityDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Facility> list = new ArrayList<Facility>( set.size() );
        for ( FacilityDto facilityDto : set ) {
            list.add( toEntity( facilityDto ) );
        }

        return list;
    }
}
