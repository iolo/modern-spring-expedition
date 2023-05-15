plugins {
	java
	id("org.springframework.boot") version "3.0.6"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

ext["jakarta-servlet.version"] = "5.0.0"

configurations {
  all {
	  exclude(group="org.springframework.boot", module="spring-boot-starter-tomcat")
  }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jetty")
  implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
