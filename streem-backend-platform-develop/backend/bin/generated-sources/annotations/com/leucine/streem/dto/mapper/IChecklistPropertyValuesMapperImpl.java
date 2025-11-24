package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.PropertyValueDto;
import com.leucine.streem.dto.PropertyValueDto.PropertyValueDtoBuilder;
import com.leucine.streem.model.ChecklistPropertyValue;
import com.leucine.streem.model.FacilityUseCasePropertyMapping;
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
public class IChecklistPropertyValuesMapperImpl implements IChecklistPropertyValuesMapper {

    @Override
    public ChecklistPropertyValue toEntity(PropertyValueDto d) {
        if ( d == null ) {
            return null;
        }

        ChecklistPropertyValue checklistPropertyValue = new ChecklistPropertyValue();

        checklistPropertyValue.setValue( d.getValue() );

        return checklistPropertyValue;
    }

    @Override
    public List<PropertyValueDto> toDto(List<ChecklistPropertyValue> list) {
        if ( list == null ) {
            return null;
        }

        List<PropertyValueDto> list1 = new ArrayList<PropertyValueDto>( list.size() );
        for ( ChecklistPropertyValue checklistPropertyValue : list ) {
            list1.add( toDto( checklistPropertyValue ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistPropertyValue> toEntity(List<PropertyValueDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistPropertyValue> list1 = new ArrayList<ChecklistPropertyValue>( list.size() );
        for ( PropertyValueDto propertyValueDto : list ) {
            list1.add( toEntity( propertyValueDto ) );
        }

        return list1;
    }

    @Override
    public List<PropertyValueDto> toDto(Set<ChecklistPropertyValue> set) {
        if ( set == null ) {
            return null;
        }

        List<PropertyValueDto> list = new ArrayList<PropertyValueDto>( set.size() );
        for ( ChecklistPropertyValue checklistPropertyValue : set ) {
            list.add( toDto( checklistPropertyValue ) );
        }

        return list;
    }

    @Override
    public List<ChecklistPropertyValue> toEntity(Set<PropertyValueDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistPropertyValue> list = new ArrayList<ChecklistPropertyValue>( set.size() );
        for ( PropertyValueDto propertyValueDto : set ) {
            list.add( toEntity( propertyValueDto ) );
        }

        return list;
    }

    @Override
    public PropertyValueDto toDto(ChecklistPropertyValue checklistPropertyValue) {
        if ( checklistPropertyValue == null ) {
            return null;
        }

        PropertyValueDtoBuilder propertyValueDto = PropertyValueDto.builder();

        Long id = checklistPropertyValueFacilityUseCasePropertyMappingPropertyId( checklistPropertyValue );
        if ( id != null ) {
            propertyValueDto.id( String.valueOf( id ) );
        }
        propertyValueDto.name( checklistPropertyValueFacilityUseCasePropertyMappingPropertyName( checklistPropertyValue ) );
        propertyValueDto.label( checklistPropertyValueFacilityUseCasePropertyMappingLabelAlias( checklistPropertyValue ) );
        propertyValueDto.value( checklistPropertyValue.getValue() );

        return propertyValueDto.build();
    }

    private Long checklistPropertyValueFacilityUseCasePropertyMappingPropertyId(ChecklistPropertyValue checklistPropertyValue) {
        if ( checklistPropertyValue == null ) {
            return null;
        }
        FacilityUseCasePropertyMapping facilityUseCasePropertyMapping = checklistPropertyValue.getFacilityUseCasePropertyMapping();
        if ( facilityUseCasePropertyMapping == null ) {
            return null;
        }
        Property property = facilityUseCasePropertyMapping.getProperty();
        if ( property == null ) {
            return null;
        }
        Long id = property.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String checklistPropertyValueFacilityUseCasePropertyMappingPropertyName(ChecklistPropertyValue checklistPropertyValue) {
        if ( checklistPropertyValue == null ) {
            return null;
        }
        FacilityUseCasePropertyMapping facilityUseCasePropertyMapping = checklistPropertyValue.getFacilityUseCasePropertyMapping();
        if ( facilityUseCasePropertyMapping == null ) {
            return null;
        }
        Property property = facilityUseCasePropertyMapping.getProperty();
        if ( property == null ) {
            return null;
        }
        String name = property.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String checklistPropertyValueFacilityUseCasePropertyMappingLabelAlias(ChecklistPropertyValue checklistPropertyValue) {
        if ( checklistPropertyValue == null ) {
            return null;
        }
        FacilityUseCasePropertyMapping facilityUseCasePropertyMapping = checklistPropertyValue.getFacilityUseCasePropertyMapping();
        if ( facilityUseCasePropertyMapping == null ) {
            return null;
        }
        String labelAlias = facilityUseCasePropertyMapping.getLabelAlias();
        if ( labelAlias == null ) {
            return null;
        }
        return labelAlias;
    }
}
