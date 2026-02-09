Modern RESTful API with Spring Boot 3.4, Java 21, and MySQL The system is built using a Layered Architecture to ensure clean separation of concerns and high testability. Authentication: Users register/login via /api/auth. Successful login returns a JWT Token.

Catalog Browsing: Public access to /api/products allows users to view items, filtered by category and price.

Cart Management: Authenticated users add items to their session-based or database-persisted cart.

Order Processing (Atomic): When a user checkouts, the OrderService starts a Database Transaction:

It validates stock levels for every item.

Decrements stock in the Product table.

Calculates the total price and generates a unique Order ID.

Success: The transaction is committed, and an order confirmation is returned to the user.


