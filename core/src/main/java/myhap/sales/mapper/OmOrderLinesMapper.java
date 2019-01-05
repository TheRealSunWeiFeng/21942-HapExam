package myhap.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import myhap.sales.dto.OmOrderLines;

import java.util.List;

public interface OmOrderLinesMapper extends Mapper<OmOrderLines>{

    List<OmOrderLines> selectWithForgeinKey(OmOrderLines condition);
}