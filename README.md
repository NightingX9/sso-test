เริ่มต้นด้วยการคลังโค้ด GitHub คุณสามารถทำการคัดลอกโค้ดจาก GitHub ได้โดยใช้คำสั่ง git clone:

bash
Copy code
git clone <repository_url>
เมื่อคุณคลังโค้ดลงมาแล้ว ต่อมาคุณต้องสร้างฐานข้อมูลใน PostgreSQL โดยใช้ข้อมูลที่คุณให้ไว้ดังนี้:

Hostname: localhost
Port: 5432
Database: ssotest
Table: sso_user_test
Username: ssodev
Password: sso2022ok
ใน PostgreSQL คุณสามารถสร้างฐานข้อมูลได้โดยใช้คำสั่ง SQL เช่น:

sql
Copy code
CREATE DATABASE ssotest;
เมื่อคุณสร้างฐานข้อมูลแล้ว ต้องการให้โค้ดของคุณเชื่อมต่อกับฐานข้อมูลที่ถูกสร้างใหม่ โดยคุณต้องแก้ไขไฟล์ application.properties หรือ application.yml ในโปรเจ็กต์ของคุณเพื่อกำหนดค่าการเชื่อมต่อฐานข้อมูล PostgreSQL ดังนี้:

properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/ssotest
spring.datasource.username=ssodev
spring.datasource.password=sso2022ok
หลังจากนั้นคุณสามารถรันโค้ดของคุณด้วยคำสั่ง mvn spring-boot:run และทดสอบ API ของคุณได้ที่ http://localhost:8080/swagger-ui/index.html#/

หากคุณต้องการจัดเรียงหรืออัปโหลดโค้ดใหม่ลงใน GitHub คุณสามารถทำได้โดยการเพิ่ม ลบ หรือแก้ไขไฟล์ในโค้ดของคุณ แล้วทำการ commit และ push โค้ดของคุณกลับไปยัง GitHub repository ที่คุณ clone มาได้เช่นกัน โดยใช้คำสั่ง:

bash
Copy code
git add .
git commit -m "เพิ่มหรือแก้ไขโค้ด"
git push origin master
อย่าลืมเปลี่ยน "เพิ่มหรือแก้ไขโค้ด" เป็นข้อความที่เกี่ยวข้องกับการเปลี่ยนแปลงที่คุณทำในโค้ดของคุณนะครับ!
