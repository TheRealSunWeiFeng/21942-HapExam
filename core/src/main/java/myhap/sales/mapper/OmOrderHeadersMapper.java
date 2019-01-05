package myhap.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import myhap.sales.dto.OmOrderHeaders;

import java.util.List;

public interface OmOrderHeadersMapper extends Mapper<OmOrderHeaders>{
    List<OmOrderHeaders> selectWithForgeinKey(OmOrderHeaders condition);
}