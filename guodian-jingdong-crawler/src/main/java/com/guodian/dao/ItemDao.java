package com.guodian.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guodian.entity.Item;

public interface ItemDao extends JpaRepository<Item,Long> {
}

