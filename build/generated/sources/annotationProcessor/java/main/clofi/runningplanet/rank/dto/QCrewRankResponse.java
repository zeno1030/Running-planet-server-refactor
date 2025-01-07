package clofi.runningplanet.rank.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * clofi.runningplanet.rank.dto.QCrewRankResponse is a Querydsl Projection type for CrewRankResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCrewRankResponse extends ConstructorExpression<CrewRankResponse> {

    private static final long serialVersionUID = -815746621L;

    public QCrewRankResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> crewName, com.querydsl.core.types.Expression<Integer> level, com.querydsl.core.types.Expression<Integer> distance) {
        super(CrewRankResponse.class, new Class<?>[]{long.class, String.class, int.class, int.class}, id, crewName, level, distance);
    }

}

