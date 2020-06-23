package online.tinkie101.dentamedcashflow.utils;

import org.apache.olingo.odata2.api.processor.ODataContext;

public class ODataContextUtil {

	private static ThreadLocal<ODataContext> oDataContext = new ThreadLocal<ODataContext>(); 
	
	public static void setODataContext(ODataContext c) {
		oDataContext.set(c);
	}
	
	public static ODataContext getODataContext() {
		return oDataContext.get();
	}
}
