package com.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.StorageDao;
import com.entity.Storage;

public class AllTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StorageDao storagedao = new StorageDao();
		ArrayList<Storage> list = storagedao.allStorage();
		for(Storage alist : list){
			System.out.println(alist.getId()+"  "+alist.getName());
		}
	}

}
