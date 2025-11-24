package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.Type.Parameter;
import com.leucine.streem.dto.ParameterDto;
import com.leucine.streem.dto.ParameterInfoDto;
import com.leucine.streem.dto.TaskPauseReasonOrComment;
import com.leucine.streem.dto.TempParameterDto;
import com.leucine.streem.dto.request.ParameterCreateRequest;
import com.leucine.streem.model.ParameterValue;
import com.leucine.streem.model.ParameterVerification;
import com.leucine.streem.model.TaskExecution;
import com.leucine.streem.model.TempParameterValue;
import com.leucine.streem.model.TempParameterVerification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IParameterMapperImpl extends IParameterMapper {

    @Override
    public ParameterDto toDto(com.leucine.streem.model.Parameter e) {
        if ( e == null ) {
            return null;
        }

        ParameterDto parameterDto = new ParameterDto();

        if ( e.getAutoInitialize() != null ) {
            parameterDto.setAutoInitialize( e.getAutoInitialize() );
        }
        parameterDto.setAutoInitialized( e.isAutoInitialized() );
        if ( e.getData() != null ) {
            parameterDto.setData( e.getData() );
        }
        if ( e.getDescription() != null ) {
            parameterDto.setDescription( e.getDescription() );
        }
        parameterDto.setHidden( e.isHidden() );
        if ( e.getId() != null ) {
            parameterDto.setId( String.valueOf( e.getId() ) );
        }
        if ( e.getLabel() != null ) {
            parameterDto.setLabel( e.getLabel() );
        }
        parameterDto.setMandatory( e.isMandatory() );
        if ( e.getMetadata() != null ) {
            parameterDto.setMetadata( e.getMetadata() );
        }
        if ( e.getOrderTree() != null ) {
            parameterDto.setOrderTree( e.getOrderTree() );
        }
        if ( e.getRules() != null ) {
            parameterDto.setRules( e.getRules() );
        }
        if ( e.getTargetEntityType() != null ) {
            parameterDto.setTargetEntityType( e.getTargetEntityType() );
        }
        if ( e.getType() != null ) {
            parameterDto.setType( e.getType().name() );
        }
        if ( e.getValidations() != null ) {
            parameterDto.setValidations( e.getValidations() );
        }
        if ( e.getVerificationType() != null ) {
            parameterDto.setVerificationType( e.getVerificationType() );
        }

        setParameterValues( e, parameterDto );

        return parameterDto;
    }

    @Override
    public com.leucine.streem.model.Parameter toEntity(ParameterDto d) {
        if ( d == null ) {
            return null;
        }

        com.leucine.streem.model.Parameter parameter = new com.leucine.streem.model.Parameter();

        if ( d.getId() != null ) {
            parameter.setId( Long.parseLong( d.getId() ) );
        }
        if ( d.getAutoInitialize() != null ) {
            parameter.setAutoInitialize( d.getAutoInitialize() );
        }
        parameter.setAutoInitialized( d.isAutoInitialized() );
        if ( d.getData() != null ) {
            parameter.setData( d.getData() );
        }
        if ( d.getDescription() != null ) {
            parameter.setDescription( d.getDescription() );
        }
        parameter.setHidden( d.isHidden() );
        if ( d.getLabel() != null ) {
            parameter.setLabel( d.getLabel() );
        }
        parameter.setMandatory( d.isMandatory() );
        if ( d.getMetadata() != null ) {
            parameter.setMetadata( d.getMetadata() );
        }
        parameter.setOrderTree( d.getOrderTree() );
        if ( d.getRules() != null ) {
            parameter.setRules( d.getRules() );
        }
        if ( d.getTargetEntityType() != null ) {
            parameter.setTargetEntityType( d.getTargetEntityType() );
        }
        if ( d.getType() != null ) {
            parameter.setType( Enum.valueOf( Parameter.class, d.getType() ) );
        }
        if ( d.getValidations() != null ) {
            parameter.setValidations( d.getValidations() );
        }
        if ( d.getVerificationType() != null ) {
            parameter.setVerificationType( d.getVerificationType() );
        }

        return parameter;
    }

    @Override
    public List<ParameterDto> toDto(List<com.leucine.streem.model.Parameter> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterDto> list1 = new ArrayList<ParameterDto>( list.size() );
        for ( com.leucine.streem.model.Parameter parameter : list ) {
            list1.add( toDto( parameter ) );
        }

        return list1;
    }

    @Override
    public List<com.leucine.streem.model.Parameter> toEntity(List<ParameterDto> list) {
        if ( list == null ) {
            return null;
        }

        List<com.leucine.streem.model.Parameter> list1 = new ArrayList<com.leucine.streem.model.Parameter>( list.size() );
        for ( ParameterDto parameterDto : list ) {
            list1.add( toEntity( parameterDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterDto> toDto(Set<com.leucine.streem.model.Parameter> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterDto> list = new ArrayList<ParameterDto>( set.size() );
        for ( com.leucine.streem.model.Parameter parameter : set ) {
            list.add( toDto( parameter ) );
        }

        return list;
    }

    @Override
    public List<com.leucine.streem.model.Parameter> toEntity(Set<ParameterDto> set) {
        if ( set == null ) {
            return null;
        }

        List<com.leucine.streem.model.Parameter> list = new ArrayList<com.leucine.streem.model.Parameter>( set.size() );
        for ( ParameterDto parameterDto : set ) {
            list.add( toEntity( parameterDto ) );
        }

        return list;
    }

    @Override
    public com.leucine.streem.model.Parameter toEntity(ParameterCreateRequest parameterCreateRequest) {
        if ( parameterCreateRequest == null ) {
            return null;
        }

        com.leucine.streem.model.Parameter parameter = new com.leucine.streem.model.Parameter();

        if ( parameterCreateRequest.getId() != null ) {
            parameter.setId( Long.parseLong( parameterCreateRequest.getId() ) );
        }
        if ( parameterCreateRequest.getAutoInitialize() != null ) {
            parameter.setAutoInitialize( parameterCreateRequest.getAutoInitialize() );
        }
        parameter.setAutoInitialized( parameterCreateRequest.isAutoInitialized() );
        if ( parameterCreateRequest.getData() != null ) {
            parameter.setData( parameterCreateRequest.getData() );
        }
        if ( parameterCreateRequest.getDescription() != null ) {
            parameter.setDescription( parameterCreateRequest.getDescription() );
        }
        parameter.setHidden( parameterCreateRequest.isHidden() );
        if ( parameterCreateRequest.getLabel() != null ) {
            parameter.setLabel( parameterCreateRequest.getLabel() );
        }
        parameter.setMandatory( parameterCreateRequest.isMandatory() );
        if ( parameterCreateRequest.getMetadata() != null ) {
            parameter.setMetadata( parameterCreateRequest.getMetadata() );
        }
        parameter.setOrderTree( parameterCreateRequest.getOrderTree() );
        if ( parameterCreateRequest.getRules() != null ) {
            parameter.setRules( parameterCreateRequest.getRules() );
        }
        if ( parameterCreateRequest.getType() != null ) {
            parameter.setType( parameterCreateRequest.getType() );
        }
        if ( parameterCreateRequest.getValidations() != null ) {
            parameter.setValidations( parameterCreateRequest.getValidations() );
        }
        if ( parameterCreateRequest.getVerificationType() != null ) {
            parameter.setVerificationType( parameterCreateRequest.getVerificationType() );
        }

        return parameter;
    }

    @Override
    public ParameterInfoDto toBasicDto(com.leucine.streem.model.Parameter parameter) {
        if ( parameter == null ) {
            return null;
        }

        ParameterInfoDto parameterInfoDto = new ParameterInfoDto();

        if ( parameter.getAutoInitialize() != null ) {
            parameterInfoDto.setAutoInitialize( parameter.getAutoInitialize() );
        }
        parameterInfoDto.setAutoInitialized( parameter.isAutoInitialized() );
        if ( parameter.getData() != null ) {
            parameterInfoDto.setData( parameter.getData() );
        }
        parameterInfoDto.setHidden( parameter.isHidden() );
        if ( parameter.getId() != null ) {
            parameterInfoDto.setId( String.valueOf( parameter.getId() ) );
        }
        if ( parameter.getLabel() != null ) {
            parameterInfoDto.setLabel( parameter.getLabel() );
        }
        parameterInfoDto.setMandatory( parameter.isMandatory() );
        if ( parameter.getMetadata() != null ) {
            parameterInfoDto.setMetadata( parameter.getMetadata() );
        }
        if ( parameter.getOrderTree() != null ) {
            parameterInfoDto.setOrderTree( parameter.getOrderTree() );
        }
        if ( parameter.getTargetEntityType() != null ) {
            parameterInfoDto.setTargetEntityType( parameter.getTargetEntityType() );
        }
        if ( parameter.getTaskId() != null ) {
            parameterInfoDto.setTaskId( String.valueOf( parameter.getTaskId() ) );
        }
        if ( parameter.getType() != null ) {
            parameterInfoDto.setType( parameter.getType().name() );
        }
        if ( parameter.getValidations() != null ) {
            parameterInfoDto.setValidations( parameter.getValidations() );
        }
        if ( parameter.getVerificationType() != null ) {
            parameterInfoDto.setVerificationType( parameter.getVerificationType() );
        }

        return parameterInfoDto;
    }

    @Override
    public List<ParameterInfoDto> toBasicDto(List<com.leucine.streem.model.Parameter> parameters) {
        if ( parameters == null ) {
            return null;
        }

        List<ParameterInfoDto> list = new ArrayList<ParameterInfoDto>( parameters.size() );
        for ( com.leucine.streem.model.Parameter parameter : parameters ) {
            list.add( toBasicDto( parameter ) );
        }

        return list;
    }

    @Override
    public TempParameterDto toTempParameterDto(com.leucine.streem.model.Parameter parameter) {
        if ( parameter == null ) {
            return null;
        }

        TempParameterDto tempParameterDto = new TempParameterDto();

        if ( parameter.getAutoInitialize() != null ) {
            tempParameterDto.setAutoInitialize( parameter.getAutoInitialize() );
        }
        tempParameterDto.setAutoInitialized( parameter.isAutoInitialized() );
        if ( parameter.getData() != null ) {
            tempParameterDto.setData( parameter.getData() );
        }
        tempParameterDto.setHidden( parameter.isHidden() );
        if ( parameter.getId() != null ) {
            tempParameterDto.setId( String.valueOf( parameter.getId() ) );
        }
        if ( parameter.getLabel() != null ) {
            tempParameterDto.setLabel( parameter.getLabel() );
        }
        tempParameterDto.setMandatory( parameter.isMandatory() );
        if ( parameter.getOrderTree() != null ) {
            tempParameterDto.setOrderTree( parameter.getOrderTree() );
        }
        if ( parameter.getRules() != null ) {
            tempParameterDto.setRules( parameter.getRules() );
        }
        if ( parameter.getType() != null ) {
            tempParameterDto.setType( parameter.getType().name() );
        }
        if ( parameter.getValidations() != null ) {
            tempParameterDto.setValidations( parameter.getValidations() );
        }
        if ( parameter.getVerificationType() != null ) {
            tempParameterDto.setVerificationType( parameter.getVerificationType() );
        }

        return tempParameterDto;
    }

    @Override
    public ParameterDto toDto(com.leucine.streem.model.Parameter parameter, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( parameter == null ) {
            return null;
        }

        ParameterDto parameterDto = new ParameterDto();

        if ( parameter.getAutoInitialize() != null ) {
            parameterDto.setAutoInitialize( parameter.getAutoInitialize() );
        }
        parameterDto.setAutoInitialized( parameter.isAutoInitialized() );
        if ( parameter.getData() != null ) {
            parameterDto.setData( parameter.getData() );
        }
        if ( parameter.getDescription() != null ) {
            parameterDto.setDescription( parameter.getDescription() );
        }
        parameterDto.setHidden( parameter.isHidden() );
        if ( parameter.getId() != null ) {
            parameterDto.setId( String.valueOf( parameter.getId() ) );
        }
        if ( parameter.getLabel() != null ) {
            parameterDto.setLabel( parameter.getLabel() );
        }
        parameterDto.setMandatory( parameter.isMandatory() );
        if ( parameter.getMetadata() != null ) {
            parameterDto.setMetadata( parameter.getMetadata() );
        }
        if ( parameter.getOrderTree() != null ) {
            parameterDto.setOrderTree( parameter.getOrderTree() );
        }
        if ( parameter.getRules() != null ) {
            parameterDto.setRules( parameter.getRules() );
        }
        if ( parameter.getTargetEntityType() != null ) {
            parameterDto.setTargetEntityType( parameter.getTargetEntityType() );
        }
        if ( parameter.getType() != null ) {
            parameterDto.setType( parameter.getType().name() );
        }
        if ( parameter.getValidations() != null ) {
            parameterDto.setValidations( parameter.getValidations() );
        }
        if ( parameter.getVerificationType() != null ) {
            parameterDto.setVerificationType( parameter.getVerificationType() );
        }

        setParameterValues( parameter, parameterDto );
        setParameterValues( parameter, parameterDto, parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf );

        return parameterDto;
    }

    @Override
    public List<ParameterDto> toDto(Set<com.leucine.streem.model.Parameter> parameters, Map<Long, List<ParameterValue>> parameterValueMap, Map<Long, TaskExecution> taskExecutionMap, Map<Long, List<TempParameterValue>> tempParameterValueMap, Map<Long, List<TaskPauseReasonOrComment>> pauseReasonOrCommentMap, Map<Long, List<ParameterVerification>> parameterVerificationMapPeerAndSelf, Map<Long, List<TempParameterVerification>> tempParameterVerificationMapPeerAndSelf) {
        if ( parameters == null ) {
            return null;
        }

        List<ParameterDto> list = new ArrayList<ParameterDto>( parameters.size() );
        for ( com.leucine.streem.model.Parameter parameter : parameters ) {
            list.add( toDto( parameter, parameterValueMap, taskExecutionMap, tempParameterValueMap, pauseReasonOrCommentMap, parameterVerificationMapPeerAndSelf, tempParameterVerificationMapPeerAndSelf ) );
        }

        return list;
    }
}
