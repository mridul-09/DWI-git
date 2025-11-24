package com.leucine.streem.dto.mapper.importmapper;

import com.leucine.streem.constant.Type.Parameter;
import com.leucine.streem.dto.ChecklistDto;
import com.leucine.streem.dto.ParameterDto;
import com.leucine.streem.dto.request.ImportChecklistRequest;
import com.leucine.streem.dto.request.ImportParameterRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IImportChecklistMapperImpl implements IImportChecklistMapper {

    @Autowired
    private IImportStageMapper iImportStageMapper;
    @Autowired
    private IImportActionMapper iImportActionMapper;

    @Override
    public ChecklistDto toEntity(ImportChecklistRequest d) {
        if ( d == null ) {
            return null;
        }

        ChecklistDto checklistDto = new ChecklistDto();

        checklistDto.setColorCode( d.getColorCode() );
        checklistDto.setDescription( d.getDescription() );
        checklistDto.setId( d.getId() );
        checklistDto.setName( d.getName() );

        return checklistDto;
    }

    @Override
    public List<ImportChecklistRequest> toDto(List<ChecklistDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportChecklistRequest> list1 = new ArrayList<ImportChecklistRequest>( list.size() );
        for ( ChecklistDto checklistDto : list ) {
            list1.add( toDto( checklistDto ) );
        }

        return list1;
    }

    @Override
    public List<ChecklistDto> toEntity(List<ImportChecklistRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<ChecklistDto> list1 = new ArrayList<ChecklistDto>( list.size() );
        for ( ImportChecklistRequest importChecklistRequest : list ) {
            list1.add( toEntity( importChecklistRequest ) );
        }

        return list1;
    }

    @Override
    public List<ImportChecklistRequest> toDto(Set<ChecklistDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ImportChecklistRequest> list = new ArrayList<ImportChecklistRequest>( set.size() );
        for ( ChecklistDto checklistDto : set ) {
            list.add( toDto( checklistDto ) );
        }

        return list;
    }

    @Override
    public List<ChecklistDto> toEntity(Set<ImportChecklistRequest> set) {
        if ( set == null ) {
            return null;
        }

        List<ChecklistDto> list = new ArrayList<ChecklistDto>( set.size() );
        for ( ImportChecklistRequest importChecklistRequest : set ) {
            list.add( toEntity( importChecklistRequest ) );
        }

        return list;
    }

    @Override
    public ImportChecklistRequest toDto(ChecklistDto e) {
        if ( e == null ) {
            return null;
        }

        ImportChecklistRequest importChecklistRequest = new ImportChecklistRequest();

        importChecklistRequest.setParameterRequests( parameterDtoListToImportParameterRequestList( e.getParameters() ) );
        importChecklistRequest.setStageRequests( iImportStageMapper.toDto( e.getStages() ) );
        importChecklistRequest.setActionRequests( iImportActionMapper.toDto( e.getActions() ) );
        importChecklistRequest.setColorCode( e.getColorCode() );
        importChecklistRequest.setDescription( e.getDescription() );
        importChecklistRequest.setId( e.getId() );
        importChecklistRequest.setName( e.getName() );

        return importChecklistRequest;
    }

    protected ImportParameterRequest parameterDtoToImportParameterRequest(ParameterDto parameterDto) {
        if ( parameterDto == null ) {
            return null;
        }

        ImportParameterRequest importParameterRequest = new ImportParameterRequest();

        importParameterRequest.setAutoInitialize( parameterDto.getAutoInitialize() );
        importParameterRequest.setAutoInitialized( parameterDto.isAutoInitialized() );
        importParameterRequest.setData( parameterDto.getData() );
        importParameterRequest.setDescription( parameterDto.getDescription() );
        importParameterRequest.setExceptionApprovalType( parameterDto.getExceptionApprovalType() );
        importParameterRequest.setHidden( parameterDto.isHidden() );
        importParameterRequest.setId( parameterDto.getId() );
        importParameterRequest.setLabel( parameterDto.getLabel() );
        importParameterRequest.setMandatory( parameterDto.isMandatory() );
        importParameterRequest.setMetadata( parameterDto.getMetadata() );
        importParameterRequest.setOrderTree( parameterDto.getOrderTree() );
        importParameterRequest.setRules( parameterDto.getRules() );
        if ( parameterDto.getType() != null ) {
            importParameterRequest.setType( Enum.valueOf( Parameter.class, parameterDto.getType() ) );
        }
        importParameterRequest.setValidations( parameterDto.getValidations() );
        importParameterRequest.setVerificationType( parameterDto.getVerificationType() );

        return importParameterRequest;
    }

    protected List<ImportParameterRequest> parameterDtoListToImportParameterRequestList(List<ParameterDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportParameterRequest> list1 = new ArrayList<ImportParameterRequest>( list.size() );
        for ( ParameterDto parameterDto : list ) {
            list1.add( parameterDtoToImportParameterRequest( parameterDto ) );
        }

        return list1;
    }
}
