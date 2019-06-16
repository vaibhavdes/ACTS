1. Download Jenkins 'war' file from Jenkins.io
2. Navigate to Directory where 'war' file is present
3. Open CMD 
          java -jar jenkins.war

4. Launch in Browser
          localhost:8080
5 Manage Jenkins
                   Change localhost to IP


-----------------------------

Installing on Ubuntu

cd /tmp && wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -

echo 'deb https://pkg.jenkins.io/debian-stable binary/' | sudo tee -a /etc/apt/sources.list.d/jenkins.list

sudo apt update
sudo apt install jenkins
sudo systemctl start jenkins.service
service jenkins status


Visit localhost:8080

cat /var/lib/jenkins/secrets/initialAdminPassword

Copy Paste the code
