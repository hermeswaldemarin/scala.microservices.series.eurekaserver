package eurekaserver

import org.springframework.boot.{ApplicationRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.context.annotation.{Bean, ComponentScan}
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@ComponentScan(basePackages = Array("configserver"))
@EnableEurekaServer
class Application{

  @Bean
  def init(): ApplicationRunner = _ => {

  }

  @Bean
  def restTemplate() : RestTemplate = new RestTemplate()
}


object Application extends App {
  SpringApplication.run(classOf[Application], args: _*)
}
