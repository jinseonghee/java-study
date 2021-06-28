package ch13.web.userinfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./Chapter3/db.properties"); // file인 db.properties를 읽어들이라는 의미

        Properties prop = new Properties(); //key,value의 쌍으로 읽어들일수 있는 기능이 있는 객체
        prop.load(fis); //FileInputStream에서 부터 파일을 읽어들일수 있다. 또 key, value 값의 쌍을 따로 들고 있어서, key에 해당되는 value 값을 리턴시킨다.

        String dbType = prop.getProperty("DBTYPE"); //db.properties의 key값을 읽어옴

        UserInfo userInfo = new UserInfo(); //new UserInfo("1", "password", "jin");
        userInfo.setUserId("3");

        UserInfoDao userInfoDao = null; //oracle을 쓸 지 mysql을 쓸 지 아직 정하지 않았기 때문에 null

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else {
            System.out.println("db error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        System.out.println();
        userInfoDao.updateUserInfo(userInfo);
        System.out.println();
        userInfoDao.deleteUserInfo(userInfo);
    }
}

