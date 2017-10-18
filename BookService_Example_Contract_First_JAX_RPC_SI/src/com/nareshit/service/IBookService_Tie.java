// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nareshit.service;

import com.sun.xml.rpc.server.http.MessageContextProperties;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.soap.streaming.*;
import com.sun.xml.rpc.soap.message.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.soap.SOAPEncodingConstants;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.lang.reflect.*;
import java.lang.Class;
import com.sun.xml.rpc.server.*;
import javax.xml.rpc.handler.HandlerInfo;
import com.sun.xml.rpc.client.HandlerChainImpl;

public class IBookService_Tie
    extends com.sun.xml.rpc.server.TieBase implements SerializerConstants {
    
    
    
    public IBookService_Tie() throws Exception {
        super(new com.nareshit.service.BookService_SerializerRegistry().getRegistry());
        initialize(internalTypeMappingRegistry);
    }
    
    /*
     * This method does the actual method invocation for operation: updateBook
     */
    private void invoke_updateBook(StreamingHandlerState state) throws Exception {
        
        com.nareshit.service.Book myBook = null;
        Object myBookObj =
            state.getRequest().getBody().getValue();
        
        if (myBookObj instanceof SOAPDeserializationState) {
            myBook = (com.nareshit.service.Book)((SOAPDeserializationState)myBookObj).getInstance();
        } else {
            myBook = (com.nareshit.service.Book)myBookObj;
        }
        
        try {
            int parameters = ((com.nareshit.service.IBookService) getTarget()).updateBook(myBook.getIsbn(), myBook.getTitle(), myBook.getAuthor(), myBook.getPrice());
            
            SOAPHeaderBlockInfo headerInfo;
            
            
            int _response = parameters;
            SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_updateBook_updateBookReturn_QNAME);
            bodyBlock.setValue(new java.lang.Integer(_response));
            bodyBlock.setSerializer(ns2_myns2__int__int_Int_Serializer);
            state.getResponse().setBody(bodyBlock);
        } catch (javax.xml.rpc.soap.SOAPFaultException e) {
            SOAPFaultInfo fault = new SOAPFaultInfo(e.getFaultCode(),
                e.getFaultString(), e.getFaultActor(), e.getDetail());
            SOAPBlockInfo faultBlock = new SOAPBlockInfo(com.sun.xml.rpc.encoding.soap.SOAPConstants.QNAME_SOAP_FAULT);
            faultBlock.setValue(fault);
            faultBlock.setSerializer(new SOAPFaultInfoSerializer(false, e.getDetail()==null));
            state.getResponse().setBody(faultBlock);
            state.getResponse().setFailure(true);
        }
    }
    
    /*
     * This method does the actual method invocation for operation: searchBook
     */
    private void invoke_searchBook(StreamingHandlerState state) throws Exception {
        
        java.lang.String myString = null;
        Object myStringObj =
            state.getRequest().getBody().getValue();
        
        if (myStringObj instanceof SOAPDeserializationState) {
            myString = (java.lang.String)((SOAPDeserializationState)myStringObj).getInstance();
        } else {
            myString = (java.lang.String)myStringObj;
        }
        
        try {
            com.nareshit.service.Book parameters = ((com.nareshit.service.IBookService) getTarget()).searchBook(myString);
            
            SOAPHeaderBlockInfo headerInfo;
            
            
            com.nareshit.service.Book _response = parameters;
            SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_searchBook_searchBookReturn_QNAME);
            bodyBlock.setValue(_response);
            bodyBlock.setSerializer(ns3_myBook_LiteralSerializer);
            state.getResponse().setBody(bodyBlock);
        } catch (javax.xml.rpc.soap.SOAPFaultException e) {
            SOAPFaultInfo fault = new SOAPFaultInfo(e.getFaultCode(),
                e.getFaultString(), e.getFaultActor(), e.getDetail());
            SOAPBlockInfo faultBlock = new SOAPBlockInfo(com.sun.xml.rpc.encoding.soap.SOAPConstants.QNAME_SOAP_FAULT);
            faultBlock.setValue(fault);
            faultBlock.setSerializer(new SOAPFaultInfoSerializer(false, e.getDetail()==null));
            state.getResponse().setBody(faultBlock);
            state.getResponse().setFailure(true);
        }
    }
    
    /*
     * This method does the actual method invocation for operation: registerBook
     */
    private void invoke_registerBook(StreamingHandlerState state) throws Exception {
        
        com.nareshit.service.Book myBook = null;
        Object myBookObj =
            state.getRequest().getBody().getValue();
        
        if (myBookObj instanceof SOAPDeserializationState) {
            myBook = (com.nareshit.service.Book)((SOAPDeserializationState)myBookObj).getInstance();
        } else {
            myBook = (com.nareshit.service.Book)myBookObj;
        }
        
        try {
            int parameters = ((com.nareshit.service.IBookService) getTarget()).registerBook(myBook.getIsbn(), myBook.getTitle(), myBook.getAuthor(), myBook.getPrice());
            
            SOAPHeaderBlockInfo headerInfo;
            
            
            int _response = parameters;
            SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_registerBook_registerBookReturn_QNAME);
            bodyBlock.setValue(new java.lang.Integer(_response));
            bodyBlock.setSerializer(ns2_myns2__int__int_Int_Serializer);
            state.getResponse().setBody(bodyBlock);
        } catch (javax.xml.rpc.soap.SOAPFaultException e) {
            SOAPFaultInfo fault = new SOAPFaultInfo(e.getFaultCode(),
                e.getFaultString(), e.getFaultActor(), e.getDetail());
            SOAPBlockInfo faultBlock = new SOAPBlockInfo(com.sun.xml.rpc.encoding.soap.SOAPConstants.QNAME_SOAP_FAULT);
            faultBlock.setValue(fault);
            faultBlock.setSerializer(new SOAPFaultInfoSerializer(false, e.getDetail()==null));
            state.getResponse().setBody(faultBlock);
            state.getResponse().setFailure(true);
        }
    }
    
    /*
     * This method must determine the opcode of the operation that has been invoked.
     */
    protected void peekFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingHandlerState state) throws Exception {
        if (bodyReader.getName().equals(ns1_updateBook_book1_QNAME)) {
            state.getRequest().setOperationCode(updateBook_OPCODE);
        }
        else if (bodyReader.getName().equals(ns1_searchBook_isbn_QNAME)) {
            state.getRequest().setOperationCode(searchBook_OPCODE);
        }
        else if (bodyReader.getName().equals(ns1_registerBook_book_QNAME)) {
            state.getRequest().setOperationCode(registerBook_OPCODE);
        }
        else {
            throw new SOAPProtocolViolationException("soap.operation.unrecognized", bodyReader.getName().toString());
        }
    }
    
    /*
     *  this method deserializes the request/response structure in the body
     */
    protected void readFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingHandlerState  state) throws Exception {
        int opcode = state.getRequest().getOperationCode();
        switch (opcode) {
            case updateBook_OPCODE:
                deserialize_updateBook(bodyReader, deserializationContext, state);
                break;
            case searchBook_OPCODE:
                deserialize_searchBook(bodyReader, deserializationContext, state);
                break;
            case registerBook_OPCODE:
                deserialize_registerBook(bodyReader, deserializationContext, state);
                break;
            default:
                throw new SOAPProtocolViolationException("soap.operation.unrecognized", java.lang.Integer.toString(opcode));
        }
    }
    
    
    
    /*
     * This method deserializes the body of the updateBook operation.
     */
    private void deserialize_updateBook(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingHandlerState state) throws Exception {
        java.lang.Object myBookObj =
            ns3_myBook_LiteralSerializer.deserialize(ns1_updateBook_book1_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_updateBook_book1_QNAME);
        bodyBlock.setValue(myBookObj);
        state.getRequest().setBody(bodyBlock);
    }
    
    /*
     * This method deserializes the body of the searchBook operation.
     */
    private void deserialize_searchBook(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingHandlerState state) throws Exception {
        java.lang.Object myStringObj =
            ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_searchBook_isbn_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_searchBook_isbn_QNAME);
        bodyBlock.setValue(myStringObj);
        state.getRequest().setBody(bodyBlock);
    }
    
    /*
     * This method deserializes the body of the registerBook operation.
     */
    private void deserialize_registerBook(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingHandlerState state) throws Exception {
        java.lang.Object myBookObj =
            ns3_myBook_LiteralSerializer.deserialize(ns1_registerBook_book_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_registerBook_book_QNAME);
        bodyBlock.setValue(myBookObj);
        state.getRequest().setBody(bodyBlock);
    }
    
    
    /*
     * This method must invoke the correct method on the servant based on the opcode.
     */
    protected void processingHook(StreamingHandlerState state) throws Exception {
        switch (state.getRequest().getOperationCode()) {
            case updateBook_OPCODE:
                invoke_updateBook(state);
                break;
            case searchBook_OPCODE:
                invoke_searchBook(state);
                break;
            case registerBook_OPCODE:
                invoke_registerBook(state);
                break;
            default:
                throw new SOAPProtocolViolationException("soap.operation.unrecognized", java.lang.Integer.toString(state.getRequest().getOperationCode()));
        }
    }
    
    protected java.lang.String getDefaultEnvelopeEncodingStyle() {
        return null;
    }
    
    public java.lang.String getImplicitEnvelopeEncodingStyle() {
        return "";
    }
    
    
    /*
     * This method must determine the opcode of the operation given the QName of the first body element.
     */
    public int getOpcodeForFirstBodyElementName(QName name) {
        if (name == null) {
            return InternalSOAPMessage.NO_OPERATION;
        }
        if (name.equals(ns1_updateBook_book1_QNAME)) {
            return updateBook_OPCODE;
        }
        if (name.equals(ns1_searchBook_isbn_QNAME)) {
            return searchBook_OPCODE;
        }
        if (name.equals(ns1_registerBook_book_QNAME)) {
            return registerBook_OPCODE;
        }
        return super.getOpcodeForFirstBodyElementName(name);
    }
    
    
    private Method internalGetMethodForOpcode(int opcode) throws ClassNotFoundException, NoSuchMethodException {
        
        Method theMethod = null;
        
        switch(opcode) {
            case updateBook_OPCODE:
                {
                    Class[] carray = { java.lang.String.class,java.lang.String.class,java.lang.String.class,Double.TYPE };
                    theMethod = (com.nareshit.service.IBookService.class).getMethod("updateBook", carray);
                }
                break;
            
            case searchBook_OPCODE:
                {
                    Class[] carray = { java.lang.String.class };
                    theMethod = (com.nareshit.service.IBookService.class).getMethod("searchBook", carray);
                }
                break;
            
            case registerBook_OPCODE:
                {
                    Class[] carray = { java.lang.String.class,java.lang.String.class,java.lang.String.class,Double.TYPE };
                    theMethod = (com.nareshit.service.IBookService.class).getMethod("registerBook", carray);
                }
                break;
            
            default:
        }
        return theMethod;
    }
    
    private Method[] methodMap = new Method[3];
    
    /*
     * This method returns the Method Obj for a specified opcode.
     */
    public Method getMethodForOpcode(int opcode) throws ClassNotFoundException, NoSuchMethodException {
         
        if (opcode <= InternalSOAPMessage.NO_OPERATION ) {
            return null;
        }
         
        if (opcode >= 3 ) {
            return null;
        }
         
        if (methodMap[opcode] == null)  {
            methodMap[opcode] = internalGetMethodForOpcode(opcode);
        }
         
        return methodMap[opcode];
    }
    
    /*
     * This method returns an array containing (prefix, nsURI) pairs.
     */
    protected java.lang.String[] getNamespaceDeclarations() {
        return myNamespace_declarations;
    }
    
    /*
     * This method returns an array containing the names of the headers we understand.
     */
    public javax.xml.namespace.QName[] getUnderstoodHeaders() {
        return understoodHeaderNames;
    }
    
    
    protected boolean preHandlingHook(StreamingHandlerState state) throws Exception {
        boolean bool = false;
        bool = super.preHandlingHook(state);
        return bool;
    }
    
    
    protected void postResponseWritingHook(StreamingHandlerState state) throws Exception {
        super.postResponseWritingHook(state);
    }
    
    private void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        ns3_myBook_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.nareshit.service.Book.class, ns3_book_TYPE_QNAME);
    }
    
    private static final javax.xml.namespace.QName portName = new QName("http://service.nareshit.com", "BookServicePort");
    private static final int updateBook_OPCODE = 0;
    private static final int searchBook_OPCODE = 1;
    private static final int registerBook_OPCODE = 2;
    private static final javax.xml.namespace.QName ns1_updateBook_book1_QNAME = new QName("http://service.nareshit.com", "book1");
    private static final javax.xml.namespace.QName ns3_book_TYPE_QNAME = new QName("http://domain.nareshit.com", "book");
    private CombinedSerializer ns3_myBook_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_updateBook_updateBookReturn_QNAME = new QName("http://service.nareshit.com", "updateBookReturn");
    private static final javax.xml.namespace.QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns2_myns2__int__int_Int_Serializer;
    private static final javax.xml.namespace.QName ns1_searchBook_isbn_QNAME = new QName("http://service.nareshit.com", "isbn");
    private static final javax.xml.namespace.QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_searchBook_searchBookReturn_QNAME = new QName("http://service.nareshit.com", "searchBookReturn");
    private static final javax.xml.namespace.QName ns1_registerBook_book_QNAME = new QName("http://service.nareshit.com", "book");
    private static final javax.xml.namespace.QName ns1_registerBook_registerBookReturn_QNAME = new QName("http://service.nareshit.com", "registerBookReturn");
    private static final java.lang.String[] myNamespace_declarations =
                                        new java.lang.String[] {
                                            "ns0", "http://domain.nareshit.com"
                                        };
    
    private static final QName[] understoodHeaderNames = new QName[] {  };
}