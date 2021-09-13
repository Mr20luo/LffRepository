package dao;

import model.Stuinfo;
import utils.MysqHelper;

import java.util.List;
import java.util.Map;

public class StuinfoDao {

        /**
         * 引入工具类
         * */
        public  List<Map<String, Object>> getQueryAll(){
            String sql="select * from stuinfo";
            List<Map<String, Object>> list = MysqHelper.executeQuery(sql);
            return list;
        }
}
