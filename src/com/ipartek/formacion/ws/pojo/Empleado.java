/**
 * Empleado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipartek.formacion.ws.pojo;

public class Empleado implements java.io.Serializable {
	private java.lang.String apellido;

	private java.lang.String email;

	private long id;

	private java.lang.String nombre;

	private java.lang.String telefono;

	public Empleado() {
	}

	public Empleado(java.lang.String apellido, java.lang.String email, long id, java.lang.String nombre,
			java.lang.String telefono) {
		this.apellido = apellido;
		this.email = email;
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * Gets the apellido value for this Empleado.
	 * 
	 * @return apellido
	 */
	public java.lang.String getApellido() {
		return this.apellido;
	}

	/**
	 * Sets the apellido value for this Empleado.
	 * 
	 * @param apellido
	 */
	public void setApellido(java.lang.String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the email value for this Empleado.
	 * 
	 * @return email
	 */
	public java.lang.String getEmail() {
		return this.email;
	}

	/**
	 * Sets the email value for this Empleado.
	 * 
	 * @param email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	/**
	 * Gets the id value for this Empleado.
	 * 
	 * @return id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * Sets the id value for this Empleado.
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the nombre value for this Empleado.
	 * 
	 * @return nombre
	 */
	public java.lang.String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets the nombre value for this Empleado.
	 * 
	 * @param nombre
	 */
	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the telefono value for this Empleado.
	 * 
	 * @return telefono
	 */
	public java.lang.String getTelefono() {
		return this.telefono;
	}

	/**
	 * Sets the telefono value for this Empleado.
	 * 
	 * @param telefono
	 */
	public void setTelefono(java.lang.String telefono) {
		this.telefono = telefono;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.__equalsCalc != null) {
			return (this.__equalsCalc == obj);
		}
		this.__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.apellido == null && other.getApellido() == null)
						|| (this.apellido != null && this.apellido.equals(other.getApellido())))
				&& ((this.email == null && other.getEmail() == null)
						|| (this.email != null && this.email.equals(other.getEmail())))
				&& this.id == other.getId()
				&& ((this.nombre == null && other.getNombre() == null)
						|| (this.nombre != null && this.nombre.equals(other.getNombre())))
				&& ((this.telefono == null && other.getTelefono() == null)
						|| (this.telefono != null && this.telefono.equals(other.getTelefono())));
		this.__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (this.__hashCodeCalc) {
			return 0;
		}
		this.__hashCodeCalc = true;
		int _hashCode = 1;
		if (getApellido() != null) {
			_hashCode += getApellido().hashCode();
		}
		if (getEmail() != null) {
			_hashCode += getEmail().hashCode();
		}
		_hashCode += new Long(getId()).hashCode();
		if (getNombre() != null) {
			_hashCode += getNombre().hashCode();
		}
		if (getTelefono() != null) {
			_hashCode += getTelefono().hashCode();
		}
		this.__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Empleado.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojo.ws.formacion.ipartek.com", "Empleado"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("apellido");
		elemField.setXmlName(new javax.xml.namespace.QName("http://pojo.ws.formacion.ipartek.com", "apellido"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("email");
		elemField.setXmlName(new javax.xml.namespace.QName("http://pojo.ws.formacion.ipartek.com", "email"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://pojo.ws.formacion.ipartek.com", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nombre");
		elemField.setXmlName(new javax.xml.namespace.QName("http://pojo.ws.formacion.ipartek.com", "nombre"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("telefono");
		elemField.setXmlName(new javax.xml.namespace.QName("http://pojo.ws.formacion.ipartek.com", "telefono"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "Empleado [apellido=" + this.apellido + ", email=" + this.email + ", id=" + this.id + ", nombre="
				+ this.nombre + ", telefono=" + this.telefono + "]";
	}

}
