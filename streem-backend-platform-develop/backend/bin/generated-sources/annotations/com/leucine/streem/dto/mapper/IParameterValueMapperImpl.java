package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.State.ParameterVerification;
import com.leucine.streem.constant.Type.VerificationType;
import com.leucine.streem.dto.MediaDto;
import com.leucine.streem.dto.ParameterValueDto;
import com.leucine.streem.dto.ParameterVerificationDto;
import com.leucine.streem.dto.PartialAuditDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.dto.VariationDto;
import com.leucine.streem.model.ParameterValue;
import com.leucine.streem.model.User;
import com.leucine.streem.model.Variation;
import com.leucine.streem.model.VariationMediaMapping;
import java.util.ArrayList;
import java.util.HashSet;
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
public class IParameterValueMapperImpl implements IParameterValueMapper {

    @Autowired
    private IParameterValueMediaMapper iParameterValueMediaMapper;

    @Override
    public ParameterValue toEntity(ParameterValueDto d) {
        if ( d == null ) {
            return null;
        }

        ParameterValue parameterValue = new ParameterValue();

        if ( d.getId() != null ) {
            parameterValue.setId( Long.parseLong( d.getId() ) );
        }
        parameterValue.setChoices( d.getChoices() );
        parameterValue.setHidden( d.isHidden() );
        parameterValue.setParameterVerifications( parameterVerificationDtoListToParameterVerificationList( d.getParameterVerifications() ) );
        parameterValue.setReason( d.getReason() );
        parameterValue.setState( d.getState() );
        if ( d.getTaskExecutionId() != null ) {
            parameterValue.setTaskExecutionId( Long.parseLong( d.getTaskExecutionId() ) );
        }
        parameterValue.setValue( d.getValue() );
        parameterValue.setVariations( variationDtoListToVariationList( d.getVariations() ) );
        parameterValue.setHasActiveException( d.isHasActiveException() );
        parameterValue.setMedias( iParameterValueMediaMapper.toEntity( d.getMedias() ) );

        return parameterValue;
    }

    @Override
    public List<ParameterValueDto> toDto(List<ParameterValue> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterValueDto> list1 = new ArrayList<ParameterValueDto>( list.size() );
        for ( ParameterValue parameterValue : list ) {
            list1.add( toDto( parameterValue ) );
        }

        return list1;
    }

    @Override
    public List<ParameterValue> toEntity(List<ParameterValueDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterValue> list1 = new ArrayList<ParameterValue>( list.size() );
        for ( ParameterValueDto parameterValueDto : list ) {
            list1.add( toEntity( parameterValueDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterValueDto> toDto(Set<ParameterValue> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterValueDto> list = new ArrayList<ParameterValueDto>( set.size() );
        for ( ParameterValue parameterValue : set ) {
            list.add( toDto( parameterValue ) );
        }

        return list;
    }

    @Override
    public List<ParameterValue> toEntity(Set<ParameterValueDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterValue> list = new ArrayList<ParameterValue>( set.size() );
        for ( ParameterValueDto parameterValueDto : set ) {
            list.add( toEntity( parameterValueDto ) );
        }

        return list;
    }

    @Override
    public ParameterValueDto toDto(ParameterValue parameterValue) {
        if ( parameterValue == null ) {
            return null;
        }

        ParameterValueDto parameterValueDto = new ParameterValueDto();

        parameterValueDto.setAudit( parameterValueToPartialAuditDto( parameterValue ) );
        parameterValueDto.setChoices( parameterValue.getChoices() );
        parameterValueDto.setHasActiveException( parameterValue.isHasActiveException() );
        parameterValueDto.setHidden( parameterValue.isHidden() );
        parameterValueDto.setMedias( iParameterValueMediaMapper.toDto( parameterValue.getMedias() ) );
        parameterValueDto.setReason( parameterValue.getReason() );
        parameterValueDto.setValue( parameterValue.getValue() );
        if ( parameterValue.getId() != null ) {
            parameterValueDto.setId( String.valueOf( parameterValue.getId() ) );
        }
        parameterValueDto.setParameterVerifications( parameterVerificationListToParameterVerificationDtoList( parameterValue.getParameterVerifications() ) );
        parameterValueDto.setState( parameterValue.getState() );
        if ( parameterValue.getTaskExecutionId() != null ) {
            parameterValueDto.setTaskExecutionId( String.valueOf( parameterValue.getTaskExecutionId() ) );
        }
        parameterValueDto.setVariations( variationListToVariationDtoList( parameterValue.getVariations() ) );

        return parameterValueDto;
    }

    protected User userAuditDtoToUser(UserAuditDto userAuditDto) {
        if ( userAuditDto == null ) {
            return null;
        }

        User user = new User();

        if ( userAuditDto.getId() != null ) {
            user.setId( Long.parseLong( userAuditDto.getId() ) );
        }
        user.setEmployeeId( userAuditDto.getEmployeeId() );
        user.setFirstName( userAuditDto.getFirstName() );
        user.setLastName( userAuditDto.getLastName() );

        return user;
    }

    protected com.leucine.streem.model.ParameterVerification parameterVerificationDtoToParameterVerification(ParameterVerificationDto parameterVerificationDto) {
        if ( parameterVerificationDto == null ) {
            return null;
        }

        com.leucine.streem.model.ParameterVerification parameterVerification = new com.leucine.streem.model.ParameterVerification();

        if ( parameterVerificationDto.getId() != null ) {
            parameterVerification.setId( Long.parseLong( parameterVerificationDto.getId() ) );
        }
        if ( parameterVerificationDto.getCreatedAt() != null ) {
            parameterVerification.setCreatedAt( Long.parseLong( parameterVerificationDto.getCreatedAt() ) );
        }
        parameterVerification.setCreatedBy( userAuditDtoToUser( parameterVerificationDto.getCreatedBy() ) );
        if ( parameterVerificationDto.getModifiedAt() != null ) {
            parameterVerification.setModifiedAt( Long.parseLong( parameterVerificationDto.getModifiedAt() ) );
        }
        parameterVerification.setModifiedBy( userAuditDtoToUser( parameterVerificationDto.getModifiedBy() ) );
        parameterVerification.setBulk( parameterVerificationDto.isBulk() );
        parameterVerification.setComments( parameterVerificationDto.getComments() );
        if ( parameterVerificationDto.getVerificationStatus() != null ) {
            parameterVerification.setVerificationStatus( Enum.valueOf( ParameterVerification.class, parameterVerificationDto.getVerificationStatus() ) );
        }
        if ( parameterVerificationDto.getVerificationType() != null ) {
            parameterVerification.setVerificationType( Enum.valueOf( VerificationType.class, parameterVerificationDto.getVerificationType() ) );
        }

        return parameterVerification;
    }

    protected List<com.leucine.streem.model.ParameterVerification> parameterVerificationDtoListToParameterVerificationList(List<ParameterVerificationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<com.leucine.streem.model.ParameterVerification> list1 = new ArrayList<com.leucine.streem.model.ParameterVerification>( list.size() );
        for ( ParameterVerificationDto parameterVerificationDto : list ) {
            list1.add( parameterVerificationDtoToParameterVerification( parameterVerificationDto ) );
        }

        return list1;
    }

    protected VariationMediaMapping mediaDtoToVariationMediaMapping(MediaDto mediaDto) {
        if ( mediaDto == null ) {
            return null;
        }

        VariationMediaMapping variationMediaMapping = new VariationMediaMapping();

        variationMediaMapping.setArchived( mediaDto.isArchived() );

        return variationMediaMapping;
    }

    protected Set<VariationMediaMapping> mediaDtoListToVariationMediaMappingSet(List<MediaDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<VariationMediaMapping> set = new HashSet<VariationMediaMapping>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( MediaDto mediaDto : list ) {
            set.add( mediaDtoToVariationMediaMapping( mediaDto ) );
        }

        return set;
    }

    protected Variation variationDtoToVariation(VariationDto variationDto) {
        if ( variationDto == null ) {
            return null;
        }

        Variation variation = new Variation();

        if ( variationDto.getId() != null ) {
            variation.setId( Long.parseLong( variationDto.getId() ) );
        }
        variation.setDescription( variationDto.getDescription() );
        if ( variationDto.getJobId() != null ) {
            variation.setJobId( Long.parseLong( variationDto.getJobId() ) );
        }
        variation.setMedias( mediaDtoListToVariationMediaMappingSet( variationDto.getMedias() ) );
        variation.setName( variationDto.getName() );
        variation.setType( variationDto.getType() );
        variation.setVariationNumber( variationDto.getVariationNumber() );

        return variation;
    }

    protected List<Variation> variationDtoListToVariationList(List<VariationDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Variation> list1 = new ArrayList<Variation>( list.size() );
        for ( VariationDto variationDto : list ) {
            list1.add( variationDtoToVariation( variationDto ) );
        }

        return list1;
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

    protected PartialAuditDto parameterValueToPartialAuditDto(ParameterValue parameterValue) {
        if ( parameterValue == null ) {
            return null;
        }

        PartialAuditDto partialAuditDto = new PartialAuditDto();

        partialAuditDto.setModifiedAt( parameterValue.getModifiedAt() );
        partialAuditDto.setModifiedBy( userToUserAuditDto( parameterValue.getModifiedBy() ) );

        return partialAuditDto;
    }

    protected ParameterVerificationDto parameterVerificationToParameterVerificationDto(com.leucine.streem.model.ParameterVerification parameterVerification) {
        if ( parameterVerification == null ) {
            return null;
        }

        ParameterVerificationDto parameterVerificationDto = new ParameterVerificationDto();

        parameterVerificationDto.setBulk( parameterVerification.isBulk() );
        parameterVerificationDto.setComments( parameterVerification.getComments() );
        if ( parameterVerification.getCreatedAt() != null ) {
            parameterVerificationDto.setCreatedAt( String.valueOf( parameterVerification.getCreatedAt() ) );
        }
        parameterVerificationDto.setCreatedBy( userToUserAuditDto( parameterVerification.getCreatedBy() ) );
        if ( parameterVerification.getId() != null ) {
            parameterVerificationDto.setId( String.valueOf( parameterVerification.getId() ) );
        }
        if ( parameterVerification.getModifiedAt() != null ) {
            parameterVerificationDto.setModifiedAt( String.valueOf( parameterVerification.getModifiedAt() ) );
        }
        parameterVerificationDto.setModifiedBy( userToUserAuditDto( parameterVerification.getModifiedBy() ) );
        if ( parameterVerification.getVerificationStatus() != null ) {
            parameterVerificationDto.setVerificationStatus( parameterVerification.getVerificationStatus().name() );
        }
        if ( parameterVerification.getVerificationType() != null ) {
            parameterVerificationDto.setVerificationType( parameterVerification.getVerificationType().name() );
        }

        return parameterVerificationDto;
    }

    protected List<ParameterVerificationDto> parameterVerificationListToParameterVerificationDtoList(List<com.leucine.streem.model.ParameterVerification> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterVerificationDto> list1 = new ArrayList<ParameterVerificationDto>( list.size() );
        for ( com.leucine.streem.model.ParameterVerification parameterVerification : list ) {
            list1.add( parameterVerificationToParameterVerificationDto( parameterVerification ) );
        }

        return list1;
    }

    protected MediaDto variationMediaMappingToMediaDto(VariationMediaMapping variationMediaMapping) {
        if ( variationMediaMapping == null ) {
            return null;
        }

        MediaDto mediaDto = new MediaDto();

        mediaDto.setArchived( variationMediaMapping.isArchived() );

        return mediaDto;
    }

    protected List<MediaDto> variationMediaMappingSetToMediaDtoList(Set<VariationMediaMapping> set) {
        if ( set == null ) {
            return null;
        }

        List<MediaDto> list = new ArrayList<MediaDto>( set.size() );
        for ( VariationMediaMapping variationMediaMapping : set ) {
            list.add( variationMediaMappingToMediaDto( variationMediaMapping ) );
        }

        return list;
    }

    protected VariationDto variationToVariationDto(Variation variation) {
        if ( variation == null ) {
            return null;
        }

        VariationDto variationDto = new VariationDto();

        variationDto.setDescription( variation.getDescription() );
        if ( variation.getId() != null ) {
            variationDto.setId( String.valueOf( variation.getId() ) );
        }
        if ( variation.getJobId() != null ) {
            variationDto.setJobId( String.valueOf( variation.getJobId() ) );
        }
        variationDto.setMedias( variationMediaMappingSetToMediaDtoList( variation.getMedias() ) );
        variationDto.setName( variation.getName() );
        variationDto.setType( variation.getType() );
        variationDto.setVariationNumber( variation.getVariationNumber() );

        return variationDto;
    }

    protected List<VariationDto> variationListToVariationDtoList(List<Variation> list) {
        if ( list == null ) {
            return null;
        }

        List<VariationDto> list1 = new ArrayList<VariationDto>( list.size() );
        for ( Variation variation : list ) {
            list1.add( variationToVariationDto( variation ) );
        }

        return list1;
    }
}
