package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.StorageDao;
import com.entity.Storage;

public class StorageService {
	//创建dao层的对象
	private StorageDao dao = new StorageDao();
	//查询所有商品信息
	public ArrayList<Storage> allStorage() throws ClassNotFoundException, SQLException{
		return dao.allStorage();
	}
	

}
