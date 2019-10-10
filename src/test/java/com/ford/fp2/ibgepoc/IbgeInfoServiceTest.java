package com.ford.fp2.ibgepoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ford.fp2.ibgepoc.dto.IbgeInfo;
import com.ford.fp2.ibgepoc.repository.IbgeInfoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IbgeInfoServiceTest {
	
	@Autowired
	private IbgeInfoRepository repository;
	
	@Test
	public void testCepMin() {
		
		//IbgeCode: 1200401L
		IbgeInfo ibgeInfo = repository.getByCep("69900001");
		assertEquals(1200401L, ibgeInfo.getIbgeCode().longValue());
	}
	
	@Test
	public void testCepMax() {
		
		//IbgeCode: 1200401L
		IbgeInfo ibgeInfo = repository.getByCep("69924999");
		assertEquals(1200401L, ibgeInfo.getIbgeCode().longValue());
	}
	
	@Test
	public void testCepEntreMinEMax() {
		
		//IbgeCode: 1200401L
		IbgeInfo ibgeInfo = repository.getByCep("69923000");
		assertEquals(1200401L, ibgeInfo.getIbgeCode().longValue());
	}
	
	@Test
	public void testCepNaoPertenceAoRange() {
		
		//IbgeCode: 1200401L
		IbgeInfo ibgeInfo = repository.getByCep("69925000");
		assertNotEquals(1200401L, ibgeInfo.getIbgeCode().longValue());
	}

}
