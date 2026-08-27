API Testing – JSONPlaceholder
📌 Project Overview

This project is based on testing the JSONPlaceholder REST API using Postman and Apache JMeter.

I used Postman for functional API testing and JMeter for basic performance/load testing. The main goal was to test different API requests, verify the responses, and check how the API performs when multiple requests are sent.

JSONPlaceholder is a free fake REST API that is commonly used for testing and learning purposes.

🛠️ Tools Used
Postman – Functional API testing
Apache JMeter – Performance and load testing
JSONPlaceholder – REST API used for testing
🔗 API Endpoints Tested
Method	Endpoint	Description
GET	/posts	Retrieve all posts
GET	/posts/1	Retrieve a single post
POST	/posts	Create a new post
PUT	/posts/1	Update an existing post
DELETE	/posts/1	Delete a post
🧪 Postman Testing

I created a Postman collection to test the different API endpoints.

The following things were checked during testing:

HTTP status codes
Response time
Response structure
Required response fields
Expected response values

The Postman collection contains tests for GET, POST, PUT, and DELETE requests.

Postman Test Results

After running the collection, the test results were reviewed in Postman to make sure the API responses matched the expected results.

⚡ JMeter Performance Testing

Apache JMeter was used to perform a basic load test on the API.

Test Configuration
Setting	Value
Number of Users	10
Ramp-Up Period	5 seconds
Loop Count	5
Total Requests	Approximately 50
Metrics Checked

The following performance metrics were reviewed:

Average response time
Minimum response time
Maximum response time
Throughput
Error rate

The purpose of the JMeter test was to see how the API responds when multiple users send requests at the same time.

▶️ How to Run Postman Tests
Open Postman.
Import the collection from the Postman folder.
Open the JSONPlaceholder API Testing collection.
Open Collection Runner.
Select the collection.
Run the tests.
Review the test results.
▶️ How to Run JMeter Tests
Install and open Apache JMeter.
Open the JSONPlaceholder_Load_Test.jmx file from the JMeter folder.
Select the Thread Group.
Check the thread configuration.
Start the test.
Open the Summary Report to review the results.

Note: Java is required to run Apache JMeter.

📁 Project Structure
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

📸 Screenshots

Screenshots of the API tests and JMeter results are included in the Screenshots folder.

Postman Tests
GET All Posts
GET Single Post
POST Post
PUT Post
DELETE Post
Postman Test Results
JMeter Results
JMeter Summary Report
✅ Conclusion

This project helped me practice API testing using Postman and basic performance testing using Apache JMeter.

Through this project, I tested different HTTP methods, verified API responses, created automated Postman tests, and performed a simple load test using JMeter.
