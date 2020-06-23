package online.tinkie101.dentamedcashflow.utils;

import org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CxfServletRegister {
	
	@Bean
	public ServletRegistrationBean<CXFNonSpringJaxrsServlet> getODataServletRegistrationBean() {
		ServletRegistrationBean<CXFNonSpringJaxrsServlet> odataServletRegistrationBean = new ServletRegistrationBean<>(new CXFNonSpringJaxrsServlet(), "/odata.svc/*");
		Map<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("javax.ws.rs.Application", "org.apache.olingo.odata2.core.rest.app.ODataApplication");
		initParameters.put("org.apache.olingo.odata2.service.factory", "online.tinkie101.dentamedcashflow.utils.JPAServiceFactory");
		odataServletRegistrationBean.setInitParameters(initParameters);
		return odataServletRegistrationBean;
	}
}
