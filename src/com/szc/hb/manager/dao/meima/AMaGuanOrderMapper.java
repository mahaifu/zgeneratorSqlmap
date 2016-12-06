package com.szc.hb.manager.dao.meima;

import com.ameima.model.shipin.AMaGuanOrder;
import com.ameima.model.shipin.AMaGuanOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AMaGuanOrderMapper {
    int countByExample(AMaGuanOrderExample example);

    int deleteByExample(AMaGuanOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(AMaGuanOrder record);

    int insertSelective(AMaGuanOrder record);

    List<AMaGuanOrder> selectByExample(AMaGuanOrderExample example);

    AMaGuanOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AMaGuanOrder record, @Param("example") AMaGuanOrderExample example);

    int updateByExample(@Param("record") AMaGuanOrder record, @Param("example") AMaGuanOrderExample example);

    int updateByPrimaryKeySelective(AMaGuanOrder record);

    int updateByPrimaryKey(AMaGuanOrder record);
}