// Simulating Spring Data JPA Quick Example
public class JpaExample {
    public static void main(String[] args) {
        System.out.println("Initializing Spring Data JPA...");
        System.out.println("Hibernate: create table country (id bigint not null, name varchar(255), primary key (id))");
        System.out.println("Hibernate: insert into country (name, id) values (?, ?)");
        System.out.println("Binding parameter [1] as [VARCHAR] - [India]");
        System.out.println("Binding parameter [2] as [BIGINT] - [1]");
        System.out.println("Country saved successfully to database!");
        
        System.out.println("Hibernate: select c1_0.id, c1_0.name from country c1_0 where c1_0.id=?");
        System.out.println("Retrieved Country: India");
    }
}
