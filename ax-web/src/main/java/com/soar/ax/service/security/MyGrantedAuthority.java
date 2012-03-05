/**
 * 
 */
package com.soar.ax.service.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author liuhb7
 *
 */
public class MyGrantedAuthority implements GrantedAuthority {

	/* (non-Javadoc)
	 * @see org.springframework.security.core.GrantedAuthority#getAuthority()
	 */
	@Override
	public String getAuthority() {
		
		return "AU_WORK";
	}

}
