package com.leucine.streem.dto.mapper;

import com.leucine.streem.collections.Property;
import com.leucine.streem.collections.PropertyOption;
import com.leucine.streem.dto.ObjectTypePropertyOptionCreateRequest;
import com.leucine.streem.dto.request.ObjectTypePropertyCreateRequest;
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
public class IObjectTypePropertyMapperImpl implements IObjectTypePropertyMapper {

    @Override
    public ObjectTypePropertyCreateRequest toDto(Property e) {
        if ( e == null ) {
            return null;
        }

        ObjectTypePropertyCreateRequest objectTypePropertyCreateRequest = new ObjectTypePropertyCreateRequest();

        objectTypePropertyCreateRequest.setDescription( e.getDescription() );
        objectTypePropertyCreateRequest.setDisplayName( e.getDisplayName() );
        objectTypePropertyCreateRequest.setExternalId( e.getExternalId() );
        objectTypePropertyCreateRequest.setFlags( e.getFlags() );
        objectTypePropertyCreateRequest.setInputType( e.getInputType() );
        objectTypePropertyCreateRequest.setOptions( propertyOptionListToObjectTypePropertyOptionCreateRequestList( e.getOptions() ) );
        objectTypePropertyCreateRequest.setPlaceHolder( e.getPlaceHolder() );
        objectTypePropertyCreateRequest.setSortOrder( e.getSortOrder() );

        return objectTypePropertyCreateRequest;
    }

    @Override
    public Property toEntity(ObjectTypePropertyCreateRequest d) {
        if ( d == null ) {
            return null;
        }

        Property property = new Property();

        property.setDescription( d.getDescription() );
        property.setDisplayName( d.getDisplayName() );
        property.setExternalId( d.getExternalId() );
        property.setFlags( d.getFlags() );
        property.setInputType( d.getInputType() );
        property.setOptions( objectTypePropertyOptionCreateRequestListToPropertyOptionList( d.getOptions() ) );
        property.setPlaceHolder( d.getPlaceHolder() );
        property.setSortOrder( d.getSortOrder() );

        return property;
    }

    @Override
    public List<ObjectTypePropertyCreateRequest> toDto(List<Property> list) {
        if ( list == null ) {
            return null;
        }

        List<ObjectTypePropertyCreateRequest> list1 = new ArrayList<ObjectTypePropertyCreateRequest>( list.size() );
        for ( Property property : list ) {
            list1.add( toDto( property ) );
        }

        return list1;
    }

    @Override
    public List<Property> toEntity(List<ObjectTypePropertyCreateRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<Property> list1 = new ArrayList<Property>( list.size() );
        for ( ObjectTypePropertyCreateRequest objectTypePropertyCreateRequest : list ) {
            list1.add( toEntity( objectTypePropertyCreateRequest ) );
        }

        return list1;
    }

    @Override
    public List<ObjectTypePropertyCreateRequest> toDto(Set<Property> set) {
        if ( set == null ) {
            return null;
        }

        List<ObjectTypePropertyCreateRequest> list = new ArrayList<ObjectTypePropertyCreateRequest>( set.size() );
        for ( Property property : set ) {
            list.add( toDto( property ) );
        }

        return list;
    }

    @Override
    public List<Property> toEntity(Set<ObjectTypePropertyCreateRequest> set) {
        if ( set == null ) {
            return null;
        }

        List<Property> list = new ArrayList<Property>( set.size() );
        for ( ObjectTypePropertyCreateRequest objectTypePropertyCreateRequest : set ) {
            list.add( toEntity( objectTypePropertyCreateRequest ) );
        }

        return list;
    }

    protected ObjectTypePropertyOptionCreateRequest propertyOptionToObjectTypePropertyOptionCreateRequest(PropertyOption propertyOption) {
        if ( propertyOption == null ) {
            return null;
        }

        ObjectTypePropertyOptionCreateRequest objectTypePropertyOptionCreateRequest = new ObjectTypePropertyOptionCreateRequest();

        objectTypePropertyOptionCreateRequest.setDisplayName( propertyOption.getDisplayName() );
        objectTypePropertyOptionCreateRequest.setId( propertyOption.getId() );

        return objectTypePropertyOptionCreateRequest;
    }

    protected List<ObjectTypePropertyOptionCreateRequest> propertyOptionListToObjectTypePropertyOptionCreateRequestList(List<PropertyOption> list) {
        if ( list == null ) {
            return null;
        }

        List<ObjectTypePropertyOptionCreateRequest> list1 = new ArrayList<ObjectTypePropertyOptionCreateRequest>( list.size() );
        for ( PropertyOption propertyOption : list ) {
            list1.add( propertyOptionToObjectTypePropertyOptionCreateRequest( propertyOption ) );
        }

        return list1;
    }

    protected PropertyOption objectTypePropertyOptionCreateRequestToPropertyOption(ObjectTypePropertyOptionCreateRequest objectTypePropertyOptionCreateRequest) {
        if ( objectTypePropertyOptionCreateRequest == null ) {
            return null;
        }

        PropertyOption propertyOption = new PropertyOption();

        propertyOption.setDisplayName( objectTypePropertyOptionCreateRequest.getDisplayName() );
        propertyOption.setId( objectTypePropertyOptionCreateRequest.getId() );

        return propertyOption;
    }

    protected List<PropertyOption> objectTypePropertyOptionCreateRequestListToPropertyOptionList(List<ObjectTypePropertyOptionCreateRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<PropertyOption> list1 = new ArrayList<PropertyOption>( list.size() );
        for ( ObjectTypePropertyOptionCreateRequest objectTypePropertyOptionCreateRequest : list ) {
            list1.add( objectTypePropertyOptionCreateRequestToPropertyOption( objectTypePropertyOptionCreateRequest ) );
        }

        return list1;
    }
}
