package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by baeonejune on 15. 1. 5..
 */
public interface Mapper {
    // XML config
    public List<Search> selectAllDatas();

    @Select("SELECT id, product_name FROM search")
    public List<Search> selectAllDatas2();

    @Select("SELECT id, product_name FROM search WHERE id = #{id}")
    public Search selectData(@Param("id") int id);

    @Insert("INSERT INTO search (product_name) VALUES (#{prdname})")
    public int insertData(Search search);
}
