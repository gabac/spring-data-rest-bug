# spring-data-rest-bug

Sample application to reproduce spring-data-rest bug https://github.com/spring-projects/spring-boot/issues/15109

The app consists out of 3 services

- service registry
- gateway
- person-service

The link element in the REST response contains the correct host name of the gateway

```
curl "http://localhost:8080/person"
```

```
 {
  "_links" : {
    "persons" : {
      "href" : "http://localhost:8080/person/persons{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/person/profile"
    }
  }
}
```
