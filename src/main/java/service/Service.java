package service;

import dao.Mapper;
import dao.Search;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by baeonejune on 15. 1. 5..
 */
public class Service {

    @Autowired
    private Mapper mapper;

    public List<Search> selectAllDatas() {
        return mapper.selectAllDatas();
    }

    public List<Search> selectAllDatas2() {
        return mapper.selectAllDatas2();
    }

    public Search selectDataOne(int id) {
        return mapper.selectData(id);
    }

    public int insertPerson(Search search){
        return mapper.insertData(search);
    }
}
