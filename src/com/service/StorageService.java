package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.StorageDao;
import com.entity.Storage;

public class StorageService {
	//����dao��Ķ���
	private StorageDao dao = new StorageDao();
	//��ѯ������Ʒ��Ϣ
	public ArrayList<Storage> allStorage() throws ClassNotFoundException, SQLException{
		return dao.allStorage();
	}
	

}
