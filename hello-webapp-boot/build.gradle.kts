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

configurations {
  all {
    exclude(group="com.fasterxml.jackson.core", module="jackson-databind") // ObjectMapper 클래스가 있는 의존성 제외
  }
}

dependencies {
  implementation("com.google.code.gson:gson") // Gson 클래스가 있는 의존성 추가(버전은 지정할 필요없음)
  implementation("org.springframework.boot:spring-boot-starter-json");
  implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
