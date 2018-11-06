# spring-data-rest-bug

Sample application to reproduce spring-data-rest bug https://github.com/spring-projects/spring-boot/issues/15109

The app consists out of 3 services

- service registry
- gateway
- person-service

The link element in the REST response contains the host name instead of the gateway base path

```
curl "http://localhost:8080/person"
```

```
    {
  "_links" : {
    "persons" : {
      "href" : "http://10.242.135.37:8081/persons{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://10.242.135.37:8081/profile"
    }
  }
}
```
