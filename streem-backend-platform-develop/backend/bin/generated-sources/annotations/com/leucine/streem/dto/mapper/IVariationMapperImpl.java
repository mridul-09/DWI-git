package com.leucine.streem.dto.mapper;

import com.leucine.streem.constant.Action.Variation;
import com.leucine.streem.dto.VariationDto;
import com.leucine.streem.dto.projection.VariationView;
import com.leucine.streem.model.VariationMediaMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class IVariationMapperImpl extends IVariationMapper {

    @Override
    VariationDto toDto(VariationView variationView, Map<Long, List<VariationMediaMapping>> variationIdMediaMap) {
        if ( variationView == null ) {
            return null;
        }

        VariationDto variationDto = new VariationDto();

        variationDto.setDescription( variationView.getDescription() );
        variationDto.setId( variationView.getId() );
        variationDto.setJobId( variationView.getJobId() );
        variationDto.setName( variationView.getName() );
        variationDto.setParameterId( variationView.getParameterId() );
        variationDto.setParameterName( variationView.getParameterName() );
        variationDto.setParameterType( variationView.getParameterType() );
        variationDto.setStageOrderTree( variationView.getStageOrderTree() );
        if ( variationView.getTaskExecutionOrderTree() != null ) {
            variationDto.setTaskExecutionOrderTree( Integer.parseInt( variationView.getTaskExecutionOrderTree() ) );
        }
        variationDto.setTaskOrderTree( variationView.getTaskOrderTree() );
        if ( variationView.getType() != null ) {
            variationDto.setType( Enum.valueOf( Variation.class, variationView.getType() ) );
        }
        variationDto.setVariationNumber( variationView.getVariationNumber() );

        setVariation( variationView, variationDto, variationIdMediaMap );

        return variationDto;
    }

    @Override
    public List<VariationDto> toDtoList(List<VariationView> variationView, Map<Long, List<VariationMediaMapping>> variationIdMediaMap) {
        if ( variationView == null ) {
            return null;
        }

        List<VariationDto> list = new ArrayList<VariationDto>( variationView.size() );
        for ( VariationView variationView1 : variationView ) {
            list.add( toDto( variationView1, variationIdMediaMap ) );
        }

        return list;
    }
}
