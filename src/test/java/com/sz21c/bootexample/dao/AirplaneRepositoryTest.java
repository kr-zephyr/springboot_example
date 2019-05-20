package com.sz21c.bootexample.dao;

import com.sz21c.bootexample.domain.AirplaneEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirplaneRepositoryTest {

	@Autowired
	AirplaneRepository airplaneRepository;

	@Test
	public void test_saveAndRead() {
		int preSize = airplaneRepository.findAll().size();

		airplaneRepository.save(new AirplaneEntity("B777", 2));
		airplaneRepository.save(new AirplaneEntity("B747", 4));

		List<AirplaneEntity> airplaneEntityList = airplaneRepository.findAll();

		Assert.assertEquals(airplaneEntityList.size(), 2 + preSize);
	}
}