package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.CollaboratorCommentDto;
import com.leucine.streem.dto.CollaboratorCommentDto.CollaboratorCommentDtoBuilder;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.ChecklistCollaboratorComments;
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
public class IChecklistCollaboratorCommentMapperImpl implements IChecklistCollaboratorCommentMapper {

    @Override
    public ChecklistCollaboratorComments toEntity(CollaboratorCommentDto d) {
        if ( d == null ) {
            return null;
        }

        ChecklistCollaboratorComments checklistCollaboratorComments = new ChecklistCollaboratorComments();

        if ( d.getId() != null ) {
            checklistCollaboratorComments.setId( Long.parseLong( d.getId() ) );
        }
        checklistCollaboratorComments.setModifiedAt( d.getModifiedAt() );
        checklistCollaboratorComments.setComments( d.getComments() );

        return checklistCollaboratorComments;
    }

    @Override
    public List<CollaboratorCommentDto> toDto(List<ChecklistCollaboratorComments> list) {
        if ( list == null ) {
            return null;
        }

        List<CollaboratorCommentDto> list1 = new ArrayList<CollaboratorCommentDto>( list.size() );
        for ( ChecklistCollaboratorComments checklistCollaboratorComments : list ) {
            list1.add( toDto( checklistCollaboratorComments ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistCollaboratorComments> toEntity(List<CollaboratorCommentDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistCollaboratorComments> list1 = new ArrayList<ChecklistCollaboratorComments>( list.size() );
        for ( CollaboratorCommentDto collaboratorCommentDto : list ) {
            list1.add( toEntity( collaboratorCommentDto ) );
        }

        return list1;
    }

    @Override
    public List<CollaboratorCommentDto> toDto(Set<ChecklistCollaboratorComments> set) {
        if ( set == null ) {
            return null;
        }

        List<CollaboratorCommentDto> list = new ArrayList<CollaboratorCommentDto>( set.size() );
        for ( ChecklistCollaboratorComments checklistCollaboratorComments : set ) {
            list.add( toDto( checklistCollaboratorComments ) );
        }

        return list;
    }

    @Override
    public List<ChecklistCollaboratorComments> toEntity(Set<CollaboratorCommentDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistCollaboratorComments> list = new ArrayList<ChecklistCollaboratorComments>( set.size() );
        for ( CollaboratorCommentDto collaboratorCommentDto : set ) {
            list.add( toEntity( collaboratorCommentDto ) );
        }

        return list;
    }

    @Override
    public CollaboratorCommentDto toDto(ChecklistCollaboratorComments checklistCollaboratorComments) {
        if ( checklistCollaboratorComments == null ) {
            return null;
        }

        CollaboratorCommentDtoBuilder collaboratorCommentDto = CollaboratorCommentDto.builder();

        collaboratorCommentDto.commentedBy( userToUserAuditDto( checklistCollaboratorComments.getCreatedBy() ) );
        collaboratorCommentDto.state( checklistCollaboratorComments.getReviewState() );
        collaboratorCommentDto.commentedAt( checklistCollaboratorComments.getCreatedAt() );
        Integer phase = checklistCollaboratorCommentsChecklistCollaboratorMappingPhase( checklistCollaboratorComments );
        if ( phase != null ) {
            collaboratorCommentDto.phase( phase );
        }
        collaboratorCommentDto.comments( checklistCollaboratorComments.getComments() );
        if ( checklistCollaboratorComments.getId() != null ) {
            collaboratorCommentDto.id( String.valueOf( checklistCollaboratorComments.getId() ) );
        }
        collaboratorCommentDto.modifiedAt( checklistCollaboratorComments.getModifiedAt() );

        return collaboratorCommentDto.build();
    }

    protected UserAuditDto userToUserAuditDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        if ( user.getId() != null ) {
            userAuditDto.id( String.valueOf( user.getId() ) );
        }
        userAuditDto.firstName( user.getFirstName() );
        userAuditDto.lastName( user.getLastName() );
        userAuditDto.employeeId( user.getEmployeeId() );

        return userAuditDto.build();
    }

    private Integer checklistCollaboratorCommentsChecklistCollaboratorMappingPhase(ChecklistCollaboratorComments checklistCollaboratorComments) {
        if ( checklistCollaboratorComments == null ) {
            return null;
        }
        ChecklistCollaboratorMapping checklistCollaboratorMapping = checklistCollaboratorComments.getChecklistCollaboratorMapping();
        if ( checklistCollaboratorMapping == null ) {
            return null;
        }
        Integer phase = checklistCollaboratorMapping.getPhase();
        if ( phase == null ) {
            return null;
        }
        return phase;
    }
}
