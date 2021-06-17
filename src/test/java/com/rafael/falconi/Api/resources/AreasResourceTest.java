package com.rafael.falconi.Api.resources;

import static org.junit.Assert.*;
import com.rafael.falconi.Api.entities.Areas;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AreasResourceTest {

	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Autowired
	private RestService restService;

	@Test
	public void getAllAreas() {
		
		String json=
                restService.restBuilder(new RestBuilder<String>().clazz(String.class))
                        .path(AreasResource.AREAS).get().build();
        System.out.println(json);
	}
	
	@Test
	public void getAreasById() {
		
		String json=
                restService.restBuilder(new RestBuilder<String>().clazz(String.class))
                        .path(AreasResource.AREAS).path(AreasResource.ID).expand(2).get().build();
        System.out.println(json);
	}

}
