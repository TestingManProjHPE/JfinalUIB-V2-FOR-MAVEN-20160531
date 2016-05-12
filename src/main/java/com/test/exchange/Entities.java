package com.test.exchange;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "Entities")
public class Entities {

	@Attribute(name = "TotalResults")
	private String totalResults;

	@ElementList(inline = true)
	private List<Entity> list;

	@Element(name = "singleElementCollection", required = false)
	private String singleElementCollection;

	public List<Entity> getList() {
		return list;
	}

	public void setList(List<Entity> list) {
		this.list = list;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public String getSingleElementCollection() {
		return singleElementCollection;
	}

	public void setSingleElementCollection(String singleElementCollection) {
		this.singleElementCollection = singleElementCollection;
	}

}

@Root(name = "Entity")
class Entity {

	@Attribute(name = "Type")
	private String Type;

	@ElementList(inline = true)
	private List<Fields> list;

	@Element(name = "ChildrenCount")
	private ChildrenCount childrenCount;

	@Element(name = "RelatedEntities", required = false)
	private String relatedEntities;

	public List<Fields> getList() {
		return list;
	}

	public void setList(List<Fields> list) {
		this.list = list;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getRelatedEntities() {
		return relatedEntities;
	}

	public void setRelatedEntities(String relatedEntities) {
		this.relatedEntities = relatedEntities;
	}

	public ChildrenCount getChildrenCount() {
		return childrenCount;
	}

	public void setChildrenCount(ChildrenCount childrenCount) {
		this.childrenCount = childrenCount;
	}

}

@Root
class ChildrenCount {
	@Element
	private String Value;

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

}

@Root(name = "Fields")
class Fields {

	@ElementList(inline = true)
	private List<Field> field;

	public List<Field> getField() {
		return field;
	}

	public void setField(List<Field> field) {
		this.field = field;
	}
}

@Root(name = "Field")
class Field {

	@ElementList(inline = true, required = false)
	private List<Value> valuelist;

	@Attribute(name = "Name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Value> getValuelist() {
		return valuelist;
	}

	public void setValuelist(List<Value> valuelist) {
		this.valuelist = valuelist;
	}

}

@Root(name = "Value")
class Value {

	@Attribute(name = "ReferenceValue", required = false)
	private String referenceValue;

	@Text(required = false)
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}

}
