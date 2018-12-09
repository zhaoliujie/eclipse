package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentDao extends BaseDao {
	//dao对象都是频繁使用的，为了提高效率，使用静态，单例模式
	private static StudentDao instances=new StudentDao();
	public static StudentDao getInstances() {//只读设定
		return instances;
	}
	//常用的对象
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	//增
	public int add(Student s){
		String sql="insert into Student(name,age,address) values(?,?,?)";
		String[] params={
			s.getName(),
			String.valueOf(s.getAge()),
			s.getAddress()
		};
		return this.exeUpd(sql, params);
	}
	//删
	public int del(int id){
		String sql="delete from Student where id=?";
		String[] params={
			String.valueOf(id)
		};
		return this.exeUpd(sql, params);
	}
	//改
	public int upd(Student s){
		String sql="update Student set name=?,age=?,address=? where id=?";
		String[] params={
			s.getName(),
			String.valueOf(s.getAge()),
			s.getAddress(),
			String.valueOf(s.getId())
		};
		return this.exeUpd(sql, params);
	}
	//查多个
	public List findAll(){
		List list=new ArrayList();
		try {
			conn=this.getConn();
			ps=conn.prepareStatement("select * from Student");
			rs=ps.executeQuery();
			//遍历结果集，封装成对象
			while(rs.next()){
				Student s=new Student();//每一行都是一个新的Student对象
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setAddress(rs.getString("address"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(rs, ps, conn);
		}
		return list;
	}
	//查一个
	public Student findOne(int id){
		Student s=null;
		try {
			conn=this.getConn();
			ps=conn.prepareStatement("select * from Student where id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			//遍历结果集，封装成对象
			while(rs.next()){
				s=new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setAddress(rs.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(rs, ps, conn);
		}
		return s;
	}
	//按姓名模糊查询
	public List findAll(String byName){
		List list=new ArrayList();
		try {
			conn=this.getConn();
			ps=conn.prepareStatement("select * from Student where name like ?");
			ps.setString(1, "%"+byName+"%");
			rs=ps.executeQuery();
			//遍历结果集，封装成对象
			while(rs.next()){
				Student s=new Student();//每一行都是一个新的Student对象
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setAddress(rs.getString("address"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(rs, ps, conn);
		}
		return list;
	}

	}
