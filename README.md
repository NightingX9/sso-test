Sso-Test

JAVA JDK Version 17

Database properties (PostgreSQL) version 15
Hostname : localhost
Port : 5432
Database : ssotest 
Table : sso_user_test  
Username : ssodev  
Password : sso2022ok 

ขั้นตอนที่ 1 clone github code 

ขั้นตอนที่ 2 create database ใน PostgreSQL โดยดูตามตัวอย่างที่ให้ไปในข้างต้น

ขั้นตอนที่ 3 กดรันโค้ดและเข้า http://localhost:8080/swagger-ui/index.html#/ เพื่อทดสอบ Api โดยใช้ request ดังนี้
{
  "ssoType": "SSOData",
  "systemId": "VATDEDEV",
  "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
  "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
  "systemPrivileges": "0|0|0|0",
  "systemUserGroup": "GRP-010,GRP-020,GRP-040",
  "systemLocationGroup": "CliC001",
  "userId": "WS233999",
  "userFullName": "ประสาท จันทร์อังคาร ",
  "userRdOfficeCode": "01000999",
  "userOfficeCode": "01001139",
  "clientLocation": "01001139",
  "locationMachineNumber": "CLI00000718-9999",
  "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
}
