package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.State.Correction;
import com.leucine.streem.dto.CorrectionDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
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
public class ICorrectionMapperImpl extends ICorrectionMapper {

    @Override
    public CorrectionDto toDto(com.leucine.streem.model.Correction e) {
        if ( e == null ) {
            return null;
        }

        CorrectionDto correctionDto = new CorrectionDto();

        correctionDto.setCode( e.getCode() );
        correctionDto.setCorrectorsReason( e.getCorrectorsReason() );
        correctionDto.setCreatedAt( e.getCreatedAt() );
        correctionDto.setCreatedBy( userToUserAuditDto( e.getCreatedBy() ) );
        if ( e.getId() != null ) {
            correctionDto.setId( String.valueOf( e.getId() ) );
        }
        correctionDto.setInitiatorsReason( e.getInitiatorsReason() );
        correctionDto.setNewChoices( e.getNewChoices() );
        correctionDto.setNewValue( e.getNewValue() );
        correctionDto.setOldChoices( e.getOldChoices() );
        correctionDto.setOldValue( e.getOldValue() );
        correctionDto.setReviewersReason( e.getReviewersReason() );
        if ( e.getStatus() != null ) {
            correctionDto.setStatus( e.getStatus().name() );
        }

        return correctionDto;
    }

    @Override
    public com.leucine.streem.model.Correction toEntity(CorrectionDto d) {
        if ( d == null ) {
            return null;
        }

        com.leucine.streem.model.Correction correction = new com.leucine.streem.model.Correction();

        if ( d.getId() != null ) {
            correction.setId( Long.parseLong( d.getId() ) );
        }
        correction.setCreatedAt( d.getCreatedAt() );
        correction.setCreatedBy( userAuditDtoToUser( d.getCreatedBy() ) );
        correction.setCode( d.getCode() );
        correction.setCorrectorsReason( d.getCorrectorsReason() );
        correction.setInitiatorsReason( d.getInitiatorsReason() );
        correction.setNewChoices( d.getNewChoices() );
        correction.setNewValue( d.getNewValue() );
        correction.setOldChoices( d.getOldChoices() );
        correction.setOldValue( d.getOldValue() );
        correction.setReviewersReason( d.getReviewersReason() );
        if ( d.getStatus() != null ) {
            correction.setStatus( Enum.valueOf( Correction.class, d.getStatus() ) );
        }

        return correction;
    }

    @Override
    public List<CorrectionDto> toDto(List<com.leucine.streem.model.Correction> list) {
        if ( list == null ) {
            return null;
        }

        List<CorrectionDto> list1 = new ArrayList<CorrectionDto>( list.size() );
        for ( com.leucine.streem.model.Correction correction : list ) {
            list1.add( toDto( correction ) );
        }

        return list1;
    }

    @Override
    public List<com.leucine.streem.model.Correction> toEntity(List<CorrectionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<com.leucine.streem.model.Correction> list1 = new ArrayList<com.leucine.streem.model.Correction>( list.size() );
        for ( CorrectionDto correctionDto : list ) {
            list1.add( toEntity( correctionDto ) );
        }

        return list1;
    }

    @Override
    public List<CorrectionDto> toDto(Set<com.leucine.streem.model.Correction> set) {
        if ( set == null ) {
            return null;
        }

        List<CorrectionDto> list = new ArrayList<CorrectionDto>( set.size() );
        for ( com.leucine.streem.model.Correction correction : set ) {
            list.add( toDto( correction ) );
        }

        return list;
    }

    @Override
    public List<com.leucine.streem.model.Correction> toEntity(Set<CorrectionDto> set) {
        if ( set == null ) {
            return null;
        }

        List<com.leucine.streem.model.Correction> list = new ArrayList<com.leucine.streem.model.Correction>( set.size() );
        for ( CorrectionDto correctionDto : set ) {
            list.add( toEntity( correctionDto ) );
        }

        return list;
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
}
