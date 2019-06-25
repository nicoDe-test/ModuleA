/*
 * Copyright (c) 2011 - 2019, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.modulea;


import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.moduleb.*;
/**
* Generated class for your E2A data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "ModuleA",
    hooksClassNameTransient = "com.apiomat.nativemodule.modulea.E2AHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.modulea.E2AHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class E2A extends com.apiomat.nativemodule.moduleb.E2B
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "ModuleA";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "E2A";

    /** class specific attributes */
    private Double aDoubleList = null;
    private com.apiomat.nativemodule.moduleb.E2B aParentAttribute = null;
    private String aString = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public E2A ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public Double getADoubleList()
    {
         return this.aDoubleList;
    }

    public void setADoubleList( Double arg )
    {
        this.aDoubleList = arg;
    }

    public com.apiomat.nativemodule.moduleb.E2B getAParentAttribute()
    { 
        if(this.aParentAttribute == null)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.aParentAttribute =  ( com.apiomat.nativemodule.moduleb.E2B ) m.invoke( this, "aParentAttribute", com.apiomat.nativemodule.moduleb.E2B.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.aParentAttribute;
    }

    public void postAParentAttribute( final com.apiomat.nativemodule.moduleb.E2B refData )
    {
        addReference( "aParentAttribute", refData );
        this.aParentAttribute = refData;
    }

    public void removeAParentAttribute( final com.apiomat.nativemodule.moduleb.E2B refData )
    {
        removeReference( "aParentAttribute", refData );
        this.aParentAttribute = null;
    }

    public String getAString()
    {
         return this.aString;
    }

    public void setAString( String arg )
    {
        this.aString = arg;
    }

}
