# telemedicine_back

## Project Preview

The name of the project is  Telemedicine, which is a web application developed by  Vue  and  Spring Boot  framework.

This project provides a good consultation platform for doctors and patients,  through which patients can easily find the right doctor for consultation, and doctors can give diagnostic advice and prescribe the corresponding medicine for the    patient's illness. In addition, there is a robust forum for patients to discuss their conditions and for doctors to answer questions and post medical knowledge in a unified manner.

## System Functionalities

- Login Service

  Login & Logout(With sa-token)
  Register
  Verify Code
  SMS message code

- Personal Information Service

  View and modify user Information
  View user’s diagnosis record and medicine list
  Medical Qualification Certification

- Inquiry Service

  View all doctors in specific department
  Search for one doctor
  View one doctor’s information and his reviews from patients

- Consult a doctor

  Input your problem
  Send text message
  Send picture message
  Send audio message
  See medicine list given by doctor
  Give this doctor a review

- Reply to patient

  Send text message
  Send picture message
  Send audio message
  Choose medicine for a patient
  Search for medicine from the list with the first words of each character   Send medicine list
  Forum Service

  View recommended questions and answers
  View recommended articles
  Ask questions
  Give answers
  Publish articles
  Post comments
  Give likes and dislikes
  
## Features

To complete our project, we have integrated many external interfaces to achieve specific functions in our project, the following shows the main three :

1. Object Storage Service. We upload images and audio to the backend when calling the AliCloud object storage service interface to upload to the cloud, relational databases only store links.When displaying, the front end receives the link and sends the requests to cloud to speed up the query
2.  Short Message Service.  In the register service we used the webchinese SMS service interface, the system will temporarily store the cell phone number and verification code in redis, and set to expire after five minutes
3.  Websocket. Websockets are integrated in both the front-end and back-end for real-time message reception during patient consultation and real-time query of the doctor's current availability
