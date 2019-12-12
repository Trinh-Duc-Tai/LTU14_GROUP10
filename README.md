# project-IT4883
de tich hop code

tren server goi new App(String s)  

tren client goi Rmiserver

cong rmi : 8888

cong socket ket noi man hinh : 6677 
link docker https://hub.docker.com/r/amneiht/11_rmi
dockef file
FROM java  
#lay image java
COPY rmi.jar /home
# copy file rmi.jar vao docker
RUN chmod +x /home/rmi.jar
# cap quyen thuc thi 
CMD ["java","-jar","/home/rmi.jar"]
# chay cau lenh khi run docker


