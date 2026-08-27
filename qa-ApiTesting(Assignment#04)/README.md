# API Testing – JSONPlaceholder

## Project Overview

This project performs functional API testing using Postman and basic performance testing using Apache JMeter.

The API tested is JSONPlaceholder, a free REST API used for testing and learning.

## Tools Used

- Postman
- Apache JMeter
- JSONPlaceholder REST API

## API Endpoints Tested

| Method | Endpoint | Purpose |
|--------|----------|---------|
| GET | `/posts` | Retrieve all posts |
| GET | `/posts/1` | Retrieve a single post |
| POST | `/posts` | Create a new post |
| PUT | `/posts/1` | Update an existing post |
| DELETE | `/posts/1` | Delete a post |

## Postman Testing

Automated Postman tests were created to validate:

- HTTP status codes
- Response time
- Response structure
- Required response fields
- Response field values

The Postman collection contains tests for GET, POST, PUT, and DELETE requests.

## JMeter Performance Testing

The following configuration was used:

- **Threads/Users:** 10
- **Ramp-Up Period:** 5 seconds
- **Loop Count:** 5
- **Total Requests:** Approximately 50

The following metrics were analyzed:

- Average response time
- Minimum response time
- Maximum response time
- Throughput
- Error rate

## How to Run Postman Tests

1. Open Postman.
2. Import the collection from the `Postman` directory.
3. Open the **JSONPlaceholder API Testing** collection.
4. Run the collection using **Collection Runner**.
5. Review the test results.

## How to Run JMeter Tests

1. Open Apache JMeter.
2. Open `JSONPlaceholder_Load_Test.jmx`.
3. Select the **Thread Group**.
4. Verify the thread configuration.
5. Start the test.
6. Review the **Summary Report**.

> **Note:** Java is required to run Apache JMeter.

## Project Structure

```text
API-Testing-Assignment/
│
├── Postman/
│   └── JSONPlaceholder_API_Tests.json
│
├── JMeter/
│   └── JSONPlaceholder_Load_Test.jmx
│
├── Screenshots/
│   ├── GET_All_Posts.png
│   ├── GET_Single_Post.png
│   ├── POST_Post.png
│   ├── PUT_Post.png
│   ├── DELETE_Post.png
│   ├── Postman_Test_Results.png
│   └── JMeter_Summary_Report.png
│
└── README.md
