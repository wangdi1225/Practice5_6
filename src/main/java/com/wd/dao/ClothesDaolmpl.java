package com.wd.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.wd.bean.Clothes;

public class ClothesDaolmpl extends JdbcDaoSupport implements ClothesDao {

	
	@Override	
		public List<Clothes> getAllList() {
			String sql = "select * from table1";
			List<Clothes> list = getJdbcTemplate().query(sql, new RowMapper<Clothes>() {
				@Override
				public Clothes mapRow(ResultSet rs, int index) throws SQLException {
					Clothes c = new Clothes();
					c.setId(rs.getString("id"));
					c.setParam_name(rs.getString("param_name"));
					c.setParam_value(rs.getString("param_value"));
					c.setRemark(rs.getString("remark"));
					return c;
				}
			});
			return list;
		}
	public Clothes selectById(String id){
		String sql = "select * from table1 where id = ?";
		Clothes c = getJdbcTemplate().queryForObject(sql, new RowMapper<Clothes>() {

			@Override
			public Clothes mapRow(ResultSet rs, int index) throws SQLException {
				Clothes c = new Clothes();
				c.setId(rs.getString("id"));
				c.setParam_name(rs.getString("param_name"));
				c.setParam_value(rs.getString("param_value"));
				c.setRemark(rs.getString("remark"));
				return c;
			}
			
		}, id);
		
		return c;
	}
	public int update(Clothes c) {
		String sql = "update table1 set param_name = ? , param_value = ?, remark = ? where id = ?";
		int i=getJdbcTemplate().update(sql,c.getParam_name(), c.getParam_value(),c.getRemark(),c.getId());
		return i;
	}
	public int deleteById(String id) {
		String sql = "delete from table1 where id = ?";
		int i=getJdbcTemplate().update(sql, id);
		return i;
	}
	public int add(Clothes c){
		try{
		String sql = "insert into table1 values(?,?,?,?)";
		int i=getJdbcTemplate().update(sql,c.getId(),c.getParam_name(), c.getParam_value(),c.getRemark());
		return i;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
		
}
