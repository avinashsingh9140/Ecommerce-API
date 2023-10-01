
# ***E-commerce API***

- The aim of the project is to perform the basic CRUD operations with some validations and mappings.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

![image](https://user-images.githubusercontent.com/112794922/236682074-06f11b43-ec23-4dab-a131-d9549c689233.png)


## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations
- MySQL Driver

![image](https://user-images.githubusercontent.com/112794922/236682082-0de342d6-2920-4c78-994a-8dd009b7bd3a.png)


## **Data Flow :**

## **Model :** 

- It consists of a  ___Userclass___ , ___OrdersClass___  , ___AddressClass___ and ___ProductClass___ which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.

![image](https://user-images.githubusercontent.com/112794922/236682095-fb2536b8-e4bd-481d-ae7a-3c34b42d2191.png)
![image](https://user-images.githubusercontent.com/112794922/236682098-f8985738-ba95-46ae-9477-6da1984764a7.png)


## **Controller :**

- It consists of ___UserController___ , ___OrderController___, ___ProductController___ and ___AddressController___ class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.

![image](https://user-images.githubusercontent.com/112794922/236682110-33129410-dda8-444a-9b09-88fef43b3831.png)
![image](https://user-images.githubusercontent.com/112794922/236682117-eb5bd274-8cb3-46b1-a2cd-209991d73a6e.png)





- ### **API Reference :**

### **User Controller :**

#### ***Get User By Id***

```http
  http://localhost:8080/getUserById/{userId}
```

#### ***Add Users***

```http
  http://localhost:8080/createUsers
```

### **Address Controller :**

#### ***Add Address***

```http
  http://localhost:8080/createAddress
```

### **Order Controller :**

#### ***Add Orders***

```http
  http://localhost:8080/createOrders
```

#### ***Get Order By Id***

```http
  http://localhost:8080/getOrderById/{orderId}
```

### **Product Controller :**

#### ***Add Product***

```http
  http://localhost:8080/createProducts
```

#### ***Get All products***

```http
  http://localhost:8080/getAllProducts
```

#### ***Get product by category***

```http
  http://localhost:8080/getProductByCategory?category={category}
```

#### ***Delete Product By Id***

```http
  http://localhost:8080/deleteById/{productId}
```

## **Service :** 

- It consists of ___UserService___ , ___OrderService___ ,  ___ProductService___ and ___AddressService___ class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

![image](https://user-images.githubusercontent.com/112794922/236682126-2f4c3028-55d1-4bb6-977a-788c5a7dec50.png)
![image](https://user-images.githubusercontent.com/112794922/236682142-fcd742cf-786c-4d0c-9a45-dea7ea8a8a2b.png)


## **Repository :**
- It consists of ___IProductDao___ , ___IUserDao___ , ___IOrderDao___ and ___IAddressDao___ which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.

![image](https://user-images.githubusercontent.com/112794922/236682151-04ff892b-c8d5-4bf0-a459-c9c7ff6aaea3.png)
![image](https://user-images.githubusercontent.com/112794922/236682154-1bf0edd7-bfbf-47bf-bf5e-5bca17b5ade3.png)




## **Documentation :**

***[SWAGGER](http://localhost:8080/swagger-ui/index.html#/)***


## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.
- The data's were stored in the ___MySQL database___ which is ___persistent database___.

![image](https://user-images.githubusercontent.com/112794922/236682330-724d5844-9426-4a23-bf5d-b95cc82b4105.png)
![image](https://user-images.githubusercontent.com/112794922/236682334-82d774ac-e715-4952-8f5c-248f0793bf23.png)