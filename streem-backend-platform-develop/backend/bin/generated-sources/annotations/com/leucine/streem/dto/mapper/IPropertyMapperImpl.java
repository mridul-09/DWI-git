package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.PropertyDto;
import com.leucine.streem.model.Property;
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
public class IPropertyMapperImpl implements IPropertyMapper {

    @Override
    public PropertyDto toDto(Property e) {
        if ( e == null ) {
            return null;
        }

        PropertyDto propertyDto = new PropertyDto();

        if ( e.getId() != null ) {
            propertyDto.setId( String.valueOf( e.getId() ) );
        }
        propertyDto.setLabel( e.getLabel() );
        propertyDto.setName( e.getName() );
        propertyDto.setPlaceHolder( e.getPlaceHolder() );

        return propertyDto;
    }

    @Override
    public Property toEntity(PropertyDto d) {
        if ( d == null ) {
            return null;
        }

        Property property = new Property();

        if ( d.getId() != null ) {
            property.setId( Long.parseLong( d.getId() ) );
        }
        property.setLabel( d.getLabel() );
        property.setName( d.getName() );
        property.setPlaceHolder( d.getPlaceHolder() );

        return property;
    }

    @Override
    public List<PropertyDto> toDto(List<Property> list) {
        if ( list == null ) {
            return null;
        }

        List<PropertyDto> list1 = new ArrayList<PropertyDto>( list.size() );
        for ( Property property : list ) {
            list1.add( toDto( property ) );
        }

        return list1;
    }

    @Override
    public List<Property> toEntity(List<PropertyDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Property> list1 = new ArrayList<Property>( list.size() );
        for ( PropertyDto propertyDto : list ) {
            list1.add( toEntity( propertyDto ) );
        }

        return list1;
    }

    @Override
    public List<PropertyDto> toDto(Set<Property> set) {
        if ( set == null ) {
            return null;
        }

        List<PropertyDto> list = new ArrayList<PropertyDto>( set.size() );
        for ( Property property : set ) {
            list.add( toDto( property ) );
        }

        return list;
    }

    @Override
    public List<Property> toEntity(Set<PropertyDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Property> list = new ArrayList<Property>( set.size() );
        for ( PropertyDto propertyDto : set ) {
            list.add( toEntity( propertyDto ) );
        }

        return list;
    }
}
