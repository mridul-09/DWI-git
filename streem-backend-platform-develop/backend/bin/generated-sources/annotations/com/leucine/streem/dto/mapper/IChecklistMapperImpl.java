package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.AuditDto;
import com.leucine.streem.dto.ChecklistBasicDto;
import com.leucine.streem.dto.ChecklistCollaboratorDto;
import com.leucine.streem.dto.ChecklistCommentDto;
import com.leucine.streem.dto.ChecklistCommentDto.ChecklistCommentDtoBuilder;
import com.leucine.streem.dto.ChecklistDto;
import com.leucine.streem.dto.ChecklistInfoJobReportDto;
import com.leucine.streem.dto.ChecklistJobDto;
import com.leucine.streem.dto.ChecklistPartialDto;
import com.leucine.streem.dto.ChecklistReviewDto;
import com.leucine.streem.dto.RelationDto;
import com.leucine.streem.dto.StageDto;
import com.leucine.streem.dto.TaskPauseReasonOrComment;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.Checklist;
import com.leucine.streem.model.ChecklistCollaboratorComments;
import com.leucine.streem.model.ChecklistCollaboratorMapping;
import com.leucine.streem.model.ParameterValue;
import com.leucine.streem.model.ParameterVerification;
import com.leucine.streem.model.Relation;
import com.leucine.streem.model.Stage;
import com.leucine.streem.model.TaskExecution;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.TempParameterVerification;
import com.leucine.streem.model.User;
import com.leucine.streem.model.Version;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IChecklistMapperImpl implements IChecklistMapper {

    @Autowired
    private IChecklistPropertyValuesMapper iChecklistPropertyValuesMapper;
    @Autowired
    private IStageMapper iStageMapper;
    @Autowired
    private IChecklistCollaboratorMapper iChecklistCollaboratorMapper;
    @Autowired
    private IChecklistCollaboratorCommentMapper iChecklistCollaboratorCommentMapper;

    @Override
    public Checklist toEntity(ChecklistDto d) {
        if ( d == null ) {
            return null;
        }

        Checklist checklist = new Checklist();

        if ( d.getId() != null ) {
            checklist.setId( Long.parseLong( d.getId() ) );
        }
        checklist.setArchived( d.isArchived() );
        checklist.setCode( d.getCode() );
        checklist.setCollaborators( checklistCollaboratorDtoListToChecklistCollaboratorMappingSet( d.getCollaborators() ) );
        checklist.setColorCode( d.getColorCode() );
        checklist.setDescription( d.getDescription() );
        checklist.setGlobal( d.isGlobal() );
        checklist.setJobLogColumns( d.getJobLogColumns() );
        checklist.setName( d.getName() );
        checklist.setRelations( relationDtoListToRelationSet( d.getRelations() ) );
        checklist.setStages( stageDtoListToStageSet( d.getStages() ) );
        checklist.setState( d.getState() );
        checklist.setUseCaseId( d.getUseCaseId() );

        return checklist;
    }

    @Override
    public List<ChecklistDto> toDto(List<Checklist> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistDto> list1 = new ArrayList<ChecklistDto>( list.size() );
        for ( Checklist checklist : list ) {
            list1.add( toDto( checklist ) );
        }

        return list1;
    }

    @Override
    public List<Checklist> toEntity(List<ChecklistDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Checklist> list1 = new ArrayList<Checklist>( list.size() );
        for ( ChecklistDto checklistDto : list ) {
            list1.add( toEntity( checklistDto ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistDto> toDto(Set<Checklist> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistDto> list = new ArrayList<ChecklistDto>( set.size() );
        for ( Checklist checklist : set ) {
            list.add( toDto( checklist ) );
        }

        return list;
    }

    @Override
    public List<Checklist> toEntity(Set<ChecklistDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Checklist> list = new ArrayList<Checklist>( set.size() );
        for ( ChecklistDto checklistDto : set ) {
            list.add( toEntity( checklistDto ) );
        }

        return list;
    }

    @Override
    public ChecklistDto toDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistDto checklistDto = new ChecklistDto();

        checklistDto.setAudit( checklistToAuditDto( checklist ) );
        checklistDto.setProperties( iChecklistPropertyValuesMapper.toDto( checklist.getChecklistPropertyValues() ) );
        checklistDto.setVersionNumber( checklistVersionVersion( checklist ) );
        checklistDto.setCollaborators( iChecklistCollaboratorMapper.toDto( checklist.getCollaborators() ) );
        checklistDto.setComments( IChecklistMapper.toCommentsDto( checklist.getCollaborators() ) );
        if ( checklist.getReviewCycle() != null ) {
            checklistDto.setPhase( checklist.getReviewCycle() );
        }
        checklistDto.setRelations( IChecklistMapper.toRelationsDto( checklist.getRelations() ) );
        checklistDto.setArchived( checklist.isArchived() );
        checklistDto.setCode( checklist.getCode() );
        checklistDto.setColorCode( checklist.getColorCode() );
        checklistDto.setDescription( checklist.getDescription() );
        checklistDto.setGlobal( checklist.isGlobal() );
        if ( checklist.getId() != null ) {
            checklistDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistDto.setJobLogColumns( checklist.getJobLogColumns() );
        checklistDto.setName( checklist.getName() );
        checklistDto.setStages( iStageMapper.toDto( checklist.getStages() ) );
        checklistDto.setState( checklist.getState() );
        checklistDto.setUseCaseId( checklist.getUseCaseId() );

        return checklistDto;
    }

    @Override
    public List<ChecklistPartialDto> toPartialDto(List<Checklist> checklists) {
        if ( checklists == null ) {
            return null;
        }

        List<ChecklistPartialDto> list = new ArrayList<ChecklistPartialDto>( checklists.size() );
        for ( Checklist checklist : checklists ) {
            list.add( toPartialDto( checklist ) );
        }

        return list;
    }

    @Override
    public ChecklistJobDto toChecklistJobDto(Checklist checklist, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistJobDto checklistJobDto = new ChecklistJobDto();

        checklistJobDto.setProperties( IChecklistPropertyValuesMapper.toPropertyValueList( checklist.getChecklistPropertyValues() ) );
        checklistJobDto.setStages( iStageMapper.toDto( checklist.getStages(), parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        checklistJobDto.setArchived( checklist.isArchived() );
        checklistJobDto.setCode( checklist.getCode() );
        checklistJobDto.setColorCode( checklist.getColorCode() );
        checklistJobDto.setGlobal( checklist.isGlobal() );
        if ( checklist.getId() != null ) {
            checklistJobDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistJobDto.setName( checklist.getName() );

        return checklistJobDto;
    }

    @Override
    public ChecklistInfoJobReportDto toChecklistInfoJobReportDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistInfoJobReportDto checklistInfoJobReportDto = new ChecklistInfoJobReportDto();

        checklistInfoJobReportDto.setProperties( IChecklistPropertyValuesMapper.toPropertyValueList( checklist.getChecklistPropertyValues() ) );
        checklistInfoJobReportDto.setArchived( checklist.isArchived() );
        checklistInfoJobReportDto.setCode( checklist.getCode() );
        checklistInfoJobReportDto.setColorCode( checklist.getColorCode() );
        checklistInfoJobReportDto.setGlobal( checklist.isGlobal() );
        if ( checklist.getId() != null ) {
            checklistInfoJobReportDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistInfoJobReportDto.setName( checklist.getName() );

        return checklistInfoJobReportDto;
    }

    @Override
    public ChecklistPartialDto toPartialDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistPartialDto checklistPartialDto = new ChecklistPartialDto();

        checklistPartialDto.setAudit( checklistToAuditDto1( checklist ) );
        checklistPartialDto.setProperties( IChecklistPropertyValuesMapper.toPropertyValueList( checklist.getChecklistPropertyValues() ) );
        checklistPartialDto.setVersion( checklistVersionVersion( checklist ) );
        Long ancestor = checklistVersionAncestor( checklist );
        if ( ancestor != null ) {
            checklistPartialDto.setAncestorId( String.valueOf( ancestor ) );
        }
        checklistPartialDto.setArchived( checklist.isArchived() );
        checklistPartialDto.setCode( checklist.getCode() );
        checklistPartialDto.setColorCode( checklist.getColorCode() );
        checklistPartialDto.setGlobal( checklist.isGlobal() );
        if ( checklist.getId() != null ) {
            checklistPartialDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistPartialDto.setName( checklist.getName() );
        checklistPartialDto.setState( checklist.getState() );

        return checklistPartialDto;
    }

    @Override
    public ChecklistBasicDto toChecklistBasicDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistBasicDto checklistBasicDto = new ChecklistBasicDto();

        if ( checklist.getReviewCycle() != null ) {
            checklistBasicDto.setPhase( checklist.getReviewCycle() );
        }
        checklistBasicDto.setCode( checklist.getCode() );
        checklistBasicDto.setColorCode( checklist.getColorCode() );
        checklistBasicDto.setGlobal( checklist.isGlobal() );
        if ( checklist.getId() != null ) {
            checklistBasicDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistBasicDto.setName( checklist.getName() );
        checklistBasicDto.setState( checklist.getState() );

        return checklistBasicDto;
    }

    @Override
    public ChecklistReviewDto toChecklistReviewDto(Checklist checklist, Collection<ChecklistCollaboratorMapping> checklistCollaboratorMappings) {
        if ( checklist == null && checklistCollaboratorMappings == null ) {
            return null;
        }

        ChecklistReviewDto checklistReviewDto = new ChecklistReviewDto();

        if ( checklist != null ) {
            checklistReviewDto.setChecklist( checklistToChecklistBasicDto( checklist ) );
        }
        if ( checklistCollaboratorMappings != null ) {
            checklistReviewDto.setCollaborators( checklistCollaboratorMappingCollectionToChecklistCollaboratorDtoList( checklistCollaboratorMappings ) );
        }

        return checklistReviewDto;
    }

    @Override
    public ChecklistCommentDto toChecklistCommentDto(Checklist checklist, ChecklistCollaboratorComments checklistCollaboratorComments, List<ChecklistCollaboratorMapping> checklistCollaboratorMappings) {
        if ( checklist == null && checklistCollaboratorComments == null && checklistCollaboratorMappings == null ) {
            return null;
        }

        ChecklistCommentDtoBuilder checklistCommentDto = ChecklistCommentDto.builder();

        if ( checklist != null ) {
            checklistCommentDto.checklist( checklistToChecklistBasicDto1( checklist ) );
        }
        if ( checklistCollaboratorComments != null ) {
            checklistCommentDto.comment( iChecklistCollaboratorCommentMapper.toDto( checklistCollaboratorComments ) );
        }
        if ( checklistCollaboratorMappings != null ) {
            checklistCommentDto.collaborators( iChecklistCollaboratorMapper.toDto( checklistCollaboratorMappings ) );
        }

        return checklistCommentDto.build();
    }

    protected Set<ChecklistCollaboratorMapping> checklistCollaboratorDtoListToChecklistCollaboratorMappingSet(List<ChecklistCollaboratorDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<ChecklistCollaboratorMapping> set = new HashSet<ChecklistCollaboratorMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ChecklistCollaboratorDto checklistCollaboratorDto : list ) {
            set.add( iChecklistCollaboratorMapper.toEntity( checklistCollaboratorDto ) );
        }

        return set;
    }

    protected Relation relationDtoToRelation(RelationDto relationDto) {
        if ( relationDto == null ) {
            return null;
        }

        Relation relation = new Relation();

        if ( relationDto.getId() != null ) {
            relation.setId( Long.parseLong( relationDto.getId() ) );
        }
        relation.setDisplayName( relationDto.getDisplayName() );
        relation.setExternalId( relationDto.getExternalId() );
        relation.setObjectTypeId( relationDto.getObjectTypeId() );
        relation.setOrderTree( relationDto.getOrderTree() );
        relation.setVariables( relationDto.getVariables() );

        return relation;
    }

    protected Set<Relation> relationDtoListToRelationSet(List<RelationDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Relation> set = new HashSet<Relation>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( RelationDto relationDto : list ) {
            set.add( relationDtoToRelation( relationDto ) );
        }

        return set;
    }

    protected Set<Stage> stageDtoListToStageSet(List<StageDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Stage> set = new HashSet<Stage>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( StageDto stageDto : list ) {
            set.add( iStageMapper.toEntity( stageDto ) );
        }

        return set;
    }

    protected UserAuditDto userToUserAuditDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        userAuditDto.employeeId( user.getEmployeeId() );
        userAuditDto.firstName( user.getFirstName() );
        if ( user.getId() != null ) {
            userAuditDto.id( String.valueOf( user.getId() ) );
        }
        userAuditDto.lastName( user.getLastName() );

        return userAuditDto.build();
    }

    protected AuditDto checklistToAuditDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        AuditDto auditDto = new AuditDto();

        auditDto.setModifiedAt( checklist.getModifiedAt() );
        auditDto.setModifiedBy( userToUserAuditDto( checklist.getModifiedBy() ) );
        auditDto.setCreatedAt( checklist.getCreatedAt() );
        auditDto.setCreatedBy( userToUserAuditDto( checklist.getCreatedBy() ) );

        return auditDto;
    }

    private Integer checklistVersionVersion(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }
        Version version = checklist.getVersion();
        if ( version == null ) {
            return null;
        }
        Integer version1 = version.getVersion();
        if ( version1 == null ) {
            return null;
        }
        return version1;
    }

    protected AuditDto checklistToAuditDto1(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        AuditDto auditDto = new AuditDto();

        auditDto.setModifiedAt( checklist.getModifiedAt() );
        auditDto.setModifiedBy( userToUserAuditDto( checklist.getModifiedBy() ) );
        auditDto.setCreatedAt( checklist.getCreatedAt() );
        auditDto.setCreatedBy( userToUserAuditDto( checklist.getCreatedBy() ) );

        return auditDto;
    }

    private Long checklistVersionAncestor(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }
        Version version = checklist.getVersion();
        if ( version == null ) {
            return null;
        }
        Long ancestor = version.getAncestor();
        if ( ancestor == null ) {
            return null;
        }
        return ancestor;
    }

    protected ChecklistBasicDto checklistToChecklistBasicDto(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistBasicDto checklistBasicDto = new ChecklistBasicDto();

        if ( checklist.getId() != null ) {
            checklistBasicDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistBasicDto.setName( checklist.getName() );
        checklistBasicDto.setState( checklist.getState() );
        if ( checklist.getReviewCycle() != null ) {
            checklistBasicDto.setPhase( checklist.getReviewCycle() );
        }
        checklistBasicDto.setColorCode( checklist.getColorCode() );

        return checklistBasicDto;
    }

    protected List<ChecklistCollaboratorDto> checklistCollaboratorMappingCollectionToChecklistCollaboratorDtoList(Collection<ChecklistCollaboratorMapping> collection) {
        if ( collection == null ) {
            return null;
        }

        List<ChecklistCollaboratorDto> list = new ArrayList<ChecklistCollaboratorDto>( collection.size() );
        for ( ChecklistCollaboratorMapping checklistCollaboratorMapping : collection ) {
            list.add( iChecklistCollaboratorMapper.toDto( checklistCollaboratorMapping ) );
        }

        return list;
    }

    protected ChecklistBasicDto checklistToChecklistBasicDto1(Checklist checklist) {
        if ( checklist == null ) {
            return null;
        }

        ChecklistBasicDto checklistBasicDto = new ChecklistBasicDto();

        if ( checklist.getId() != null ) {
            checklistBasicDto.setId( String.valueOf( checklist.getId() ) );
        }
        checklistBasicDto.setState( checklist.getState() );
        if ( checklist.getReviewCycle() != null ) {
            checklistBasicDto.setPhase( checklist.getReviewCycle() );
        }
        checklistBasicDto.setName( checklist.getName() );

        return checklistBasicDto;
    }
}
