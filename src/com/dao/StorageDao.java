package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Storage;

public class StorageDao {
	private Connection conn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	//查询全部
	public ArrayList<Storage> allStorage() throws ClassNotFoundException, SQLException{ 
		conn = JdbcUtil.getConnection();
		String sql = "select * from storage";
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		ArrayList<Storage> storageList = new ArrayList<Storage>();
		while(rs.next()){
			Storage storage = new Storage();
			storage.setId(rs.getInt("id"));
			storage.setName(rs.getString("name"));
			storage.setNumber(rs.getInt("number"));
			storage.setPrice(rs.getFloat("price"));
			storage.setType(rs.getString("type"));
			storageList.add(storage);
		}
		//关闭数据库连接，释放资源
		JdbcUtil.release(rs, pstm, conn);
		//返回查询到的所有产品
		return storageList;
	}
	
}
