import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Pay;
import utils.MybatisUtils;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<Pay> userList = userDao.getUserList();
            for(Pay pay : userList){
                System.out.println(pay);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
