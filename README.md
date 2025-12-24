# servlet_basic
Basic Servlet set up on machine and execute

## For used JSPServlet you've to follow some steps
<ol>
    <li>download apache tomcat on your local machine
    <a href="https://apache.root.lu/tomcat/tomcat-9/v9.0.80/bin/">click_to_download</a> tomcat-v9.0.80 
</li>
    <li>extract all from downloaded zip file</li>
<li>Open Intellij editor
    <br>
    <h5>Setup-1</h5>
        <ul>
            <li>Click on setting.</li>
            <li>Click Plugins</li>
            <li>Search tomcat in search bar of this window</li>
            <li>Select smartTomcat</li>
            <li>Click for install</li>
            <li>add the path inside location</li>
            <li>click on apply</li>
        </ul>
        <h5>Setup-2</h5>
    <ul>
        <li>Click new to create a new project</li>
        <li>Select for project</li>
        <li>Give name and location  of the project</li>
        <li>In left side you will see generator option select "Maven Archetype"</li>
        <li>Then select archtype drop-down select "webapp"</li>
        <li>Then click on create option</li>
        <li>You wil see a message like "--BUILD SUCCESS--" in your consoles </li><p>you successfully setup your server.... :)</p>
        <li></li>
    </ul>

    . Now open  index.jsp and run it (select setClasspathmodule as your projectname)
Then you see the link , that tell's your server is successfully running on port number  8080
http://localhost:8080/servlet1
</li>

<li>create a new directory named as java inside main directory</li>
<p>All java program will be writing here</p>
<li>add dependency inside pom.xml file</li>

<dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
    </dependency>

</ol>


