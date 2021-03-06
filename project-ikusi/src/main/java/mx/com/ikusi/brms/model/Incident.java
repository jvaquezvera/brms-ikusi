package mx.com.ikusi.brms.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Incident implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String sysId;
   private mx.com.ikusi.brms.model.Request request;
   private java.util.List<mx.com.ikusi.brms.model.Request> requestAsociated;
   private java.lang.String severity;
   private java.lang.String name;

   private java.lang.String status="";

   public Incident()
   {
   }
   
   public void addRequestAsociado(Request resquest){
       boolean insert=true;
       
       for(Request requestLocal: requestAsociated){
           System.out.println("requestLocal: "+requestLocal.getDevice().getSysId());
           System.out.println("request: "+resquest);
           if(requestLocal.getDevice().getSysId().equals(resquest.getDevice().getSysId())){
               insert= false;
           }
       }
       
       if(insert){
           System.out.println("was added");
           requestAsociated.add(resquest);
       }
   }

   public Incident(mx.com.ikusi.brms.model.Request request){
      
      this.request=request;
      requestAsociated= new java.util.ArrayList<>(); 
      
   }

   public java.lang.String getSysId()
   {
      return this.sysId;
   }

   public void setSysId(java.lang.String sysId)
   {
      this.sysId = sysId;
   }

   public mx.com.ikusi.brms.model.Request getRequest()
   {
      return this.request;
   }

   public void setRequest(mx.com.ikusi.brms.model.Request request)
   {
      this.request = request;
   }

   public java.util.List<mx.com.ikusi.brms.model.Request> getRequestAsociated()
   {
      return this.requestAsociated;
   }

   public void setRequestAsociated(
         java.util.List<mx.com.ikusi.brms.model.Request> requestAsociated)
   {
      this.requestAsociated = requestAsociated;
   }

   public java.lang.String getSeverity()
   {
      return this.severity;
   }

   public void setSeverity(java.lang.String severity)
   {
      this.severity = severity;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public Incident(java.lang.String sysId,
         mx.com.ikusi.brms.model.Request request,
         java.util.List<mx.com.ikusi.brms.model.Request> requestAsociated,
         java.lang.String severity)
   {
      this.sysId = sysId;
      this.request = request;
      this.requestAsociated = requestAsociated;
      this.severity = severity;
   }

   public String toString()
   {
      return "incident name: " + getName() + " ... ";
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public Incident(java.lang.String sysId,
         mx.com.ikusi.brms.model.Request request,
         java.util.List<mx.com.ikusi.brms.model.Request> requestAsociated,
         java.lang.String severity, java.lang.String name,
         java.lang.String status)
   {
      this.sysId = sysId;
      this.request = request;
      this.requestAsociated = requestAsociated;
      this.severity = severity;
      this.name = name;
      this.status = status;
   }

}