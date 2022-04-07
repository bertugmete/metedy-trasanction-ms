# Transaction MS

## Endpoints

### Save Transaction

``` 
POST /transactions HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVVzZXJuYW1lIQ==
Content-Type: application/json
Cookie: JSESSIONID=69893818B353A266C90C1941C9078E4A
Content-Length: 39

{
    "userId": 1,
    "productId": 1
}
```

### Get All Transactions

```
GET /transactions/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVVzZXJuYW1lIQ==
Content-Type: application/json
Cookie: JSESSIONID=C67FDFEFCDBB3998C1A4F268720D2ACA
Content-Length: 49

{
    "id": 1,
    "userId": 1,
    "productId": 1,
    "transactionTime": "2022-04-07T22:38:06.872636"
}
```

### Delete Transaction

```
DELETE /transactions/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVVzZXJuYW1lIQ==
Content-Type: application/json
Cookie: JSESSIONID=C67FDFEFCDBB3998C1A4F268720D2ACA
```