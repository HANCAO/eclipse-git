package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Employe;

import util.DBUtil;

public class EmployeeDAO {
	public List<Employe> list() throws Exception{
		List<Employe> employees=new ArrayList<Employe>();
		Connection conn=DBUtil.getConnection();
		Statement stat=conn.createStatement();
		ResultSet rst=stat.executeQuery("select * from t_emp2");
		while(rst.next()){
			Employe e=new Employe();
			e.setId(rst.getLong("id"));
			e.setName(rst.getString("name"));
			e.setSalary(rst.getDouble("salary"));
			e.setAge(rst.getInt("age"));
			employees.add(e);
		}
		DBUtil.close(conn);
		return employees;
	}
	
	public void del(long id) throws Exception{
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("delete from t_emp2 where id=?");
		prep.setLong(1, id);
		prep.executeUpdate();
		DBUtil.close(conn);
	}

	public void add(long id) throws Exception{
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("insert into t_emp2(name,salary,age) values(?,?,?)");
		prep.setLong(1, id);
		prep.executeUpdate();
		DBUtil.close(conn);
	}
	
	public void load(long id) throws Exception{
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("update t_emp2 set name=?,salary=?,age=? where id=?");
		prep.setLong(1, id);
		prep.executeUpdate();
		DBUtil.close(conn);
	}
	
}
