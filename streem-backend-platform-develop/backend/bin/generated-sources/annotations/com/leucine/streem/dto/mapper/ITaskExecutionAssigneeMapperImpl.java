package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.TaskExecutionAssigneeDto;
import com.leucine.streem.model.TaskExecutionUserMapping;
import com.leucine.streem.model.User;
import com.leucine.streem.model.UserGroup;
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
public class ITaskExecutionAssigneeMapperImpl implements ITaskExecutionAssigneeMapper {

    @Override
    public TaskExecutionUserMapping toEntity(TaskExecutionAssigneeDto d) {
        if ( d == null ) {
            return null;
        }

        TaskExecutionUserMapping taskExecutionUserMapping = new TaskExecutionUserMapping();

        taskExecutionUserMapping.setActionPerformed( d.isActionPerformed() );
        taskExecutionUserMapping.setState( d.getState() );

        return taskExecutionUserMapping;
    }

    @Override
    public List<TaskExecutionAssigneeDto> toDto(List<TaskExecutionUserMapping> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskExecutionAssigneeDto> list1 = new ArrayList<TaskExecutionAssigneeDto>( list.size() );
        for ( TaskExecutionUserMapping taskExecutionUserMapping : list ) {
            list1.add( toDto( taskExecutionUserMapping ) );
        }

        return list1;
    }

    @Override
    public List<TaskExecutionUserMapping> toEntity(List<TaskExecutionAssigneeDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskExecutionUserMapping> list1 = new ArrayList<TaskExecutionUserMapping>( list.size() );
        for ( TaskExecutionAssigneeDto taskExecutionAssigneeDto : list ) {
            list1.add( toEntity( taskExecutionAssigneeDto ) );
        }

        return list1;
    }

    @Override
    public List<TaskExecutionAssigneeDto> toDto(Set<TaskExecutionUserMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskExecutionAssigneeDto> list = new ArrayList<TaskExecutionAssigneeDto>( set.size() );
        for ( TaskExecutionUserMapping taskExecutionUserMapping : set ) {
            list.add( toDto( taskExecutionUserMapping ) );
        }

        return list;
    }

    @Override
    public List<TaskExecutionUserMapping> toEntity(Set<TaskExecutionAssigneeDto> set) {
        if ( set == null ) {
            return null;
        }

        List<TaskExecutionUserMapping> list = new ArrayList<TaskExecutionUserMapping>( set.size() );
        for ( TaskExecutionAssigneeDto taskExecutionAssigneeDto : set ) {
            list.add( toEntity( taskExecutionAssigneeDto ) );
        }

        return list;
    }

    @Override
    public TaskExecutionAssigneeDto toDto(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }

        TaskExecutionAssigneeDto taskExecutionAssigneeDto = new TaskExecutionAssigneeDto();

        Long id = taskExecutionUserMappingUserId( taskExecutionUserMapping );
        if ( id != null ) {
            taskExecutionAssigneeDto.setUserId( String.valueOf( id ) );
        }
        taskExecutionAssigneeDto.setEmployeeId( taskExecutionUserMappingUserEmployeeId( taskExecutionUserMapping ) );
        taskExecutionAssigneeDto.setFirstName( taskExecutionUserMappingUserFirstName( taskExecutionUserMapping ) );
        taskExecutionAssigneeDto.setLastName( taskExecutionUserMappingUserLastName( taskExecutionUserMapping ) );
        taskExecutionAssigneeDto.setEmail( taskExecutionUserMappingUserEmail( taskExecutionUserMapping ) );
        taskExecutionAssigneeDto.setState( taskExecutionUserMapping.getState() );
        taskExecutionAssigneeDto.setActionPerformed( taskExecutionUserMapping.isActionPerformed() );
        Long id1 = taskExecutionUserMappingUserGroupId( taskExecutionUserMapping );
        if ( id1 != null ) {
            taskExecutionAssigneeDto.setUserGroupId( String.valueOf( id1 ) );
        }
        taskExecutionAssigneeDto.setUserGroupName( taskExecutionUserMappingUserGroupName( taskExecutionUserMapping ) );

        return taskExecutionAssigneeDto;
    }

    private Long taskExecutionUserMappingUserId(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        User user = taskExecutionUserMapping.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String taskExecutionUserMappingUserEmployeeId(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        User user = taskExecutionUserMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String employeeId = user.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }

    private String taskExecutionUserMappingUserFirstName(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        User user = taskExecutionUserMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String firstName = user.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String taskExecutionUserMappingUserLastName(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        User user = taskExecutionUserMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String lastName = user.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String taskExecutionUserMappingUserEmail(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        User user = taskExecutionUserMapping.getUser();
        if ( user == null ) {
            return null;
        }
        String email = user.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }

    private Long taskExecutionUserMappingUserGroupId(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        UserGroup userGroup = taskExecutionUserMapping.getUserGroup();
        if ( userGroup == null ) {
            return null;
        }
        Long id = userGroup.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String taskExecutionUserMappingUserGroupName(TaskExecutionUserMapping taskExecutionUserMapping) {
        if ( taskExecutionUserMapping == null ) {
            return null;
        }
        UserGroup userGroup = taskExecutionUserMapping.getUserGroup();
        if ( userGroup == null ) {
            return null;
        }
        String name = userGroup.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
