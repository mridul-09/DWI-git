package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.ParameterValueApprovalDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.model.ParameterValueApproval;
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
public class IParameterApprovalMapperImpl implements IParameterApprovalMapper {

    @Override
    public ParameterValueApproval toEntity(ParameterValueApprovalDto d) {
        if ( d == null ) {
            return null;
        }

        ParameterValueApproval parameterValueApproval = new ParameterValueApproval();

        if ( d.getId() != null ) {
            parameterValueApproval.setId( Long.parseLong( d.getId() ) );
        }
        parameterValueApproval.setCreatedAt( d.getCreatedAt() );
        parameterValueApproval.setState( d.getState() );

        return parameterValueApproval;
    }

    @Override
    public List<ParameterValueApprovalDto> toDto(List<ParameterValueApproval> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterValueApprovalDto> list1 = new ArrayList<ParameterValueApprovalDto>( list.size() );
        for ( ParameterValueApproval parameterValueApproval : list ) {
            list1.add( toDto( parameterValueApproval ) );
        }

        return list1;
    }

    @Override
    public List<ParameterValueApproval> toEntity(List<ParameterValueApprovalDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ParameterValueApproval> list1 = new ArrayList<ParameterValueApproval>( list.size() );
        for ( ParameterValueApprovalDto parameterValueApprovalDto : list ) {
            list1.add( toEntity( parameterValueApprovalDto ) );
        }

        return list1;
    }

    @Override
    public List<ParameterValueApprovalDto> toDto(Set<ParameterValueApproval> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterValueApprovalDto> list = new ArrayList<ParameterValueApprovalDto>( set.size() );
        for ( ParameterValueApproval parameterValueApproval : set ) {
            list.add( toDto( parameterValueApproval ) );
        }

        return list;
    }

    @Override
    public List<ParameterValueApproval> toEntity(Set<ParameterValueApprovalDto> set) {
        if ( set == null ) {
            return null;
        }

        List<ParameterValueApproval> list = new ArrayList<ParameterValueApproval>( set.size() );
        for ( ParameterValueApprovalDto parameterValueApprovalDto : set ) {
            list.add( toEntity( parameterValueApprovalDto ) );
        }

        return list;
    }

    @Override
    public ParameterValueApprovalDto toDto(ParameterValueApproval parameterValueApproval) {
        if ( parameterValueApproval == null ) {
            return null;
        }

        ParameterValueApprovalDto parameterValueApprovalDto = new ParameterValueApprovalDto();

        parameterValueApprovalDto.setApprover( userToUserAuditDto( parameterValueApproval.getUser() ) );
        parameterValueApprovalDto.setCreatedAt( parameterValueApproval.getCreatedAt() );
        if ( parameterValueApproval.getId() != null ) {
            parameterValueApprovalDto.setId( String.valueOf( parameterValueApproval.getId() ) );
        }
        parameterValueApprovalDto.setState( parameterValueApproval.getState() );

        return parameterValueApprovalDto;
    }

    protected UserAuditDto userToUserAuditDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserAuditDtoBuilder userAuditDto = UserAuditDto.builder();

        if ( user.getId() != null ) {
            userAuditDto.id( String.valueOf( user.getId() ) );
        }
        userAuditDto.employeeId( user.getEmployeeId() );
        userAuditDto.firstName( user.getFirstName() );
        userAuditDto.lastName( user.getLastName() );

        return userAuditDto.build();
    }
}
