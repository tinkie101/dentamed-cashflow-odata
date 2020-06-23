package online.tinkie101.dentamedcashflow.utils;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

import javax.persistence.EntityManagerFactory;

public class JPAServiceFactory extends ODataJPAServiceFactory {

	public static final String DEFAULT_ENTITY_UNIT_NAME = "Model";
	public static final String ENTITY_MANAGER_FACTORY_ID = "entityManagerFactory";

	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException {
		ODataJPAContext oDataJPAContext = getODataJPAContext();

		EntityManagerFactory factory = (EntityManagerFactory) SpringContextsUtil.getBean(ENTITY_MANAGER_FACTORY_ID);

		oDataJPAContext.setEntityManagerFactory(factory);
		oDataJPAContext.setPersistenceUnitName(DEFAULT_ENTITY_UNIT_NAME);
		oDataJPAContext.setJPAEdmExtension(new JPAEdmExtension());
		ODataContextUtil.setODataContext(oDataJPAContext.getODataContext());
		
		return oDataJPAContext;
	}
}
