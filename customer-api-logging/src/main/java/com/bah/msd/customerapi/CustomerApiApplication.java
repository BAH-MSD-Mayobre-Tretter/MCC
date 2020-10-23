package com.bah.msd.customerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApplication.class, args);
	}
	
//	@Bean
//    public static JaegerTracer getTracer() {
//	Configuration.SamplerConfiguration samplerConfig =
//	Configuration.SamplerConfiguration.fromEnv().withType("const").withParam(1);
//
//	Configuration.ReporterConfiguration reporterConfig = 
//	Configuration.ReporterConfiguration.fromEnv().withLogSpans(true);
//	
//	Configuration config = new Configuration("customer-api").withSampler(samplerConfig).withReporter(reporterConfig);
//	return config.getTracer();
//    }

}
