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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AreasResourceTest {

	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Autowired
	private RestService restService;
	private Areas areas;
	
	@Before
    public void before() {
        areas = new Areas();
        //this.areas.setId(3);
        this.areas.setDomain("aaa");
        this.areas.setLine("aaa");
    }

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
                        .path(AreasResource.AREAS).path(AreasResource.ID).expand(1).get().build();
        System.out.println(json);
	}
	
	
	/*@Test
	public void getAreasByLinea() {
		
		String json = 
				restService.restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(AreasResource.AREAS).path(AreasResource.LINEA).expand("ejemplo").get().build();
        System.out.println(json);
	}*/
	
	 @Test
	    public void deleteAreas() {
	        String json = restService
	                .restBuilder(new RestBuilder<String>().clazz(String.class))
	                .path(AreasResource.AREAS).path(AreasResource.ID).expand(2).delete().build();
	        System.out.println(json);
	    }
	 
	 @Test
	    public void createAreas() {
	        String json = restService
	                .restBuilder(new RestBuilder<String>().clazz(String.class))
	                .path(AreasResource.AREAS).body(this.areas).post().build();
	        System.out.println(json);

	    }
	
	  
}
