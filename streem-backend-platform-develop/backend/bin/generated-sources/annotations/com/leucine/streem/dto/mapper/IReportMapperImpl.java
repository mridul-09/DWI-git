package com.leucine.streem.dto.mapper;

import com.leucine.streem.collections.Report;
import com.leucine.streem.collections.Report.ReportBuilder;
import com.leucine.streem.constant.CollectionMisc.ReportType;
import com.leucine.streem.dto.ReportDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IReportMapperImpl implements IReportMapper {

    @Override
    public ReportDto toDto(Report e) {
        if ( e == null ) {
            return null;
        }

        ObjectId id = null;
        String name = null;
        ReportType type = null;

        id = e.getId();
        name = e.getName();
        type = e.getType();

        ReportDto reportDto = new ReportDto( id, name, type );

        return reportDto;
    }

    @Override
    public Report toEntity(ReportDto d) {
        if ( d == null ) {
            return null;
        }

        ReportBuilder report = Report.builder();

        report.id( d.id() );
        report.name( d.name() );
        report.type( d.type() );

        return report.build();
    }

    @Override
    public List<ReportDto> toDto(List<Report> list) {
        if ( list == null ) {
            return null;
        }

        List<ReportDto> list1 = new ArrayList<ReportDto>( list.size() );
        for ( Report report : list ) {
            list1.add( toDto( report ) );
        }

        return list1;
    }

    @Override
    public List<Report> toEntity(List<ReportDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Report> list1 = new ArrayList<Report>( list.size() );
        for ( ReportDto reportDto : list ) {
            list1.add( toEntity( reportDto ) );
        }

        return list1;
    }

    @Override
    public List<ReportDto> toDto(Set<Report> set) {
        if ( set == null ) {
            return null;
        }

        List<ReportDto> list = new ArrayList<ReportDto>( set.size() );
        for ( Report report : set ) {
            list.add( toDto( report ) );
        }

        return list;
    }

    @Override
    public List<Report> toEntity(Set<ReportDto> set) {
        if ( set == null ) {
            return null;
        }

        List<Report> list = new ArrayList<Report>( set.size() );
        for ( ReportDto reportDto : set ) {
            list.add( toEntity( reportDto ) );
        }

        return list;
    }
}
