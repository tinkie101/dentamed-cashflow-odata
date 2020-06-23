package online.tinkie101.dentamedcashflow.utils;

import org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmSchemaView;

import java.io.InputStream;

public class JPAEdmExtension implements org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmExtension {

	public static final String MAPPING_MODEL = "odata-mapping.xml";
	
	@Override
	public void extendWithOperation(JPAEdmSchemaView view) {
	}

	@Override
	public void extendJPAEdmSchema(JPAEdmSchemaView view) {
	}

	@Override
	public InputStream getJPAEdmMappingModelStream() {
		return JPAEdmExtension.class.getClassLoader().getResourceAsStream(MAPPING_MODEL);
	}

}
