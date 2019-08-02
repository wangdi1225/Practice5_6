package com.wd.service;

import java.util.List;

import com.wd.bean.Clothes;

public interface ClothesService{
	
	List<Clothes> getAllList();
	Clothes selectById(String id);
	int update(Clothes c);
	int deleteById(String id);
	int add(Clothes c);
}