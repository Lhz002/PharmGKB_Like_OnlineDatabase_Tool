# PharmGKB_Like_OnlineDatabase_Tool
基于PharmGKB数据库进行的基因诊断药物平台Gene diagnostic drug platform based on PharmGKB database

**Introduction**
We have developed a web application project called Precision Medicine Matching System with the aim of providing the healthcare industry with an intelligent system that can recommend personalized treatment plans based on individual genetic information. The system supports user registration and login, uploading of personal genetic data files for analysis, and generates matching results along with personalized recommendations and guidance.


The project uses Java as its backend language and employs a three-tier architecture as its coding framework. We utilized IntelliJ IDEA's Maven for the project's structure, making it easier to maintain and expand. For the front-end, the project utilizes JSP and Apache's MyBatis library, which provides a responsive layout and interactive effects.

The project contains multiple pages, including register.jsp for user registration, login.jsp for user login, dashboard.jsp for the main user interface after login, and upload .jsp for uploading personal genetic data files. Additionally, the project includes several Java classes, such as LoginServlet, RegisterServlet, and UploadServlet, primarily used for handling system logic and business processes.
After uploading the genetic data VCF file, the system parses and analyzes the data and matches the suitable personalized treatment plan based on the user's genetic information and medical history. The system also provides data visualization functionality, which presents the matching results in chart form.

As a member responsible for software development, my main responsibilities include selecting and implementing a program framework based on the design proposals provided by my colleagues in the requirements and design team. At the business layer, I utilized servlet programming to fulfill the functional requirements proposed by the design team, such as user registration, user login, gene data file upload, and gene data comparison. In terms of visual presentation, I designed JSP files to provide a user interface for web page navigation, user log in and registration, logged-in user interface, and gene data upload interface, and integrated front-end and back-end by configuring JSP and servlet files.

**Project Function**
When users utilize our system, they will be directed to the system's homepage (Figure 1A). By clicking on the registration button, users can transition to the registration page (Figure 1B) in order to register a new username and password. Once registration is complete, users will be redirected back to the login page (Figure 1C). After entering their newly registered username and password, users may log in to the system's interface (Figure 1D). Within the interface, users have the capability to upload genetic data files (Figure 1E). Upon clicking the upload button, the system will automatically begin matching and subsequently return the matched results to the interface (Figure 2A).
<img width="894" alt="image" src="https://github.com/Lhz002/PharmGKB_Like_OnlineDatabase_Tool/assets/139037029/4f1e603a-83cd-4a44-96ed-84453a8eb9e6">

Figure1 A: System homepage  B: Registration page C: Login page D: User interface E: File upload interface
<img width="916" alt="image" src="https://github.com/Lhz002/PharmGKB_Like_OnlineDatabase_Tool/assets/139037029/31f73c24-521c-4041-abb3-68a3b0932b3f">

Figure2 A: Comparison results B: System framework design
