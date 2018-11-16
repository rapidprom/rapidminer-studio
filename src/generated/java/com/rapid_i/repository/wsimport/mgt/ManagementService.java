/**
 * Copyright (C) 2001-2018 by RapidMiner and the contributors
 * 
 * Complete list of developers available at our web site:
 * 
 * http://rapidminer.com
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Affero General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see http://www.gnu.org/licenses/.
*/
package com.rapid_i.repository.wsimport.mgt;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ManagementService", targetNamespace = "http://service.web.rapidanalytics.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ManagementService {


    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkSetup", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.CheckSetup")
    @ResponseWrapper(localName = "checkSetupResponse", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.CheckSetupResponse")
    public boolean checkSetup();

    /**
     * 
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGlobalProperty", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.GetGlobalProperty")
    @ResponseWrapper(localName = "getGlobalPropertyResponse", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.GetGlobalPropertyResponse")
    public String getGlobalProperty(
        @WebParam(name = "key", targetNamespace = "")
        String key);

    /**
     * 
     * @param value
     * @param key
     */
    @WebMethod
    @RequestWrapper(localName = "setGlobalProperty", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.SetGlobalProperty")
    @ResponseWrapper(localName = "setGlobalPropertyResponse", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.SetGlobalPropertyResponse")
    public void setGlobalProperty(
        @WebParam(name = "key", targetNamespace = "")
        String key,
        @WebParam(name = "value", targetNamespace = "")
        String value);

    /**
     * 
     * @param schema
     * @param port
     * @param system
     * @param pwd
     * @param host
     * @param permittedGroups
     * @param name
     * @param user
     * @return
     *     returns com.rapid_i.repository.wsimport.mgt.Response
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createDBConnection", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.CreateDBConnection")
    @ResponseWrapper(localName = "createDBConnectionResponse", targetNamespace = "http://service.web.rapidanalytics.de/", className = "com.rapid_i.repository.wsimport.mgt.CreateDBConnectionResponse")
    public Response createDBConnection(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "host", targetNamespace = "")
        String host,
        @WebParam(name = "port", targetNamespace = "")
        String port,
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd,
        @WebParam(name = "schema", targetNamespace = "")
        String schema,
        @WebParam(name = "system", targetNamespace = "")
        String system,
        @WebParam(name = "permittedGroups", targetNamespace = "")
        List<String> permittedGroups);

}
