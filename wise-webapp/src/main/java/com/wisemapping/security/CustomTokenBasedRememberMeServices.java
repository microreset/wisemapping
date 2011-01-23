/*
*    Copyright [2011] [wisemapping]
*
*   Licensed under the Apache License, Version 2.0 (the "License") plus the
*   "powered by wisemapping" text requirement on every single page;
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the license at
*
*       http://www.wisemapping.org/license
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.wisemapping.security;

import org.acegisecurity.ui.rememberme.TokenBasedRememberMeServices;
import org.acegisecurity.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomTokenBasedRememberMeServices extends
        TokenBasedRememberMeServices {
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
    {
     if(authentication!=null)
         super.logout(request, response, authentication);
     else
     {
         logger.debug("Session Already Expired. Authentication is null");
         response.addCookie(makeCancelCookie(request));
     }
    }

}