# ElasticSearch_GeoLocation_2
Example Spring boot 1.3.0 + ElaticSearch + Geolocation (string geo-points are "latitude,longitude") on nested document

In this example use the same entity class from ElasticSearch document and H2 table.

```java
@Entity
@Document(indexName = "trip")
@Table(name = "trip")
public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	@Field(type=FieldType.String)
	private String name;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id")
	@Field(type=FieldType.Nested)
	private Car car;
	
	...
}
```

Create a JpaRepository and ElasticsearchRepository to access data.

```java

```

This example run "ApplicationRunner" to load an read data.

```java
@Component
public class App implements ApplicationRunner {

	private final Logger log = LoggerFactory.getLogger(ApplicationRunner.class);
	
	@Inject
	private TripService tripService; 
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("Create Trips:");
		...
		
	}
}
```
