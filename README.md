# Easy-Shop API
An e-commerce application or online store for a company called EasyShop.

# Web Application Features:

* List of items for sale
* Filter options(Category, Price, Color)
* Ability to add items to cart
* Able to delete items from cart
* Header Options(Home,Profile,View Cart, Login/Logout)

To run application, the front end component (EasyShopFrontEnd) is required to format the website and the information sent by the backend portion.

# Built with

* Java (JDK 17), SQL, Spring (Backend)
* HTML, CSS, JavaScript (Frontend)

# To run this program
If you want to run this program on your machine.
1. Clone the repository
2. Open the project in any IDE of your choice
3. Set up a MySQL server and run the SQL script in the project directory.
4. Run the EasyshopApplication file.
5. Start up the frontend application with the index.html file and you are good to go!
6. Testing - Would be with Postman for the endpoints of the API.

# Phase 1 - CategoriesController

Phase 1 required implementing the methods inside the CategoriesController and MySqlCategoryDao class while assigning the proper annotations to the controller. Some methods are restricted for admin only.

![image_2024-01-05_001646010](https://github.com/AlexisS05/easy-shop/assets/57822868/26a9b733-77ad-440e-b5f9-c0cf7809747f)

# Phase 2 - Fix bugs
For bug 1, the product search functionality is returning incorrect results in the . What was required to fix this bug was to add a maximum price line in the sql statement. 

![image_2024-01-05_002421467](https://github.com/AlexisS05/easy-shop/assets/57822868/f88acf52-f89b-4e49-ac3e-b6974fb9dc99)

For bug 2, products would be duplicated because instead of updating the product, a new product would be added to the database. To fix this all that was required was to change create to update in below method.

![Capture](https://github.com/AlexisS05/easy-shop/assets/57822868/9d00f43b-4eb5-4f99-8450-4344bf3e1211)

# Phase 3 - ShoppingCart
Added the functionality where users logged in can add items to cart and clear them. It comes from the database.
Part of the requirements were to do these requests: 
* GET: Returns the shopping cart for the current user.
* POST: Adds a new product to the shopping cart.
* DELETE: Clears the shopping cart.
* PUT: Updates the quantity of a product in the cart.
  
Here is an example below of a user's shopping cart: 

![image_2024-01-05_003205222](https://github.com/AlexisS05/easy-shop/assets/57822868/3318ca26-c869-4cb9-b18e-5c72934c54bc)

# Postman Easy-Shop Collection Test
Here is the collection test. I added some more tests to adjust the duplicated Laptop and ensure it is updated with tests.

![image_2024-01-05_004256564](https://github.com/AlexisS05/easy-shop/assets/57822868/48858318-7aa6-4b78-9d51-c4a72646fec7)





