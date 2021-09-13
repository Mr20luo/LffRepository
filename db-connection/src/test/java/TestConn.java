import dao.StuinfoDao;
import model.Stuinfo;
import org.junit.Test;
import utils.MysqHelper;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestConn {


    /**
     * 测试连接
     * */
    @Test
    public void TestConn() {
        Connection connection = MysqHelper.getConnection();
        System.out.println(connection);
    }

    /**
     * 查询数据
     * */
    @Test
    public void TestQueryAll() {
        StuinfoDao stuinfoDao = new StuinfoDao();
        List<Map<String, Object>> queryAll =
                stuinfoDao.getQueryAll();
        System.out.println(queryAll);


    }

    /**
     * insert  注意使用转义符号
     * */
    @Test
    public void TestInsert() {
        StuinfoDao stuinfoDao = new StuinfoDao();

        String sql="insert into stuinfo values(444,"+"\"武松\","+"\'男\'"+")";
        boolean b = MysqHelper.executeUpdate(sql);
        System.out.println(b);

        String a="\"\"";
        String c="\'\'";
        System.out.println(a+c);



    }


    /**
     * 类型转换的问题    list类型能否转换成Stuinfo类型（实体类）
     *
     * 对此,我们只需使用map的key即可
     * */
    @Test
    public void Convert01() {
        List<Map<String,Object>> list=new ArrayList();
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",23);
        map.put("name","listti1");
        map.put("sex",'男');
        list.add(map);
        map.put("id",23);
        map.put("name","listti2");
        map.put("sex",'男');
        list.add(map);

        System.out.println(list);
        System.out.println(list.get(1).get("name"));


    }
}
