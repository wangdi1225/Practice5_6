package com.wd.service;

import java.util.List;

import com.wd.bean.Clothes;
import com.wd.dao.ClothesDao;


public class ClothesServicelmpl implements ClothesService{

	private ClothesDao clothesDao;
	public void setClothesDao(ClothesDao clothesDao) {
		this.clothesDao = clothesDao;
	}

	@Override
	public List<Clothes> getAllList() {
		
		return clothesDao.getAllList();
	}

	@Override
	public Clothes selectById(String id) {
		
		return clothesDao.selectById(id);
	}
	public int update(Clothes c){
		return clothesDao.update(c);
	}
	public int deleteById(String id){
		return clothesDao.deleteById(id);
	}
	public int add(Clothes c){
		return clothesDao.add(c);
	}
}
