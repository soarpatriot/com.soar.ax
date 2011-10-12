/**
 * 
 */
package com.soar.ax.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author liuhb7
 *
 */
public class LogAspect {
	
	
	public void before(JoinPoint call){   
        String className=call.getTarget().getClass().getName();   
	    String methodName=call.getSignature().getName(); 
	    for(int i=0;i<20;i++){
		    System.out.println("前置通知 before advice "+ className+ " 类的"+ methodName+" 方法开始了！");   

	    }
	}   
	
	public void afterReturn(){   
		 System.out.println("后置通知 afterReturn advice ：方法正常结束了! ");   
	}   

	public void after()   
    {   
        System.out.println("最终通知 after advice ：不管方法正常执行与否，一定会执行!");   
    }
	public Object doAround(ProceedingJoinPoint jp) throws Throwable{   
	       System.out.println(jp.getTarget().getClass().getName());   
		       System.out.println(jp.getSignature().getName());   
	        System.out.println("周围通知执行！");   
		        return jp.proceed();   
   }   

	public void logException(){
		System.out.println("exception occures!!");
	}
}
