package io.jsd.training.webapp.petclinic.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MonitorAspect {
	private Logger logger = LoggerFactory.getLogger(MonitorAspect.class);
	
	public void afterReturningServiceAnyMethod(StaticPart staticPart, Object result) {
		logger.debug("Objet retourné : " + result);
	}
	
	public void beforeServiceAnyMethod(JoinPoint joinPoint) {
		boolean notNull = joinPoint != null && joinPoint.getArgs() != null;
		
		joinPoint.getTarget();
		
		String param;
		if (notNull && joinPoint.getArgs().length > 1) {
			param = "Paramètres d'entrée de la méthode : ";
		} else {
			param = "Paramètre d'entrée de la méthode : ";
		}
		
		StringBuilder builder = new StringBuilder(param);
		
		if (notNull && joinPoint.getArgs().length > 0) {
			builder.append(joinPoint.getArgs()[0]);
			
			for (int k = 1; k < joinPoint.getArgs().length; k++) {
				builder.append(", " + joinPoint.getArgs()[k]);
			}
		} else {
			builder.append("aucun");
		}
		
		logger.debug(builder.toString());
	}
	
	public void onErrorServiceAnyMethod(JoinPoint joinPoint, Exception e) {
		logger.error("Exception de type : " + e.getLocalizedMessage() + ", sur la méthode : " + joinPoint.getSignature().getName());
	}
}
