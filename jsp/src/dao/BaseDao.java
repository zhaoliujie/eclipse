package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	//连接信息
	public static final String DRIVER="com.mysql.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost/school";
	public static final String USERNAME="root";
	public static final String PASSWROD="root";
	//获得连接
	public Connection getConn(){
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USERNAME,PASSWROD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//释放资源
	public void closeAll(ResultSet rs,PreparedStatement ps,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 增删改的通用方法
	 * @param sql 带？号的SQL语句
	 * @param params 与？对应的参数数组
	 * @return
	 */
	public int exeUpd(String sql,String[] params){
		int flag=0;
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=this.getConn();
			ps=conn.prepareStatement(sql);
			//通过循环数组，一一替换问号
			for (int i = 0; i < params.length; i++) {
				ps.setString(i+1, params[i]);
			}
			flag=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(null, ps, conn);
		}
		return flag;
	}
}





