# Bajaj Trading SDK

## Overview
This project is a simplified **Trading API SDK** simulating core trading workflows like viewing instruments, placing orders, checking trades, and fetching portfolio holdings.  
It is built using **Java Spring Boot** with in-memory storage, intended as a demonstration of backend design and REST API development.

---

## Features
- View available financial instruments
- Place BUY/SELL orders (MARKET/LIMIT)
- Check order status
- View executed trades
- Fetch portfolio holdings
- Proper error handling for invalid requests

---

## API Endpoints

### 1. Instruments
**GET** `/api/v1/instruments`  
Fetch the list of tradable instruments.

**Sample Response:**
  {
    "symbol": "TCS",
    "exchange": "NSE",
    "instrumentType": "EQUITY",
    "lastTradedPrice": 3800.0
  },
  {
    "symbol": "INFY",
    "exchange": "NSE",
    "instrumentType": "EQUITY",
    "lastTradedPrice": 1500.0
  }

2. Place Order

POST /api/v1/orders
Place a new order (BUY or SELL).

Request Body Example:
{
  "symbol": "TCS",
  "side": "BUY",
  "orderType": "MARKET",
  "quantity": 5,
  "price": 3800
}
3. Order Status

GET /api/v1/orders/{orderId}
Fetch the status of a specific order.

Sample Response:

{
  "orderId": "9362c7e5-c622-4243-af28-0a1d924e7512",
  "symbol": "TCS",
  "side": "BUY",
  "orderType": "MARKET",
  "quantity": 5,
  "price": 3800.0,
  "status": "EXECUTED"
}

4. Trades

GET /api/v1/trades
Fetch all executed trades.

Sample Response:

[
  {
    "tradeId": "9362c7e5-c622-4243-af28-0a1d924e7512",
    "orderId": "9362c7e5-c622-4243-af28-0a1d924e7512",
    "symbol": "TCS",
    "quantity": 5,
    "price": 3800.0
  }
]

5. Portfolio

GET /api/v1/portfolio
Fetch current portfolio holdings with average price and current value.

Sample Response:

[
  {
    "symbol": "TCS",
    "quantity": 20,
    "averagePrice": 3800.0,
    "currentValue": 76000.0
  }
]


Note: currentValue = quantity × lastTradedPrice

Setup Instructions

Clone the repository:

git clone git@github.com:Kanisha18/trading_sdk.git


Navigate to the project folder:

cd trading_sdk


Run the application using Maven:

mvn spring-boot:run


The server will start on http://localhost:8080

Demo / Testing

You can use curl or Postman to interact with the APIs.

Examples with curl:

List instruments:

curl http://localhost:8080/api/v1/instruments


Place an order:

curl -X POST http://localhost:8080/api/v1/orders \
-H "Content-Type: application/json" \
-d '{"symbol":"TCS","side":"BUY","orderType":"MARKET","quantity":5,"price":3800}'


Get order status:

curl http://localhost:8080/api/v1/orders/9362c7e5-c622-4243-af28-0a1d924e7512


List executed trades:

curl http://localhost:8080/api/v1/trades


Fetch portfolio:

curl http://localhost:8080/api/v1/portfolio

Assumptions

Only a single hardcoded user is supported.

Market orders are executed immediately.

Portfolio calculations are simplified.

Authentication is mocked.

Author

Kanisha Bansal
B.Tech Computer Science – Manipal University Jaipur
GitHub: https://github.com/Kanisha18
