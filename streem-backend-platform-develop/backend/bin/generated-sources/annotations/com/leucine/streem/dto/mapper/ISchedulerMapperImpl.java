package com.leucine.streem.dto.mapper;

import com.leucine.streem.dto.AuditDto;
import com.leucine.streem.dto.CalendarEventDto;
import com.leucine.streem.dto.SchedulerDto;
import com.leucine.streem.dto.SchedulerInfoDto;
import com.leucine.streem.dto.SchedulerPartialDto;
import com.leucine.streem.dto.UserAuditDto;
import com.leucine.streem.dto.UserAuditDto.UserAuditDtoBuilder;
import com.leucine.streem.dto.request.CreateProcessSchedulerRequest;
import com.leucine.streem.dto.request.UpdateSchedulerRequest;
import com.leucine.streem.model.Scheduler;
import com.leucine.streem.model.User;
import com.leucine.streem.model.Version;
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
public class ISchedulerMapperImpl implements ISchedulerMapper {

    @Override
    public Scheduler toEntity(SchedulerDto d) {
        if ( d == null ) {
            return null;
        }

        Scheduler scheduler = new Scheduler();

        if ( d.getId() != null ) {
            scheduler.setId( Long.parseLong( d.getId() ) );
        }
        scheduler.setChecklistId( d.getChecklistId() );
        scheduler.setChecklistName( d.getChecklistName() );
        scheduler.setCode( d.getCode() );
        scheduler.setCustomRecurrence( d.isCustomRecurrence() );
        scheduler.setData( d.getData() );
        scheduler.setDeprecatedAt( d.getDeprecatedAt() );
        scheduler.setDescription( d.getDescription() );
        scheduler.setDueDateDuration( d.getDueDateDuration() );
        scheduler.setDueDateInterval( d.getDueDateInterval() );
        scheduler.setEnabled( d.isEnabled() );
        scheduler.setExpectedStartDate( d.getExpectedStartDate() );
        scheduler.setName( d.getName() );
        scheduler.setRecurrenceRule( d.getRecurrenceRule() );
        scheduler.setRepeated( d.isRepeated() );

        return scheduler;
    }

    @Override
    public List<SchedulerDto> toDto(List<Scheduler> list) {
        if ( list == null ) {
            return null;
        }

        List<SchedulerDto> list1 = new ArrayList<SchedulerDto>( list.size() );
        for ( Scheduler scheduler : list ) {
            list1.add( toDto( scheduler ) );
        }

        return list1;
    }

    @Override
    public List<Scheduler> toEntity(List<SchedulerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Scheduler> list1 = new ArrayList<Scheduler>( list.size() );
        for ( SchedulerDto schedulerDto : list ) {
            list1.add( toEntity( schedulerDto ) );
        }

        return list1;
    }

    @Override
    public List<SchedulerDto> toDto(Set<Scheduler> set) {
        if ( set == null ) {
            return null;
        }

        List<SchedulerDto> list = new ArrayList<SchedulerDto>( set.size() );
        for ( Scheduler scheduler : set ) {
            list.add( toDto( scheduler ) );
        }

        return list;
    }

    @Override
    public List<Scheduler> toEntity(Set<SchedulerDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Scheduler> list = new ArrayList<Scheduler>( set.size() );
        for ( SchedulerDto schedulerDto : set ) {
            list.add( toEntity( schedulerDto ) );
        }

        return list;
    }

    @Override
    public SchedulerDto toDto(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        SchedulerDto schedulerDto = new SchedulerDto();

        schedulerDto.setAudit( schedulerToAuditDto( scheduler ) );
        schedulerDto.setVersionNumber( schedulerVersionVersion( scheduler ) );
        schedulerDto.setChecklistId( scheduler.getChecklistId() );
        schedulerDto.setChecklistName( scheduler.getChecklistName() );
        schedulerDto.setCode( scheduler.getCode() );
        schedulerDto.setCustomRecurrence( scheduler.isCustomRecurrence() );
        schedulerDto.setData( scheduler.getData() );
        schedulerDto.setDeprecatedAt( scheduler.getDeprecatedAt() );
        schedulerDto.setDescription( scheduler.getDescription() );
        schedulerDto.setDueDateDuration( scheduler.getDueDateDuration() );
        schedulerDto.setDueDateInterval( scheduler.getDueDateInterval() );
        schedulerDto.setEnabled( scheduler.isEnabled() );
        schedulerDto.setExpectedStartDate( scheduler.getExpectedStartDate() );
        if ( scheduler.getId() != null ) {
            schedulerDto.setId( String.valueOf( scheduler.getId() ) );
        }
        schedulerDto.setName( scheduler.getName() );
        schedulerDto.setRecurrenceRule( scheduler.getRecurrenceRule() );
        schedulerDto.setRepeated( scheduler.isRepeated() );

        return schedulerDto;
    }

    @Override
    public SchedulerPartialDto toPartialDto(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        SchedulerPartialDto schedulerPartialDto = new SchedulerPartialDto();

        schedulerPartialDto.setAudit( schedulerToAuditDto1( scheduler ) );
        schedulerPartialDto.setArchived( scheduler.isArchived() );
        if ( scheduler.getChecklistId() != null ) {
            schedulerPartialDto.setChecklistId( String.valueOf( scheduler.getChecklistId() ) );
        }
        schedulerPartialDto.setChecklistName( scheduler.getChecklistName() );
        schedulerPartialDto.setCode( scheduler.getCode() );
        schedulerPartialDto.setCustomRecurrence( scheduler.isCustomRecurrence() );
        schedulerPartialDto.setDeprecatedAt( scheduler.getDeprecatedAt() );
        if ( scheduler.getId() != null ) {
            schedulerPartialDto.setId( String.valueOf( scheduler.getId() ) );
        }
        schedulerPartialDto.setName( scheduler.getName() );
        schedulerPartialDto.setRecurrenceRule( scheduler.getRecurrenceRule() );

        return schedulerPartialDto;
    }

    @Override
    public List<SchedulerPartialDto> toPartialDto(List<Scheduler> schedulers) {
        if ( schedulers == null ) {
            return null;
        }

        List<SchedulerPartialDto> list = new ArrayList<SchedulerPartialDto>( schedulers.size() );
        for ( Scheduler scheduler : schedulers ) {
            list.add( toPartialDto( scheduler ) );
        }

        return list;
    }

    @Override
    public SchedulerInfoDto toInfoDto(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        SchedulerInfoDto schedulerInfoDto = new SchedulerInfoDto();

        schedulerInfoDto.setAudit( schedulerToAuditDto2( scheduler ) );
        schedulerInfoDto.setChecklistId( scheduler.getChecklistId() );
        schedulerInfoDto.setChecklistName( scheduler.getChecklistName() );

        return schedulerInfoDto;
    }

    @Override
    public CreateProcessSchedulerRequest toCreateRequest(UpdateSchedulerRequest updateSchedulerRequest) {
        if ( updateSchedulerRequest == null ) {
            return null;
        }

        CreateProcessSchedulerRequest createProcessSchedulerRequest = new CreateProcessSchedulerRequest();

        createProcessSchedulerRequest.setCustomRecurrence( updateSchedulerRequest.isCustomRecurrence() );
        createProcessSchedulerRequest.setDescription( updateSchedulerRequest.getDescription() );
        createProcessSchedulerRequest.setDueDateDuration( updateSchedulerRequest.getDueDateDuration() );
        createProcessSchedulerRequest.setDueDateInterval( updateSchedulerRequest.getDueDateInterval() );
        createProcessSchedulerRequest.setExpectedStartDate( updateSchedulerRequest.getExpectedStartDate() );
        createProcessSchedulerRequest.setName( updateSchedulerRequest.getName() );
        createProcessSchedulerRequest.setRecurrence( updateSchedulerRequest.getRecurrence() );
        createProcessSchedulerRequest.setRepeated( updateSchedulerRequest.isRepeated() );

        return createProcessSchedulerRequest;
    }

    @Override
    public CalendarEventDto toEventsDto(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        CalendarEventDto calendarEventDto = new CalendarEventDto();

        calendarEventDto.setTitle( scheduler.getName() );
        calendarEventDto.setChecklistName( scheduler.getChecklistName() );

        return calendarEventDto;
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

    protected AuditDto schedulerToAuditDto(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        AuditDto auditDto = new AuditDto();

        auditDto.setModifiedAt( scheduler.getModifiedAt() );
        auditDto.setModifiedBy( userToUserAuditDto( scheduler.getModifiedBy() ) );
        auditDto.setCreatedAt( scheduler.getCreatedAt() );
        auditDto.setCreatedBy( userToUserAuditDto( scheduler.getCreatedBy() ) );

        return auditDto;
    }

    private Integer schedulerVersionVersion(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }
        Version version = scheduler.getVersion();
        if ( version == null ) {
            return null;
        }
        Integer version1 = version.getVersion();
        if ( version1 == null ) {
            return null;
        }
        return version1;
    }

    protected AuditDto schedulerToAuditDto1(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        AuditDto auditDto = new AuditDto();

        auditDto.setModifiedAt( scheduler.getModifiedAt() );
        auditDto.setModifiedBy( userToUserAuditDto( scheduler.getModifiedBy() ) );
        auditDto.setCreatedAt( scheduler.getCreatedAt() );
        auditDto.setCreatedBy( userToUserAuditDto( scheduler.getCreatedBy() ) );

        return auditDto;
    }

    protected AuditDto schedulerToAuditDto2(Scheduler scheduler) {
        if ( scheduler == null ) {
            return null;
        }

        AuditDto auditDto = new AuditDto();

        auditDto.setModifiedAt( scheduler.getModifiedAt() );
        auditDto.setModifiedBy( userToUserAuditDto( scheduler.getModifiedBy() ) );
        auditDto.setCreatedAt( scheduler.getCreatedAt() );
        auditDto.setCreatedBy( userToUserAuditDto( scheduler.getCreatedBy() ) );

        return auditDto;
    }
}
