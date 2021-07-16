package com.rafael.falconi.Api.resources;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rafael.falconi.Api.entities.*;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class EventsResourcesTest {


    @Autowired
    private RestService restService;
    private Events event;
    @Before
    public void before() {
        event = new Events();
        this.event.setDescription("F");
        this.event.setImagen("http");
        this.event.setName("Hola");
    }


    @Test
    public void getAllEvents() {
        String json=
                restService.restBuilder(new RestBuilder<String>().clazz(String.class))
                        .path(EventsResources.EVENTS).get().build();
        System.out.println(json);
    }
    @Test
    public void getById() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(EventsResources.EVENTS).path(EventsResources.ID).expand("001").get().build();
        System.out.println(json);
    }
    @Test
    public void createEvent() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(EventsResources.EVENTS).body(this.event).post().build();
        System.out.println(json);

    }

    @Test
    public void editProduct() {
    	this.event.setName("Hola");
    	this.event.setDescription("Ejemplo");
    	this.event.setImagen("Ejemploss");
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(EventsResources.EVENTS).path(EventsResources.ID)
                .expand("002").body(event).put().build();
        System.out.println(json);
    }

    @Test
    public void deleteProduct() {
        String json = restService
                .restBuilder(new RestBuilder<String>().clazz(String.class))
                .path(EventsResources.EVENTS).path(EventsResources.ID).expand("003").delete().build();
        System.out.println(json);
    }
}