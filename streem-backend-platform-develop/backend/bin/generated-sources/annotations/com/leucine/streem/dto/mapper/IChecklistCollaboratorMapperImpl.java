package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.ChecklistCollaboratorDto;
import com.leucine.streem.dto.ChecklistCollaboratorDto.ChecklistCollaboratorDtoBuilder;
import com.leucine.streem.model.ChecklistCollaboratorMapping;
import com.leucine.streem.model.User;
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
public class IChecklistCollaboratorMapperImpl implements IChecklistCollaboratorMapper {

    @Override
    public ChecklistCollaboratorMapping toEntity(ChecklistCollaboratorDto d) {
        if ( d == null ) {
            return null;
        }

        ChecklistCollaboratorMapping checklistCollaboratorMapping = new ChecklistCollaboratorMapping();

        if ( d.getId() != null ) {
            checklistCollaboratorMapping.setId( Long.parseLong( d.getId() ) );
        }
        checklistCollaboratorMapping.setPhase( d.getPhase() );
        checklistCollaboratorMapping.setPhaseType( d.getPhaseType() );
        checklistCollaboratorMapping.setState( d.getState() );
        checklistCollaboratorMapping.setType( d.getType() );

        return checklistCollaboratorMapping;
    }

    @Override
    public List<ChecklistCollaboratorDto> toDto(List<ChecklistCollaboratorMapping> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistCollaboratorDto> list1 = new ArrayList<ChecklistCollaboratorDto>( list.size() );
        for ( ChecklistCollaboratorMapping checklistCollaboratorMapping : list ) {
            list1.add( toDto( checklistCollaboratorMapping ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistCollaboratorMapping> toEntity(List<ChecklistCollaboratorDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistCollaboratorMapping> list1 = new ArrayList<ChecklistCollaboratorMapping>( list.size() );
        for ( ChecklistCollaboratorDto checklistCollaboratorDto : list ) {
            list1.add( toEntity( checklistCollaboratorDto ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistCollaboratorDto> toDto(Set<ChecklistCollaboratorMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistCollaboratorDto> list = new ArrayList<ChecklistCollaboratorDto>( set.size() );
        for ( ChecklistCollaboratorMapping checklistCollaboratorMapping : set ) {
            list.add( toDto( checklistCollaboratorMapping ) );
        }

        return list;
    }

    @Override
    public List<ChecklistCollaboratorMapping> toEntity(Set<ChecklistCollaboratorDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistCollaboratorMapping> list = new ArrayList<ChecklistCollaboratorMapping>( set.size() );
        for ( ChecklistCollaboratorDto checklistCollaboratorDto : set ) {
            list.add( toEntity( checklistCollaboratorDto ) );
        }

        return list;
    }

    @Override
    public ChecklistCollaboratorDto toDto(ChecklistCollaboratorMapping checklistCollaboratorMapping) {
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }

        ChecklistCollaboratorDtoBuilder checklistCollaboratorDto = ChecklistCollaboratorDto.builder();

        Long id = checklistCollaboratorMappingUserId( checklistCollaboratorMapping );
        if ( id != null ) {
            checklistCollaboratorDto.id( String.valueOf( id ) );
        }
        checklistCollaboratorDto.firstName( checklistCollaboratorMappingUserFirstName( checklistCollaboratorMapping ) );
        checklistCollaboratorDto.lastName( checklistCollaboratorMappingUserLastName( checklistCollaboratorMapping ) );
        checklistCollaboratorDto.email( checklistCollaboratorMappingUserEmail( checklistCollaboratorMapping ) );
        checklistCollaboratorDto.employeeId( checklistCollaboratorMappingUserEmployeeId( checklistCollaboratorMapping ) );
        if ( checklistCollaboratorMapping.getPhase() != null ) {
            checklistCollaboratorDto.phase( checklistCollaboratorMapping.getPhase() );
        }
        checklistCollaboratorDto.phaseType( checklistCollaboratorMapping.getPhaseType() );
        checklistCollaboratorDto.state( checklistCollaboratorMapping.getState() );
        checklistCollaboratorDto.type( checklistCollaboratorMapping.getType() );

        return checklistCollaboratorDto.build();
    }

    private Long checklistCollaboratorMappingUserId(ChecklistCollaboratorMapping checklistCollaboratorMapping) {
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }
        User user = checklistCollaboratorMapping.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String checklistCollaboratorMappingUserFirstName(ChecklistCollaboratorMapping checklistCollaboratorMapping) {
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }
        User user = checklistCollaboratorMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String firstName = user.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String checklistCollaboratorMappingUserLastName(ChecklistCollaboratorMapping checklistCollaboratorMapping) {
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }
        User user = checklistCollaboratorMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String lastName = user.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String checklistCollaboratorMappingUserEmail(ChecklistCollaboratorMapping checklistCollaboratorMapping) {
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }
        User user = checklistCollaboratorMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String email = user.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }

    private String checklistCollaboratorMappingUserEmployeeId(ChecklistCollaboratorMapping checklistCollaboratorMapping) {
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }
        User user = checklistCollaboratorMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String employeeId = user.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }
}
