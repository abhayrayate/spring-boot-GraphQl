# 🚀 Spring Boot GraphQL 
## 📖 Overview
This project demonstrates **GraphQL integration with Spring Boot 3**, **JPA**, and **MySQL** to manage user registration data.  
It provides APIs for fetching user details using **GraphQL queries** instead of traditional REST endpoints.

---

## ⚙️ Tech Stack
- **Spring Boot 3**
- **Spring Data JPA**
- **Spring GraphQL**
- **MySQL Database**
- **Lombok**
- **Maven Build Tool**

---

## 🧩 Key Features
- Integrated **GraphQL API** for flexible data querying
- **JPA** for ORM and seamless database interaction
- **MySQL** for persistent storage
- **Lombok** reduces boilerplate code
- **Live reload** with Spring Boot DevTools
- Clean layered architecture: Controller → Service → Repository → Entity

---

## 🧠 Important Annotations
| Layer | Annotation | Purpose |
|-------|------------|---------|
| GraphQL | `@QueryMapping` | Defines GraphQL query methods |
| Spring Boot | `@Controller`, `@Service`, `@Autowired` | Dependency injection & component mapping |
| JPA / Hibernate | `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`, `@CreationTimestamp`, `@UpdateTimestamp` | Database mapping |
| Lombok | `@Data`, `@AllArgsConstructor`, `@NoArgsConstructor` | Reduces boilerplate code |

---

## 🗃️ Database Table
**Table Name:** `users`

| Column | Type   | Description          |
|--------|--------|--------------------|
| id     | Long   | Primary key          |
| firstName | String | User’s first name |
| lastName  | String | User’s last name  |
| email     | String | User’s email      |
| password  | String | User’s password   |
| contactNo | Long   | User’s contact number |

---

## 🧾 GraphQL Schema (`schema.graphqls`)
```graphql
type UserRegister {
    id: ID!
    firstName: String
    lastName: String
    email: String
    password: String
    contactNo: String
}

type Query {
    getAllRegisterUserDetails: [UserRegister]
}
