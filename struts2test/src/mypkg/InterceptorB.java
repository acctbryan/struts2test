package mypkg;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorB extends BaseInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		String result = "";
		log.info(result);
		result = arg0.invoke();
		return result;
	}

}
